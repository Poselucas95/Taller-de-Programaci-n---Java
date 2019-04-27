package ej1y2;

public class Subcontratado extends Empleado {
    private float cantHoras;
    private float precioHora;

    public Subcontratado(){ // Extiende comportamiento
        super();
    }

    public Subcontratado(String nombre, int edad, float cantHoras, float precioHora) { // Extiende y agrega comportamiento de la superclass
        super(nombre, edad);
        setCantHoras(cantHoras);
        setPrecioHora(precioHora);
    }

    @Override
    public float calcularPago(){  // Especializa el comportamiento de superclass
        return super.calcularPago() + getCantHoras() * getPrecioHora();
    }


    public float getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(float cantHoras) {
        this.cantHoras = cantHoras;
    }

    public float getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }
}
