package practicas;

public class Arreglos {
	public static void main(String[] args) {
	String [] nx = {"Suzanne" , "Alvaro" , "Servando"};
	//lo de abajo no tiene que ver una poronga con lo de arriba
	String [] arrx = new String [3];
	//lo de abajo no tiene que ver una poronga con lo de arriba
	System.out.println(nx [0]);
	System.out.println(nx [1]);
	System.out.println(nx [2]);
	System.out.println("\n");//esto coloca un salto de linea para que no se vea fea la cosa
		for (String abc : nx){
		System.out.println(abc);
		}
		System.out.println("\n");//esto coloca un salto de linea para que no se vea fea la cosa
			for (int indice = 0 ; indice < nx.length ; indice ++){
				System.out.println( nx [indice]);
			
			}
			System.out.println("\n");// esto coloca un salto de linea para que no se vea fea la cosa
				for (int x=0 ; x < arrx . length; x++){
					arrx [x]= "Alumno : " + x ;
				}
					for (int y = 0 ; y < arrx . length ; y ++) {
						System.out.println(arrx [y]);
					}
		}
	}

