package com.dbfirstproject.firstdbproject.controller;

/**
 * Created by abhi on 23/07/18.
 */

import com.dbfirstproject.firstdbproject.Implementor.add_data;
import com.dbfirstproject.firstdbproject.Implementor.login_impl;
import com.dbfirstproject.firstdbproject.message.Response;
import com.dbfirstproject.firstdbproject.model.Trader_login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = {"Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization"}, methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})

@RequestMapping("/api")
public class RestWebController {

    @Autowired
   login_impl impl;

    @PostMapping(value = "/login")
    public Response getSingleData(@RequestBody Trader_login trader_login) {

        return impl.getRecord(trader_login.getName(), trader_login.getPassword());
    }


   @Autowired
    add_data a;

    @GetMapping(value = "/csvs")
    public void rc() {
       System.out.println("sdjksjb");
        a.readCsvUsingLoad();
    }





}