package ejercicio5;

public enum Meses {
	
	ENERO(31,1),FEBRERO(28,2),MARZO(31,3),ABRIL(30,4),MAYO(31,5),JUNIO(30,6),JULIO(31,7),AGOSTO(31,8), SEPTIEMBRE(30,9), OCTUBRE(31,10), 
	NOVIEMBRE(30,11),DICIEMBRE(31,12);
	
	private int dias;
	private int numero;
	
	private Meses(int dias, int numero){
		this.dias=dias;
		this.numero=numero;

}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
