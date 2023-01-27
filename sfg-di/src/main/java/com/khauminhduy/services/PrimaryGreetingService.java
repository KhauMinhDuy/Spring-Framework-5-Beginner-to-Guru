package com.khauminhduy.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - Primary Bean";
    }
}
