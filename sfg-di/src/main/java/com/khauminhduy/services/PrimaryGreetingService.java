package com.khauminhduy.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - Primary Bean";
    }
}
