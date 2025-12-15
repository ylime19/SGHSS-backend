package br.edu.uninter.sghss_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uninter.sghss_backend.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
