package com.exampleDatabase.ExampleClass.repository;

import com.exampleDatabase.ExampleClass.Model.Security_RetType;

public interface SecurityInterface {
    public Security_RetType showSecurityDetails(String symbol);
}
