package com.donutec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O nome do produto não pode estar vazio.")
    private String nome;
    @NotNull(message = "Defina um preço para o produto")
    private BigDecimal precoVenda;
    @NotNull(message = "Defina um preço para o produto")
    private BigDecimal custo;

}
