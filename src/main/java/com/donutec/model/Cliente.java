package com.donutec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do cliente não pode estar vazio.")
    private String nome;
    @NotBlank(message = "O endereço não pode estar vazio.")
    private String endereco;
    private String telefone;
    private LocalDate dataNascimento;


}
