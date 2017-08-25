import Controlador.Logica;
import Vista.Pantallas;

public class Application {

	public static void main(String[] args) {
		
		Pantallas vista = new Pantallas();
		Logica controlador = new Logica();
		
		String valorIngresado = vista.IngresarValor("Calculadora");
		
		vista.MostrarMensaje ("El resultado es : " + controlador.calcular(valorIngresado));
	}
}
