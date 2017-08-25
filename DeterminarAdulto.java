package practica;
	
/*
* Leer la edad de una persona ( numero entero entre 1 y 100) y que se imprima esa edad junto 
* a un mensaje que indique si se trata de un niño (edad entre 1 y 12 años), 
* un adolescente ( entre 13 y 17 años),
* un adulto ( entre 18 y 60 años) o un adulto mayor( De 61 años en adelante).

 */
public class DeterminarAdulto {
	public static void main(String[] args) {
		int edad=39;
		ObjetoRobot objeto = new ObjetoRobot();
	    while (objeto.perdirNuevamente)
	    {
		System.out.println("Por favor Ingrese su edad");
	    edad = (int)objeto.leer();
	    }
		if (edad >0 && edad <12){
			System.out.println("Usted es un niño de "+edad);
		}	
		if (edad>12 && edad<=17)
		{
			System.out.println("Usted es un adolescente de "+edad);
		}
		if (edad>17 && edad<=60)
		{
			System.out.println("Usted es un adulto de "+edad);
		}
		if (edad>60 && edad<100)
		{
			System.out.println("Usted es un adulto mayor de "+ edad);
		}
		System.out.println(objeto.getNombre());
		}
	}