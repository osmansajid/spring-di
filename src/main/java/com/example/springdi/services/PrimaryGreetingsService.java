package com.example.springdi.services;

public class PrimaryGreetingsService implements GreetingsService{
    @Override
    public void sayGreetings() {
        System.out.println("Hello world - En");
    }
}
