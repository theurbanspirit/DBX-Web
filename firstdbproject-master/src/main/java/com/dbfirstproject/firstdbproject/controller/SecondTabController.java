package com.dbfirstproject.firstdbproject.controller;

import com.dbfirstproject.firstdbproject.Implementor.SecondTabImpl;
import com.secondbproject.seconddbproject.model.SecondTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.IntegerSyntax;
import java.util.List;

/**
 * Created by abhi on 24/07/18.
 */

@RestController
@CrossOrigin(allowedHeaders = {"Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization"}, methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
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
       @PathVariable Integer id){
       SecondTab st = secondTabImpl.getSingleRecord(id);
       return st;
   }

    @RequestMapping(value="/getSingleList/{id}")
    public List<SecondTab> getSingleList(
            @PathVariable Integer id){ //?

       List<SecondTab> list2=secondTabImpl.getSingleList(id);
        return list2;
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
