package practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjetoRobot {
	public boolean pedirNuevamente=true;
	
	private String nombre="Soria";
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void lineaHorizontal (int A){
		for (int x = 0 ; x < A ; x ++){
			System.out.println("*");
		}
	}
	
	public void lineaVertical (int A){
		for (int y = 0 ; y < A ; y ++){
			if (y == 0 || (y + 1) == A){
				System.out.println("*");
			}else 
				System.out.println(" ");
		}
	}
	
	public float Leer(){
		String valorObtenido; 
		float valorConvertido=0;
		try {
			InputStreamReader io = new InputStreamReader(System.in);
			BufferedReader leo = new BufferedReader(io);
			valorObtenido=leo.readLine();
			valorConvertido=Float.parseFloat(valorObtenido);
			pedirNuevamente=false;
		} catch (NumberFormatException nf){
			System.out.println(nf.getMessage());
			pedirNuevamente=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			pedirNuevamente=true;
		} 
		return valorConvertido;
	}



}