package com.demospring.xavierkress.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "Hello World From Original implem of greeting service";


    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
