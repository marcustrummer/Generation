package br.com.marquito.git.Aula03;

import java.util.Scanner;

/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade=0, idade50=0, idade21=0;
		
		while(idade != -99) {
			System.out.println("Digite uma idade");
			idade = entrada.nextInt();
			if(idade<=21 && idade > 0) {
				idade21++;
			}else if(idade >= 50){
				idade50++;
			}
		}
		System.out.println(idade21 + " Pessoas com menos de 21 anos \n" + idade50 + " Pessoas com mais de 50 anos");
		
		entrada.close();
		
	}

}
