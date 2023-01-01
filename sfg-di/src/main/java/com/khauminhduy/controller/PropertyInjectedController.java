package com.khauminhduy.controller;

import com.khauminhduy.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greeting();
    }

}
