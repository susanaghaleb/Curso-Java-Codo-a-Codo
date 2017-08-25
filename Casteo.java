package Practica;

public class Casteo {

	public static void main(String[] args) {
		int Entero = (int) 84.3;
		float Flotante = (float) 54;
		System.out.println("Esta es mi variable de tipo entero");
		System.out.println(Entero);
		System.out.println("Esta es mi variable de tipo flotante");
		System.out.println(Flotante);
		
		String miConversion= "24.8";
		Flotante = Float.parseFloat (miConversion);
		System.out.println ("Nuevo valor de mi variable flotante");
		System.out.println (Flotante);
		
		String x = "28";
		Entero = Integer.parseInt (x);
		System.out.println ("Nuevo valor de mi variable entero");
		System.out.println (Entero);
	}
	
}
