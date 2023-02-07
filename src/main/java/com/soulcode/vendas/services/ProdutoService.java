package com.soulcode.vendas.services;

import com.soulcode.vendas.models.Produto;
import com.soulcode.vendas.models.dtos.ProdutoDTO;
import com.soulcode.vendas.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoDTO save(ProdutoDTO dto) {
        Produto produto = ProdutoDTO.convert(dto);
        produto = this.produtoRepository.save(produto);
        return new ProdutoDTO(produto);
    }

    public List<ProdutoDTO> findAll() {
        List<Produto> produtos = this.produtoRepository.findAll();
        return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
    }

    public ProdutoDTO findById(Long id) {
        Optional<Produto> resultado = this.produtoRepository.findById(id);
        if(resultado.isEmpty()) {
            throw new RuntimeException("O produto não foi encontrado!");
        }
        else {
            return new ProdutoDTO(resultado.get());
        }
    }

    public ProdutoDTO deleteById(Long id) {
        ProdutoDTO dto = this.findById(id);
        this.produtoRepository.deleteById(id);
        return dto;
    }

    public ProdutoDTO updateById(Long id, ProdutoDTO dto) {
        this.findById(id);
        Produto produto = ProdutoDTO.convert(dto);
        produto.setId(id);
        produto = this.produtoRepository.save(produto);
        return new ProdutoDTO(produto);
    }
}
