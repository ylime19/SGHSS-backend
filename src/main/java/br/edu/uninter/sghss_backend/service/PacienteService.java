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

    // CRIAR
    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    // LISTAR
    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    // ATUALIZAR
    public Paciente atualizar(Long id, Paciente dadosAtualizados) {
        Paciente paciente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));

        paciente.setNome(dadosAtualizados.getNome());
        paciente.setCpf(dadosAtualizados.getCpf());
        paciente.setDataNascimento(dadosAtualizados.getDataNascimento());
        paciente.setTelefone(dadosAtualizados.getTelefone());

        return repository.save(paciente);
    }

    // DELETAR
    public void deletar(Long id) {
    if (!repository.existsById(id)) {
        throw new RuntimeException("Paciente não encontrado");
    }
    repository.deleteById(id);
}

}

