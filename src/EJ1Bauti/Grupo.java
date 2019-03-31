package EJ1Bauti;
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private List<String> integrantes;

    public Grupo(String nombre, List<String> integrantes) {
        setNombre(nombre);
        this.integrantes = integrantes;
    }
    public Grupo(String nombre) {
        setNombre(nombre);
        this.integrantes = new ArrayList<>();
    }

    public int getPosicionIntegrante(String nombreInte){
          return this.integrantes.indexOf(nombreInte);
    }

    public String obtenerIntegrante(int posicion){
        if (posicion > 0){
            return this.integrantes.get(posicion);
        }else{
            return null;
        }
    }

    public int getCantidadIntegrantes(){
        return integrantes.size();
    }

    public void agregarIntegrante(String integrante){
        if (integrante != null && !this.integrantes.contains(integrante)){
            this.integrantes.add(integrante);
        }
    }
    public String removerIntegrante(String nombre){
        if(nombre != null && this.integrantes.contains(nombre)){
            this.integrantes.remove(nombre);
            return nombre;
        }else{
            return null;
        }
    }

    public String buscarIntegrante(String nombre){
        if(nombre != null && this.integrantes.contains(nombre)){
            return nombre;
        }else{
            return null;
        }
    }

    public void mostrarIntegrantes(){
        System.out.println("Cantidad de integrantes: " + this.integrantes.size());
        int i = 1;
        for(String integrante: this.integrantes){
            System.out.println("Integrante nro " + i + ": " + integrante);
            i++;
        }
    }

    public void mostrar(){
        System.out.println(this.nombre);
        mostrarIntegrantes();
    }

    public void vaciar(){
        this.integrantes = new ArrayList<>();
    }


    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
