package com.example.demo.repository;

import com.example.demo.repository.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HelloWorldRepository extends JpaRepository<User, Long> {

    public User getUserById(Long id);


}
