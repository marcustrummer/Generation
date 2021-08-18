create database rh_funcionarios;

use rh_funcionarios;

create table funcionario(
id bigint auto_increment,
nome varchar(255) not null,
idade bigint not null, 
salario decimal(8,2) not null,
planoSaude varchar(50),
primary key (id)
);

select * from funcionario;

insert into funcionario(nome, idade, salario, planoSaude) values ("Artur", 23, 2500, "CapeSaude");
insert into funcionario(nome, idade, salario, planoSaude) values ("Raquel", 26, 1500, "Unimed");
insert into funcionario(nome, idade, salario, planoSaude) values ("Marilia", 27, 3500, "Hapvida");
insert into funcionario(nome, idade, salario, planoSaude) values ("Trummer", 24, 4500, "Bradesco");
insert into funcionario(nome, idade, salario, planoSaude) values ("Cybelle", 22, 1900, "Geap");

select id, nome, salario from funcionario where salario > 2000;
select id, nome, salario from funcionario where salario < 2000;

update funcionario set planoSaude = "Santander" where id=2;


