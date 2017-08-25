package Practica;

public class DeterminarComision {
	
	public static void main(String[] args) {
		float SueldoBase = 0;
		int Comision = 10;
		float [] Ventas = new float [3];
		Robot obj = new Robot();
		float sueldo;
		System.out.println("Por favor ingrese su sueldo base:");
		sueldo = obj .Leer();
		int comision = 10;
		int totalVentas = 0;
		for (int i = 0 ; i < Ventas.length ; i ++){
		System.out.println("Por favor ingrese el monto de las tres ventas :");
		Ventas [i] = obj.Leer();
		}
		for (int i = 0 ; i < Ventas.length ; i ++){
			totalVentas += Ventas [i];
		}
		System.out.println("El monto total de las ventas es : " + totalVentas );
		float Porcentaje = totalVentas / Comision;
		System.out.println("El total de la comision de las ventas es :" + Porcentaje);
		System.out.println("El total del sueldo mas la comision es igual a : " + (sueldo + Porcentaje));
		
	}
}
