package metodos;

public class esteMetodo {
	public static  int metodoEntero(){
		int suma = 5+5;
		return suma;
	}
	public static int metodoBoolean (int n , String nombre){
		if (n>0){
			System.out.println("Hola" + nombre);
			
		}return n;
			
	}
	public static void procedimiento (int n , String fff){
		if(n>0 && !fff.equals("")){
			System.out.println("Hola" + fff);
			return;
		}else{
			System.out.println("Vete " + fff);
		}   
		
	}
	
		public static void main (String[] args){
		
		System.out.println(metodoEntero());
		int respuesta = metodoBoolean(8," pepe");
		procedimiento(3,"juan");
		procedimiento(metodoBoolean(3,"hola"),"teresa");

	}
}
