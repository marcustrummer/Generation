package br.com.marquito.git.Aula04;

import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
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
