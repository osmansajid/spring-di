package com.example.springdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingsService implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hello world - Constructor");
    }
}
