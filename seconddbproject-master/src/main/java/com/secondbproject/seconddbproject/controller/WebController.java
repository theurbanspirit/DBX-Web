package com.secondbproject.seconddbproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by abhi on 24/07/18.
 */
@Controller
public class WebController {

    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }
}
