package com.exampleDatabase.ExampleClass.Impl;
import com.exampleDatabase.ExampleClass.Model.BreachModel;
import com.exampleDatabase.ExampleClass.repository.BreachInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class BreachImplementor implements BreachInterface {
    @Autowired
    JdbcTemplate templ;
    @Override
    public String checkPriceBreach(Integer id,Integer qty, Double price) {
         String sql="SELECT Trader_ID,SUM(VALUE) FROM compliancedemo.`compliance-orders`GROUP BY Trader_ID ORDER BY Trader_ID";
        
        // BreachModel v=templ.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<>(BreachModel.class));

         return null;

    }
}
