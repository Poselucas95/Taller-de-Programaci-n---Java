package ej1y2;

public class Test {


    public static void main(String[] args){

        Asalariado asalariado = new Asalariado("Jose", 30, 10000f);
        Subcontratado subcontratado = new Subcontratado("Carlos", 23, 50f, 100f);

        System.out.println(asalariado.toString() + " gana:" + asalariado.calcularPago());
        System.out.println(subcontratado.toString() + " gana:" + subcontratado.calcularPago());

    }
}
