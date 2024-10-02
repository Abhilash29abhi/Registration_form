package com.example.singup.controller;

import com.example.singup.dtos.UserDTO;
import com.example.singup.service.RegisterService;
import com.example.singup.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/register")
    public String registernew(@RequestBody UserDTO userDTO) {
        try {
            
            User registered= registerService.registernew(userDTO);
            String response="Registered sucessfully  "+registered.getUsername();
            return response;
        } catch (Exception e) {
            return "Registration failed: " + e.getMessage();
        }
    }
}
