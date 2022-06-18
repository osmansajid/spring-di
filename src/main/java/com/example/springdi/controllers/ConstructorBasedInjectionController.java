package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedInjectionController {
    private final GreetingsService greetingsService;

    public ConstructorBasedInjectionController(@Qualifier("constructorGreetingsService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void sayGreetings(){
        greetingsService.sayGreetings();
    }
}
