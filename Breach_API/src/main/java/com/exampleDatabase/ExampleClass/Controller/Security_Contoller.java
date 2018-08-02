package com.exampleDatabase.ExampleClass.Controller;

import com.exampleDatabase.ExampleClass.Impl.SecurityImplementor;
import com.exampleDatabase.ExampleClass.Model.Security_RetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Security_Contoller {
    @Autowired
    SecurityImplementor simpl;
    @RequestMapping(value="/showsecurity/{symbol}")
    public Security_RetType retrunSecurityDetails(@PathVariable String symbol){
        return simpl.showSecurityDetails(symbol);
    }
}
