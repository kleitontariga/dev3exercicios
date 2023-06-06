-- Criar o banco de dados
create database if not exists loja_alvorada_noite;
-- Ativar o banco de dados que desejamos trabalhar
use loja_alvorada_noite;
-- Criando as tabelas
create table if not exists vendedores(
	codigo smallint primary key auto_increment,
    nome varchar(20) not null,
    cpf char(14) not null unique key,
    email varchar(30) not null unique key,
    salario decimal(6,2) not null
);

create table if not exists clientes(
	codigo smallint primary key auto_increment,
    nome varchar(20) not null,
    cpf char(14) not null unique key,
    email varchar(30) not null unique key,
    pontos_de_fidelidade smallint
);

create table if not exists produtos(
	sku varchar(15) primary key,
    codigo_de_barra varchar(15),
    nome varchar(20) not null,
    preco decimal(6,2) not null,
    data_de_validade date
);

create table if not exists vendas(
	codigo int primary key auto_increment,
    data_da_venda date not null,
    codigo_do_vendedor smallint not null,
    codigo_do_cliente smallint not null,
    constraint fk_codigo_vendedor foreign key (codigo_do_vendedor) references vendedores(codigo),
    constraint fk_codigo_cliente foreign key (codigo_do_cliente) references clientes(codigo)
);

create table if not exists itens(
	codigo_do_produto varchar(15) not null,
    codigo_da_venda int not null,
    quantidade tinyint not null,
    primary key(codigo_do_produto,codigo_da_venda),
    constraint fk_codigo_produto foreign key(codigo_do_produto) references produtos(sku),
    constraint fk_codigo_venda foreign key (codigo_da_venda) references vendas(codigo)
);