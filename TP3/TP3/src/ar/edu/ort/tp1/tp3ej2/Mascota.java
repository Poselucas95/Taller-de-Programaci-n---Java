package ar.edu.ort.tp1.tp3ej2;


public class Mascota{
	private String nombre;
	private String tipo;
	
	public Mascota(String nombre, String tipo){
		this.nombre = nombre;
		this.tipo = tipo;
		
	}
	
	public String getValor(){
		return tipo+", "+ nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
