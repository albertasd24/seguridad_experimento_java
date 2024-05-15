package com.dev.proyecto_clase.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dev.proyecto_clase.dto.UserDto;
import com.dev.proyecto_clase.model.User;
import com.dev.proyecto_clase.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()) ,userDto.getRole(),userDto.getFullName());
        userRepository.save(user);
        return null;
    }
    
}
