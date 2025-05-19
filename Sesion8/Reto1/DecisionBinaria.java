
package Sesion8.Reto1;

// LIBRERIAS 
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {

    @Override
    public String tomarDecision() {

        // MOSTRAMOS LAS OPCIONES AL USUARIO *********************************
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el camino que deseas tomar");
        System.out.println("1: Ir al pantano");
        System.out.println("2: Ir a Muy Muy Lejano");

        // USUARIO SELECCIONA UNA OPCION *************************************
        System.out.print("Oprime el numero de tu elección");
        String input = scanner.nextLine();

        return input;

    }


}
