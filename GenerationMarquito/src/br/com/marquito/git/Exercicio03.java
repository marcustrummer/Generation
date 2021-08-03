package br.com.marquito.git;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tempo, hora, minuto, segundo;
		
		System.out.println("Tempo de duraçao do evento em uma fabrica: ");
		tempo = entrada.nextInt();
		
		hora = (tempo / 3600);
		minuto = (tempo - (hora * 3600)) / 60;
		segundo = (tempo - (hora * 3600)) % 60;
		
		System.out.println(hora + "horas\n"+ minuto+"minutos\n"+ segundo+"segundos");
	}

}
