package Utils;

public class Resta implements Operaciones {
		
		// sobrecargar el metodo constructor de Suma
		
		public Resta(){}
		
		public double Resta (String operador, double a, double b){
			return Operacion ("-", a, b);
		}
		
		public double Resta (String operador, double a, double b, double c){
			return Operacion ("-", a, b, c);
			
		}
		
		public double Resta (String operador, double a, double b, double c, double d){
			return Operacion ("-", a, b, c, d);
		}
		public double Resta (String operador, double...parametros){
			return Operacion ("-", parametros);
		}
		
		@Override
		public double Operacion(String operador, double... parametros) {
		
			double acumulador = 0;
			
			for (int i = 0; i < parametros.length; i++) {
				acumulador -= parametros[i];
			}
			
			return acumulador;
		}



		@Override
		public double Operacion(String operador, double a, double b) {
			// TODO Auto-generated method stub
			return a-b;
		}
		@Override
		public double Operacion(String operador, double a, double b, double c) {
			// TODO Auto-generated method stub
			return a-b-c;
		}

		@Override
		public double Operacion(String operador, double a, double b, double c, double d) {
			// TODO Auto-generated method stub
			return a-b-c-d;
		}

}


