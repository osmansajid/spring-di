package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyBasedInjectionControllerTest {

    private PropertyBasedInjectionController propertyBasedInjectionController;

    @BeforeEach
    void setUp() {
        propertyBasedInjectionController = new PropertyBasedInjectionController();
        propertyBasedInjectionController.greetingsService = new GreetingsServiceImpl();
    }

    @Test
    void sayGreetings() {
        propertyBasedInjectionController.sayGreetings();
    }
}