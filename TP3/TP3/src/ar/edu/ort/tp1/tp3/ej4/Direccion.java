package ar.edu.ort.tp1.tp3.ej4;

public class Direccion {
	private String calle;
	private int altura;
	private int piso;
	private String departamento;
	public Direccion(String calle, int altura, int piso, String departamento) {
		super();
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	
	
	
	public String getCalle() {
		return calle;
	}




	public void setCalle(String calle) {
		this.calle = calle;
	}




	public int getAltura() {
		return altura;
	}




	public void setAltura(int altura) {
		this.altura = altura;
	}




	public int getPiso() {
		return piso;
	}




	public void setPiso(int piso) {
		this.piso = piso;
	}




	public String getDepartamento() {
		return departamento;
	}




	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}




	public void mostrar() {
		System.out.println(calle + " " + altura + " " + piso + departamento);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		if (altura != other.altura)
			return false;
		if (calle == null) {
			if (other.calle != null)
				return false;
		} else if (!calle.equals(other.calle))
			return false;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (piso != other.piso)
			return false;
		return true;
	}
	
	
	

}
