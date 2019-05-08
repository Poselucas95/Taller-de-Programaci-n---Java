package ej5;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
	
	private int jugadoresPermitidos;
	private List<Jornada> jornadas;

	public Torneo(int jugadoresPermitidos, List<Jornada> jornadas) {
		this.jugadoresPermitidos = jugadoresPermitidos;
		this.jornadas = jornadas;
	}

	public int getJugadoresPermitidos() {
		return jugadoresPermitidos;
	}

	public void setJugadoresPermitidos(int jugadoresPermitidos) {
		this.jugadoresPermitidos = jugadoresPermitidos;
	}
	
	public void mostrarPuntos(int puntosPorGanar, int puntosPorPerder,int puntosPorEmpate, int puntosPorEmpateMas3Goles, int puntosPorGanarMas4Goles, int puntosPorNoRivalNoConvirtioGoles) {
		// Toma todas las jornadas y calcula puntos por jornada
		// Y luego hace la suma entre todas ellas y las muestra
		List<Equipo> listaEquipos = new ArrayList<>();
		for(Jornada jornada : this.jornadas) {
			List<Partido> listaPartidos = jornada.getListaPartidos();
			for(Partido partido : listaPartidos) { // Por cada partido calculo puntos y asigno a cada equipo
				// Aca me fijo como fue el puntaje y me fijo si se encuentra en la lista de equipos
				// Si no lo encuentro lo agrego con su nuevo puntaje, sino lo modifico
				int golesVisitante = partido.getGolesVisitante();
				int golesLocal = partido.getGolesLocal();

				Equipo equipoLocal = buscarEquipoEnLista(partido.getEquipoLocal(), listaEquipos);
				Equipo equipoVisitante = buscarEquipoEnLista(partido.getEquipoVisitante(), listaEquipos);

				boolean encontreLocalEnLista = equipoLocal != null;
				boolean encontreVisitanteEnLista = equipoVisitante != null;
				if (!encontreLocalEnLista){
					// No encontre el equipo, entonces uso el del partido
					equipoLocal = partido.getEquipoLocal();
				}
				if (!encontreVisitanteEnLista){
					// No encontre el equipo, entonces uso el del partido
					equipoVisitante = partido.getEquipoVisitante();
				}

				// Actualizo puntos

				// Si gano o perdio
				if (golesLocal > golesVisitante) {  // Gano local y Perdio el visitante
					// Doy puntos por ganar y perder
					equipoLocal.agregarPuntos(puntosPorGanar(golesLocal, golesVisitante, puntosPorGanar, puntosPorGanarMas4Goles, puntosPorNoRivalNoConvirtioGoles));
					equipoVisitante.agregarPuntos(puntosPorPerder);

				} else if (golesVisitante > golesLocal) { // gano visitante y Perdio local
					equipoVisitante.agregarPuntos(puntosPorGanar(golesVisitante, golesLocal, puntosPorGanar, puntosPorGanarMas4Goles, puntosPorNoRivalNoConvirtioGoles));
					equipoLocal.agregarPuntos(puntosPorPerder);

				} else if (golesVisitante == golesLocal) { // Si empato
					if (golesLocal > 3){
						equipoLocal.agregarPuntos(puntosPorEmpateMas3Goles);
						equipoVisitante.agregarPuntos(puntosPorEmpateMas3Goles);
					} else {
						equipoLocal.agregarPuntos(puntosPorEmpate);
						equipoVisitante.agregarPuntos(puntosPorEmpate);
					}
				}
				// Update la lista de equipos
				if (!encontreLocalEnLista){
					listaEquipos.add(equipoLocal);
				} else { // Ya se encontraba, updateo
					int i = listaEquipos.indexOf(equipoLocal);
					listaEquipos.set(i, equipoLocal);
				}
				if (!encontreVisitanteEnLista){
					// No encontre el equipo, entonces lo agrego a la lista actualizado
					listaEquipos.add(equipoVisitante);
				} else { // Ya se encontraba, updateo
					int i = listaEquipos.indexOf(equipoVisitante);
					listaEquipos.set(i, equipoVisitante);
				}

			}
		}

		// Muestro la lista
		System.out.println("Tabla de posiciones al cabo de " + this.jornadas.size() + " fechas");
		for(Equipo equipo: listaEquipos){
			equipo.mostrarPuntos();
		}

	}

	public int puntosPorGanar(int golesGanador, int golesPerdedor, int puntosPorGanar, int puntosPorGanarMas4, int puntosPorRivalNoConvirtio){ // Devuelve los puntos correspondientes por ganar
		if ((golesGanador - golesPerdedor) > 4) {
			return puntosPorGanarMas4;
		} else if (golesPerdedor == 0) {
			return puntosPorRivalNoConvirtio;
		} else {
			return puntosPorGanar;
		}
	}

	public Equipo buscarEquipoEnLista(Equipo equipo, List<Equipo> listaEquipo){ // Busco el equipo en la lista, si lo encuentro lo devuelvo
		// Para poder actualizarlo
		for(Equipo e : listaEquipo){
			if (e.equals(equipo)){
				return e;
			}
		}
		// No encontre nada
		return null;
	}
}
