package ejerciciosclasecinco;

public class tasaCambiaria {
	
	public double Argentina (double valor1 , int valor2){
		return valor1 * valor2;
	}

	public double Venezuela (double valor1 , double valor2){
			return valor1 / valor2;
	}
	
	public static void main(String[] args) {
		
		tasaCambiaria obj = new tasaCambiaria();
		double bolivarespordolar = 8532;
		int pesospordolar = 16;
		int bolivaresacambiar = 700000;
		
		System.out.println( "Cant bs : " + bolivaresacambiar );
		System.out.println( "Cant $ * bs : " + obj.Venezuela( bolivaresacambiar , bolivarespordolar ) );
		System.out.println( "Cant pesos * $ : " + obj.Argentina( obj.Venezuela( bolivaresacambiar , bolivarespordolar ), pesospordolar ) );
				
	}
		
}




