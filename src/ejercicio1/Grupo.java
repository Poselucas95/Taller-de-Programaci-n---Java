package ejercicio1;

import java.util.ArrayList;

public class Grupo {
	
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo(String nombre) {
		this.nombre=nombre;
		this.integrantes= new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int CantidadIntegrantes() {
		return integrantes.size();
	}
	public void agregarIntegrante(String nombre) {
		
		if(integrantes.contains(nombre)) {
			System.out.println("No se ha podido agregar por que el ya existe");
		}else{
			System.out.println("["+nombre+"] fue asignado al grupo ["+this.nombre+"]");
			integrantes.add(nombre);
			
		}
	}
	public String obtenerIntegrante(int posicion) {
		
		if(posicion >= 1) {
			
		
		integrantes.get(posicion-1);
	     
	     if(integrantes.get(posicion-1) != null) {
	    	 return integrantes.get(posicion-1);

		}else{
			return null;
			
		}
	}else{
		System.out.println("La posicion tiene que ser mayor o igual a uno");
		return null;
	}
}
	public int posicionIntegrante(String nombre) {
		int i=0;
		int x=-1;
		boolean enc=false;
		
		while(i<integrantes.size() && enc==false) {
			
			if(integrantes.get(i).equalsIgnoreCase(nombre)) {
				enc = true;
				x = 1;
			
			}else{
				i++;
			}
		}
		return x;
	}
	public String buscarIntegrante(String nombre) {
	 String	integrante=null;
	 int i = 0;
		
	 while(i<integrantes.size() && integrante == null) {
			
			if(integrantes.get(i).equalsIgnoreCase(nombre)) {
				integrante = integrantes.get(i);
				
			}else{
				i++;
			}
			
		}
		return integrante;
		
	}
	public String removerIntegrante(String nombre) {
		String integrante;
		 integrante = buscarIntegrante(nombre);
		 
		 if(integrante != null) {
			 integrantes.remove(integrante);
			 return integrante;
			 
		 }else{
			 return null;
		 }
	}
	private void mostrarIntegrantes() {
		int i = integrantes.size();
		
		System.out.println("Cantidad de Integrantes: "+i);
		
		for(String e: integrantes){
			System.out.println(e);
		}
	}
	public void mostrar() {
		int i = integrantes.size();
		
		System.out.println("Cantidad de Integrantes: "+i+" Nombre del Grupo: "+this.nombre);

		for(String e: integrantes){
			System.out.println(e);

	}
	}
	public ArrayList getIntegrantes() {
		return this.integrantes;
	}
}
