package ej5;

import java.util.List;

public class TorneoFut5 extends Torneo{

	public TorneoFut5(int jugadoresPermitidos, List<Jornada> jornadas) {
		super(jugadoresPermitidos, jornadas);
	}
	public void mostrarPuntos() {
		// TODO Auto-generated method stub
		System.out.println("Torneo de futbol 5");
		super.mostrarPuntos(3,0,1, 0,
				 0,0);
	}

}
