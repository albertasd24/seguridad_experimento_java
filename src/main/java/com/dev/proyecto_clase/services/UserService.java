package com.dev.proyecto_clase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.proyecto_clase.model.User;
import com.dev.proyecto_clase.repository.IUserRepository;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;


    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
