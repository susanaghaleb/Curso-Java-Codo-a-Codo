package Practica;

public class Comision {
	Double Ganancia (Double A , int B){
		return (A/B);
	}
	Double SueldoTotal (Double A , int B){
		return (A+B);
	}
	
	public static void main(String[] args) {
		int Sueldo = 8000;
		int Comision = 10;
		Double Ventas = ( 300.72 + 2550.30 + 878.20);
		Comision X = new Comision ();
		X.Ganancia (Ventas , Comision);
		System.out.println("El porcentaje de las ventas es de " +X.Ganancia (Ventas , Comision) + " pesos");
		X.SueldoTotal (X.Ganancia (Ventas , Comision) , Sueldo);
		System.out.println("El sueldo total con las ganancias es de " + X.SueldoTotal (X.Ganancia (Ventas , Comision) , Sueldo) + " pesos");
	}
}
