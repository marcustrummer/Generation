package br.com.marquito.git.Aula05Exercicio03;

import java.util.Scanner;

/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
public class Exercicio003Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ProdutoEletronico produto = new ProdutoEletronico();
		
		
		//-----------------------------------------------------------------------------------------------------
		produto.modelo = "Geladeira N95";
		produto.marca = "Electrolux";
		produto.valor = 1899;
		produto.notaFiscalEletronica = 0;
		produto.garantia = 0;
		//------------------------------------------------------------------------------------------------------
		
		
		String resposta = "";
		int extensaoGarantia = 0;
		System.out.println("Deseja extender a garantia do produto?  s/n");
		resposta = entrada.next();
		if(resposta.equals("s")) {
			produto.extensaoGarantia();
		}else {
			System.out.println("Garantia de fabrica de 1 ano");
			produto.garantia=1;
		}
		
		produto.gerandoNotaFiscal();
		for(int i=0;i<50;i++)System.out.println();
		
		
		System.out.println("[Informacoes do Produto]");
		System.out.println("Marca: [ " + produto.marca + " ]" );
		System.out.println("Modelo: [ " +produto.modelo + " ]");
		System.out.println("Valor: [ R$" +produto.valor+ " ]" );
		System.out.println("Garantia: [ " +produto.garantia+ " ano(s) ]" );
		System.out.println("NFe : [ " +produto.notaFiscalEletronica+ " ]" );
		entrada.close();
	}

}
