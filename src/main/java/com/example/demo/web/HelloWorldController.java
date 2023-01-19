package com.example.demo.web;

import com.example.demo.repository.domain.User;
import com.example.demo.services.UserService;
import com.example.demo.services.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class HelloWorldController {
    private final UserService userService;

    public HelloWorldController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/{id}")
    public UserDto findUserById(@PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping("/")
    public List<UserDto> getAllHelloUser(){
        return userService.getAllUsers();
    }

    @PostMapping("/add-user")
    public UserDto addUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }

}