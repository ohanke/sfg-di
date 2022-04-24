package com.oscarhanke.sfidi.services;

public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from PrimaryGreetingService";
    }
}
