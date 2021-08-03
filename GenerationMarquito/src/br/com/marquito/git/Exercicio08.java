package br.com.marquito.git;

import java.util.Scanner;

/*
O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.
*/
public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double carroNovo, precoFabrica;
		
		System.out.println("Digite o valor do preco de fabrica do carro");
		precoFabrica = entrada.nextDouble();
		
		
		carroNovo = (precoFabrica + (precoFabrica*0.28) + (precoFabrica*0.45));

		
		System.out.println("O valor do carro eh:" + carroNovo);
		entrada.close();
				
				
	}

}