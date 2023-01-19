package com.example.demo.services;


import com.example.demo.repository.UserRepository;
import com.example.demo.repository.domain.User;
import com.example.demo.services.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final UserRepository userRepository;


    public UserDto getUser(Long id){
        return UserMapper.INSTANCE.userToUserDto(userRepository.getUserById(id));
    }

    public List<UserDto> getAllUsers(){
        return UserMapper.INSTANCE.mapList(userRepository.findAll());
    }

    public UserDto saveUser(UserDto userDto){
        return UserMapper.INSTANCE.userToUserDto(userRepository.saveAndFlush(UserMapper.INSTANCE.userDtoToUser(userDto)));
    }
}
