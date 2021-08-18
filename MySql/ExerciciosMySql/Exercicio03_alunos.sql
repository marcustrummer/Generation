create database escola;
use escola;

create table alunos(
id bigint auto_increment, 
nome varchar(255) not null,
idade bigint not null,
serie varchar(20),
nota decimal(8,2),
primary key (id)
);

insert into alunos(nome, idade , serie, nota) values ("Yan"  , 23, "2o ano", 6);
insert into alunos(nome, idade , serie, nota) values ("Pedro"  , 25, "3o ano", 6.5);
insert into alunos(nome, idade , serie, nota) values ("Humberto"  , 20, "1o ano", 6);
insert into alunos(nome, idade , serie, nota) values ("Trummer"  , 24, "Generation", 8);

select id, nome, nota from alunos where nota < 7;
select id, nome, nota from alunos where nota < 7;
select * from alunos;

update alunos set nota = 7 where id=2;
