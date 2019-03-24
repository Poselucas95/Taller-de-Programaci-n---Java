package EJ1Bauti;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Grupo grupo1 = new Grupo("grupo1");
		agregarIntegranteAGrupo("Bautista Querejeta", grupo1);
		agregarIntegranteAGrupo("Lucas Pose", grupo1);
		agregarIntegranteAGrupo("Eleazar Tracana", grupo1);
		agregarIntegranteAGrupo("el diegote", grupo1);


		System.out.println(integrantefueAgregado("nicolas", grupo1));
		System.out.println(integrantefueAgregado("Bautista querejeta", grupo1));
		grupo1.mostrar();

		grupo1.removerIntegrante("el diegote");
		grupo1.mostrarIntegrantes();
		grupo1.removerIntegrante("el diegote");
		grupo1.mostrarIntegrantes();
		grupo1.vaciar();
		grupo1.mostrar();
	}

	public static void agregarIntegranteAGrupo(String integrante, Grupo grupo){
		String integranteLowerC = integrante.toLowerCase();
		if (!integrantefueAgregado(integranteLowerC, grupo)){
			grupo.agregarIntegrante(integranteLowerC);
			System.out.println("["+ integrante+"]" + " fue agregado al grupo: "+ "["+ grupo.getNombre()+"]");
		} else{
			System.out.println("["+ integrante+"]" + " ya se encuentra en el grupo: "+ "["+ grupo.getNombre()+"]");
		}

	}

	public static boolean integrantefueAgregado(String integrante, Grupo grupo){
		return grupo.buscarIntegrante(integrante.toLowerCase()) != null;
	}

}
