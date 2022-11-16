drop database if exists Cadastro_clientes;
create database Cadastro_clientes;
use Cadastro_clientes;

Create table Cliente (
	cpf		bigint(15)		not null	primary key,
    nome	varchar(60)		not null,
    cidade 	varchar(60)		not null,
    uf		varchar(4)		not null,
    email	varchar(60)		not null	unique,
    telefone bigint(20)		not null	unique
);


## cadastro de teste    
insert into Cliente(cpf, nome, cidade, uf, email, telefone) values
	(12345678900, "Aurelio Bernardo Cardoso", "Sorocaba", "SP", "abc@gmail.com", "15123456789")

#select * from Cliente;
