package br.com.marquito.git;

import java.util.Scanner;
/*
Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é: d = squareRoot((x2 - x1)2 + (y2-y1)2) 
*/
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2;
		double d;
		
		System.out.println("Digite os valores de x1,x2 e y1,y2 respectivamente\n");
		x1 = entrada.nextDouble();
		x2 = entrada.nextDouble();
		y1 = entrada.nextDouble();
		y2 = entrada.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1),2));
		System.out.println("Valor de D:" + d);
		entrada.close();
		
	}
}
