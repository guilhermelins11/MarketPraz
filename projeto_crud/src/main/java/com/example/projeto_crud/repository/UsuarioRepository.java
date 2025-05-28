package com.example.projeto_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projeto_crud.model.Usuario; // Import necessário

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos CRUD básicos já estão implementados pelo JpaRepository
}
