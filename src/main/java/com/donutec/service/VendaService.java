package com.donutec.service;

import com.donutec.model.ItensVenda;
import com.donutec.model.Produto;
import com.donutec.model.Venda;
import com.donutec.repository.AdicionalRepository;
import com.donutec.repository.ClienteRepository;
import com.donutec.repository.ProdutoRepository;
import com.donutec.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VendaService {

    private List<ItensVenda> itensVenda = new ArrayList<ItensVenda>();
    private Venda venda = new Venda();

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private AdicionalRepository adicionalRepository;




}
