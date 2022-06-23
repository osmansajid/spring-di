package com.example.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Profile({"De"})
@Service("primaryGreetingsService")
public class PrimaryGermanGreetingsService implements GreetingsService {
    @Override
    public void sayGreetings() {
        System.out.println("Hallo Welt - De");
    }
}
