package com.example.springdi;

import com.example.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ConcurrentModificationException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springdi.controllers","com.example.springdi.services"})
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        myController.sayHello();

        System.out.println("------Property------");
        I18NController i18NController = (I18NController) context.getBean("i18NController");
        i18NController.sayHello();

        System.out.println("------Property------");
        PropertyBasedInjectionController propertyBasedInjectionController = (PropertyBasedInjectionController) context.getBean("propertyBasedInjectionController");
        propertyBasedInjectionController.sayGreetings();

        System.out.println("------Setter------");
        SetterBasedInjectionController setterBasedInjectionController = (SetterBasedInjectionController) context.getBean("setterBasedInjectionController");
        setterBasedInjectionController.sayGreetings();

        System.out.println("------Constructor------");
        ConstructorBasedInjectionController constructorBasedInjectionController = (ConstructorBasedInjectionController) context.getBean("constructorBasedInjectionController");
        constructorBasedInjectionController.sayGreetings();
    }

}
