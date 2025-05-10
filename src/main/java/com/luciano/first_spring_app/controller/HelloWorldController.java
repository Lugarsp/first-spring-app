package com.luciano.first_spring_app.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    // Fica escutando o metodo GET
    // GET /hello-world
    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }
}
