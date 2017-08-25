package Practica;


public class SumaNaturalesPares {

	public static void main(String[] args) {
	
		int N = 0 , SumaNaturales = 0 , SumaPares = 0;
		Robot obj = new Robot ();
		while 
			(obj.PedirNuevamente){
			System.out.println("Por favor ingrese un valor numerico");
			N = (int) obj.Leer ();
			} 
		
		for (int i = 0; i < N; i++) {
			SumaNaturales = SumaNaturales + i;
			if (i % 2 == 0){
				SumaPares = SumaPares + i;
			}
		}
			System.out.println("La suma de los numeros naturales es : " + SumaNaturales);
			System.out.println("La suma de los numeros pares es : " + SumaPares);
			
		}
		
	}

