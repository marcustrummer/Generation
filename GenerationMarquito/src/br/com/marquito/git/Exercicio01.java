package br.com.marquito.git;

import java.util.Scanner;

/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano, mes, dia;
		
		double resultado;
		
		System.out.println("\"Digite a sua idade em anos, meses e dias respectivamente\n");
		ano = entrada.nextInt();
		mes = entrada.nextInt();
		dia = entrada.nextInt();
		
		resultado = ((ano*365) + (mes*30) + dia);
		
		System.out.println("Resultado: " + resultado);
		entrada.close();//comentario pa testar
	}

}
