package practica;

public class Notas {
	public static void main(String[] args) {
		String []nombreEstudiante;
		float []calificacionesEstudiante;
		int cantEstudiantes;		
		
		ObjetoRobot objeto = new ObjetoRobot();

		do{
			System.out.println("Ingrese la cantidad de estudiantes:");
			cantEstudiantes = (int)objeto.leer();			
		}while  (cantEstudiantes < 0);
		
		nombreEstudiante = new String [cantEstudiantes];
		calificacionesEstudiante = new float [cantEstudiantes];
				
		for (int i=0; i< cantEstudiantes; i++)
		{
			System.out.println("Ingrese el nombre del estudiante:");
			nombreEstudiante[i]=objeto.leerTexto();
			System.out.println("Ingrese su calificación:");
			calificacionesEstudiante[i] = objeto.leer();
		}
		
		for (int i=0; i< cantEstudiantes; i++) {
			if (calificacionesEstudiante[i] >= 19 && calificacionesEstudiante[i] <= 20){
				System.out.println("El alumno " + nombreEstudiante[i] + " tiene A.");
			}
			if (calificacionesEstudiante[i] >= 16 && calificacionesEstudiante[i] <= 18){
				System.out.println("El alumno " + nombreEstudiante[i] + " tiene B.");
			}
			if (calificacionesEstudiante[i] >= 13 && calificacionesEstudiante[i] <= 15){
				System.out.println("El alumno " + nombreEstudiante[i] + " tiene C.");
			}
			if (calificacionesEstudiante[i] >= 10 && calificacionesEstudiante[i] <= 12){
				System.out.println("El alumno " + nombreEstudiante[i] + " tiene D.");
			}
			if (calificacionesEstudiante[i] >= 1 && calificacionesEstudiante[i] <= 9){
				System.out.println("El alumno " + nombreEstudiante[i] + " tiene E.");
			}
			
		}
		
		
		 
		
		
		
	}

}
