package EJ3;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		ArrayList<Corredor> lista = new ArrayList<Corredor>();
		
		Corredor corredor1 = new Corredor("pepe", 10);
		Corredor corredor2 = new Corredor("jose", 5);
		lista.add(corredor1);
		lista.add(corredor2);

		Carrera carrera = new Carrera(lista, "hockey");
		carrera.verificarGanadores();
		

	}

}
