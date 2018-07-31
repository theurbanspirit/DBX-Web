package com.dbfirstproject.firstdbproject.Interface;

import com.dbfirstproject.firstdbproject.Implementor.login_impl;
import com.dbfirstproject.firstdbproject.message.Response;

public interface login_interface {

    Response getRecord( String name, String password );
}
