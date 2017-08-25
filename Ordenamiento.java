package Practica;

import java.util.Arrays;

public class Ordenamiento {
	public static void main(String[] args) {
		int[] numeros =new int[5];
		String[] palabras=new String[5];
		Robot objetoRobot = new Robot();
		
		
		for (int i = 0; i <palabras.length; i++) {
			System.out.println("Ingrese una palabra: ");
			palabras[i]=objetoRobot.LeerTexto();
		}
		
		
		do {
			for (int i = 0; i <numeros.length; i++) {
				System.out.println("Ingrese un número: ");
				numeros[i]=(int)objetoRobot.Leer();
			}
			
		} while (objetoRobot.PedirNuevamente);
		
			
		System.out.println("\n Los números ingresados son");
		for (int i = 0; i <numeros.length; i++) {
			System.out.print("-"+numeros[i]+"-");
		}
		
		System.out.println("\n Los palabras ingresadas son");
		for (int i = 0; i <numeros.length; i++) {
			System.out.print("-"+palabras[i]+"-");
		}
		
		numeros=objetoRobot.OrdenarArregloEntero(numeros);
		palabras=objetoRobot.OrdenarArregloTexto(palabras);
		//Arrays.sort(numeros);
		
		System.out.println(" ");
		System.out.println("\n Los números ordenados");
		for (int i = 0; i <numeros.length; i++) {
			System.out.print("-"+numeros[i]+"-");
		}
		
		System.out.println(" ");
		System.out.println("\n Las palabras ordenadas");
		for (int i = 0; i <palabras.length; i++) {
			System.out.print("-"+palabras[i]+"-");
		}
		
	}

}
