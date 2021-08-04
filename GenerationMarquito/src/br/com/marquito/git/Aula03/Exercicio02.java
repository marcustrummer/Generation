package br.com.marquito.git.Aula03;

import java.util.Scanner;

//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
