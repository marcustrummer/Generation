package br.com.marquito.git.AulaPOO;

public class TestaAnimais {
		public static void main(String[] args) {
			
			TestaAnimal ta = new TestaAnimal();
			
			
			ta.somAnimal(new Cavalo());
			ta.correr(new Cavalo());
			ta.somAnimal(new Cachorro());
			ta.somAnimal(new Preguica());
			ta.subir(new Preguica());
			
		}
}
