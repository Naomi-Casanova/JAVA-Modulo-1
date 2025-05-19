package Reto1;

// LIBRERIAS
import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SOLICITAMOS LA INFORMACON DEL MEDICAMENTO ***********************************************************
        System.out.println("_______________________ CARRITO DE COMPRAS 🛒 _______________________");
        // Nombre del Medicamento
        System.out.print("Nombre del medicamento: ");
        String Nombre_Medicamento = scanner.nextLine();

        // Precio del Medicamento
        System.out.print("Precio por pieza: ");
        double Precio_Medicamento = scanner.nextDouble();

        // Cantidad de Piezas
        System.out.print("Cantidad: ");
        int Cantidad_Med = scanner.nextInt();

        // CALCULAMOS EL MONTO TOTAL ( ANTES DE DESCUENTOS ) ****************************************************
        double MontoTotal = Precio_Medicamento * Cantidad_Med;

        // CALCULAMOS EL DESCUENTO ******************************************************************************
        // Si el monto > 500 pesos  --> 15% descuento
        boolean AplicaDescuento = MontoTotal > 500.00 ;
        double Descuento = AplicaDescuento ? MontoTotal * 0.15 : 0;

        // MONTO FINAL ( DESPUES DEL DESCUENTO ) ****************************************************************
        double MontoFinal = MontoTotal - Descuento;
        
        // MOSTRAMOS EL RESUMEN *********************************************************************************
        System.out.println("_______________________ RESUMEN DE COMPRA _______________________");
        System.out.println("Medicamento: " + Nombre_Medicamento);
        System.out.println("Cantidad: " + Cantidad_Med);
        System.out.println("Precio unitario: $" + Precio_Medicamento);
        System.out.println("Total sin descuento: $" + MontoTotal);
        System.out.println("¿Aplica descuento?: " + AplicaDescuento);
        System.out.println("Descuento: $" + Descuento);
        System.out.println("Total a pagar: $" + MontoFinal);


        scanner.close();
    }
}