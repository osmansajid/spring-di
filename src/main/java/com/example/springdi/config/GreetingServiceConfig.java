package com.example.springdi.config;

import com.example.springdi.services.GreetingServiceFactory;
import com.example.springdi.services.GreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"En","default"})
    GreetingsService primaryGreetingsService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("En");
    }

    @Bean
    @Primary
    @Profile({"Es"})
    GreetingsService primarySpanishGreetingsService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("Es");
    }

    @Bean
    @Primary
    @Profile({"De"})
    GreetingsService primaryGermanGreetingsService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("De");
    }
}
