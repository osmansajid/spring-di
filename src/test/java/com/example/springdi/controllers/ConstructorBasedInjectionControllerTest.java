package com.example.springdi.controllers;

import com.example.springdi.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorBasedInjectionControllerTest {
    ConstructorBasedInjectionController constructorBasedInjectionController;

    @BeforeEach
    void setUp() {
        constructorBasedInjectionController = new ConstructorBasedInjectionController(new ConstructorGreetingsService());
    }

    @Test
    void sayGreetings() {
        constructorBasedInjectionController.sayGreetings();
    }
}