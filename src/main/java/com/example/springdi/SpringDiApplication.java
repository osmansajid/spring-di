package com.example.springdi;

import com.example.springdi.controllers.*;
import com.example.springdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.ConcurrentModificationException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.springdi.controllers","com.example.springdi.services","com.example.springdi.config"})
public class SpringDiApplication {

    public static void main(String[] args) {
        System.out.println("------Primary & Profile------");
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

        System.out.println("-----Properties config------");
        FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername()+ " " + fakeDataSource.getPassword() + " " + fakeDataSource.getDbUrl());
    }

}
