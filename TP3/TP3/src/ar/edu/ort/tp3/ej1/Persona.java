package ar.edu.ort.tp3.ej1;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	ArrayList<Email> iMails;
	ArrayList<NumeroTelefonico> iTelefonos;
	
	public Persona(String nombre, String apellido){
		this.apellido = apellido;
		this.nombre = nombre;
		iMails = new ArrayList<Email>();
		iTelefonos = new ArrayList<NumeroTelefonico>();
	}
	
	public void agregarTelefono(String caracteristica, String nroDeAbonado, String codigoPais, TipoDeLinea tipo){
		iTelefonos.add(new NumeroTelefonico(caracteristica, nroDeAbonado, codigoPais, tipo));
	}
	public void agregarEmail(String email){
		iMails.add(new Email(email));		
	}
	
	public void mostrarTodo(){
		System.out.println(this.apellido + ", " + this.nombre);
		System.out.println("Telefonos:");
		for(NumeroTelefonico telefono : iTelefonos){
			System.out.println(telefono.getTipo() + ": " + telefono.getValor());
		}
		for(Email email : iMails){
			System.out.println("Email: " + email.getValor());
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
