package ar.edu.ort.tp1.tp3.ej4;

import java.util.ArrayList;
import java.util.List;

public class Vivienda {
	private Direccion direccion; //Composicion
	private List<Persona> habitantes; //Agregacion
	private List<Mueble> muebles; //Agregacion
	
	public Vivienda(String calle, int altura, int piso, String departamento) {
		this.direccion = new Direccion(calle, altura, piso, departamento);
		this.habitantes = new ArrayList<>();
		this.muebles = new ArrayList<>();
	}
	
	public Direccion getDireccion() { return this.direccion; }

	public void agregarMueble(Mueble mueble) {
		this.muebles.add(mueble);
	}
	
	public void agregarHabitante(Persona persona) {
		this.habitantes.add(persona);
	}
	
	public List<Persona> getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(List<Persona> habitantes) {
		this.habitantes = habitantes;
	}

	public List<Mueble> getMuebles() {
		return muebles;
	}

	public void setMuebles(List<Mueble> muebles) {
		this.muebles = muebles;
	}
	
	public void vaciarVivienda() {
		this.muebles.clear();
		this.habitantes.clear();
	}
	
	public void mostrarVivienda() {
		direccion.mostrar();
		System.out.println("Personas:");
		for(Persona persona : this.habitantes) {
			persona.mostrar();
		}
		System.out.println("Muebles:");
		for(Mueble mueble : muebles) {
			mueble.mostrar();
		}
		System.out.println(" ");
	}

	@Override
	public String toString() {
		return "Vivienda [direccion=" + direccion + ", habitantes=" + habitantes + ", muebles=" + muebles + "]";
	}
	
	
}
