package practica;

public class CalcularDias {
	public static void main(String[] args) {
		int nDias;
		int diasXanio = 365;
		int diasXsemana = 7;
		//int mesesXanio = 12;
		//int semanasXanio = 54;
		int diasXmes = 30;
		
		int cantSemanasEnDias = 0;
		int cantMesesEnDias = 0;
		int cantAniosEnDias = 0;
		int cantDiasRestantes = 0;
		
		ObjetoRobot objeto = new ObjetoRobot();
		
		do
		{
			System.out.println("Ingrese cantidad de días:");
			nDias = (int)objeto.leer();
		}while (nDias < 0);
		
		if (nDias >= diasXanio)
		{
			cantAniosEnDias = nDias / diasXanio;
		}
		if (nDias >= diasXsemana)
		{
			cantSemanasEnDias = nDias /diasXsemana;
		}
		if (nDias >= diasXmes)
		{
			cantMesesEnDias = nDias /diasXmes;
		}
		if (cantAniosEnDias > 0)
		{
			if ((cantAniosEnDias * diasXanio) < nDias)
			{
				cantDiasRestantes = nDias - (cantAniosEnDias * diasXanio);
			}
		}
		
		System.out.println(nDias + " días contituyen: "+ cantAniosEnDias + " año/s, ");
		System.out.println(cantSemanasEnDias + " semana/s, "+ cantMesesEnDias+ " mes/es y ");
		System.out.println(cantDiasRestantes + " día/s.");		
	}

}
