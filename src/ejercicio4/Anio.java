package ejercicio4;

public class Anio {
	
	private String[] meses;
	private int[] canxMes;
	
	public Anio() {
		
		meses = new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
		                    "Septiembre", "Octubre","Noviembre","Diciembre"};
		
		canxMes = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	}
	
	public String getNombredelMes(int num) {
		
		int nun = num-1;
		
		return this.meses[nun];
	}
	
	public int diasTranscurridos(int numeroMes) {
		 
		 int nun = numeroMes-1;
		 int i = 0;
		 int acum = 0;
		 
		while(i < numeroMes) {
			
		  acum += canxMes[i];
		  i++;
			 
		 }
		return acum;
	}
	
	
}


