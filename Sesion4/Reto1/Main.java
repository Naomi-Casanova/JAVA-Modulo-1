

public class Main {
    public static void main(String[] args) {

        // CREAMOS DOS FACTURAS ******************************************************************
        Factura Factura1 = new Factura( "FAC001", "Daniel García",  2_780.00);
        Factura Factura2 = new Factura( "FAC001", "Salvador Barrera", 942.50);

        // MOSTRAMOS LAS FACTURAS ****************************************************************
        System.out.println(Factura1);
        System.out.println(Factura2);

        // COMPARAMOS AMBAS FACTURAS *************************************************************
        System.out.println("¿Las facturas son iguales?: " + Factura1.equals(Factura2) );
    }

}