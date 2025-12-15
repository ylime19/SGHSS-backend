package br.edu.uninter.sghss_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uninter.sghss_backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

