create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255),
tipo varchar(50),
primary key (id)
);

insert into tb_categoria(descricao, tipo) values ( "Leva queijo muzzarela, molho de tomate e calabresa picante", "Salgada");
insert into tb_categoria(descricao, tipo) values ( "Leva queijo muzzarela, prato e queijo do reino derretidos em uma combinacao apaixonante", "Salgada");
insert into tb_categoria(descricao, tipo) values ( "A moda da casa, nossa bestseller, levemente picante, com um toque de molho de tomate e queijo suico", "Salgada");
insert into tb_categoria(descricao, tipo) values ( "Chocolate, banana e nutella: A combinacao pft", "Doce");

select * from tb_categoria;
create table tb_pizza(
id bigint auto_increment,
nome varchar(255),
valor decimal(5,2),
borda boolean,
categoria_id bigint,
refrigerante varchar(50),
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_pizza(nome, valor, borda,refrigerante, categoria_id) values ("Calabresa", 59.9, true, "Coca-cola", 1);
insert into tb_pizza(nome, valor, borda,refrigerante, categoria_id) values ("Tres queijos", 65.5, false,"Fanta",  2);
insert into tb_pizza(nome, valor, borda,refrigerante, categoria_id) values ("Pepperoni", 70.9, true,"Pepsi" , 3);
insert into tb_pizza(nome, valor, borda,refrigerante, categoria_id) values ("Banana Split", 40.9, true,"Pepsi" , 4);

select * from tb_pizza;
select * from tb_categoria;
select * from tb_pizza where valor>45;
select * from tb_pizza where valor>29 and valor<60;

select nome,tb_categoria.descricao, borda, refrigerante, valor  from tb_pizza inner join tb_categoria on categoria_id = tb_categoria.id;

select * from tb_categoria where tipo = "doce";



