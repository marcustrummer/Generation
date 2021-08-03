package br.com.marquito.git;

import java.util.Scanner;

/*
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
*/
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a,b,c,d,j,f,x,y;
		
		System.out.println("Digite os valores de A, B , C, D, J e F\n");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		j = entrada.nextInt();
		f = entrada.nextInt();
		
		
		x = ( ((c*j) - (b*f)) / ((a*j) - (b*d)) );
		y = ( ((a*f) - (c*d)) / ((a*j) - (b*d)) );
		
		System.out.println("Os valores de x e y sao:" + x+ " e " + y+ " respectivamente" );
		entrada.close();
		
		
	}
}