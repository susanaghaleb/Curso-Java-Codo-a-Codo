package ejerciciosclasecinco;

public class calcularEdad{
	
    public static void main(String[] args) {
    	int nino = 12;
    	int adolecente = 17;
    	int adulto = 60;
    	int muerto = 100;
    	
    	int edadPersona = 82;
    	if (edadPersona <= nino){
    		System.out.println("soy un niño de: " + edadPersona);
    	}else{
    		if(edadPersona <= adolecente){
    			System.out.println("soy un adolecente de: " + edadPersona);
    		}else{
    			if(edadPersona <= adulto){
    				System.out.println("soy un adulto de: " + edadPersona);
    			}else{
    				if(edadPersona <= muerto){
    					System.out.println("soy un adulto mayor de: " + edadPersona);
    				}
    			}
    		}
    	}
    }
}




