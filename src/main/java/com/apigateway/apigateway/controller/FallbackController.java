package com.apigateway.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

//    @GetMapping("/usersServiceFallBack")
//    public String userServiceFallback() {
//        return "User service is down!";
//    }

    @GetMapping("/eventsServiceFallBack")
    public String eventsServiceFallback() {
        return "Events service is down!";
    }

    @GetMapping("/notificationServiceFallBack")
    public String notificationServiceFallback() {
        return "Notification service is down!";
    }
}
