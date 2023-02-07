package com.soulcode.vendas.controllers;

import com.soulcode.vendas.models.dtos.ItemDTO;
import com.soulcode.vendas.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/itens/venda/{idVenda}")
    public List<ItemDTO> findByIdVenda(@PathVariable Long idVenda) {
        return this.itemService.findByIdVenda(idVenda);
    }
}
