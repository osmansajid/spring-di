package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;

public class PropertyBasedInjectionController {

    public GreetingsService greetingsService;

    public void sayGreetings(){
        greetingsService.sayGreetings();
    }
}
