
package Sesion8.Reto2;

// LIBRERIAS 
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {

        // USUARIO INGRESA EL CONSUMO DE CPU DE VARIOS SERVDORES *****************************************************
        Scanner scanner = new Scanner(System.in);

        // Obtenemos los valores unicos del consumo del CPU
        Set<Integer> registrosCPU = new HashSet<>();
        

        // HACEMOS LA VALIDACION DE LOS CONSUMOS INGRESADOS ******************************************************************************
        try {

            // MENSAJE CON LAS INSTRUCCIONES 
            System.out.println("Ingresa los porcentajes de los consumos de CPU (Recuerda ingresar numeros enteros y del 0 al 100).");
            System.out.println("Escribe -1 para terminar.");

            while (true) {

                System.out.print("Porcentajes de consumo de CPU\n");
                int consumo;

                // EL USUARIO INGRESA LOS CONSUMOS ***************************************************************************************
                try {
                    
                    consumo = scanner.nextInt();

                } catch (InputMismatchException e) {
                    scanner.next(); 
                    System.out.println("Recuerda ingresar un dato válido");
                    continue; 

                }

                // HACEMOS LAS VALIDACIONES **********************************************************************************************
                // Salir de proceso
                if (consumo == -1) {
                    break;
                }
                // Numero no Valido
                if (consumo < 0 || consumo > 100) {
                    System.out.println("Los porcentajes de consumo deben de ser entre 0 y 100");
                    continue;
                }
            
                // Consumo Critico
                if ( consumo > 95) {
                    throw new ConsumoCriticoException("Se ha detectado un consumo crítico !!! ");
                }

                System.out.println("El consumo ingresado es válido");

            }

        } catch (ConsumoCriticoException e) {
            System.out.println("Seha detectado un consumi critico.");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        } finally {
            scanner.close();
            System.out.println("El código se ejecutó correctamente");
        
        }

    }

}
