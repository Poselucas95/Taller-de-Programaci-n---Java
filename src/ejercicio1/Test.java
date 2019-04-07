package ejercicio1;

public class Test {

	public static void main(String[] args) {
		
		Grupo grupoTest = new Grupo("Wozniak's");
		
		grupoTest.agregarIntegrante("Bautista Querejeta");
		grupoTest.agregarIntegrante("Lucas Pose");
		grupoTest.agregarIntegrante("Eleazar Tracana");
		grupoTest.agregarIntegrante("Ficticio");
		
		fueAgregado(grupoTest, "Lucas Pose");
		
		grupoTest.mostrar();
		
		System.out.println("Integrante removido: "+grupoTest.removerIntegrante("Ficticio"));
		
		grupoTest.removerIntegrante("Ficticio");
		
		grupoTest.mostrar();
		
		grupoTest.getIntegrantes().clear();
		
		grupoTest.mostrar();
		
		

	}
	public static boolean fueAgregado(Grupo grupo, String nom) {
		
		boolean aggExitosa = false;
		
		if(grupo.buscarIntegrante(nom) != null) {
			aggExitosa = true;
		}
		
		return aggExitosa;
	
		
	}

}
