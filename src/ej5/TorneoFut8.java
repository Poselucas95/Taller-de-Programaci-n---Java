package ej5;

import java.util.List;

public class TorneoFut8 extends Torneo{

	public TorneoFut8(int jugadoresPermitidos, List<Jornada> jornadas) {
		super(jugadoresPermitidos, jornadas);
	}
	public void mostrarPuntos() {
		System.out.println("Torneo de futbol 8");
		super.mostrarPuntos(3,1,1, 0,
				 0,0);
	}
}
