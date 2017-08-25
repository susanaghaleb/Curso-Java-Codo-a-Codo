package Practica;


public class AreaVolumenCilindro {
	Double A (int R , int H , Double Pi ){
		return (2 * Pi * R *(H + R));
	}
	Double V (Double Pi , int R , int H){
		return (Pi * R * R* H);
	}
	public static void main(String[] args) {
	int R = 3;
	int H = 7;
	Double Pi = 3.14;
	
	
	AreaVolumenCilindro  obj = new AreaVolumenCilindro ();
	obj.A (R, H, Pi);
	obj.V ( Pi , R, H);
			System.out.println("El Area de mi Cilindro es " + obj.A (R, H, Pi));
			System.out.println("El volumen de mi cilindro es " + obj.V ( Pi , R, H));
	}
}
