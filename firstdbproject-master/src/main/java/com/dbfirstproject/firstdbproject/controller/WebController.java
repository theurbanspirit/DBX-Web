package com.dbfirstproject.firstdbproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by abhi on 23/07/18.
 */

@Controller
public class WebController {

    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }

    @GetMapping(value="/security")
    public String homepages(){
        return "securities";
    }
}