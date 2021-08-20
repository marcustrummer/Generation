create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
marca varchar(255),
tipoMaterial varchar(50),
primary key (id)
);


create table tb_produto(
id bigint auto_increment,
nome varchar(255),
valor decimal(5,2),
qtdProduto int,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(tipoMaterial, marca) values ("Metal", "Soferro");
insert into tb_categoria(tipoMaterial, marca) values ("PVC", "Tigre");
insert into tb_categoria(tipoMaterial, marca) values ("Blindado", "BlindagemSA");
insert into tb_categoria(tipoMaterial, marca) values ("Isolado", "ProtecTudo");


insert into tb_produto(nome, valor, qtdProduto, categoria_id) values ("Cano de tubulacao", 182.0, 20, 2);
insert into tb_produto(nome, valor, qtdProduto, categoria_id) values ("Ferragem", 350.0, 50,1);
insert into tb_produto(nome, valor, qtdProduto, categoria_id) values ("Extensao para bombas hidraulica", 90.0, 50,4);
insert into tb_produto(nome, valor, qtdProduto, categoria_id) values ("Protecao para vidro veicular", 320.0, 70,3);
insert into tb_produto(nome, valor, qtdProduto, categoria_id) values ("Placa de aco", 459.9, 20,1);
insert into tb_produto(nome, valor, qtdProduto, categoria_id) values ("Eletroduto", 350.9, 100,2);


select * from tb_produto;
select * from tb_produto where valor> 50;
select * from tb_produto where valor >3 and valor< 60;
select * from tb_produto where nome like "%c%";
select nome as Nome, tb_categoria.tipoMaterial as Tipo,tb_categoria.marca as Marca ,   valor as Valor from tb_produto
inner join tb_categoria on categoria_id = tb_categoria.id;

select nome as Nome, tb_categoria.tipoMaterial as Tipo,tb_categoria.marca as Marca ,   valor as Valor from tb_produto
inner join tb_categoria on categoria_id = tb_categoria.id where tb_categoria.id = 1;
