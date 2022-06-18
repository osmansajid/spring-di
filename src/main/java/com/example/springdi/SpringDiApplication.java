package com.example.springdi;

import com.example.springdi.controllers.ConstructorBasedInjectionController;
import com.example.springdi.controllers.MyController;
import com.example.springdi.controllers.PropertyBasedInjectionController;
import com.example.springdi.controllers.SetterBasedInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ConcurrentModificationException;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringDiApplication.class, args);
        MyController myController = (MyController) context.getBean("myController");
        myController.sayHello();

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
