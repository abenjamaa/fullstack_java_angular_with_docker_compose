package com.example.demo.repository;

import com.example.demo.repository.domain.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {

    public User getUserById(Long id);

     List<User> findAll();

     User saveAndFlush(User user);
}
