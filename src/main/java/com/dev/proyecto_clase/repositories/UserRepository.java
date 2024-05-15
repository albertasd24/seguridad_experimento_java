package com.dev.proyecto_clase.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.proyecto_clase.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
