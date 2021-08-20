create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
tipoCarne varchar(255),
descricao varchar(255),
primary key(id)
);

insert into tb_categoria(tipoCarne, descricao) values ("Bovino", "Friboi");
insert into tb_categoria(tipoCarne, descricao) values ("Suino", "Seara");
insert into tb_categoria(tipoCarne, descricao) values ("Suino", "Perdigao");
insert into tb_categoria(tipoCarne, descricao) values ("Bovino", "Friboi");
insert into tb_categoria(tipoCarne, descricao) values ("Bovino", "SoBoi");


insert into tb_produto(nome, valor, qtdProduto) values ("Carne de sol", 78.0, 20);
insert into tb_produto(nome, valor, qtdProduto) values ("Bacon", 35.0, 50);
insert into tb_produto(nome, valor, qtdProduto) values ("Picanha suina", 90.0, 50);
insert into tb_produto(nome, valor, qtdProduto) values ("Picanha Bovina", 120.0, 70);
insert into tb_produto(nome, valor, qtdProduto) values ("File mignon", 29.9, 20);

create table tb_produto(
id bigint auto_increment,
nome varchar(255),
valor decimal(5,2),
qtdProduto int,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);



select * from tb_produto;
select * from tb_produto where valor> 50;
select * from tb_produto where valor <3 and valor> 60;
select * from tb_produto where nome like "%c%";
select nome, tb_categoria.tipoCarne,  valor from tb_produto as A inner join tb_categoria on categoria_id = tb_categoria.id;


