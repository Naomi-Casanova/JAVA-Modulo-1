
package Reto1;

public abstract class UnidadEmergencia {

    // ATRIBUTO **************************************************
    String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // METODO ACTIVAR UNIDAD *************************************
    public void activarUnidad() {
        System.out.println("Activando unidad: " + nombre);
    }
    
    // METODO RESPONDER ******************************************
    public abstract void responder();

}
