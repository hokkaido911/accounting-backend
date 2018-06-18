package com.guazi.finance;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource("classpath:/config/*.xml")
@PropertySource("classpath:/config/dubbo.properties")
public class CoreApplication {
    public static void main(String[] args){
        SpringApplication.run(CoreApplication.class,args);
    }
}
