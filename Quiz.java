package Practica;

public class Quiz {
	public static void main(String[] args) {
		int edad = 0;
		String nombre = "";
		Robot obj = new Robot();
		
		System.out.println("Por favor ingrese su nombre");
		nombre = obj.LeerTexto();
		System.out.println("Por favor Ingrese su edad");
	    edad = (int)obj.Leer();
	    
		while (edad < 0 || edad >100) {
		
		obj.PedirNuevamente = true;
		System.out.println("Usted ha ingresado un error erroneo");
		System.out.println("Por favor Ingrese su edad");
		edad = (int)obj.Leer();
		}		
			
		while (obj.PedirNuevamente){
			System.out.println("Por favor Ingrese su edad");
			edad = (int)obj.Leer();
		
		}
				if (edad >=0 && edad <=12){
				System.out.println("Usted es un niño de "+ edad);
				}	
				if (edad>12 && edad<=17){
				System.out.println("Usted es un adolescente de "+ edad);
				}
				if (edad>17 && edad<=60){
				System.out.println("Usted es un adulto de "+ edad);
				}
				if (edad>60 && edad<=100){
				System.out.println("Usted es un adulto mayor de "+ edad);
				}
			
	    }
	
}
		