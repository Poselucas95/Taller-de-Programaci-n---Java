package ejercicio5;

public class AnioV2 {
	
	public int diasTranscurridos(int mes) {
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
