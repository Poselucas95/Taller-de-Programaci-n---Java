package ort.tp2.ej1y2;

public class Test2 {

    public static void main(String[] args){


        Vendedor Vendedor = new Vendedor("Pedro", 25, 100, 200, 5);
        Vendedor Vendedor2 = new Vendedor("Maria", 30, 100, 200, 10);

        System.out.println(Vendedor.toString() + " gana:" + Vendedor.calcularPago());
        System.out.println(Vendedor2.toString() + " gana:" + Vendedor2.calcularPago());

    }
}
