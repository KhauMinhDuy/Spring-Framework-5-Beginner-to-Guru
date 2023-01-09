package com.khauminhduy;

import com.khauminhduy.controller.ConstructorInjectedController;
import com.khauminhduy.controller.I18nController;
import com.khauminhduy.controller.MyController;
import com.khauminhduy.controller.PrimaryInjectedController;
import com.khauminhduy.controller.PropertyInjectedController;
import com.khauminhduy.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        final MyController myController = ctx.getBean("myController", MyController.class);

        final String sayHello = myController.sayHello();

        System.out.println(sayHello);

        System.out.println("----- property");

        final PropertyInjectedController propertyInjectedController = ctx.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----- setter");
        final SetterInjectedController setterInjectedController = ctx.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----- constructor");
        final ConstructorInjectedController constructorInjectedController = ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("----- primary bean");
        final PrimaryInjectedController primaryInjectedController = ctx.getBean("primaryInjectedController", PrimaryInjectedController.class);
        System.out.println(primaryInjectedController.getGreeting());

        System.out.println("----- spring profile");
        final I18nController i18nController = ctx.getBean("i18nController", I18nController.class);
        System.out.println(i18nController.sayHello());

    }

}
