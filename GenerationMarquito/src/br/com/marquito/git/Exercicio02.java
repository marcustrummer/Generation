package br.com.marquito.git;

import java.util.Scanner;
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idadeEmDias, ano, mes, dia;
		
		 System.out.println("Digite sua idade em dias");
		 idadeEmDias = entrada.nextInt();
	
		 ano = idadeEmDias/365;
		 
		 mes = (idadeEmDias - (365 * ano) ) / 30;
		 
		 dia = (idadeEmDias - (365 * ano) ) % 30;
		 
		 System.out.println(ano+" anos\n" + mes+" meses\n" + dia+" dias\n");
	}

}
