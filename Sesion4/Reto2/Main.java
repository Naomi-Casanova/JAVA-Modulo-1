package Reto2;

public class Main {
    public static void main(String[] args) {

        // DECLARACION DE IMPUESTOS ********************************************************************************
        DeclaracionImpuestos Nueva_Declaracion = new DeclaracionImpuestos("CARN020712666", 6_100.0);

        // CREAMOS UNA CUENTA **************************************************************************************
        CuentaFiscal cuenta = new CuentaFiscal("CARN020712666",
                                               5_300.0);

        // MOSTRANDO INFO ******************************************************************************************
        System.out.println("📄 Declaración enviada por RFC: " + Nueva_Declaracion.rfcContribuyente() +
                           " por $" + Nueva_Declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Validamos si el RFC de la declaración es válido
        boolean rfcValido = cuenta.validarRFC(Nueva_Declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);

    }

}
