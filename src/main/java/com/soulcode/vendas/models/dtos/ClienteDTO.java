package com.soulcode.vendas.models.dtos;

import com.soulcode.vendas.models.Cliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

public class ClienteDTO {

    private Long id;

    @NotBlank(message = "O nome deve ser preenchido!")
    private String nome;

    @NotBlank(message = "O e-mail deve ser preenchido!")
    @Email(message = "O e-mail está inválido!")
    private String email;

    @NotBlank(message = "O CPF deve ser preenchido!")
    @CPF(message = "O CPF está inválido!")
    private String cpf;

    @NotBlank(message = "A data de nascimento deve ser preenchida!")
    private String dataNascimento;

    @NotBlank(message = "O telefone deve ser preenchido!")
    private String telefone;

    @NotBlank(message = "O logradouro deve ser preenchido!")
    private String logradouro;

    @NotBlank(message = "O número deve ser preenchido!")
    private String numero;

    @NotBlank(message = "A cidade deve ser preenchida!")
    private String cidade;

    @NotBlank(message = "O estado deve ser preenchido!")
    private String estado;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.email = cliente.getEmail();
        this.cpf = cliente.getCpf();
        this.dataNascimento = cliente.getDataNascimento();
        this.telefone = cliente.getTelefone();
        this.logradouro = cliente.getLogradouro();
        this.numero = cliente.getNumero();
        this.cidade = cliente.getCidade();
        this.estado = cliente.getEstado();
    }

    public static Cliente convert(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setId(clienteDTO.getId());
        cliente.setNome(clienteDTO.getNome());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setLogradouro(clienteDTO.getLogradouro());
        cliente.setNumero(clienteDTO.getNumero());
        cliente.setCidade(clienteDTO.getCidade());
        cliente.setEstado(clienteDTO.getEstado());
        return cliente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
