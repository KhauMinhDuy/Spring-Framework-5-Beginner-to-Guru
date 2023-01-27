package com.khauminhduy.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class FactoryBean {

    public FactoryBean() {
        System.out.println("Create a FactoryBean");
    }

    public String getMyType() {
        return "I'm a Factory";
    }

}
