package com.example.springdi.config;

import com.example.springdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Value("${dbUrl}")
    String dbUrl;

    @Bean
    public FakeDataSource dataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(environment.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dbUrl);
        return fakeDataSource;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer property(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
