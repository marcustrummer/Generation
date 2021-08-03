package br.com.marquito.git.Aula02;

//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num[] = new int[3];
		int maiorNum=0, maiorNum2 =0, num3=0;
		
		System.out.println("Digite 3 numeros inteiros:");
		for(int i=0;i<3;i++) {
			num[i] = entrada.nextInt();
			if(num[i]>=maiorNum) {
				num3= maiorNum2;
				maiorNum2 = maiorNum;
				maiorNum = num[i];
				
			}
			else if(num[i] < maiorNum && num[i] >= maiorNum2) {
				num3 = maiorNum2;
				maiorNum2 = num[i];
				
			}
			if(num[i] < maiorNum && num[i] < maiorNum2 && num[i] >= num3) {
				num3 = num[i];
			}
		}
		
		
		System.out.println("Numeros em ordem crescente: "+ num3 + maiorNum2 + maiorNum);
		System.out.println("Numeros em ordem crescente: "+ maiorNum2);
		System.out.println("Numeros em ordem crescente: "+ maiorNum);
		entrada.close();
	}

}