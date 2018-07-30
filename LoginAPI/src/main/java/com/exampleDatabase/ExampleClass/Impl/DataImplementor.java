package com.exampleDatabase.ExampleClass.Impl;

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
    public void saveData(Var i){
        String sql="insert into dbfirst value(?,?)";
        templ.update(sql,new Object[]{i.getId(),i.getName()});
    }

    @Override
    public List<Var> getList() {
       String sql="select * from dbfirst";
       List<Var>list= templ.query(sql,new BeanPropertyRowMapper<>(Var.class));
        return list;
    }

    @Override
    public Var getRecord(String name, String pass) {
        String sql="select * from login where name=?";
        Var v=templ.queryForObject(sql,new Object[]{name},new BeanPropertyRowMapper<>(Var.class));
        if(v==null||!v.getName().equals(name)||!v.getPassword().equals(pass)){
            v.setName("Invalid user name or password");
        }else{
            v.setMsg("Success");
            id=v.getId();
        }
        return v;
    }






}
