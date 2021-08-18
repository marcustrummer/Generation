create database ecommerce;
use ecommerce;

create table produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal(8,2),
setor varchar(20),
descricao varchar(80),
primary key (id)
);

insert into produtos(nome, preco, setor, descricao) values ("iPhone", 7900, "Informatica", "Novo" );
insert into produtos(nome, preco, setor, descricao) values ("Galaxy s21", 5900, "Informatica", "SemiNovo" );
insert into produtos(nome, preco, setor, descricao) values ("Notebook Dell", 2550, "Informatica", "Usado" );
insert into produtos(nome, preco, setor, descricao) values ("SmarTV Samsung", 10900, "Informatica", "Novo, 52 polegadas" );
insert into produtos(nome, preco, setor, descricao) values ("Redmi note 9", 1600, "Informatica", "Novo" );
insert into produtos(nome, preco, setor, descricao) values ("Nokia tijolao", 499, "Informatica", "Usado" );

select id, nome, preco from produtos where preco < 500;
select id, nome, preco from produtos where preco > 500;

update produtos set nome = "Nokia N30" where id=6;