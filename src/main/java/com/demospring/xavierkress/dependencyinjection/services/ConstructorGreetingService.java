package com.demospring.xavierkress.dependencyinjection.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the constructor!!!";
    }
}