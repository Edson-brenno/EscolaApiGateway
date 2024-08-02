package com.spring.escolaapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.Config")
public class EscolaApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscolaApiGatewayApplication.class, args);
    }

}
