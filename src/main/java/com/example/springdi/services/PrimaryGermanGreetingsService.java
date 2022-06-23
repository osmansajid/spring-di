package com.example.springdi.services;

public class PrimaryGermanGreetingsService implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hallo Welt - De");
    }
}
