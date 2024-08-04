package com.spring.Config;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

//@Configuration
//public class ApiGatewayConfig {
//    @Bean
//    public RouteLocator apiGatewayRoutes(RouteLocatorBuilder builder) {
//
//        return builder.routes()
//                .route(p -> p.path("/get").uri("http://httpbin.org"))
//                .route(p -> p.path("/estudante-service/**").uri("lb://estudante-service"))
//                .build();
//    }
//}
