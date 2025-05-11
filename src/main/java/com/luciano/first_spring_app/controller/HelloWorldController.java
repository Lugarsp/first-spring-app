package com.luciano.first_spring_app.controller;


import com.luciano.first_spring_app.domain.User;
import com.luciano.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    //public HelloWorldController(HelloWorldService helloWorldService){
    //    this.helloWorldService = helloWorldService;
    //}

    // Fica escutando o metodo GET
    // GET /hello-world
    @GetMapping
    public String helloWorld(){
        //return "Hello Controller";
        return helloWorldService.helloWorld("Luciano");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestBody User body){
        String name = body.getName();
        return "Hello Controller POST = " + name + id;
    }

}
