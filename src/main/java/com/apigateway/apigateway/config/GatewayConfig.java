//package com.apigateway.apigateway.config;
//
//import com.apigateway.apigateway.filter.AuthenticationFilter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//
//@Configuration
//public class GatewayConfig {
//
//    @Autowired
//    AuthenticationFilter filter;
//
//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("USER-SERVICE", r->r.path("/user/**")
//                        .filters(f -> f.filter(filter))
//                        .uri("lb://USER-SERVICE"))
//                .build();
//    }
//
//    @Bean
//    @Order(Ordered.LOWEST_PRECEDENCE)
//    public LogRequestFilter logRequestFilter() {
//        return new LogRequestFilter();
//    }
//}
