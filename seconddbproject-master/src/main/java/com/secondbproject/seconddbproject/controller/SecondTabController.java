package com.secondbproject.seconddbproject.controller;

import com.secondbproject.seconddbproject.impl.SecondTabImpl;
import com.secondbproject.seconddbproject.model.SecondTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by abhi on 24/07/18.
 */

@RestController
public class SecondTabController {

    @Autowired
    SecondTabImpl secondTabImpl;//

       @RequestMapping(value="/savedata")
    public String saveData(@RequestBody SecondTab secondTab){

        secondTabImpl.saveData(secondTab);
        return "Data saved successfully";

    }


   @RequestMapping(value="/getdata")
   public List<SecondTab> getTotalData(){ // second tab is the class get total data is the name

       List<SecondTab> list=secondTabImpl.getList();
       System.out.println(list);
       return list;
   }


    @RequestMapping(value="/getSingleRecord/{id}")
    public SecondTab getSingleRecord(
            @PathVariable Integer id){ //?

        SecondTab st=secondTabImpl.
                getSingleRecord(id);
        return st;
    }

    @RequestMapping(value="/updateRecord/{id}/{name}")
    public String updateRecord(
            @PathVariable Integer id,
            @PathVariable String name){

        secondTabImpl.updateData(id,name);

        return "Data updated successfully";
    }

    @RequestMapping(value="/deleteRecord/{id}")
    public String deleteRecord(
            @PathVariable Integer id){

        secondTabImpl.deleteData(id);

        return "Data deleted successfully";
    }

}
