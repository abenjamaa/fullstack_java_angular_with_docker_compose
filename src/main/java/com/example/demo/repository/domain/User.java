package com.example.demo.repository.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table( name = "HELLO_WORLD")
@Data
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
}


