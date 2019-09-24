package com.demospring.xavierkress.dependencyinjection.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From primary greeting service";
    }
}
