
package Reto2;

// LIBRERIAS 
import java.time.LocalDate;

public class Entrada {
    String nombre_evento;
    double precio_evento;
    LocalDate fecha_evento;


    // ATRIBUTOS DE UNA ENTRADA *****************************************************************
    /*  Nombre del Evento 
        Precio 
        Fecha (extra)
    */ 
    
    public Entrada(String Nombre, double Precio , LocalDate Fecha ) {
        this.nombre_evento = Nombre;
        this.precio_evento = Precio;
        this.fecha_evento = Fecha;
    }

    // MOSTRAMOS LOS DATOS DEL EVENTO  ***********************************************************
    public void mostrarInformacion() {
        System.out.println("Fecha: " + fecha_evento + "----------------------------------");
        System.out.println("Evento: " + nombre_evento + " | Precio: $" + precio_evento);
    }

}