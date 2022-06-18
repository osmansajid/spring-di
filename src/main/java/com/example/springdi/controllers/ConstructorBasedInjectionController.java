package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;

public class ConstructorBasedInjectionController {
    private final GreetingsService greetingsService;

    public ConstructorBasedInjectionController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void sayGreetings(){
        greetingsService.sayGreetings();
    }
}