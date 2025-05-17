// RETO 1 SESION 1 ___________________________________________________________
package Reto1;

// Importamos librerias 
import java.util.Scanner;

// Creamos la Clase PACIENTE
public class Paciente {

    String Nombre_Paciente;
    int Edad_Paciente;
    String NumExpediente;

    // Creamos un metodo para imprimit los datos del paciente
    void mostrarInformacion() {
        System.out.println("\nMOSTRANDO LA INFORMACIÓN REGISTRADA ...");
        System.out.println("Paciente: " + Nombre_Paciente );
        System.out.println("Edad: " + Edad_Paciente);
        System.out.println("Expediente: " + NumExpediente);
    }
}