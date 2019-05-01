package ej5;

public class Equipo {
	private String nombre;
	private int puntos;
	
	public Equipo(String nombre) {
		this.puntos = 0;
		this.nombre = nombre;
	}
	
	public void agregarPuntos(int puntos) {
			if (this.puntos + puntos < 0) {
				return;
			} else {
				this.puntos += puntos;
			}		
	}

	public void mostrarPuntos(){
		System.out.println(nombre + ": " + puntos);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
