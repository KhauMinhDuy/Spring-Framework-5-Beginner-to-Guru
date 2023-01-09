package com.khauminhduy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("VN")
@Service("i18nService")
public class I18nVNGreetingService implements GreetingService {
    @Override
    public String greeting() {
        return "Xin Chao - VN";
    }
}
