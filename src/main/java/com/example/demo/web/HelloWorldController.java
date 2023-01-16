package com.example.demo.web;

import com.example.demo.services.HelloWorldService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldController {
    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }


    @RequestMapping("/{id}")
    public String sayHello(@PathVariable Long id){
        return helloWorldService.helloWorld(id).toString();
    }
}