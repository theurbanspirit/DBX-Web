package com.dbfirstproject.firstdbproject.model;

/**
 * Created by abhi on 23/07/18.
 */
public class Trader_login {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public Trader_login(){}

    public Trader_login(String name, String password){
        this.name = name;
        this.password = password;
    }


}