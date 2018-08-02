package com.exampleDatabase.ExampleClass.repository;


import com.exampleDatabase.ExampleClass.Model.TradeRetType;
import com.exampleDatabase.ExampleClass.Model.Var;

import java.util.List;

public interface DataInterface {
    Var getRecord(String name,String pass);
    TradeRetType getTraderDetails(Integer id);
}
