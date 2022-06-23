package com.example.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Profile({"En","default"})
@Service("primaryGreetingsService")
public class PrimaryGreetingsService implements GreetingsService{
    @Override
    public void sayGreetings() {
        System.out.println("Hello world - En");
    }
}
