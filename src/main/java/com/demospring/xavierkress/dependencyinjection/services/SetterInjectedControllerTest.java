package com.demospring.xavierkress.dependencyinjection.services;

import com.demospring.xavierkress.dependencyinjection.controllers.SetterInjectedController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
    }
}
