package com.oscarhanke.sfidi.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world from ConstructorGreetingService";
    }
}
