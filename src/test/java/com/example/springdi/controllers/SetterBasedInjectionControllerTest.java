package com.example.springdi.controllers;

import com.example.springdi.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterBasedInjectionControllerTest {
    SetterBasedInjectionController setterBasedInjectionController;

    @BeforeEach
    void setUp() {
        setterBasedInjectionController = new SetterBasedInjectionController();
        setterBasedInjectionController.setGreetingsService(new ConstructorGreetingsService());
    }

    @Test
    void sayGreetings() {
        setterBasedInjectionController.sayGreetings();
    }
}