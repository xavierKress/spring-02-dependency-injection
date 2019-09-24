package com.demospring.xavierkress.dependencyinjection.services;

public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "hallo auf deutsch";
    }
}
