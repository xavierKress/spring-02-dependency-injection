package com.demospring.xavierkress.dependencyinjection.controllers;

import com.demospring.xavierkress.dependencyinjection.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
