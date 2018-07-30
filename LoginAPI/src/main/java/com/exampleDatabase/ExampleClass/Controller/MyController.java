package com.exampleDatabase.ExampleClass.Controller;

import com.exampleDatabase.ExampleClass.Impl.DataImplementor;
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
    @RequestMapping(value = "/savedata")
    public String saveData(@RequestBody Var i) {
        dataImplementor.saveData(i);
        return ("Saved!!");
    }

    @RequestMapping(value = "/getdata")
    public List<Var> getTotalData() {
        List<Var> list = dataImplementor.getList();
        return list;
    }

    @RequestMapping(value = "/getsingledata/{name}/{password}")
    public Var getSingleData( @PathVariable String name,@PathVariable String pass) {

        return dataImplementor.getRecord(name,pass);
    }


}