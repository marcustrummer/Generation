package br.com.marquito.git.Aula02;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.println("Digite um numero qualquer");
		num = entrada.nextInt();
		
		
		if(num%2 == 0 ) {
			System.out.println("Este numero eh par!!" + "\nRaiz quadrada:" + Math.sqrt(num));
		}else {
			System.out.println("Este numero eh impar" + "\nNumero ao quadrado:" + num*num);
		}
		entrada.close();
	}

}
