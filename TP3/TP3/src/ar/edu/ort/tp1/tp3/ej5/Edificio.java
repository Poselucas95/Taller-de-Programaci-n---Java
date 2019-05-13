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

		int indexViviendaOrigen = -1;
		int indexViviendaDestino = -1;
		
		for(int i = 0; i < viviendas.size(); i++) {
			Vivienda viviendaIter = viviendas.get(i);
			Direccion direcVivienda = viviendaIter.getDireccion();
			if (direcVivienda.getPiso() == pisoOrigen && direcVivienda.getDepartamento().equals(deptoOrigen))
			{
				// Encontramos vivienda origen
				indexViviendaOrigen = i;
			} else if (direcVivienda.getPiso() == pisoDestino && direcVivienda.getDepartamento().equals(deptoDestino)) 
			{
				// Encontramos vivienda destino
				indexViviendaDestino = i;
			}
		}
		if (indexViviendaOrigen != -1 && indexViviendaDestino != -1) { // Encontre vivienda para mudanza entonces la realizo
			List<Persona> personasAmudar = new ArrayList<>();
			List<Mueble> mueblesAmudar = new ArrayList<>();
			Vivienda viviendaOrigen = viviendas.get(indexViviendaOrigen);
			Vivienda viviendaDestino = viviendas.get(indexViviendaDestino);
			// Tomo muebles y personas de la vivienda origen y la vacio
			mueblesAmudar.addAll(viviendaOrigen.getMuebles());
			personasAmudar.addAll(viviendaOrigen.getHabitantes()); 
			viviendaOrigen.vaciarVivienda();
			
			// Mudo
			viviendas.set(indexViviendaOrigen, viviendaOrigen); // Hago efectiva la mudanza en origen
			viviendaDestino.setHabitantes(personasAmudar);
			viviendaDestino.setMuebles(mueblesAmudar);
			viviendas.set(indexViviendaDestino, viviendaDestino); // Hago efectiva la mudanza en destino

			System.out.println("Se realizo mudanza del deptartamento: " + pisoOrigen + deptoOrigen + " al: " + pisoDestino + deptoDestino);
			
			mostrarTodo();
		}else {
			System.out.println("No se realizo mudanza ya que no se encontro una de las viviendas.");
		}
	}
	
}
