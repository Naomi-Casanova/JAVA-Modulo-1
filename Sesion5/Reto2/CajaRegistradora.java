
package Reto2;

public class CajaRegistradora {

    // ARREGLO METODOPAGO **********************************************************************************************
    public static void main(String[] args) {
        MetodoPago[] pagos = { new PagoEfectivo( 230.0),
                               new PagoTarjeta( 680.0, 900.0),
                               new PagoTransferencia( 150.0, false) 
                            };
        
        // ITERAMOS SOBRE CADA METODO DE PAGO EN NUESTRO ARREGLO *******************************************************
        for (MetodoPago pago : pagos) {

            if ( pago.autenticar() ) {
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println("");

        }

    }

}
