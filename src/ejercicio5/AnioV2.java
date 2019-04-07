package ejercicio5;

public class AnioV2 {
	
	public int diasTranscurridos(int mes) {
		
		/* Sabemos que se puede hacer asi, no tuvimos tiempo de cambiarlo
		Mes[] meses = Meses.values()  
		int i = 0
		while(i<mes){
		Mes mesIter =  meses[i];
		acum+= e.getDias();
		i++;
		}*/
		int i=1, acum=0;
		
		for(Meses e: Meses.values()){
			
			if(i<mes) {
				acum += e.getDias();
			}else{
				break;
			}
			i++;
		}
		return acum;
	}
	public String getNombreDelMes(int num) {
		
		String miMes =null;
		for(Meses e: Meses.values()) {
			
			if(e.getNumero() == num) {
				
				miMes = e.name();
				break;
			}
		}
		return miMes;
	}
}
