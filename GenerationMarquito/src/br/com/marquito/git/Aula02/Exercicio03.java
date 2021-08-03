package br.com.marquito.git.Aula02;

//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
// 10-14 infantil
// 15-17 juvenil
//18-25 adulto

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade");
		idade = entrada.nextInt();
		
		if(idade>10 && idade < 15) {
			System.out.println("infantil");
			
		}
		else if(idade>=15 && idade <18) {
			System.out.println("juvenil");
			
		}
		else if(idade>=18 && idade <=25){
			System.out.println("adulto");
			
		}
		entrada.close();
	}

}