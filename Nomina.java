package Practica;

public class Nomina {
	public static void main(String[] args) {
		int cantidadPersonas = 5;
		String[] nombreEmpleado = new String [5];
		float [] horasTrabajadasxPersonas = new float [5];
		
		Robot obj = new Robot();
		
		for (int x=0; x<cantidadPersonas; x++){
		System.out.println("Por favor ingrese el nombre del trabajador");
		nombreEmpleado[x] = obj.LeerTexto();
		System.out.println("Por favor ingrese las horas trabajadas");
		horasTrabajadasxPersonas[x]= obj.Leer();
		}
		for (int y=0 ; y<cantidadPersonas; y ++){
			System.out.println(nombreEmpleado[y]+ " Total por pagar: " + horasTrabajadasxPersonas [y] * 300);
		}
	}
}
