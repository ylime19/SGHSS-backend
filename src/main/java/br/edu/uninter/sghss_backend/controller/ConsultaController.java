package br.edu.uninter.sghss_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.uninter.sghss_backend.entity.Consulta;
import br.edu.uninter.sghss_backend.repository.ConsultaRepository;


/**
 * Controller responsável por expor os endpoints REST
 * relacionados às consultas médicas.
 */
@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    
    //faz comunicação com o banco de dados
    private final ConsultaRepository repository;

    public ConsultaController(ConsultaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Consulta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Consulta agendar(@RequestBody Consulta consulta) {
        return repository.save(consulta);
    }
}

