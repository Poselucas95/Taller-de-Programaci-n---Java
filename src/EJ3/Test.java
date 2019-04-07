package EJ3;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		ArrayList<Corredor> lista = new ArrayList<Corredor>();
		
		Corredor corredor1 = new Corredor("Pepe", 0.5);
		Corredor corredor2 = new Corredor("Jose", 0.5);
		Corredor corredor3 = new Corredor("Ricardo", 0.3);
		Corredor corredor4 = new Corredor("Ana", 0.3);
		Corredor corredor5 = new Corredor("Julio", 0.7);
		Corredor corredor6 = new Corredor("Lucas", 0.2);
		Corredor corredor7 = new Corredor("Roman", 0.5);
		lista.add(corredor1);
		lista.add(corredor2);
		lista.add(corredor3);
		lista.add(corredor4);
		lista.add(corredor5);
		lista.add(corredor6);
		lista.add(corredor7);

		Carrera carrera = new Carrera(lista, "hockey");
		carrera.verificarGanadores();
		

	}

}
