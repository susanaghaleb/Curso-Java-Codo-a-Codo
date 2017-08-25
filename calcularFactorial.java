package ejerciciosclasecinco;

public class calcularFactorial {
	public static int Factorial (double numero) {
		  if (numero==0)
		    return 1;
		  else
		    return (int) (numero * Factorial(numero-1));
		}
	
			
	
	public static void main(String[] args) {
		
		System.out.println("esto vale " + Factorial(5));

	int factorial = 1;
	
	System.out.println("El factorial comienza en " + factorial +'\n');
	int numero = 5;
		while (numero != 0) {
			  factorial = factorial * numero;
			  numero--;
			  
			  System.out.println(" ahora el factorial vale " +factorial );
			  System.out.println(" ahora el numero vale " +numero);
		}	 
		
	}	
	
}
