package com.khauminhduy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
//@ConfigurationProperties("db")
//@Configuration
public class SfgConfiguration {

    private String username;
    private String password;
    private String jdbcUrl;

}
