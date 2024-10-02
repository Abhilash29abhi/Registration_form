package com.example.singup.repository;


import com.example.singup.model.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findBypassword(String password);
}

