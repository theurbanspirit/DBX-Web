package com.exampleDatabase.ExampleClass.Controller;

import com.exampleDatabase.ExampleClass.Impl.BreachImplementor;
import com.exampleDatabase.ExampleClass.Model.BreachModel;
import com.exampleDatabase.ExampleClass.Model.RetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class BreachContoller {
    @Autowired
    BreachImplementor breachimplementor;
    @RequestMapping(value="/breach/{id}/{sector}/{qty}/{price}")
    public RetType breach(@PathVariable Integer id,@PathVariable String sector, @PathVariable BigDecimal qty, @PathVariable BigDecimal price){

                RetType bi=breachimplementor.checkPriceBreach(id,sector,qty,price);
                System.out.println("RetMsg= "+ bi.getRetmsg());
                System.out.println("Sector ="+ bi.getRet());
                return bi;
    }
}
