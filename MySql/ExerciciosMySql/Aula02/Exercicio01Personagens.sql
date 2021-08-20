create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
classe varchar(255),
subclasse varchar(255),
primary key (id)
);

insert into tb_classe(classe, subclasse) values ("Guerreiro", "Ninja");
insert into tb_classe(classe, subclasse) values ("Guerreiro", "Viking");
insert into tb_classe(classe, subclasse) values ("Guerreiro", "Cavaleiro");
insert into tb_classe(classe, subclasse) values ("Arqueiro", "Elfo");
insert into tb_classe(classe, subclasse) values ("Mago", "Bruxo");

select * from tb_classe;
select * from tb_personagem;

create table tb_personagem(
id bigint auto_increment,
nome varchar(255),
genero varchar(20),
poderAtaque bigint,
poderDefesa bigint,
classe_id bigint,
primary key (id),
FOREIGN KEY (classe_id) REFERENCES tb_classe (id)
);


insert into tb_personagem(nome, genero, classe_id, poderAtaque, poderDefesa) values ("Lagertha Lothbrok", "Feminino", 2, 9000, 4000);
insert into tb_personagem(nome, genero, classe_id, poderAtaque, poderDefesa) values ("Hattori Hanro", "Masculino",1 , 6500, 9000);
insert into tb_personagem(nome, genero, classe_id, poderAtaque, poderDefesa) values ("Jaime Lannister", "Masculino",3 , 9000,7000);
insert into tb_personagem(nome, genero, classe_id, poderAtaque, poderDefesa) values ("Legolas Greenleaf", "Masculino",4 , 9200,3500);
insert into tb_personagem(nome, genero, classe_id, poderAtaque, poderDefesa) values ("Alvo Dumbledore", "Masculino",5 , 9200,9500);

select * from tb_personagem where poderAtaque>2000;
select * from  tb_personagem where poderDefesa > 1000 and poderDefesa < 2000;
select * from tb_personagem where nome like "%c%";

select nome, genero, poderAtaque, poderDefesa, tb_classe.classe, tb_classe.subclasse from tb_personagem inner join tb_classe on classe_id = tb_classe.id;

select * from tb_personagem where classe_id = 4;




