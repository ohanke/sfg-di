package com.oscarhanke.sfidi.services;

public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from SetterInjectedGreetingService";
    }
}
