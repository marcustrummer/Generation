package br.com.marquito.git;
/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão:*/
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d,s ,r;
		
		System.out.println("Digite os valores de A, B e C\n");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		r = ((a+b)*(a+b));
		s = ((b+c)*(b+c));
		d = (r+s)/2;
		
		System.out.println("valor de D:" + d);

		
		
	}

}
