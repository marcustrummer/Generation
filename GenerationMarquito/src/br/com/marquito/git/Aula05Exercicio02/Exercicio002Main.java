package br.com.marquito.git.Aula05Exercicio02;

import java.util.Scanner;

/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Exercicio002Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Aviao aviao = new Aviao();
		
		aviao.marca = "Boeing";
		aviao.modelo = "737";
		aviao.ano = 1998;
		aviao.capacidade = 215;
		aviao.velocidade = 0;
		
		
		int aceleracao=400;
		int reducao = 200;
		
		System.out.println("[Informacoes do aviao]");
		System.out.println("Marca: [ " + aviao.marca + " ]" );
		System.out.println("Modelo: [ " +aviao.modelo + " ]");
		System.out.println("Ano: [ " +aviao.ano+ " ]" );
		System.out.println("Capacidade: [ " +aviao.capacidade+ " ]" );
		System.out.println("Velocidade: [ " +aviao.velocidade+ "km/h ]" );
		System.out.println("Acelerando...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(int i=0;i<50; i++) {System.out.println();}              // LIMPANDO CONSOLE
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		System.out.println("Acelerando...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aviao.acelera(aceleracao);
		System.out.println("Velocidade atual: [ " +aviao.velocidade+ "km/h ]" );
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<50; i++) {System.out.println();}
		
		
		System.out.println("Reduzindo...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aviao.reduzindo(reducao);
		System.out.println("Velocidade atual: [ " +aviao.velocidade+ "km/h ]" );
		entrada.close();
		
		
		
	}

}
