package ar.edu.ort.tp1.tp3ej3;
import java.util.ArrayList;
import ar.edu.ort.tp1.tp3ej1.Persona;


public class Hito {
	private String fecha;
	private String descripcion;
	ArrayList<Persona> personasInvolucradas;
	
	public Hito(String fecha, String descripcion){
		this.fecha = fecha;
		this.descripcion = descripcion;
		personasInvolucradas = new ArrayList<Persona>();
	}
	
	

	public void getValor(){
		System.out.println(fecha);
		System.out.println(descripcion);
		for(Persona persona : personasInvolucradas){
			System.out.println(persona.getApellido() + ", " + persona.getNombre());
		}
	}
	
	public void agregarPersona(Persona persona){
		personasInvolucradas.add(persona);
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Persona> getPersonasInvolucradas() {
		return personasInvolucradas;
	}

	public void setPersonasInvolucradas(ArrayList<Persona> personasInvolucradas) {
		this.personasInvolucradas = personasInvolucradas;
	}
	
	
	
}
