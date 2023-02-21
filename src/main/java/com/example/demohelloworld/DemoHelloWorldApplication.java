package com.example.demohelloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoHelloWorldApplication {

    @Value("${hello.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(DemoHelloWorldApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHelloFromProperties(){
        return "Hello, "+ name;
    }

}
