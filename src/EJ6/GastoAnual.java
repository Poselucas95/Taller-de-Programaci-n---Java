package EJ6;

import java.util.ArrayList;
import java.util.List;

public class GastoAnual {


    static final int CANTIDAD_MESES = Mes.values().length;
    private List<Rubro> listaRubro;

    public GastoAnual(){
        listaRubro = new ArrayList<>();
    }

    public GastoAnual(List<Rubro> listaRubro){
       setListaRubro(listaRubro);
    }

    public void setListaRubro(List<Rubro> listaRubro) {
        this.listaRubro = listaRubro;
    }

    public void agregarGasto(Mes mes, String nombreRubro, double importe){
        Rubro rubroEncontrado = buscarRubro(nombreRubro);
        boolean importeMayorCero = importe > 0.0;
        if (rubroEncontrado != null && importeMayorCero){
            rubroEncontrado.agregarGasto(mes, importe);
        }
        else if (rubroEncontrado == null && importeMayorCero){
            Rubro nuevoRubro = new Rubro(nombreRubro);
            nuevoRubro.agregarGasto(mes, importe);
            listaRubro.add(nuevoRubro);
        }
    }

    public Rubro buscarRubro(String nombreRubro){
        Rubro rubroEncontrado = null;
        nombreRubro = nombreRubro.toLowerCase();
        for(Rubro rub : this.listaRubro){
            if (rub.getNombre().equals(nombreRubro)){
                rubroEncontrado = rub;
            }
        }
        return rubroEncontrado;
    }

    public Rubro obtenerRubro(String nombreRubro){
        Rubro rubroEncontrado = buscarRubro(nombreRubro);

        if (rubroEncontrado != null){
            return rubroEncontrado;
        }
        else {
           Rubro nuevoRubro = new Rubro(nombreRubro);
           this.listaRubro.add(nuevoRubro);
        }
        return  rubroEncontrado;
    }




    private double[][] consolidadoDeGastos(){
        // Por cada mes tengo un array de rubros
        double[][] gastos = new double[CANTIDAD_MESES][this.listaRubro.size()];
        // Llenar matriz con los gastos de cada rubro por cada mes
        Mes[] meses = Mes.values();
        for(int i = 0; i< gastos.length; i++){
            for(int j = 0; j < gastos[0].length; j++){
                gastos[i][j] = this.listaRubro.get(j).getTotalGastos(meses[i]);
            }
        }
        return  gastos;
    }

    public double gastoAcumulado(Mes mes){
        double total = 0;
        for(Rubro rubro : this.listaRubro){
            total += rubro.getTotalGastos(mes);
        }
        return total;
    }

    public double gastoAcumulado(String nombreRubro){
        Rubro rubroEnc = buscarRubro(nombreRubro);
        double gastoAcum = 0;
        Mes[] meses = Mes.values();
        if (rubroEnc != null){
            for(Mes mes: meses){
                gastoAcum += rubroEnc.getTotalGastos(mes);
            }
        }else{
            return -1;
        }
        return gastoAcum;
    }

    public void informarConsumosPorMes(){
        // Entiendo que esto pide que muestre cada consumo por mes de cada rubro

        // para saber que rubro es tomo J y hago el get de la lista
        // ya que el gasto siempre va a ser acorde al rubro porque tienen la misma posicion

        double[][] consolidado = consolidadoDeGastos();
        Mes[] meses = Mes.values();

        for(int i =0; i < CANTIDAD_MESES; i++){
            for(int j = 0; j < consolidado[0].length; j++){
                System.out.println("El rubro: " + this.listaRubro.get(j).getNombre() +
                        " gastó: " + consolidado[i][j] + " en el mes: " + meses[i].toString());
            }
        }

    }
    public void informarPromedioMensualPorRubro(){
        // por cada rubro, calcular su promedio de gastos por mes
            for(Rubro rubro: this.listaRubro){
                double[] arrayGastosMesRubro = rubro.getGastosPorMes();
                double totalGastos = 0;
                for(double gastoMes: arrayGastosMesRubro){
                    totalGastos +=  gastoMes;
                }
                System.out.println("EL promedio de gastos del rubro " + rubro.getNombre() +
                        " fue: " + (totalGastos/CANTIDAD_MESES));
            }
    }

    public void informarMesMayorConsumo(){
        Mes[] meses = Mes.values();
        double valorMaximo = 0;
        List<Mes> listaMesesGanadores = new ArrayList<>();
        for (Mes mes: meses) {
            double gastoAcumuladoMesIter = gastoAcumulado(mes);
            if(gastoAcumuladoMesIter > valorMaximo) {
                valorMaximo = gastoAcumuladoMesIter;
                listaMesesGanadores.clear();
                listaMesesGanadores.add(mes);
                // Si tengo ganadores viejos y este mes tiene el valorMaximo, empataron, lo agrego a la lista de ganadores
            }else if(listaMesesGanadores.size() > 0 && gastoAcumuladoMesIter == valorMaximo){
                listaMesesGanadores.add(mes);
            }
        }

        if (listaMesesGanadores.size() == 1){
            System.out.println("El mes: " + listaMesesGanadores.get(0).toString() + " tuvo el mayor consumo con: " + valorMaximo);
        }else {
            System.out.println("Los meses con mayor consumo de: " + valorMaximo + " fueron:");
            // TODO probar si funca esto System.out.println(listaMesesGanadores.toString());
            for (Mes mes: listaMesesGanadores){
                System.out.println(mes.toString());
            }
        }

    }

}
