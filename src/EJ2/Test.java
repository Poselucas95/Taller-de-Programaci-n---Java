package EJ2;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		ArrayList<Corredor> lista = new ArrayList<Corredor>();
		
		Corredor corredor1 = new Corredor("pepe", 0.2);
		Corredor corredor2 = new Corredor("JORGE", 0.3);
		Corredor corredor3 = new Corredor("toto", 0.2);
		Corredor corredor4 = new Corredor("tata", 0.1);
		lista.add(corredor1);
		lista.add(corredor2);
		lista.add(corredor3);
		lista.add(corredor4);
		Carrera carrera = new Carrera(lista, "hockey");
		carrera.verificarGanador();
		

	}

}
