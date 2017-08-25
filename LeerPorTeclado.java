package Practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerporTeclado {

	
	public static void main(String[] args) {
		InputStreamReader io = new InputStreamReader (System.in);
		BufferedReader leer = new BufferedReader (io);
		boolean terminarPrograma = false;
		do{
			try {
				System.out.println("Por favor ingrese un numero");
				String valorleido = leer.readLine();
				float valor = Float.parseFloat(valorleido);
				System.out.println (valor);
				terminarPrograma = false;
			} catch (IOException e) {
				System.out.println("Dato incorrecto");
				terminarPrograma = true;
			} catch (NumberFormatException nf){
				System.out.println("Otro error");
				terminarPrograma = true;
			}
		}while (terminarPrograma);
		
	}
}

