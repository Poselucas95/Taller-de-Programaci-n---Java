package EJ3;

import java.util.ArrayList;

public class Posicion {
	private int pos;
	private double tiempo;
	private ArrayList<Corredor> corredores;
	
	public Posicion() {
		
	}
	
	public Posicion(int pos, double tiempo) {
		corredores = new ArrayList<Corredor>();
		this.setPos(pos);
		this.setTiempo(tiempo);
		
	}
	
	
	
	
	
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public double getTiempo() {
		return tiempo;
	}
	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	public ArrayList<Corredor> getCorredores() {
		return corredores;
	}
	public void setCorredores(ArrayList<Corredor> corredores) {
		this.corredores = corredores;
	}
	
	
	
}
