package NumeroDieciseis;

public class DescuentoPorcentaje {
public static void main(String[] args) {
	double miProducoComprado = 84.33;
	double descuentoTienda = 0.15;
	double montodescuento = (miProducoComprado * descuentoTienda);
	System.out.println(montodescuento);
	double montoPagar =  (miProducoComprado - montodescuento);
	System.out.println(montoPagar);
	
}
}
