package ar.edu.ort.tp1.tp3.ej5;

import java.util.ArrayList;
import java.util.List;

import ar.edu.ort.tp1.tp3.ej4.Direccion;
import ar.edu.ort.tp1.tp3.ej4.Persona;
import ar.edu.ort.tp1.tp3.ej4.Vivienda;
import ar.edu.ort.tp1.tp3.ej4.Mueble;

public class Edificio {

	private List<Vivienda> viviendas;
	
	public Edificio(List<Vivienda> viviendas) {
		this.viviendas = viviendas;
	}
	
	public void mostrarTodo() {
		for(int i = 0; i < viviendas.size(); i++) {
			System.out.println("Vivienda " + (i+1));
			viviendas.get(i).mostrarVivienda();
		}
	}
	
	public void realizarMudanza(int pisoOrigen, String deptoOrigen, int pisoDestino, String deptoDestino) {
		List<Persona> personasAmudar = new ArrayList<>();
		List<Mueble> mueblesAmudar = new ArrayList<>();
		List<Vivienda> listaActualizada = new ArrayList<>();
		boolean encontreDestino = false;
		boolean encontreOrigen = false;

		for(Vivienda vivienda: viviendas) {
			Direccion direcVivienda = vivienda.getDireccion();
			if (direcVivienda.getPiso() == pisoOrigen && direcVivienda.getDepartamento().equals(deptoOrigen))
			{
				// Encontramos vivienda origen
				encontreOrigen = true;
				personasAmudar = vivienda.getHabitantes();
				mueblesAmudar = vivienda.getMuebles();
				vivienda.vaciarVivienda();
			} else if (direcVivienda.getPiso() == pisoDestino && direcVivienda.getDepartamento().equals(deptoDestino)) 
			{
				// Encontramos vivienda destino
				encontreDestino = true;
				if (encontreOrigen) { // Si encontre previamente la de origen
					//Realizo mudanza
					vivienda.setHabitantes(personasAmudar);
					vivienda.setMuebles(mueblesAmudar);
				}
			}
			listaActualizada.add(vivienda);
		}
		if (encontreOrigen && encontreDestino) { // Si pude realizar la mudanza entonces actualizo viviendas
			System.out.println("Se realizo mudanza del deptartamento: " + pisoOrigen + deptoOrigen + " al: " + pisoDestino + deptoDestino);
			this.viviendas = listaActualizada;
			mostrarTodo();
		}else {
			System.out.println("No se realizo mudanza ya que no se encontro una de las viviendas.");
		}
	}
	
}
