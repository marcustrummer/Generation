package br.com.marquito.git.Aula04;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int soma =0;
		int[][] matriz = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3 ; j++) {
				System.out.printf("Digite o valor [%d][%d] da matriz N1", i, j);
				matriz[i][j] = entrada.nextInt();
			}
		}
		soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
		
		System.out.println("A soma eh : " + soma);
		
		
		System.out.println("Imprimindo a matriz N1: \n");  // IMPRINMINDO A MATRIZ N1
		for(int i=0;i < 3 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		
				
	}

}
