package com.demospring.xavierkress.dependencyinjection.controllers;

import com.demospring.xavierkress.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
