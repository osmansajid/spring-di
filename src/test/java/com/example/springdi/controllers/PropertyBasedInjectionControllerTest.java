package com.example.springdi.controllers;

import com.example.springdi.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyBasedInjectionControllerTest {

    private PropertyBasedInjectionController propertyBasedInjectionController;

    @BeforeEach
    void setUp() {
        propertyBasedInjectionController = new PropertyBasedInjectionController();
        propertyBasedInjectionController.greetingsService = new ConstructorGreetingsService();
    }

    @Test
    void sayGreetings() {
        propertyBasedInjectionController.sayGreetings();
    }
}