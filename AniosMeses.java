package Practica;

public class AniosMeses {
	private static final int Anios = 0;

	public static int Dias (int value){
		return value ;	
	}
	public int Semanas (int value ){
		return value / 7 ;	
	}
	public int Meses (int value ){
		return (value / 365) * 12 ;	
	}
	public int Anios (int value){
		return value / 365;	
	}
	
	    public static void main (String [] args) {
	    	AniosMeses x = new AniosMeses();
	        int diasDados = 2794;
	        int cantAnios = 0;
	        int mesesPoranio=12;
	        int diasPoranio = 365;
	        cantAnios= diasDados/365;
	        int y = diasPoranio * cantAnios; 
	        
	        System.out.println("Valor de los dias por a�os por la cantidad de a�os es: " + y);
	        
	        int diasRestantes = 0;
	        diasRestantes = diasDados - y;
	        
	        System.out.println("Dias restantes son: " + diasRestantes);
	        
	        int mesesEndiasRestantes = 0;
	        
	    if (diasRestantes > 30 ){
	    	mesesEndiasRestantes = diasRestantes / 30;
	    }
	    	int mesesEncantidadanio = 0;
	    	mesesEncantidadanio = cantAnios * mesesPoranio;
	    	
	    	System.out.println("Meses en cantidad de a�os serian: " + mesesEncantidadanio);
	    	
	    	int totalMesesenAnios = mesesEncantidadanio + mesesEndiasRestantes;
	    	System.out.println("El total de los meses en a�os es de: " + totalMesesenAnios);
	    
	    
	        System.out.println( "Numero de dias ingresado es : " + diasDados + " serian : " +  x.Anios( diasDados ) + " a�os" + " " +  x.Meses( diasDados) + " meses " + " y " + x.Semanas( diasDados) + " semanas." );
	       
	    }
} 


