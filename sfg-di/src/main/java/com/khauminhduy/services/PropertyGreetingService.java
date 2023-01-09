package com.khauminhduy.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - Property";
    }
}
