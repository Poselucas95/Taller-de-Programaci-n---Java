package EJ6;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        List<Rubro> listaRubros = new ArrayList<>();
        Rubro rubro = new Rubro("Informatica");
        rubro.agregarGasto(Mes.ENERO, 10000);
        rubro.agregarGasto(Mes.ENERO, 3000);

        Rubro rubro2 = new Rubro("Medicina");
        rubro2.agregarGasto(Mes.ENERO, 34000);
        rubro2.agregarGasto(Mes.FEBRERO, 1000);

        Rubro rubro3 = new Rubro("Astrofisica");
        rubro3.agregarGasto(Mes.ENERO, 100000);
        rubro3.agregarGasto(Mes.ENERO, 30000);
        rubro3.agregarGasto(Mes.FEBRERO, 1000000);

        listaRubros.add(rubro);
        listaRubros.add(rubro2);
        listaRubros.add(rubro3);

        GastoAnual gastoAnual = new GastoAnual(listaRubros);

        gastoAnual.agregarGasto(Mes.ENERO, "Informatica",10000);
        System.out.println(gastoAnual.gastoAcumulado("Informatica"));

        gastoAnual.informarConsumosPorMes();





    }
}
