package br.com.marquito.git.Aula04;

import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] lance = new int[10];
		int soma=0, pontMaior = 0;
		double media =0;
		for(int i=0; i < lance.length; i++) {
			System.out.println("Digite o valor do lancamento");
			lance[i] = entrada.nextInt();
			soma = soma + lance[i];
			if(lance[i]>= 6) {
				pontMaior++;
			}
		}
		media = soma /10;
		
		System.out.println("A media dos lancamentos foi: " + media);
		System.out.println("O num de ocorrencias da maior pontuacao (6) foi: " + pontMaior);
		entrada.close();
	}

}
