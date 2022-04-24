package com.oscarhanke.sfidi.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from PropertyInjectedGreetingService";
    }
}
