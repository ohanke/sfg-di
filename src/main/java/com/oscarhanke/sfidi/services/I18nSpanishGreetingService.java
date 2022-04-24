package com.oscarhanke.sfidi.services;

//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world - ES";
    }
}
