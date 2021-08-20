create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipoProduto varchar(255),
descricao varchar(255),
receita boolean, 
primary key(id)
);

select * from tb_categoria;
select* from tb_produto;
insert into  tb_categoria(tipoProduto, descricao, receita) values("Medicacao", "utilzado para tratamento de gastrite", true);
insert into  tb_categoria(tipoProduto, descricao, receita) values("Medicacao", "utilizado para dores de cabeca", false);
insert into  tb_categoria(tipoProduto, descricao, receita) values("Alimento", "Suco sabor baunilha", false);
insert into  tb_categoria(tipoProduto, descricao, receita) values("Cosmetico", "Desodorante aerosol", false);
insert into  tb_categoria(tipoProduto, descricao, receita) values("Cosmetico", "Secante de espinhas", false);

create table tb_produto(
id bigint auto_increment,
nome varchar(255), 
qtdProduto int, 
valor decimal(8,2),
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome, qtdProduto, valor) values ("Pantoprazol", 50, 69.9);
insert into tb_produto(nome, qtdProduto, valor) values ("Dorflex", 500, 9.90);
insert into tb_produto(nome, qtdProduto, valor) values ("Suco de Baunilha", 100, 5.50);
insert into tb_produto(nome, qtdProduto, valor) values ("Rexona", 50, 12.9);
insert into tb_produto(nome, qtdProduto, valor) values ("Minancora", 70, 29.9);

select * from tb_produto;

select * from tb_produto where valor > 50;
select * from tb_produto where valor >3 and valor < 60;
select * from tb_produto where nome like "%b%";

select nome, qtdProduto, tb_categoria.tipoProduto,  valor from tb_produto as A inner join tb_categoria on categoria_id = tb_categoria.id;

select nome from tb_produto where categoria_id =1 or categoria_id = 2;