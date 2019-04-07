package ejercicio4;

public class Test {

	public static void main(String[] args) {
			
		Anio anio = new Anio();
		
		// cumpleanos de Eleazar 02/04/
		
		System.out.println(calcularcumpleanos(2,4,anio));

	}
	public  static int calcularcumpleanos(int mes, int dia, Anio anio) {
		
			int dias =  anio.diasTranscurridos(mes)+dia;
			
			return dias;
	}
	
}
