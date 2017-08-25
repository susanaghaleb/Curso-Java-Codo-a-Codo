package Practica;

public class Caliicaciones {

	public static void main(String [] args){

		Robot obj = new Robot ();
			
			float N = 0;
			String nombreEstudiante = "";
			
			
			
		if (N == 19 || N == 20){
			System.out.println("Tu nota es A");
			nombreEstudiante = obj. LeerTexto();
			N = obj.Leer();
		}else{
			if (N <= 18 && N >= 16){
				System.out.println("Tu nota es B");
			}else{	
				if (N <= 15 && N >= 13){
					System.out.println("Tu nota es C");
				}else{
					if (N <= 12 && N >= 10){
						System.out.println("Tu nota es D");
					}else{
						if (N <= 9 && N >= 1){
							System.out.println("Tu nota es E");
						}else{	
							System.out.println("Tu nota esta fuera del rango (0 , 20)");
							}
						}
					}
				}
			}
		}
	
}
