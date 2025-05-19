package Sesion7.Reto2;

// LIBRERIAS 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {

        // DEFINIMOS LAS RUTAS ****************************************************************************
        Path Ruta_Errores = Paths.get("Reto2","errores.log");
        Path Ruta_Fallos = Paths.get("registro_fallos.txt");

        int Total_Lineas = 0;
        int Conteo_Errores = 0;
        int Conteo_Warnings = 0;


        // Pequela Validacion
        if (Files.exists(Ruta_Errores)) {
            System.out.println("errores.log existe");
        } else {
            System.out.println("errores.log NO existe");
        }

        // CONTAMOS LOS ERROES Y LOS WARNINGS EN EL ARCHIVO ************************************************
        try (BufferedReader lector = Files.newBufferedReader(Ruta_Errores)) {
            
            String linea;

            while ((linea = lector.readLine()) != null) {
                Total_Lineas++;
                // Conteo de errores
                if (linea.contains("ERROR")) {
                    Conteo_Errores++;
                }
                // Conteo de warnings 
                if (linea.contains("WARNING")) {
                    Conteo_Warnings++;
                }

            }

            // IMPRIMIMOS EL RESUMEN ************************************************************************
            System.out.println("RESUMEN:");
            System.out.println("Lineas: " + Total_Lineas);
            System.out.println("Número de Errores: " + Conteo_Errores);
            System.out.println("Número de Warnings: " + Conteo_Warnings);

            double Prop_Errores = (Total_Lineas > 0) ? ((double) Conteo_Errores / Total_Lineas) * 100 : 0;
            double Prop_Warnings = (Total_Lineas > 0) ? ((double) Conteo_Warnings / Total_Lineas) * 100 : 0;

            System.out.println("Porcentaje de Errores: " + Prop_Errores + "%");
            System.out.println("Porcentaje de Advertencias: " +  Prop_Warnings + "%");

        } catch (IOException e) {
            System.out.println("Ocurrió un problema al momento de leer el archivo");
            System.out.println(e.getMessage());

            // Guardamos los fallos **************************************************************************
            try (BufferedWriter escritor = Files.newBufferedWriter( Ruta_Fallos )) {
                escritor.write("Se produjo un error al leer el archivo 'errores.log': ");
                escritor.write(e.getMessage());

            } catch (IOException ex) {
                System.out.println("No se pudo registar el fallo");
            }


        }

    }

}
