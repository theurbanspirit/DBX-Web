package com.exampleDatabase.ExampleClass.Impl;

import com.exampleDatabase.ExampleClass.Model.Security_RetType;
import com.exampleDatabase.ExampleClass.repository.SecurityInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class SecurityImplementor implements SecurityInterface {
    @Autowired
    JdbcTemplate templ;
    @Override
    public Security_RetType showSecurityDetails(String symbol) {
        String sql="SELECT * FROM compliancedemo.security_master WHERE SYMBOL=?";
        Security_RetType srt=templ.queryForObject(sql,new Object[]{symbol},new BeanPropertyRowMapper<>(Security_RetType.class));
        return srt;
    }
}
