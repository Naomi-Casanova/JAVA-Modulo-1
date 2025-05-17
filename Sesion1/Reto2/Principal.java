
package Reto2;

// LIBRERIAS 
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        // CREAMOS LAS ENTRADAS *****************************************************************************
        Entrada Entrada_Concierto = new Entrada("Concierto The Weeknd" , 2_200.00, LocalDate.of(2025, 12, 10));
        Entrada Entrada_Partida = new Entrada("Disney On Ice", 945.00 , LocalDate.of(2025, 4, 30));
        Entrada Entrada_Museo = new Entrada("Museo de la Biodiversidad ",  100.00 , LocalDate.of(2025, 6, 20));

        // MOSTRAMOS LA INFO DE LAS ENTRADAS ****************************************************************
        Entrada_Concierto.mostrarInformacion();
        Entrada_Partida.mostrarInformacion();
        Entrada_Museo.mostrarInformacion();

    }
}
