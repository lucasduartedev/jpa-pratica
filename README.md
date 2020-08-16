# Projeto de pratica - JPA Java Persistence API

## Objetivo
- Colocar em prática os conhecimnetos obtidos através do livro *JPA Eficaz* (a casa do código) e Curso *Java e JPA* (alura)

## Configurações do projeto

### Docker
- O __*docker*__ foi usado nesse projeto para manter o banco de dados em contêiner.

### Banco de Dados
- Foi escolhido o __*MySQL*__ para armazenar os dados gerados durante a construção projeto.

### Dependências
- Foram usadas somente 2(duas) depêndias nesse projeto:
  - Hibernate Core: para utilização do JPA;
  - MySQL Connector Java: para e efetuar as transações com o banco de dados;

## O Projeto
- Simula um sistema de banco contendo informações de básicas de contas, clientes, enderecos. O sistema é simples pois serve apenas para colocar em prática o uso do JPA em projetos Java.

### Relacionamento **@OneToOne** entre Clientes e Contas
* Cada cliente pode ser dono de apenas uma conta e vice-versa.
* Analisando as tabelas geradas no banco de dados a tabela _contas_ é uma entidade forte, já que a tabela _clientes_ fica responsável por conter a _chave primária_ da tabela conta.
  - As regras de negócio vai da empresa responsável pelo sistema defini-las;

<!--
### Teste com JUnit
-->

## Fontes
  - Livro: JPA Eficaz - As melhores práticas de persistência de dados em Java;
  - [x] [Link do livro](https://www.casadocodigo.com.br/products/livro-jpa-eficaz)
  
  - Alura: Java e JPA: Persista seus objetos com a JPA2 e Hibernate;
  - [x] [Link do curso](https://www.alura.com.br/curso-online-jpa-hibernate-persistencia-objetos)
