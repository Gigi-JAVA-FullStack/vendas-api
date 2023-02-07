# API Vendas

## Descrição
[API Vendas](https://github.com/gabriel-soulcode/vendas-api) é uma API Rest criada com objetivo prático de trabalhar os fundamentos de desenvolvimento de API Rest
com Spring e Hibernate, dois grandes frameworks do ecosistema Java.

## Tecnologias
#### Spring + Hibernate + MySQL

## Ferramentas
* IntelliJ IDEA Community Edition
* MySQL Workbench
* Postman
* Google Chrome

## Como executar a aplicação?
1. Abra o terminal do seu computador e execute o comando `git clone https://github.com/gabriel-soulcode/vendas-api`
2. Abra o IntelliJ IDEA Community Edition e nele abra o diretório que foi gerado pelo comando anteriror
3. Aguarde o Maven fazer o download automático das dependências e execute o arquivo `VendasApiApplication.java`

## Endpoints

### Produto
* `POST: /produtos` Salvar um novo produto
* `GET: /produtos` Consultar todos os produtos
* `GET: /produtos/{id}` Consultar produto por identificador
* `DELETE: /produtos/{id}` Excluir produto por identificador
* `PUT: /produtos/{id}` Editar produto por identificador

### Cliente
* `POST: /clientes` Salvar um novo cliente
* `GET: /clientes` Consultar todos os clientes
* `GET: /clientes/{id}` Consultar cliente por identificador
* `DELETE: /clientes/{id}` Excluir cliente por identificador
* `PUT: /clientes/{id}` Editar cliente por identificador

### Venda
* `POST: /vendas` Salvar uma nova venda
* `GET: /vendas` Consultar todas as vendas
* `GET: /vendas/{id}` Consultar venda por identificador



### Item
* `GET: /itens/venda/{idVenda}` Consultar itens por identificador da venda

## Sugestão
Se você quer se desafiar, continue melhorando este projeto. Faça um _Fork_ deste repositório e aplicaque as melhorias que você quiser. Ou caso esteja querendo práticar
seus conhecimentos em _front-end_, você pode utilizar este projeto como seu _back-end_.

## SoulCode Academy
Este projeto foi criado pelo curso de Spring e Hibernate da [SoulCode Academy](https://soulcode.com).
