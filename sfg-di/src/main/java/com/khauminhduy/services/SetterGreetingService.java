package com.khauminhduy.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - Setter";
    }
}
