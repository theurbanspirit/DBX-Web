package com.dbfirstproject.firstdbproject.Implementor;

import com.dbfirstproject.firstdbproject.Interface.login_interface;
import com.dbfirstproject.firstdbproject.message.Response;
import com.dbfirstproject.firstdbproject.model.Trader_login;
import com.sun.prism.impl.PrismSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class login_impl implements login_interface {

    @Autowired
    JdbcTemplate templ;


    public Response getRecord(String name, String password) {
        String returnMsg = "";
        Response response;

        String sql = "select * from trader_login where name=?";
        System.out.println("name is : " + name);
        try {
            Trader_login v = templ.queryForObject(sql, new Object[]{name}, new BeanPropertyRowMapper<>(Trader_login.class));
            //  Response response;


       if(!v.getName().equals(name)&&!v.getPassword().equals(password)){
           response = new Response("ïnvalid", "invalid",  "wrong user name or password", 1 );
        }else{

            response = new Response(v.getName(), v.getPassword(),  "done", 1 );
        }

            return response;
        } catch (Exception e) {
            System.out.println("Not exists");
            response = new Response("ïnvalid", "invalid", "invalid", 1);
            return  response;
        }


    }

}
