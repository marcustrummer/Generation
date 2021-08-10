package br.com.marquito.git.Aula05Exercicio01;
/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
public class Cliente {
	
	
	//Atributos do Cliente
	String nome;
	String profissao;
	String genero;
	double renda;
	int idade;
	double senha;
	
	
	
	//metodos do Cliente
	
	String formaPagto(String formaPagamento) {
		String cartao = "cartao", debito = "debito";
		String resultado = "";
		if(formaPagamento.equals(cartao)) {
			resultado = "A forma de pagto escolhida foi: " + cartao;
			
		}
		if(formaPagamento.equals(debito)) {
			resultado = "A forma de pagto escolhida foi " + debito;
		}
		return resultado;
	}
	
	
	void valorCompra(int valorCompra) {
		System.out.println("O valor da sua compra foi: R$" + valorCompra);
	}
	
	
	
}
