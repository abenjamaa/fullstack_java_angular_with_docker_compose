package com.example.demo.services.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;


@Data
public class UserDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
}


