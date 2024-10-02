package com.example.singup.service;

import com.example.singup.dtos.UserDTO;
import com.example.singup.model.User;


public interface RegisterService {
    User registernew(UserDTO userDTO) throws Exception;
}
