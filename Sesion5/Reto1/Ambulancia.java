
package Reto1;

public class Ambulancia extends UnidadEmergencia {

    private SistemaGPS GPS;
    private Sirena Sirena;
    private Operador Operador;

    public Ambulancia(String nombre, String nombreOperador) {
        super(nombre);
        this.GPS = new SistemaGPS();
        this.Sirena = new Sirena();
        this.Operador = new Operador(nombreOperador);
    }

    public void iniciarOperacion() {
        activarUnidad();
        GPS.localizar();
        Sirena.activarSirena();
        Operador.reportarse();
        responder();
    }
    
    // SOBREESCRIBIMOS EL METODO RESPONDER ***********************************************
    @Override
    public void responder() {
        System.out.println("La Ambulancia se dirigue al lugar del incidente.");
    }
    
}