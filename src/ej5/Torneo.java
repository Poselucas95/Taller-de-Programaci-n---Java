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

	public void calcularPuntosJornadas() {
		 
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
				
				// Si gano o perdio
				if (golesLocal > golesVisitante) {  // Gano local y Perdio el visitante
					// Doy puntos por ganar y perder
					if (diferenciaGoles(golesLocal, golesVisitante) > 4) {
						
					} else if (golesVisitante == 0) {
						
					}
				} else if (golesVisitante > golesLocal) { // Perdio local y gano visitante
					
				} else if (golesVisitante == golesLocal) { // Si empato
					
				}
				
				
			}
		}
	}
	
	public int diferenciaGoles(int ganadorGoles, int perdedorGoles) {
		return ganadorGoles - perdedorGoles;
	}
	
	
}
