package Practica;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

import java.util.Scanner;

public class Calificaciones {
	public static void main(String [] args){
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingresa tu nota");
		//InputStreamReader X = new InputStreamReader (System.in);
		//BufferedReader leer = new BufferedReader (X);
		
	int N =sc.nextInt();
		//String N = leer.readLine();
	if (N == 19 || N == 20){
		System.out.println("Tu nota es A");
	}else{
		if (N <= 18 && N >= 16){
			System.out.println("Tu nota es B");
		}else{	
			if (N <= 15 && N >= 13){
				System.out.println("Tu nota es C");
			}else{
				if (N <= 12 && N >= 10){
					System.out.println("Tu nota es D");
				}else{
					if (N <= 9 && N >= 1){
						System.out.println("Tu nota es E");
					}else{	
						System.out.println("Tu nota esta fuera del rango (0 , 20)");
						}
					}
				}
			}
		}
	}
}
