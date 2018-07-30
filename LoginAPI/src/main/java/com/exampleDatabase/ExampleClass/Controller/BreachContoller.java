package com.exampleDatabase.ExampleClass.Controller;

import com.exampleDatabase.ExampleClass.Impl.BreachImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BreachContoller {
    @Autowired
    BreachImplementor breachimplementor;
    @RequestMapping(value="/breach/id/qty/price")
    public String breach(@PathVariable Integer id,@PathVariable Integer qty, @PathVariable Double price){

        return "";
    }
}
