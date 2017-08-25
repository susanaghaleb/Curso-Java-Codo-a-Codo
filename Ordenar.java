package Practica;

public class Ordenar {
	public static void main(String[] args) {
		int [] a = new int [4];
		int bate = a.length;
		int guante ;

		Robot obj = new Robot ();

		for (int x=0; x < bate ; x ++){
			System.out.println("Por favor ingrese los numeros : ");
			a [x] = (int) obj.Leer();
		}
		/*for (int p = 0 ; p < bate ; p ++){
			for (int y = 0 ; y < bate ; y ++){
				if (a[p] < a[y] ){
					System.out.println("si");
				}else{
				System.out.println("no");
				}
			}
			System.out.println("fin for");
	
		}*/
		boolean j = a[0] > a[1];
		boolean u = a[0] < a[1];
		if((j && u)){
			
		}
		//System.out.println("    "  +  a[1] );
			
			
		
		
		
		/*int x = 0 ;
		
		for (x = 0 ; x < x; x++){
			System.out.println(x + " Huevo");
		}*/
			
	}

}
