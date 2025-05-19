package Sesion7.Reto1;

// LIBRERIAS 
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {

    public static void main(String[] args) {

        // DEFINIMOS LA RUTA DEL ARCHIVO *****************************************************************
        Path Ruta_Carpeta = Paths.get("Reto1","config");
        Path Ruta_Archivo = Ruta_Carpeta.resolve("parametros.txt");


        System.out.println(Ruta_Archivo);
        System.out.println(Ruta_Carpeta);

        // CREAMOS UN STRING *****************************************************************************
        String parametros = "Tiempo de ciclo: 55.8 segundos\n" 
                            + "Velocidad de línea: 1.2 m/s\n"
                            + "Número de estaciones: 8\n";

        // GUARDAMOS EL CONTENIDO EN UN ARCHIVO **********************************************************
        try {

            // Validamos si la carpeta existe 
            if (!Files.exists(Ruta_Carpeta)) {
                Files.createDirectory(Ruta_Carpeta);
            }

            // Guardamos la info
            Files.write(Ruta_Archivo, parametros.getBytes());

            // Validamos la creacion del archivo 
            if (Files.exists(Ruta_Archivo)) {
                System.out.println("El archivo se encuentra en la ruta " + Ruta_Archivo.toAbsolutePath());

                // LEEMOS EL ARCHIVO Y MASTRAMOS LA INFO *************************************************
                String Contenido_Archivo = new String(Files.readAllBytes(Ruta_Archivo));
                System.out.println("La información que contiene el archivo es la siguiente: ");
                System.out.println(Contenido_Archivo);

            } else {
                System.out.println("No Existe el archivo");
            }

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo !");
            System.out.println(e.getMessage());
        }

    }

}
