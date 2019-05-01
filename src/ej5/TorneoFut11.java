package ej5;

import java.util.List;

public class TorneoFut11 extends Torneo {

	public TorneoFut11(int jugadoresPermitidos, List<Jornada> jornadas) {
		super(jugadoresPermitidos, jornadas);
	}

	public void mostrarPuntos() {
		// TODO Auto-generated method stub
		System.out.println("Torneo de futbol 11");
		super.mostrarPuntos(3,0,1, 0,
				 0,0);
	}
	
	

}
