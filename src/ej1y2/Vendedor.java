package ej1y2;

public class Vendedor extends Subcontratado {

    private float porcentaje;


    public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
        super(nombre, edad, cantHoras, precioHora);
        setPorcentaje(porcentaje);
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public float calcularPago() { // agrega comportamiento de la superclass
        if (porcentaje > 0){
            float agregado = super.calcularPago() * (getPorcentaje()/100);
            return super.calcularPago() + agregado;
        }else {
            return super.calcularPago();
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Vendedor{" +
                "porcentaje=" + porcentaje +
                '}';
    }
}
