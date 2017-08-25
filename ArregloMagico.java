package Practica;

public class ArregloMagico {
	public static void main(String[] args) {
		int [] A = new int [4];
		
		Robot obj = new Robot();
		
		for (int x = 0 ; x < 4 ; x++){
			System.out.println("Por favor ingrese los numeros deseados : ");
			A[x] = (int) obj.Leer();
		}
		A = obj.ordenarMagicamente(A);
		for (int i = 0 ; i < 4 ; i++){
		System.out.println(A[i]);
		}
	}
}
