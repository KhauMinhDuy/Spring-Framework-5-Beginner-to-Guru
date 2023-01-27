package com.khauminhduy.services;

import com.khauminhduy.repositories.EnglishGreetingRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class I18nEnGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;


    @Override
    public String greeting() {
        return "Hello World - En";
    }

}
