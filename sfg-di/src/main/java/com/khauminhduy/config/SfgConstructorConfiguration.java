package com.khauminhduy.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@AllArgsConstructor
@ConstructorBinding
@ConfigurationProperties("db")
public class SfgConstructorConfiguration {

    private final String username;
    private final String password;
    private final String jdbcUrl;

}
