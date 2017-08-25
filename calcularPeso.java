package ejerciciosclasecinco;
import java.util.Scanner; //Importación del código de la clase Scanner desde la biblioteca Java

public class calcularPeso {

	public static double multiplicaPeso (double valor1 , double valor2){
		return (valor1 * valor2);
	}
	public static void main (String[] args){
		System.out.println("Por favor introduzca peso del animal en toneladas");
		Scanner sc = new Scanner(System.in);
	     int pesoAnimal = sc.nextInt();
		double pesoKilos = 1000;
		double pesoTotal = multiplicaPeso(pesoAnimal , pesoKilos);
		System.out.println("El peso por kiogramos es : " + pesoTotal);
	}
}


