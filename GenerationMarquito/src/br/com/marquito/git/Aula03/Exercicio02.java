package br.com.marquito.git.Aula03;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int i,num, pares=0, impares=0;
		
		System.out.println("Digite 10 numeros");
		for(i=0;i<10;i++) {
			num = entrada.nextInt();
			if(num%2==0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		System.out.println("Temos " + pares + " pares" + " e " + impares + " impares");
		
		entrada.close();
	}

}
