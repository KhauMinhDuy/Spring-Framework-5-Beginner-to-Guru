package com.khauminhduy.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Create a SingletonBean");
    }

    public String getMyType() {
        return "I'm a Singleton";
    }

}
