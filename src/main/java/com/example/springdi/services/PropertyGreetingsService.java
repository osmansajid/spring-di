package com.example.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingsService implements GreetingsService{
    @Override
    public void sayGreetings() {
        System.out.println("Hello world - Property");
    }
}
