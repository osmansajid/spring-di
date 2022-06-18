package com.example.springdi.services;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hello world");
    }
}
