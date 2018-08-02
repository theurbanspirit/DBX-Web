package com.exampleDatabase.ExampleClass.repository;

import com.exampleDatabase.ExampleClass.Model.BreachRetType;
import com.exampleDatabase.ExampleClass.Model.OrderRetType;

public interface AddToDatabaseInterface {
    public void AddToOrder(OrderRetType ort);
    public  void AddToBreach(BreachRetType brt);

}
