package br.com.marquito.git.Aula02;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
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
