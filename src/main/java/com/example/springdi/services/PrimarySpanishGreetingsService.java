package com.example.springdi.services;

public class PrimarySpanishGreetingsService implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hola Mundo - Es");
    }
}
