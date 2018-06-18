package com.guazi.finance;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource("classpath:/config/spring-consumer.xml")
@PropertySource("classpath:/config/dubbo.properties")
public class BackendApplication {
    public  static void main(String[] args){
        SpringApplication.run(BackendApplication.class,args);
    }
}
