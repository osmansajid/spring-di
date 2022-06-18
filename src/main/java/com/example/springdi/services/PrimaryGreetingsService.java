package com.example.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingsService implements GreetingsService{
    @Override
    public void sayGreetings() {
        System.out.println("Hello world - Primary");
    }
}
