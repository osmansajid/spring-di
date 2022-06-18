package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }
    public void sayHello(){
        greetingsService.sayGreetings();
    }
}
