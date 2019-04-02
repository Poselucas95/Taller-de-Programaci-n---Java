package ejercicio5;


public class Test {

	public static void main(String[] args) {
			AnioV2 Anio = new AnioV2();
		
		System.out.println(calcularcumpleanos(2,4,Anio));

	}
	public  static int calcularcumpleanos(int mes, int dia, AnioV2 anio) {
		
		int dias =  anio.diasTranscurridos(mes)+dia;
		
		return dias;
}
}
