package Practica;

public class Descuento {
	Double Rebaja (Double A , int B){
		return (A / B);
	}
	Double PagoTotal (Double A , Double B){
		return (A - B);
	}
	
	public static void main(String[] args) {
		Double TotalCompra = 3675.28;
		int Comision = 15;
		Descuento Z = new Descuento ();
		Z.Rebaja (TotalCompra , Comision);
		System.out.println("El descuento es de " + Z.Rebaja (TotalCompra , Comision) + " pesos");
		Z.PagoTotal (TotalCompra , Z.Rebaja (TotalCompra , Comision));
		System.out.println("El total de su compra es de " + Z.PagoTotal (TotalCompra , Z.Rebaja (TotalCompra , Comision)) + " pesos");
	}
}
