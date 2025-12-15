package br.edu.uninter.sghss_backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.uninter.sghss_backend.entity.Consulta;
import br.edu.uninter.sghss_backend.repository.ConsultaRepository;

@Service
public class ConsultaService {

    private final ConsultaRepository repository;

    public ConsultaService(ConsultaRepository repository) {
        this.repository = repository;
    }

    public List<Consulta> listarTodas() {
        return repository.findAll();
    }
}
