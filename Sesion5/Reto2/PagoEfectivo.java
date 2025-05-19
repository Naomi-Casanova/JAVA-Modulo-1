
package Reto2;

public class PagoEfectivo extends MetodoPago {
    
    // AUTENTIFICACION , NO REQUIERE VALIDACION **********************************
    public PagoEfectivo(double monto) {
        super(monto);
    }
    
    @Override
    public boolean autenticar() {
        return true; 
    }
    
    // INSTANCIA PROCESAR PAGO ***************************************************
    // 💳 Procesando pago con tarjeta por $320.0
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
    }

}