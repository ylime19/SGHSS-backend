package br.edu.uninter.sghss_backend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.uninter.sghss_backend.entity.Paciente;
import br.edu.uninter.sghss_backend.service.PacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    //Listar
    @GetMapping
    public List<Paciente> listar() {
        return service.listarTodos();
    }

    //Adicionar
    @PostMapping
    public Paciente salvar(@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }

    //Atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Paciente> atualizar(
            @PathVariable Long id,
            @RequestBody Paciente paciente) {

        Paciente atualizado = service.atualizar(id, paciente);
        return ResponseEntity.ok(atualizado);
    }

    //Deletar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}


