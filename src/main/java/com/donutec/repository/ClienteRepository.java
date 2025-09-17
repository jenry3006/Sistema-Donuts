package com.donutec.repository;

import com.donutec.dto.ClienteDTO;
import com.donutec.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    public List<ClienteDTO> findByNomeContainingIgnoreCase(String nome);

}
