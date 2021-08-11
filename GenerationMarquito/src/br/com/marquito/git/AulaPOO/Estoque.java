package br.com.marquito.git.AulaPOO;

import java.util.ArrayList;
import java.util.Collections;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/
public class Estoque {
	public static void main(String[] args) {
		
		
		String item1 = "Celular";
		String item2 = "Computador";
		String item3 = "Geladeira";
		String item4 = "Fogao";
		
		ArrayList<String> estoque = new ArrayList<>();
		
		estoque.add(item1);
		estoque.add(item2);
		estoque.add(item3);
		
		estoque.add(item4);
		estoque.remove(3); // removendo o fogao
		
		Collections.sort(estoque);
		
		for(int i = 0; i < estoque.size(); i++) {
			System.out.println(estoque.get(i));
		}
		
		
		
		
		
		
	}

}
