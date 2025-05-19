package Reto1;

public class Patrulla extends UnidadEmergencia {
    
    private SistemaGPS GPS;
    private Sirena Sirena;
    private Operador Operador;

    public Patrulla(String nombre, String nombreOperador) {
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
        System.out.println("Patrulla respondiendo al llamado.");
    }
}
