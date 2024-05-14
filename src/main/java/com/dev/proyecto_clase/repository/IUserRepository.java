package com.dev.proyecto_clase.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.proyecto_clase.model.User;



@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
