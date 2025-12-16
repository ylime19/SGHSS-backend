package br.edu.uninter.sghss_backend.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {
    


    // Identificador único do paciente
    // Chave primaria gerada automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // Nome do paciente obrigatorio
    @Column(nullable = false, length = 100)
    private String nome;

   // cpf do paciente obrigatório
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;


    // data de nascimentodo paciente obrigatório
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;
 

   //telefone do paciente
    @Column(length = 20)
    private String telefone;

    public Paciente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
