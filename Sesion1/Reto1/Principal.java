// RETO 1 SESION 1 ___________________________________________________________
package Reto1;

// Importamos librerias 
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        System.out.println("\n________________ BIENVENIDX AL PORTAL DE REGISTRO DE PACIENTES ________________");

        Scanner scanner = new Scanner(System.in);

        // Creamos un objeto de tipo Paciente
        Paciente paciente = new Paciente();

        // SOLICITAMOS LOS DATOS *************************************
        // Nombre del paciente
        System.out.print("Ingresa tu nombre y apellido: ");
        paciente.Nombre_Paciente = scanner.nextLine();
        
        // Edad
        System.out.print("Ingresa tu edad: ");
        paciente.Edad_Paciente = scanner.nextInt();
        scanner.nextLine(); 
        
        // Numero de expediente
        System.out.print("Ingresa tu número de expediente: ");
        paciente.NumExpediente = scanner.nextLine();

        // MOSTRAMOS LOS DATOS ***************************************
        paciente.mostrarInformacion();

        scanner.close();
    }

}
