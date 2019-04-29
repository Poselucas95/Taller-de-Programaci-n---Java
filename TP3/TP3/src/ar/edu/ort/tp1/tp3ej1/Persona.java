package ar.edu.ort.tp1.tp3ej1;

import ar.edu.ort.tp1.tp3ej2.Mascota;
import ar.edu.ort.tp1.tp3ej3.Hito;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	ArrayList<Email> iMails;
	ArrayList<NumeroTelefonico> iTelefonos;
	ArrayList<Mascota> iMascotas;
	ArrayList<Hito> iHitos;
	
	public Persona(String nombre, String apellido){
		this.apellido = apellido;
		this.nombre = nombre;
		iMails = new ArrayList<Email>();
		iTelefonos = new ArrayList<NumeroTelefonico>();
		iMascotas = new ArrayList<Mascota>();
		iHitos = new ArrayList<Hito>();
	}
	
	public void agregarTelefono(String caracteristica, String nroDeAbonado, String codigoPais, TipoDeLinea tipo){
		iTelefonos.add(new NumeroTelefonico(caracteristica, nroDeAbonado, codigoPais, tipo));
	}
	public void agregarEmail(String email){
		iMails.add(new Email(email));		
	}
	public void agregarMascota(String nombre, String tipo){
		iMascotas.add(new Mascota(nombre, tipo));
	}
	
	public void agregarHito(Hito hito){
		iHitos.add(hito);
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
		System.out.println("Mascotas: ");
		for(Mascota mascota : iMascotas){
			System.out.println(mascota.getValor());
		}
		System.out.println("Momentos importantes: ");
		for(Hito hito : iHitos){
			System.out.println(hito.getValor());
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
