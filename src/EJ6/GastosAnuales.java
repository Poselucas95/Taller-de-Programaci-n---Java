package EJ6;

import java.util.ArrayList;
import java.util.List;

public class GastosAnuales {
    private List<Rubro> listaRubro;

    public GastosAnuales(){
        listaRubro = new ArrayList<>();
    }

    public GastosAnuales(List<Rubro> listaRubro){
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


    public double gastoAcumulado(Mes mes){
        double total = 0;
        for(Rubro rubro : this.listaRubro){
            total += rubro.getTotalGastos(mes);
        }
        return total;
    }





}
