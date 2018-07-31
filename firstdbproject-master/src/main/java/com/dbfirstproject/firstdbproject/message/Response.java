package com.dbfirstproject.firstdbproject.message;


public class Response {

    private String name;
    private String password;
    private  String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Object getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Response(){

    }

    public Response(String name, String password, String status, int id){
        this.name = name;
        this.password = password;
        this.status = status;
        this.id=id;
    }


}