package com.example.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Profile({"Es"})
@Service("primaryGreetingsService")
public class PrimarySpanishGreetingsService implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hola Mundo - Es");
    }
}
