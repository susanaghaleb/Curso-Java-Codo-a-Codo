package org.francho.java.calculadora;

import Utils.Resultados;

public class Main {

    public static void main(String[] args) {
    	
    	
    	
    	Resultados x = new Resultados();
    	x.Calcular();
    	
    	
     VentanaCalculadora calculadora = new VentanaCalculadora();
     calculadora.setVisible(true);
        
        
    	 /* public static double conversor(String valor){
    			
    			double valorConvertido = 0;
    			try {
    				valorConvertido = Double.parseDouble(valor);
    			} catch (NumberFormatException e) {
    				
    			}
    			
    			return valorConvertido;
    		}

    		public static double[] conversor (String[] valores){
    			double[] auxiliar = new double [valores.length];
    			for (int i = 0; i < valores.length; i++) {
    				auxiliar[i] = conversor(valores[i]);
    			}
    			return auxiliar;
    		}*/
        
        
        	
        }
  
	
	
	

}
