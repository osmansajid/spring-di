package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyBasedInjectionController {

    @Qualifier("propertyGreetingsService")
    @Autowired
    public GreetingsService greetingsService;

    public void sayGreetings(){
        greetingsService.sayGreetings();
    }
}
