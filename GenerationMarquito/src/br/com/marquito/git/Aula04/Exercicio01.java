package br.com.marquito.git.Aula04;

import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[] nota = new double[5];
		double maiorNota=0.0;
		
		for(int i=0;i<nota.length;i++) {                   //For de escrita das pontuacoes
			System.out.println("Digite a sua " +(i+1) +  " pontuacao: ");
			nota[i] = entrada.nextDouble();
			if(nota[i]>= maiorNota) {
				maiorNota = nota[i];
			}
		}
		
	
		for(int i = 0;i < nota.length ; i++) {                    // For de leitura das pontuacoes
			System.out.println("Sua " +(i+1) +  " pontuacao foi:  " + nota[i]);
				
			}
		System.out.println("A maior pontuacao foi : "+ maiorNota);
		entrada.close();
		}
		
		
	}
