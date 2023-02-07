package com.soulcode.vendas.models;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Float valorParcial;

    @Column(nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Venda venda;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Produto produto;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValorParcial() {
        return valorParcial;
    }

    public void setValorParcial(Float valorParcial) {
        this.valorParcial = valorParcial;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
