package br.com.marquito.git.Aula02;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num[] = new int[3];
		int maiorNum=0;
		
		System.out.println("Digite 3 numeros inteiros:");
		for(int i=0;i<3;i++) {
			num[i] = entrada.nextInt();
			if(num[i]>=maiorNum) {
				maiorNum = num[i];
			}
		}
		
		System.out.println("O maior numero eh: "+ maiorNum);
		entrada.close();
	}

}
