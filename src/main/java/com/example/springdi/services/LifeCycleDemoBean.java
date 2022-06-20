package com.example.springdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    LifeCycleDemoBean(){
        System.out.println("LifeCycle: constructor has been called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("LifeCycle: factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("LifeCycle: name has been set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LifeCycle: bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LifeCycle: properties has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("LifeCycle: application context has been set");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("LifeCycle: bean will be destroyed");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("LifeCycle: bean has been constructed");
    }
}
