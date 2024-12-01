
package com.example.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring_app.service.HelloWorldService;

@RestController
@RequestMapping("/test")
class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    


    @GetMapping
    public String helloWorld(){
        return "hello world";
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id){
        String[] veiculos = {"Chevrolet Onix","Fiat Mobi","Volkswagen Gol"};
        
        return veiculos[Integer.parseInt(id)-1];
    }
}