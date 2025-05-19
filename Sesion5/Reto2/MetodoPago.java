
package Reto2;

public abstract class MetodoPago implements Autenticable {
    
    // ATRIBUTO *********************************************************************************************
    protected double monto;

    // METODO PROCESAR PAGO *********************************************************************************
    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // METODO PROCESAR PAGO *********************************************************************************
    public abstract void procesarPago();
    
    // METODO MOSTRAR RESUMEN *******************************************************************************
    // 📄 Tipo: PagoTarjeta - Monto: $320.0
    public void mostrarResumen() {
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }

}
