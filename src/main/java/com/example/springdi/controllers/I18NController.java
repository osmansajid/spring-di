package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingsService greetingsService;

    public I18NController(@Qualifier("primaryGreetingsService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public void sayHello(){
        greetingsService.sayGreetings();
    }
}
