package ejerciciosclasecinco;

public class mostrarDiassemanasMesesanios {
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
	    	mostrarDiassemanasMesesanios x = new mostrarDiassemanasMesesanios();
	        int diasDados = 1095;
	    
	        System.out.println( "Numero de dias ingresado es : " + diasDados + " serian : " +  x.Anios( diasDados ) + " años" + " " +  x.Meses( diasDados) + " meses " + " y " + x.Semanas( diasDados) + " dias." );
	       
	    }
} 

