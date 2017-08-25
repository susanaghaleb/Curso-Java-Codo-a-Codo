package practicas;

public class NumeroPositivoNegativo {
	public int reversionEntero (int A){
	return (A * -1);
	}
	public double reversionDecimal (double A){
		return (A * -1);
	}		
	public static void main (String[] args){
		NumeroPositivoNegativo obj = new NumeroPositivoNegativo();
		obj. reversionEntero (-84);
		obj. reversionDecimal (-42.2);
		System.out.println(obj. reversionEntero (-84));
		System.out.println(obj. reversionDecimal (-42.2));
		
		
		int A = 4;
		double B = 24.2;
		System.out.println(A * -1) ;
		System.out.println(B * -1);
	
		}
	
}