package com.exampleDatabase.ExampleClass.Controller;

import com.exampleDatabase.ExampleClass.Impl.DataImplementor;
import com.exampleDatabase.ExampleClass.Model.TradeRetType;
import com.exampleDatabase.ExampleClass.Model.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    DataImplementor dataImplementor;
    @RequestMapping(value = "/getsingledata/{name}/{password}")
    public Var getSingleData( @PathVariable String name,@PathVariable String password) {

        Var v=dataImplementor.getRecord(name,password);
        if(v!=null){
            System.out.print("ID= "+v.getId());
            TradeRetType trt=dataImplementor.getTraderDetails(v.getId());
            v.setTrt(trt);
        }
        return v;
    }


}