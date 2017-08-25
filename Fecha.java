package Practica;

public class Fecha {
	public static void main(String[] args) {
		int dia = 0;
		int mes = 0;
		int anio = 0;
		String NombreMes = "";
		Robot obj = new Robot();
		while (obj.PedirNuevamente ){
			System.out.println("Por favor ingrese el dia de la fecha: ");
			dia = (int) obj .Leer();
		
			System.out.println("Por favor ingrese el mes de la fecha: ");
			mes = (int) obj .Leer();
		
			System.out.println("Por favor ingrese el anio de la fecha: ");
			anio = (int) obj .Leer();
		}
		if (dia > 0 && dia <= 31){
			System.out.println("Fecha valida");
		}	else {
			System.out.println("Fecha invalida");
			}
		if (mes > 0 && mes < 13){
		}	else {
			System.out.println("Fecha invalida");	
			}
		if (anio > 0){
		}System.out.println("Fecha invalida");
				
		switch (mes) {
			case 1:
				NombreMes = "Enero";
				break;
			case 2:
				NombreMes = "Febrero";
				break;
			case 3:
				NombreMes = "Marzo";
				break;
			case 4:
				NombreMes = "Abril";
				break;
			case 5:
				NombreMes = "Mayo";
				break;
			case 6:
				NombreMes = "Junio";
				break;
			case 7:
				NombreMes = "Julio";
				break;
			case 8:
				NombreMes = "Agosto";
				break;
			case 9:
				NombreMes = "Septiembre";
				break;
			case 10:
				NombreMes = "Octubre";
				break;
			case 11:
				NombreMes = "Noviembre";
				break;
			case 12:
				NombreMes = "Diciembre";
				break;
			default:
				break;
		}
		System.out.println(dia + " " + NombreMes + " " + anio);
}
}