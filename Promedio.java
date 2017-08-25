package ejerciciosclasecinco;

public class Promedio {

	static double Notas (double x , double y , double z){
		return (x + y + z);
	}
	static double Resultado (double x , double y){
		return (x / y);
	}
	
	//el promedio es la suma de las notas entre la cantidad de notas sumadas
	
	public static void main(String[] args) {
		double notasAlumno = Notas (18.5 , 10.3 , 15.8);
		System.out.println("Total notas del alumno es : " + notasAlumno);
		
		double promedio = Resultado (notasAlumno , 3);
		System.out.println("El promedio total del alumno es: " + promedio);
		
		if (promedio > 10) { 
			System.out.println ("El estudiante aprovo con un promedio de: " + promedio ) ; 
			} else { 
			System.out.println ("El estudiante No aprovo, el promedio es de: " + promedio ) ; 
			} 
		
		
	}
	
	
	
}

