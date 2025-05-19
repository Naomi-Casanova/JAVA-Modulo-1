package Sesion6.Reto1;

// LIBRERIAS 
import java.util.*;

public class RegistroMuestrasLab {
    public static void main(String[] args) {
        
        // CREAMOS EL VECTOR CON LAS MUESTRAS **************************************************
        ArrayList<String> Muestras_Especies = new ArrayList<>(Arrays.asList("Homo sapiens",
                                                                            "Mus musculus",
                                                                            "Arabidopsis thaliana",
                                                                            "Homo sapiens",
                                                                            "Homo sapiens",
                                                                            "Mus musculus"
                                                                            ));

        // OBETENEMOS LAS ESPECIES ÚNICAS ****************************************************************
        HashSet<String> Especies_Unicas = new HashSet<>(Muestras_Especies);

        // ASOCIAMOS LA MUESTRA CON EL NVESTIGADOR *******************************************************
        HashMap<String, String> Investigador_Muestras = new HashMap<>();
        Investigador_Muestras.put("5623", "Investigadora Miriam Morales");
        Investigador_Muestras.put("4510", "Investigador Alejandro Gutierrez");
        Investigador_Muestras.put("6191", "Investigador Ricardo Casanova");
        Investigador_Muestras.put("3357", "Investigador Iván García");

        // VARIABLE PARA BUSCAR EL ID ********************************************************************
        String Buscar_ID = "6191"; 
        
        // MOSTRAMOS LA INFO SOLICITADA ******************************************************************
        
        // MOSTRAMOS LA MUESTRA RECIBIDA
        System.out.println("\nMuestra recibida: ");
        System.out.print("[");
        for ( String m : Muestras_Especies) {
            System.out.print(m);
        }
        System.out.print("]");


        System.out.println();
        // MOSTRAMOS LAS ESPECIES RECIBIDAS ( sin repetir )
        System.out.println("\nLas especies que se registraron en la muestra son:");
        for ( String e : Especies_Unicas) {
            System.out.println(" + " + e);
        }

        
        // ASOCIANDO MUESTRAS CON INVESTIGADORES 
        System.out.println("\nInvestigadores y sus muestras:");
        for (Map.Entry<String, String> entry : Investigador_Muestras.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // INVESTIGADOR BUSCADO 
        System.out.println("\nEl " + Investigador_Muestras.get(Buscar_ID) + " es responsable de la muestra " + Buscar_ID );



    }

}
