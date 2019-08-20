package com.demospring.xavierkress.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public void hello(){
        System.out.println("Hello from the controller");
    }
}
