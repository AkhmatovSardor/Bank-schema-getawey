package com.company.Bankschemagetaway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    //todo: localhost:9999/user/create
    //todo: localhost:8001/user/create

   /* @Bean
    public RouteLocator initRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-path-route", r -> r.path("/user-service/**")
                        .uri("lb://user-service"))
                .route("route-file", r -> r.path("/file-service/**")
                        .uri("lb://file-service"))
                .build();
    }*/


}