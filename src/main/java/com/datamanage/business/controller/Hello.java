package com.datamanage.business.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String a (){
        return "aaa";
    }

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String b (){
        return "aaa";
    }
}
