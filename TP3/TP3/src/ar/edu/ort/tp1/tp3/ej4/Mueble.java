package ar.edu.ort.tp1.tp3.ej4;

public class Mueble {
	private String nombre;
	private String material;
	private String color;
	
	public Mueble(String nombre, String material, String color) {
		super();
		this.nombre = nombre;
		this.material = material;
		this.color = color;
	}
	
	public void mostrar() {
		System.out.println(nombre + " de " + material + " color " + color);
	}
}
