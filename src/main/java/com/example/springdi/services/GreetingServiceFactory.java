package com.example.springdi.services;

public class GreetingServiceFactory {

    public GreetingsService createGreetingService(String lang){
        switch (lang){
            case "Es":
                return new PrimarySpanishGreetingsService();
            case "De":
                return new PrimaryGermanGreetingsService();
            default:
                return new PrimaryGreetingsService();
        }
    }
}
