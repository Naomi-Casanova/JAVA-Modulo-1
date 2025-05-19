
package Reto2;

public class PagoTransferencia extends MetodoPago {

    private boolean Val_Externa;

    // AUTENTIFICACION , SIMULA VALIDACION ***************************************
    public PagoTransferencia(double monto, boolean Val_Externa) {
        super(monto);
        this.Val_Externa = Val_Externa;
    }

    @Override
    public boolean autenticar() {
        return Val_Externa;
    }


    // INSTANCIA PROCESAR PAGO ***************************************************
    // 💳 Procesando pago con tarjeta por $320.0
    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia por $" + monto);
    }

}