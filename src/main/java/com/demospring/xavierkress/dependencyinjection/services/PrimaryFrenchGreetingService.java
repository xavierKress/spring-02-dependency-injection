package com.demospring.xavierkress.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("fr")
@Primary
public class PrimaryFrenchGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bonjour depuis le service de salutation primaire";
    }
}
