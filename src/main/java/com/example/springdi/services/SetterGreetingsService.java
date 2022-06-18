package com.example.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingsService implements GreetingsService{
    @Override
    public void sayGreetings() {
        System.out.println("Hello world - Setters");
    }
}
