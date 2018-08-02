package com.exampleDatabase.ExampleClass.repository;

import com.exampleDatabase.ExampleClass.Model.BreachModel;
import com.exampleDatabase.ExampleClass.Model.RetType;

import java.math.BigDecimal;
import java.util.List;

public interface BreachInterface {
    public RetType checkPriceBreach(Integer id,String sector, BigDecimal qty, BigDecimal price);
}
