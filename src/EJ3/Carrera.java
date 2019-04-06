package EJ3;

import java.util.ArrayList;

public class Carrera {
	private String especialidad;
	private ArrayList<Corredor> listaCorredores = null;
	private ArrayList<Corredor> primerosCorredores;
	private ArrayList<Corredor> segundosCorredores;
	private ArrayList<Corredor> tercerosCorredores;
	private Posicion puestoA;
	private Posicion puestoB;
	private Posicion puestoC;
	
	

	public  Carrera(ArrayList<Corredor> list, String especialidad) {
		this.setEspecialidad(especialidad);
		this.setListaCorredores(list);
		ArrayList<Corredor> primerosCorredores = new ArrayList<Corredor>();
		ArrayList<Corredor> segundosCorredores = new ArrayList<Corredor>();
		ArrayList<Corredor> tercerosCorredores = new ArrayList<Corredor>();
		puestoA = new Posicion(1, 99.9, primerosCorredores);
		puestoB = new Posicion(2, 99.9, segundosCorredores);
		puestoC = new Posicion(3, 99.9, tercerosCorredores);
	}
	
	public  Carrera() {
	}



	
	public void verificarGanadores() {
		ArrayList<Corredor> lista = this.getListaCorredores();
		ArrayList<Corredor> primerPuesto = this.getPrimerosCorredores();
		ArrayList<Corredor> segundoPuesto = this.getSegundosCorredores();
		ArrayList<Corredor> tercerPuesto = this.getTercerosCorredores();
		Posicion auxPrimero;
		Posicion auxSegundo;
		Posicion auxTercero;
		
		for(Corredor corredor : lista){	
			if(corredor.getTiempo() < traerPrimerPuesto().getTiempo() ) {
				traerTercerPuesto().getCorredores().clear();
				traerTercerPuesto().getCorredores().add(corredor);
				traerTercerPuesto().setTiempo(corredor.getTiempo());
				
				auxSegundo = traerPrimerPuesto();
				auxTercero = traerSegundoPuesto();
				
				setPrimerPuesto(traerTercerPuesto(), 1);
				setSegundoPuesto(auxSegundo, 2);
				setTercerPuesto(auxTercero, 3);
				
				System.out.print(traerSegundoPuesto().getTiempo());
			}
		}
		
	
		
	}
	
	
	private void setTercerPuesto(Posicion corredores, int posicion) {
		traerTercerPuesto().setCorredores(corredores.getCorredores());
		traerTercerPuesto().setPos(posicion);
		traerTercerPuesto().setTiempo(corredores.getTiempo());
		
	}
	
	private void setSegundoPuesto(Posicion corredores, int posicion) {
		traerSegundoPuesto().setCorredores(corredores.getCorredores());
		traerSegundoPuesto().setPos(posicion);
		traerSegundoPuesto().setTiempo(corredores.getTiempo());
		
	}
	
	private void setPrimerPuesto(Posicion corredores, int posicion) {
		traerPrimerPuesto().setCorredores(corredores.getCorredores());
		traerPrimerPuesto().setPos(posicion);
		traerPrimerPuesto().setTiempo(corredores.getTiempo());
		
	}
	
	
	private Posicion traerTercerPuesto() {
		Posicion pos = new Posicion();
		if(puestoA.getPos()==3) {
			pos = puestoA;
		}else if(puestoB.getPos()==3){
			pos = puestoB;
		}else if(puestoC.getPos()==3) {
			pos = puestoC;
		}
		return pos;
	}
	
	private Posicion traerSegundoPuesto() {
		Posicion pos = new Posicion();
		if(puestoA.getPos()==2) {
			pos = puestoA;
		}else if(puestoB.getPos()==2){
			pos = puestoB;
		}else if(puestoC.getPos()==2) {
			pos = puestoC;
		}
		return pos;
	}
	
	private Posicion traerPrimerPuesto() {
		Posicion pos = new Posicion();
		if(puestoA.getPos()==1) {
			pos = puestoA;
		}else if(puestoB.getPos()==1){
			pos = puestoB;
		}else if(puestoC.getPos()==1) {
			pos = puestoC;
		}
		return pos;
	}
	
	
	
	//GETTERS AND SETTERS
	
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public ArrayList<Corredor> getListaCorredores() {
		return listaCorredores;
	}

	public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
		this.listaCorredores = listaCorredores;
	}
	

	public ArrayList<Corredor> getPrimerosCorredores() {
		return primerosCorredores;
	}

	public void setPrimerosCorredores(ArrayList<Corredor> primerosCorredores) {
		this.primerosCorredores = primerosCorredores;
	}

	public Posicion getPuestoA() {
		return puestoA;
	}

	public void setPuestoA(Posicion puestoA) {
		this.puestoA = puestoA;
	}

	public Posicion getPuestoB() {
		return puestoB;
	}

	public void setPuestoB(Posicion puestoB) {
		this.puestoB = puestoB;
	}

	public Posicion getPuestoC() {
		return puestoC;
	}

	public void setPuestoC(Posicion puestoC) {
		this.puestoC = puestoC;
	}

	public ArrayList<Corredor> getSegundosCorredores() {
		return segundosCorredores;
	}

	public void setSegundosCorredores(ArrayList<Corredor> segundosCorredores) {
		this.segundosCorredores = segundosCorredores;
	}

	public ArrayList<Corredor> getTercerosCorredores() {
		return tercerosCorredores;
	}

	public void setTercerosCorredores(ArrayList<Corredor> tercerosCorredores) {
		this.tercerosCorredores = tercerosCorredores;
	}


	
}
