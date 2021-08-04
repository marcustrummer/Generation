package br.com.marquito.git.Aula03;

import java.util.Scanner;

/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i=0,idade=0 , sexo=0, personalidade=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0;
		int nervosas40=0, calmas18=0, outrosCalmos=0;
		
		while(i<=150) {
			
			System.out.println("Digite sua idade");
			idade = entrada.nextInt();
			System.out.println("Informe o seu sexo 1=feminino 2=masculino 3=outros");
			sexo = entrada.nextInt();
			System.out.println("Informe o sua personalidade 1=calma 2=nervoso 3=agressiva");
			personalidade = entrada.nextInt();
			
			if(personalidade==1) {
				pessoasCalmas++;
			}if(sexo==1 && personalidade ==2) {
				mulheresNervosas++;
			}
			if(sexo==2 && personalidade ==3) {
				homensAgressivos++;
			}
			if(sexo == 3 && personalidade ==1) {
				outrosCalmos++;
			}
			if(personalidade==2 && idade>=40) {
				nervosas40++;
				
			}
			if(personalidade==1 && idade<=18) {
				calmas18++;
			}
			
			System.out.println("Pessoas calmas: " + pessoasCalmas);
			
			System.out.println("Mulheres nervosas: " + mulheresNervosas);
			
			System.out.println("Homens agressivos: " + homensAgressivos);
			
			System.out.println("Outros calmos: " + outrosCalmos);
			
			System.out.println("Pessoas nervosas com mais de 40 anos: " + nervosas40);
			
			System.out.println("Pessoas calmas com menos de 18 anos: " + calmas18);
			
		}
		entrada.close();
		
		
		
	}

}
