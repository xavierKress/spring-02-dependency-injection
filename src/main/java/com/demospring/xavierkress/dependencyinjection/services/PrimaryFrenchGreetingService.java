package com.demospring.xavierkress.dependencyinjection.services;

public class PrimaryFrenchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bonjour depuis le service de salutation primaire";
    }
}
