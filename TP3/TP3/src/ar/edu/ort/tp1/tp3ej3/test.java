package ar.edu.ort.tp1.tp3ej3;

import ar.edu.ort.tp1.tp3ej1.*;
import ar.edu.ort.tp1.tp3ej2.*;


public class test {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Lucas", "Pose");
		Persona persona2 = new Persona("pepe", "jose");
		persona1.agregarEmail("poselucas@gmail.com");
		persona1.agregarEmail("Pepe@gmail.com");
		persona1.agregarTelefono("549", "1121", "021", TipoDeLinea.FAX );
		persona1.agregarTelefono("549", "1131", "031", TipoDeLinea.FIJO );
		persona1.agregarTelefono("549", "1141", "041", TipoDeLinea.CELULAR );
		persona1.agregarMascota("Pluto", "Perro");
		
		Hito hito1 = new Hito("20.04.2018", "me tome un caf�");
		hito1.agregarPersona(persona1);
		hito1.agregarPersona(persona2);
		persona1.agregarHito(hito1);
		persona1.mostrarTodo();
	}

}
