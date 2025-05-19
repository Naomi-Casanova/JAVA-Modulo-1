
package Reto2;

public class PagoTarjeta extends MetodoPago {

    private double saldoDisponible;

    // AUTENTIFICACION , VALIDAMOS EL SALDO DISPONIBLE ***************************
    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        return saldoDisponible >= monto;
    }
    
    // INSTANCIA PROCESAR PAGO ***************************************************
    // 💳 Procesando pago con tarjeta por $320.0
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }

}
