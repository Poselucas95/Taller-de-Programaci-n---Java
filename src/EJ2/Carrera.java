package EJ2;

import java.util.ArrayList;

public class Carrera {
	private String especialidad;
	private ArrayList<Corredor> listaCorredores = null;
	
	public  Carrera(ArrayList<Corredor> list, String especialidad) {
		this.setEspecialidad(especialidad);
		this.setListaCorredores(list);
	}
	
	public  Carrera() {
		
	}

	
	public void verificarGanador() {
		ArrayList<Corredor> lista = this.getListaCorredores();
		ArrayList<Corredor> ganadores = new ArrayList<Corredor>();
		for(Corredor corredores : lista){	
			if(ganadores.isEmpty()) {
				ganadores.add(corredores);
			}else if(corredores.getTiempo()<ganadores.get(0).getTiempo()) {
				ganadores.clear();	
				ganadores.add(corredores);
			}else if (corredores.getTiempo()==ganadores.get(0).getTiempo()) {
				ganadores.add(corredores);
			}
		
		}
		
		for(Corredor cResultado : ganadores) {
			System.out.print("Corredor ganador: " + cResultado.getNombre());
			System.out.println();
			System.out.print("Corredor ganador: " + cResultado.getTiempo());
		}
		
		
	}
	
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
	
	
	
}
