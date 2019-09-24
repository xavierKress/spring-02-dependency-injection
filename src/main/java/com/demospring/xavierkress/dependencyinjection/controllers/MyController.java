package com.demospring.xavierkress.dependencyinjection.controllers;

import com.demospring.xavierkress.dependencyinjection.services.GreetingService;

public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
