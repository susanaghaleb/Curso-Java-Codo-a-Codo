package Practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leerxteclado {
	
	public static void main(String[] args) {
		
		boolean pedirvalornuevamente = true;
		String valorLeido = "";
		float valorConvertido = 0;
		
		while ( pedirvalornuevamente ) {
			
			System.out.println(" Por favor ingrese un valor numerico \n");
			
			try {
				
				InputStreamReader io = new InputStreamReader(System.in);
				BufferedReader leer = new BufferedReader(io);
				
				valorLeido = leer.readLine();
				
				valorConvertido = Float.parseFloat(valorLeido);
				
				pedirvalornuevamente = false;
				
			} catch ( NumberFormatException e) {
				// TODO: handle exception
				System.out.println( "Ha ingresado un valor que no es numeico" );
				pedirvalornuevamente = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println( "Ha ocurrido un error general" );
				pedirvalornuevamente = true;
			}	
			
		}
		
		System.out.println( "Valo convertido : " + valorConvertido );
		
	}

}
