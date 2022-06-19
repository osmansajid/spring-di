package com.example.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Es")
@Service("i18NGreetingsService")
public class I18NSpanishGreetingsService implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hola Mundo - Es");
    }
}
