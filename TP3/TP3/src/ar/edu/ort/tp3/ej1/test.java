package ar.edu.ort.tp3.ej1;

public class test {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Persona persona1 = new Persona("Lucas", "Pose");
		persona1.agregarEmail("poselucas@gmail.com");
		persona1.agregarEmail("Pepe@gmail.com");
		persona1.agregarTelefono("549", "1121", "021", TipoDeLinea.FAX );
		persona1.agregarTelefono("549", "1131", "031", TipoDeLinea.FIJO );
		persona1.agregarTelefono("549", "1141", "041", TipoDeLinea.CELULAR );
		
		persona1.mostrarTodo();
	}

}
