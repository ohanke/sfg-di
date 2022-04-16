package com.oscarhanke.sfidi.controllers;

import com.oscarhanke.sfidi.services.GreetingService;
import org.springframework.stereotype.Controller;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
