package com.khauminhduy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello World - En";
    }
}
