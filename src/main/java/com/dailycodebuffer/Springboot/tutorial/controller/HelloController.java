package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//it has annotation response body that is it will always return response ie some of the data becz our rest api will always return some of the data..
@RestController
public class HelloController {

//    using this annotation this welcome.message property will be fetched from app.properties file and attached to the welcomeMessage var
    @Value("${welcome.message}")
    private String welcomeMessage;

//    we have assigned an endpoint that is /, default endpoint to this method
//    8080 is the default Tomcat container port
//    @RequestMapping(value = "/", method= RequestMethod.GET)
    @GetMapping(value = "/")
    public String helloWorld(){
        return welcomeMessage;
    }
}
