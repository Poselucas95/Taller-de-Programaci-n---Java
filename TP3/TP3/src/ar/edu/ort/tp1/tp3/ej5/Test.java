package ar.edu.ort.tp1.tp3.ej5;

import java.util.ArrayList;
import java.util.Arrays;

import ar.edu.ort.tp1.tp3.ej4.Mueble;
import ar.edu.ort.tp1.tp3.ej4.Persona;
import ar.edu.ort.tp1.tp3.ej4.Vivienda;

public class Test {

	public static void main(String[] args) {

		Vivienda vivienda = new Vivienda("Montañeses", 1234, 4, "C");
		
		
		vivienda.agregarHabitante(new Persona("Arturo", "Roman", 53));
		vivienda.agregarHabitante(new Persona("Monica", "Gaztambide", 35));

		vivienda.agregarMueble(new Mueble("Mesa", "Madera", "Marron"));
		vivienda.agregarMueble(new Mueble("Mesada", "Marmol", "Rojo"));
		vivienda.agregarMueble(new Mueble("Perchero", "Metal", "Negro"));
		vivienda.agregarMueble(new Mueble("Sillon", "Cuero", "Azul"));
		Vivienda viviendaAmudarse = new Vivienda("Montañeses", 1234, 2, "B");
		
		Edificio edificio = new Edificio(new ArrayList<Vivienda>(Arrays.asList(vivienda, viviendaAmudarse)));
		edificio.mostrarTodo();
		edificio.realizarMudanza(4, "C", 2, "B");
	}

}
