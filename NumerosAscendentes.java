package Practica;

import java.util.Arrays;

public class NumerosAscendentes {
	public static void main (String []arg){
		int A = 24;
		int B =230;
		int C =1;
		System.out.println(A + " " + B + " " + C);

		int arrayNumeros [] = {A,B,C};
		 Arrays.sort(arrayNumeros);
		for(int x = 0 ; x < arrayNumeros.length ; x++){
			System.out.println(arrayNumeros[x]);
		}
	}
}
