
package Sesion8.Reto1;

public class MainNarrativa {
    public static void main(String[] args) {
        
        PaqueteNarrativo paquete = new PaqueteNarrativo("Inicio del viaje");

        TransicionHistoria Transicion = new TransicionSimple();
        GestorDialogo Dialogo = new DialogoTexto();
        LogicaDecision Decision = new DecisionBinaria();

        Dialogo.mostrarDialogo(paquete);
        String accion = Decision.tomarDecision();
        Transicion.realizarTransicion(accion);

    }


}
