package ar.edu.ort.tp1.tp3.ej4;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void mostrar() {
		System.out.println(nombre + " " + apellido + ", Edad: " + edad);
	}
}
