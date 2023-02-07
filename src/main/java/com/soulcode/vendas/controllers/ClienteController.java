package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.dtos.ClienteDTO;
import com.soulcode.vendas.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/clientes")
    public ClienteDTO save(@RequestBody @Valid ClienteDTO dto) {
        return this.clienteService.save(dto);
    }

    @GetMapping("/clientes")
    public List<ClienteDTO> findAll() {
        return this.clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public ClienteDTO findById(@PathVariable Long id) {
        return this.clienteService.findById(id);
    }

    @DeleteMapping("/clientes/{id}")
    public ClienteDTO deleteById(@PathVariable Long id) {
        return this.clienteService.deleteById(id);
    }

    @PutMapping("/clientes/{id}")
    public ClienteDTO updateById(@PathVariable Long id, @RequestBody @Valid ClienteDTO dto) {
        return this.clienteService.updateById(id, dto);
    }
}
