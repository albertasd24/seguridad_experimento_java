package com.dev.proyecto_clase.services;

import org.springframework.stereotype.Service;

import com.dev.proyecto_clase.dto.UserDto;
import com.dev.proyecto_clase.model.User;

@Service
public interface UserService {
    User save (UserDto userDto);
}
