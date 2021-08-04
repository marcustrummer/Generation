package br.com.marquito.git.Aula03;

import java.util.Scanner;

/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero=0 , soma=0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();
			soma = soma + numero;
		}while(numero != 0);
		
		System.out.println("Soma dos numeros: " + soma);
		entrada.close();
	}
}
