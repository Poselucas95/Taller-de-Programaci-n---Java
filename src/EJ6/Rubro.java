package EJ6;

public class Rubro {

    private static final int TOTAL_MESES = 12;
    private String nombre;
    private double[] gastosPorMes;

    public Rubro(String nombre) {
        this.nombre = nombre;
        inicializarGastos();
    }

    private void inicializarGastos(){
        this.gastosPorMes = new double[TOTAL_MESES];
    }

    public void agregarGasto(Mes mes, double importe){
        this.gastosPorMes[mes.ordinal()] += importe;
    }

    public double getTotalGastos(Mes mes){
        return this.gastosPorMes[mes.ordinal()];
    }

    public double[] getGastosPorMes() {
        return gastosPorMes;
    }

    public String getNombre() {
        return nombre.toLowerCase();
    }


}
