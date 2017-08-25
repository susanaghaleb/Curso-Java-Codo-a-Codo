package Practica;

public class CajaRegistradora {
	
	public static void main (String [] args){
		
		String productos [] = {"arroz", "pasta", "leche", "harina", "azucar", "cafe" , "te", "sal", "aceite", "galletas"  };
		double precios [] = {10.50, 8.30, 15.98, 17.70, 13.90, 28.82, 6.99, 5.40, 33.20, 19.99};
		
		double total = 0;
		
		System.out.println(  "Cantidad de productos " + productos.length );
		System.out.println(  "Cantidad de precios " + precios.length );
		
		for (int i = 0; i < precios.length; i++) {
			
			System.out.println( productos[ i ] +" ---> "+ precios[ i ] );
			
			if( i+1 < precios.length )
				total += precios[i+1];
			
		}
		
		System.out.println( "Total de compra : " + total);
	
	}	
}
