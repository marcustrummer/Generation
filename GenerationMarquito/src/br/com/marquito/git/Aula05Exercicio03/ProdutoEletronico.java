package br.com.marquito.git.Aula05Exercicio03;

import java.util.Random;
import java.util.Scanner;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
public class ProdutoEletronico {
	Random gerador = new Random();
	Scanner entrada = new Scanner(System.in);
	String marca;
	String modelo;
	int valor;
	int garantia;
	double notaFiscalEletronica;
	
	
	double gerandoNotaFiscal() {
		System.out.println("Gerando nota fiscal eletronica...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notaFiscalEletronica = gerador.nextDouble()*900000000;
		System.out.println("Nota fiscal gerada com SUCESSO!!!");
		return notaFiscalEletronica;
	}
	
	int extensaoGarantia() {
		int extensaoGarantia =0;
		System.out.println("Extender por quanto tempo?");
		extensaoGarantia = entrada.nextInt();
		garantia = extensaoGarantia+1;
		System.out.println("Extensao garantida por mais : " + extensaoGarantia + "ano(s)");
		
		return garantia;
	}
	
	

}
