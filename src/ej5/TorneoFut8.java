package ej5;

import java.util.List;

public class TorneoFut8 extends Torneo{

	public TorneoFut8(int jugadoresPermitidos, List<Jornada> jornadas) {
		super(jugadoresPermitidos, jornadas);
		// TODO Auto-generated constructor stub
	}
	public void mostrarPuntos() {
		// TODO Auto-generated method stub
		super.mostrarPuntos(3,1,1, 0,
				 0,0);
	}
}
