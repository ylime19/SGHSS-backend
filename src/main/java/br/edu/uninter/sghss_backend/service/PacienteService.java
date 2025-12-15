package br.edu.uninter.sghss_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.uninter.sghss_backend.entity.Paciente;
import br.edu.uninter.sghss_backend.repository.PacienteRepository;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }
}
