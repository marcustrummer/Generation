package br.com.marquito.git.Aula05Exercicio02;
/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Aviao {
	
	// Atributos do aviao:
	
	String modelo;
	int ano;
	String marca;
	int capacidade;
	int velocidade;

	
	
	void acelera(int aceleracao) {
		velocidade += aceleracao;
		if(velocidade>= 400) {
			System.out.println("Preparando para decolar...");
		}
	}
	
	void reduzindo(int reducao) {
		velocidade -= reducao;
		if(velocidade <= 200) {
			System.out.println("Preparando para pouso...");
		}
	}
	
	
	void preparandoParaPouso(int velocidade){
		
	}
}
