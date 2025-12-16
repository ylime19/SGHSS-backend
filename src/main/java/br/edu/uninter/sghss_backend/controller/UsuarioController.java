package br.edu.uninter.sghss_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.uninter.sghss_backend.entity.Usuario;
import br.edu.uninter.sghss_backend.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repository;

    
    //Construtor utilizado para injeção de dependência.
    //O Spring injeta automaticamente a implementação do UsuarioRepository.
     
    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }
}
