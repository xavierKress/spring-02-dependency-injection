package com.demospring.xavierkress.dependencyinjection.services;

public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}