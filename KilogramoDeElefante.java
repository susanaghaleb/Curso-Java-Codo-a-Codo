package practica;

public class KilogramoDeElefante {
	public static void main(String[] args) {
		int tonelada = 1000;
		ObjetoRobot objeto = new ObjetoRobot();
		float pe = 0;
		while (objeto.perdirNuevamente){
			System.out.println("ingrese pe");
			pe = objeto.leer();
			
		}
		
		if (pe >= 4 && pe <= 7.5) {
			System.out.println(pe * tonelada);
			
	
			
		}
	
		else {
			System.out.println("no es real ");
			
		}
				
		
	}

}
