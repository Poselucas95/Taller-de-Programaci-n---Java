package ej1y2;

public class Asalariado extends Empleado {


    private float sueldo;

    public Asalariado(){ // Extiende comportamiento
        super();
    }

    public Asalariado(String nombre, int edad, float sueldo) { // Extiende y agrega comportamiento de la superclass
        super(nombre, edad);
        setSueldo(sueldo);
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public float calcularPago(){ // Especializa el comportamiento de superclass
        return super.calcularPago() + getSueldo();
    }


}
