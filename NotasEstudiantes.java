package Practica;

public class NotasEstudiantes {
		
		public static void main(String[] args) {
			String [] nombreEstudiante = new String [2] ;
			String [] nombretemporal = new String [2];
			String [] apellidoEstudiante = new String [2] ;
			int [] edad = new int [2];
			float [] calificacionesEstudiante = new float [2];
			float [] notatemporal = new float [2];		
			float valortemporal = 0;
	
			
			Robot obj = new Robot();
			
			for (int x = 0 ; x < 2 ; x++){
				System.out.println("Por favor ingrese el nombre del estudiante : ");
				nombreEstudiante[x] = obj.LeerTexto();
				System.out.println("Por favor ingrese el apellido del estudiante : ");
				apellidoEstudiante[x] = obj.LeerTexto();
				System.out.println("Por favor ingrese la edad del estudiante : ");
				edad[x] = (int) obj.Leer();
				System.out.println("Por favor ingrese la nota del estudiante : ");
				calificacionesEstudiante[x] = obj.Leer();
			}
			for (int x = 0 ; x < 2 ; x++){
				System.out.println("La nota de " + nombreEstudiante[x] + " = " + calificacionesEstudiante[x]);
			}
			for (int y = 0; y < 2; y++) {
				
				for (int i = 0; i < 2; i++) {
					
					if ( (i + 1) < 2 ) {	
						
						if ( calificacionesEstudiante [i] > calificacionesEstudiante [i+1] || calificacionesEstudiante [i] < valortemporal ){
							
							valortemporal = calificacionesEstudiante [i];
//							nombretemporal [y] = nombreEstudiante[i];
							
						}else {
							valortemporal = calificacionesEstudiante  [i+1];
//							nombretemporal[y] = nombreEstudiante [i+1];
						}
						
					}
					
				}
				
				notatemporal [y] = valortemporal;
			}
			
			for (int i = 0; i < notatemporal.length; i++) {

				System.out.println( nombretemporal [i] + " : " + notatemporal [i] );
			}

		}
		
}	


