package com.khauminhduy;

import com.khauminhduy.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        final MyController myController = ctx.getBean("myController", MyController.class);

        final String sayHello = myController.sayHello();

        System.out.println(sayHello);

    }

}
