package com.exampleDatabase.ExampleClass.Impl;

import com.exampleDatabase.ExampleClass.Model.TradeRetType;
import com.exampleDatabase.ExampleClass.Model.Var;
import com.exampleDatabase.ExampleClass.repository.DataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository

public class DataImplementor implements DataInterface
{    Integer id=null;
    @Autowired
    JdbcTemplate templ;
    @Override
    public Var getRecord(String name, String pass) {
        String sql="select * from login where name=?";
        Var v=templ.queryForObject(sql,new Object[]{name},new BeanPropertyRowMapper<>(Var.class));
        if(v==null||!v.getName().equals(name)||!v.getPassword().equals(pass)){
            v.setMsg("Invalid user name or password");
        }else{
            v.setMsg("Success");
            id=v.getId();
        }
        return v;
    }

    @Override
    public TradeRetType getTraderDetails(Integer id) {
        String sql="SELECT * FROM trading_limits WHERE Trader_ID=?";
        TradeRetType trt=templ.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(TradeRetType.class) );
        return trt;
    }


}
