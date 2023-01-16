package com.example.demo.services;


import com.example.demo.repository.HelloWorldRepository;
import com.example.demo.repository.domain.User;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public HelloWorldService(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    private final HelloWorldRepository helloWorldRepository;


    public User helloWorld(Long id){
        return helloWorldRepository.getUserById(id);
    }

}
