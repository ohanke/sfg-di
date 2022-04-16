package com.oscarhanke.sfidi.controllers;

import com.oscarhanke.sfidi.services.GreetingService;
import org.springframework.stereotype.Controller;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
