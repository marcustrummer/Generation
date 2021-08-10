package br.com.marquito.git;
/*Crie um programa que calcule a media aritmetica dos seus vizinhos imediatos
 * e verifique se eh igual a posicao atual do vetor
 * vetores inexistentes devem ser considerados =0*/
public class teste {
	public static void main(String[] args) {
		int[] a = new int[5];
		//a[-1]   -1       //0            
		a[0] = 2;   // 2
		a[1] = 4;   // 4
		a[2] = 6;   // 5
		a[3] = 6;   // 3.5
		a[4] = 3; // 3
		//a[5] ==0
		contarMediaAritmetica(a);
		//System.out.println(a);
		
	}
	
	

	static int contarMediaAritmetica(int[] a) {
	    int c=0;
	    int arraylenght = a.length;
	    for(int i = 0 ; i < arraylenght ; i++){
	    	if(i < 0 || i > a.length){
	    		a[i] = 0;
		        if(a[i-1] + a[i+1] == (2*a[i])){
		            c++;
		        }
	    	}

	    }
	    System.out.println("Numeros que tao certos: " + c);
	    return c;
	}
}
