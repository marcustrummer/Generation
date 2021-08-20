create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
materia varchar(255),
primary key (id)
);

create table tb_curso(
id bigint auto_increment,
nome varchar(255),
valor decimal(5,2),
qtdVagas int,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(materia) values  ("Portugues");
insert into tb_categoria(materia ) values ("Matematica");
insert into tb_categoria(materia ) values ("Ingles");
insert into tb_categoria(materia ) values ("Completo");


insert into tb_curso(nome, valor, qtdVagas, categoria_id) values ("Mat para todos",400 ,50 ,2 );
insert into tb_curso(nome, valor, qtdVagas, categoria_id) values ("Gramatica Essencial",600 ,100 ,1 );
insert into tb_curso(nome, valor, qtdVagas, categoria_id) values ("Learning english within 3 weeks",900 ,250 ,3 );
insert into tb_curso(nome, valor, qtdVagas, categoria_id) values ("Enem extensivao",700 ,500 ,4 );


select * from tb_produto;
select * from tb_produto where valor> 50;
select * from tb_produto where valor >3 and valor< 60;
select * from tb_produto where nome like "%J%";
select nome as Curso, tb_categoria.materia as Materia, valor as Valor, qtdVagas as Vagas from tb_curso
inner join tb_categoria on categoria_id = tb_categoria.id;


select nome as Curso, tb_categoria.materia as Materia,   valor as Valor, qtdVagas as Vagas from tb_curso
inner join tb_categoria on categoria_id = tb_categoria.id where tb_categoria.id = 1;
