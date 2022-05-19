/* Criando uma base de dados */

create database mercearia;
/*Criando tabela(entidade) do produto*/
create table produto(
    codigo serial primary key,
    nome varchar (100),
    valor numeric(10,2),
    qtdEstoque int
);

create table cliente(
    codigo serial primary key,
    nome varchar (100),
    telefone varchar(30),
    email varchar (100)
);

create table fornecedor(
    codigo serial primary key,
    razaoSocial varchar(100),
    telefone varchar(100),
    email varchar(100)
);