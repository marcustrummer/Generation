package br.com.marquito.git.Aula03;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero=0, c=0;
		double media =0;
		do {
			System.out.println("Digite um numero: " );
			numero = entrada.nextInt();
			if(numero%3==0) {
				media = media + numero;
				c++;
			}
		}while(numero != 0);
		
		media = media / c;
		
		System.out.println("Media: " + media);

	}

}
