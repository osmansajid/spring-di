package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedInjectionControllerTest {
    ConstructorBasedInjectionController constructorBasedInjectionController;

    @BeforeEach
    void setUp() {
        constructorBasedInjectionController = new ConstructorBasedInjectionController(new GreetingsServiceImpl());
    }

    @Test
    void sayGreetings() {
        constructorBasedInjectionController.sayGreetings();
    }
}