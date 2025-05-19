package Sesion8.Reto1;

public class DialogoTexto implements GestorDialogo {
    
    @Override
    public void mostrarDialogo(PaqueteNarrativo paquete) {
        System.out.println("ACTO: " + paquete.getEscenaActual());
        System.out.println("Aparece el Hada Madrina y te ofrece dos opciones: ");
    }

}
