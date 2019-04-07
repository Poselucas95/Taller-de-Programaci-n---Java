package EJ3;

import java.util.ArrayList;


public class Carrera {
	private String especialidad;
	private ArrayList<Corredor> listaCorredores = null;
	private Posicion puestoA;
	private Posicion puestoB;
	private Posicion puestoC;
	
	

	public  Carrera(ArrayList<Corredor> list, String especialidad) {
		this.setEspecialidad(especialidad);
		this.setListaCorredores(list);
		puestoA = new Posicion(1, 99.9);
		puestoB = new Posicion(2, 99.9);
		puestoC = new Posicion(3, 99.9);

	}
	
	public  Carrera() {
	}



	
	public void verificarGanadores() {
		ArrayList<Corredor> lista = this.getListaCorredores();
		Posicion auxPrimero;
		Posicion auxSegundo;
		Posicion auxTercero;
		
		for(Corredor corredor : lista){	
			if(corredor.getTiempo() < puestoA.getTiempo() ) {
				puestoC = new Posicion(3, corredor.getTiempo());
				puestoC.getCorredores().add(corredor);
				puestoC.setTiempo(corredor.getTiempo());
				//Se guardan los nuevos puestos en variables.
				auxPrimero = puestoC;
				auxSegundo = puestoA;
				auxTercero = puestoB;
				//Se le asignan a los nuevos puestos las corresponientes posiciones.
				auxPrimero.setPos(1);
				auxSegundo.setPos(2);
				auxTercero.setPos(3);
				//Se remplazan las nuevas posiciones en los objs de posiciones.
				puestoA = auxPrimero;
				puestoB = auxSegundo;
				puestoC = auxTercero;
				
			}
			//Si el corredor es igual al puesto uno, se agrega a la lista del mejor puesto.
			else if(corredor.getTiempo() == puestoA.getTiempo()) {
				puestoA.getCorredores().add(corredor);	
			}
			//Si es menor que el puesto numero 2, lo remplazamos y colocamos al antiguo puesto 2 como puesto 3.
			else if(corredor.getTiempo() < puestoB.getTiempo()) {
				puestoC = new Posicion(3, corredor.getTiempo());
				puestoC.getCorredores().add(corredor);
				puestoC.setTiempo(corredor.getTiempo());
				//Se guardan los nuevos puestos en variables.
				auxSegundo = puestoC;
				auxTercero = puestoB;
				//Se le asignan a los nuevos puestos las corresponientes posiciones.
				auxSegundo.setPos(2);
				auxTercero.setPos(3);
				//Se remplazan las nuevas posiciones en los objs de posiciones.
				puestoB = auxSegundo;
				puestoC = auxTercero;
			}
			//Si el corredor es igual al puesto dos, se agrega a la lista del segundo puesto.
			else if(corredor.getTiempo() == puestoB.getTiempo()) {
				puestoB.getCorredores().add(corredor);	
			}
			//Si es menor que el puesto numero 3, lo remplazamos.
			else if(corredor.getTiempo() < puestoB.getTiempo()) {
				puestoC = new Posicion(3, corredor.getTiempo());
				puestoC.getCorredores().add(corredor);
				puestoC.setTiempo(corredor.getTiempo());
			}
			//Si el corredor es igual al puesto tres, se agrega a la lista del tercer puesto.
			else if(corredor.getTiempo() == puestoC.getTiempo()) {
				puestoC.getCorredores().add(corredor);	
			}
			
			
		}
		
		mostrarPosicionesFinales();
		


		
	}
	
	
	public void mostrarPosicionesFinales() {
		//Se muestran los resultados finales de los primeros 3 puestos
		System.out.print("Corredores en primer lugar: " );
		for(Corredor cResultado : puestoA.getCorredores()) {
			System.out.print(cResultado.getNombre() + "  ");
		}
		System.out.println();
		System.out.println("Tiempo: " + puestoA.getTiempo());
		System.out.println();
		
		System.out.print("Corredores en segundo lugar: ");
		for(Corredor cResultado : puestoB.getCorredores()) {
			System.out.print(cResultado.getNombre()  + "  ");
		}
		System.out.println();
		System.out.println("Tiempo: " + puestoB.getTiempo());
		System.out.println();
		
		System.out.print("Corredores en tercer lugar: ");
		for(Corredor cResultado : puestoC.getCorredores()) {
			System.out.print(cResultado.getNombre()  + "  ");
		}
		System.out.println();
		System.out.println("Tiempo: " + puestoC.getTiempo());
		System.out.println();
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



	
}
