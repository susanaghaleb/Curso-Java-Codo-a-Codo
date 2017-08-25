package CalculadoraKelman;
import java.util.Scanner;


public class CalYears {
	
	public static int Anios(int NumDias){
		return NumDias / 365;
	}
	public static int Meses(int NumDias){
		return (NumDias / 365)*12;
	}
	public static int Semanas(int NumDias){
		return (NumDias/7);
	}
	@SuppressWarnings("resource")
	public static void main(String [] arg){
		System.out.println("Dame los dias a calcular mi pana");
		Scanner sc1 = new Scanner(System.in);
	     int i = sc1.nextInt();
	     int valorCalculado = 1095;
	     String mensaje = "Los "+ i+ " dias hacen " +CalYears.Anios(valorCalculado)+" años, " + CalYears.Meses(valorCalculado)+" meses y "+ CalYears.Semanas(valorCalculado)+" Semanas";
	     String mensaje2 = ", Eres un flojo";
	     
	     System.out.println(mensaje+mensaje2);
	     
	     
	     
	}
}

