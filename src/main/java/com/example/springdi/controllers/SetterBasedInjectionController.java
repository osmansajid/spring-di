package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;

public class SetterBasedInjectionController {
    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void sayGreetings(){
        greetingsService.sayGreetings();
    }
}
