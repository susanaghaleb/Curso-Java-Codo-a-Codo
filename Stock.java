package practica;

public class Stock {
	public static void main(String[] args) {
		String []NombreProducto = new String [10];
		float []PrecioProducto = new float [10];
		int []CantidadProducto = new int [10];
		String ProductoVendido = null;
		int CantidadVendida = 0;
		int Indice = -1;
	
		
		ObjetoRobot objeto = new ObjetoRobot();
		
		for (int i = 0; i < 3; i++)
		{
			while (objeto.perdirNuevamente){
				System.out.println("Ingrese el producto:");
				NombreProducto[i]=objeto.leerTexto();
			}
			objeto.perdirNuevamente = true;
			
			while (objeto.perdirNuevamente){
				System.out.println("Ingrese su precio:");
				PrecioProducto[i] = objeto.leer();
			}
			objeto.perdirNuevamente = true;
			
			while (objeto.perdirNuevamente){
				System.out.println("Ingrese la cantidad:");
				CantidadProducto[i] = (int)objeto.leer();
			}	
			objeto.perdirNuevamente = true;
		}
		
		
		for (int i = 0; i < 3; i++)
		{
			Indice = -1;
			ProductoVendido = null;
			CantidadVendida = 0;
			
			while (objeto.perdirNuevamente){
				System.out.println("Ingrese el producto que se vende:");
				ProductoVendido = objeto.leerTexto();
				
				for (int j = 0; j < 10; j++){
					if (ProductoVendido.equalsIgnoreCase(NombreProducto[j])){
						Indice = j;
						objeto.perdirNuevamente = false;
						
						if (CantidadProducto[Indice] < 1){
							System.out.println("El producto no tiene stock.");
							objeto.perdirNuevamente = true;
						}
					}					
				}
				
				if (Indice == -1){
					System.out.println("El producto ingresado no existe.");
					objeto.perdirNuevamente = true;
				}				
			}
			
			objeto.perdirNuevamente = true;			
			
						
			
			while (objeto.perdirNuevamente){
				System.out.println("Ingrese la cantidad:");
				CantidadVendida = (int)objeto.leer();
				
				if (CantidadProducto[Indice]<CantidadVendida){
					System.out.println("La cantidad vendida supera la que hay en stock.");
					objeto.perdirNuevamente = true;
				}
			}
			objeto.perdirNuevamente = true;
			
			System.out.println("El total es: $" + CantidadVendida*PrecioProducto[Indice] );
			CantidadProducto[Indice] = CantidadProducto[Indice] - CantidadVendida; 
		}		
		
		
	}

}
