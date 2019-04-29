package ar.edu.ort.tp1.tp3ej1;

public class Email {
	private String cuenta;
	private String dominio;
	
	public Email(String email){
		String[] mail = email.split("@");
		cuenta = mail[0];
		dominio = mail[1];
		
	}
	
	public String getValor(){
		return cuenta+"@"+dominio;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	
}
