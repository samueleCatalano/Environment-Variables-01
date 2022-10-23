package com.envvar01.EnvVar01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    Environment env;

    @GetMapping
    public String getVars(){
        String firstProperty = env.getProperty("authCode.value");
        String secondProperty = env.getProperty("devName.value");
        return "My name is " + secondProperty + " and my authCode is: " + firstProperty;
    }


}
