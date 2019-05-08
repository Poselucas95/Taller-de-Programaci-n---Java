package ej5;

import java.util.ArrayList;
import java.util.List;

public class Jornada {

	private List<Partido> listaPartidos;
	private String fecha;

	public Jornada(String fecha, List<Partido> listaPartidos){
		setFecha(fecha);
		setListaPartidos(listaPartidos);
	}

	public void setListaPartidos(List<Partido> listaPartidos) {
		this.listaPartidos = listaPartidos;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<Equipo> obtenerListaEquipos() {
		List<Equipo> listaEquipos = new ArrayList<>();
		
		for(Partido partido : this.listaPartidos) {
			// Local
			Equipo equipoLocal = partido.getEquipoLocal();
			if(!(listaEquipos.contains(equipoLocal))) {
				listaEquipos.add(equipoLocal);
			}
			// Visitante
			Equipo equipoVisitante = partido.getEquipoVisitante();
			if(!(listaEquipos.contains(equipoVisitante))) {
				listaEquipos.add(equipoVisitante);
			}
		}
		return listaEquipos;
		
	}
	
	public List<Partido> getListaPartidos(){
		return this.listaPartidos;
	}
	
}
