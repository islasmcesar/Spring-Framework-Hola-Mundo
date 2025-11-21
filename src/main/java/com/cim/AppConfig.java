package com.cim;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
