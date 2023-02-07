package com.soulcode.vendas.services;

import com.soulcode.vendas.models.Venda;
import com.soulcode.vendas.models.dtos.VendaDTO;
import com.soulcode.vendas.repositories.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    public VendaDTO save(VendaDTO dto) {
        Venda venda = VendaDTO.convert(dto);
        for(int i = 0; i < venda.getItens().size(); i++) {
            venda.getItens().get(i).setVenda(venda);
        }
        venda = this.vendaRepository.save(venda);
        return new VendaDTO(venda);
    }

    public List<VendaDTO> findAll() {
        List<Venda> vendas = this.vendaRepository.findAll();
        return vendas.stream().map(VendaDTO::new).collect(Collectors.toList());
    }

    public VendaDTO findById(Long id) {
        Optional<Venda> venda = this.vendaRepository.findById(id);
        if(venda.isEmpty()) {
            throw new RuntimeException("A venda não foi encontrada!");
        }
        else {
            return new VendaDTO(venda.get());
        }
    }
}
