package Practica;

public class ProductosDeBellezaFemenina {
	public static void main(String[] args) {
		String [] nombreProductos = new String [10];
		float [] precioProductos  = new float [10] ;
		int [] cantidadProductos = new int [10];

		
		Robot obj = new Robot();
		int x=0;
		
		for (x=0; x<2; x++){
		System.out.println("Por favor ingrese el nombre del producto :");
		nombreProductos[x] = obj.LeerTexto();
		System.out.println("Por favor ingrese el precio del producto :");
		precioProductos[x]= obj.Leer();
		System.out.println("Por favor ingrese la cantidad total del producto :");
		cantidadProductos[x]= (int) obj.Leer();
		}
		
		String producto = "";
		int cantPorVender=0;
		int y = 0 , z = 5;
		
		while (y < 1){
			
			System.out.println("Producto a vender");
			producto = obj.LeerTexto();
			
			System.out.println("cantidad a vender");		
			cantPorVender = (int) obj.Leer();
			
			for (x = 0 ; x < 1 ; x++){
				if ( producto.equalsIgnoreCase(nombreProductos[x]) 
						&& cantPorVender > cantidadProductos[x] ){
					System.out.println(" No hay suficiente en Stock");
				}
				
			}
			for (int i = 0 ; i < cantPorVender ; i ++){
				System.out.println(nombreProductos[x]+ " Total por pagar: " + precioProductos[x] * cantPorVender);
		}
			
			y++;
			
		}
		
		
	}	
}
