package metodos;

public class Ejemplometodos {
	
	public void Mostrar (int valor){
		System.out.println(valor);
	}
	
	public int Suma (int a, int b){
		return a + b;
	}
	
	public int Resta (int a, int b){
		return a - b;
	}
	
	public int Multiplica (int a, int b){
		return a * b;
	}
	
	public int Division (int a, int b){
		return a / b;
	}
	
	public static void main(String[] args) {
		Ejemplometodos obj = new Ejemplometodos();
		obj.Mostrar (obj.Suma(2,2));
		obj.Mostrar (obj.Resta(2,2));
		obj.Mostrar (obj.Multiplica(2,2));
		obj.Mostrar (obj.Division(2,2));

	}
}
