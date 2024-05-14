package com.dev.proyecto_clase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.proyecto_clase.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findByNombre(String nombre);
}
