package Reto1;

public class UnidadBomberos extends UnidadEmergencia {
    
    private SistemaGPS GPS;
    private Sirena Sirena;
    private Operador Operador;

    public UnidadBomberos(String nombre, String nombreOperador) {
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
        System.out.println("Unidad de Bomberosrespondiendo al llamado de incendio");
    }
}