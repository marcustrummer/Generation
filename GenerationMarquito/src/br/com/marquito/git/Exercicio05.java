package br.com.marquito.git;

import java.util.Scanner;

/*
Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
*/
public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota0, nota1 , nota2;
		
		double media;
		
		System.out.println("Digite as 3 notas do aluno\n");
		nota0 = entrada.nextDouble();
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		
		
		media = (((nota0*2) + (nota1*3) + (nota2*5)) / 10);
		
		System.out.println("A media ponderada do aluno: "+ media);
	}

}
