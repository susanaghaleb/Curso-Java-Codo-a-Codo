package Practica; 

public class OrdenarArreglos {
	public static void main(String[] args) {
		int [] Inicial = new int [4];
		int [] AlmacenarIndices = new int [4];
		int mayor = 0;
		
		Robot obj = new Robot();
		
			for (int x = 0 ; x < Inicial.length ; x++){
			System.out.println("Por favor ingrese los numeros deseados : ");
			Inicial[x] = (int) obj.Leer();
			}
			
			for (int x = 0 ; x < Inicial.length ; x++){
				mayor = x;
				for (int j = 0 ; j < Inicial.length; j++) {
					if( Inicial [j] > Inicial[x] ){
						Inicial [x] = mayor;
						System.out.println("Los numeros Ascendentes : " + Inicial [j] );
					}
				}
			}
	}
}

