package Practica;

public class CuadradoAsterisco {
	public static void main(String[] args) {
		/*int  A = 4;
		String B = "*" ;
		for ( B = "*" ; A < 4 ; A ++);
		System.out.print(B + " " + B + " " + B + " " + B);
		
		for ( B = "*" ; A < 4 ; A ++);
		System.out.print ('\n' + B +  "     "  +  B + '\n' + B +  "     "  +  B + '\n' + B );

		for (B = "*" ; A < 4 ; A ++);
		System.out.print(" "+ B + " " + B + " " + B );*/
		
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < 4; i++) {
			
			if ( i == 0 || i+1 == 4 )
				System.out.print( "*" );
			else
				System.out.print( " " );
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < 4; i++) {
			System.out.print("*");
		}
		
	}

}
