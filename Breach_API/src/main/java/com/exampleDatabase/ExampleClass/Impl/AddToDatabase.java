package com.exampleDatabase.ExampleClass.Impl;

import com.exampleDatabase.ExampleClass.Model.BreachRetType;
import com.exampleDatabase.ExampleClass.Model.OrderRetType;
import com.exampleDatabase.ExampleClass.repository.AddToDatabaseInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AddToDatabase implements AddToDatabaseInterface {
    @Autowired
    JdbcTemplate templ;
    @Override
    public void AddToOrder(OrderRetType ort) {
        String sql="INSERT INTO compliancedemo.`compliance - orders`" + "(`SECURITY`," + "`QUANTITY`,\n" + "`LIMIT_PRICE`,\n" + "`DIRECTION`,\n" + "`VALUE`,\n" + "`Trader_ID`)\n" + "VALUES\n" + "(?,?,?,?,?,?)";
        templ.update(sql,new Object[]{ort.getSECURITY(),ort.getQUANTITY(),ort.getLIMIT_PRICE(),ort.getDIRECTION(),ort.getVALUE(),ort.getTrader_ID()});
    }

    @Override
    public void AddToBreach(BreachRetType brt) {
        String sql="insert into breach_tale values (?,?,?)";
        templ.update(sql,new Object[]{brt.getTrader_ID(),brt.getSector_of_breach(),brt.getAmount_breach()});

    }
}
