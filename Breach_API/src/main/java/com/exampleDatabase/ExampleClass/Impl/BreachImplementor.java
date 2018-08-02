package com.exampleDatabase.ExampleClass.Impl;
import com.exampleDatabase.ExampleClass.Model.*;
import com.exampleDatabase.ExampleClass.repository.BreachInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BreachImplementor implements BreachInterface {
    @Autowired
    JdbcTemplate templ;
    @Autowired
    AddToDatabase atd;

    @Override
    public RetType checkPriceBreach(Integer id, String sector, BigDecimal qty, BigDecimal price) {
        BigDecimal ni=new BigDecimal(0);
        BigDecimal i=new BigDecimal(0);
            String sql="select sum(VALUE) from compliancedemo.`compliance - orders` group by Trader_ID having Trader_ID=?";
            i=templ.queryForObject(sql, new Object[]{id}, BigDecimal.class);//Already traded values
        String sql2="select * from compliancedemo.trading_limits";
        List<BreachModel> j=templ.query(sql2, new BeanPropertyRowMapper<>(BreachModel.class));
        String retmsg="";
        BreachModel o=null;
        MathContext mc=new MathContext(4);
        BigDecimal dec=new BigDecimal(0);
        for (BreachModel m : j) {
            if (m.getTrader_ID() == id) {
                if (sector.equals(m.getSECTOR_1())) {
                    dec=m.getSECTOR_LIMIT();
                } else if (sector.equals(m.getSECTOR_2())) {
                    dec=m.getOVERALL_LIMIT().subtract(m.getSECTOR_LIMIT());
                } else {
                    System.out.println("I am working here");
                    retmsg="You are not allowed to trade in this sector";
                    break;
                }
                System.out.println("Dec="+dec);
                if (i.compareTo(dec) == 1) {
                    retmsg="Already Breach";
                    break;
                }
                System.out.println("DEc=" + dec);
                BigDecimal bd=price.multiply(qty, mc);
                ni=i.add(bd);
                System.out.println("ni=" + ni);
                o=m;
                System.out.println(dec);
                BigDecimal bd1=new BigDecimal(0.85);
                BigDecimal bd2=new BigDecimal(0.95);
                BigDecimal bd3=dec.multiply(bd1, mc);
                System.out.println("bd3=" + bd3);
                BigDecimal bd4=dec.multiply(bd2, mc);
                System.out.println("bd4=" + bd4);
                if (ni.compareTo(bd3) < 0) {
                    retmsg="Normal";
                    //run update here;

                } else if (ni.compareTo(bd3) > 0 && ni.compareTo(bd4) < 0) {
                    retmsg="alert";

                } else {
                    System.out.print("I am in breach");
                    retmsg="breach";

                }
            }

        }
        String sql3="select * from security_master";
        List<Security_RetType> ret=templ.query(sql3, new BeanPropertyRowMapper<>(Security_RetType.class));
        List<Security_RetType>retList=new ArrayList<>();
        for(Security_RetType srt:ret){
            if(srt.getSECTOR().equals(sector)){
                retList.add(srt);
            }
        }
        OrderRetType ort=new OrderRetType("hello", qty, price, "B", ni, id);
        BigDecimal over=new BigDecimal(0);
        BreachRetType brt=new BreachRetType(id, sector, over);
        if (retmsg == "Normal" || retmsg == "alert") {
            atd.AddToOrder(ort);
        } else if (retmsg == "breach") {
            if (atd != null)
                atd.AddToBreach(brt);
            else System.out.println("null object");
        } else {
            System.out.println("Nothing To Do!! Already Breach");
        }

            if (o == null) {
                return new RetType(retmsg, new BigDecimal(0), sector, null);
            }
            BigDecimal bd5=dec.subtract(i);
            BigDecimal bd6=bd5.divide(dec, mc);
            BigDecimal bd7=new BigDecimal(100);
            BigDecimal percent=bd6.multiply(bd7, mc);
            RetType obj=new RetType(retmsg, percent, sector, retList);
            obj.setRetmsg(retmsg);
            return obj;
        }
    }

