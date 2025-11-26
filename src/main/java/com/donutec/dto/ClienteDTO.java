package com.donutec.dto;

import com.donutec.model.Cliente;

import java.time.LocalDate;

public class ClienteDTO {

    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;
    private String observacao;

    public ClienteDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public ClienteDTO(){}


    @Override
    public String toString() {
        return "ClienteDTO{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public ClienteDTO(Cliente cliente){
        id = cliente.getId();
        nome = cliente.getNome();
        endereco = cliente.getEndereco();
        telefone = cliente.getTelefone();
        dataNascimento = cliente.getDataNascimento();
        observacao = cliente.getObservacao();
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
