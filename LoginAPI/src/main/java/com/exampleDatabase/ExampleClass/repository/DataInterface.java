package com.exampleDatabase.ExampleClass.repository;


import com.exampleDatabase.ExampleClass.Model.Var;

import java.util.List;

public interface DataInterface {
    void saveData(Var i);
    List<Var>getList();
    Var getRecord(String name,String pass);
}
