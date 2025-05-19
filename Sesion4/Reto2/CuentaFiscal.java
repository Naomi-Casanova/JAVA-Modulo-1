package Reto2;

// LIBRERIAS 
import java.util.Objects;

public class CuentaFiscal {

    private final String RFC;
    private double SaldoDisponible;

    // CREAMOS EL CONSTRUCTOR *********************************************************************
    public CuentaFiscal(String RFC, double SaldoDisponible) {
        this.RFC = RFC;
        if (SaldoDisponible >= 0) {
            this.SaldoDisponible = SaldoDisponible;
        } else {
            System.out.println("❌ El saldo no puede ser negativo. Se asigna 0.");
            this.SaldoDisponible = 0;
        }
    }

    // GETTERS ************************************************************************************
    public String getRFC() {
        return RFC;
    }

    public double getSaldoDisponible() {
        return SaldoDisponible;
    }

    // VALIDACIPON DEL RFC ************************************************************************
    public boolean validarRFC( DeclaracionImpuestos d) {
        return Objects.equals( this.RFC, d.rfcContribuyente() );
    }

    // MOSTRAMOS LA INFO **************************************************************************
    public void mostrarCuenta() {
        System.out.println("Cuenta fiscal registrada con RFC: " + RFC + ", saldo disponible: $" + SaldoDisponible);
    }

}
