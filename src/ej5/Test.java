package ej5;
import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {

		Equipo equipo = new Equipo("River");
		Equipo equipo2 = new Equipo("Boca");
		Equipo equipo3 = new Equipo("San Lorenzo");
		Partido partido0 = new Partido(equipo, equipo2, 10, 2);
		Partido partido1 = new Partido(equipo, equipo2, 5, 5);
		Partido partido2 = new Partido(equipo, equipo3, 1, 1);
		Partido partido3 = new Partido(equipo2, equipo3, 1, 20);

		List<Partido> listaPartidos = new ArrayList<>();
		listaPartidos.add(partido0);
		listaPartidos.add(partido1);
		listaPartidos.add(partido2);
		listaPartidos.add(partido3);

		Jornada jornada = new Jornada("2 de mayo", listaPartidos);
		Jornada jornada2 = new Jornada("3 de mayo", listaPartidos);
		List<Jornada> list = new ArrayList<>();
		list.add(jornada);
		list.add(jornada2);
		TorneoFut5 torneoFut5 = new TorneoFut5(11, list);

		torneoFut5.mostrarPuntos();


	}
}
