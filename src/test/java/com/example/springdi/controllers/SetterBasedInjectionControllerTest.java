package com.example.springdi.controllers;

import com.example.springdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedInjectionControllerTest {
    SetterBasedInjectionController setterBasedInjectionController;

    @BeforeEach
    void setUp() {
        setterBasedInjectionController = new SetterBasedInjectionController();
        setterBasedInjectionController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    void sayGreetings() {
        setterBasedInjectionController.sayGreetings();
    }
}