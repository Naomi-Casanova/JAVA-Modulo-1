package Sesion6.Reto2;


// LIBRERIAS 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

// CREAMOS LA CLASE TEMA *******************************************************************
class Tema implements Comparable<Tema> {
    // Atributos 
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Para ordenar por titulo
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " | Prioridad: " + prioridad;
    }

}

public class PlaneacionEducativa {
    public static void main(String[] args) {

        // GESTIONAMOS LOS TEMAS ACTIVOS ************************************************
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        // Agregamos temas 
        temas.add(new Tema("Educación Financiera", 1));
        temas.add(new Tema("Asertividad Emocional", 1));
        temas.add(new Tema("Matemáticas", 2));
        temas.add(new Tema("Historia", 3));
        temas.add(new Tema("Educacíon Física", 2));


        // 1. ORDENAMOS POR TITULOS 
        List<Tema> Temas_OrdAlf = new ArrayList<>(temas);
        Collections.sort(Temas_OrdAlf, Comparator.comparing(t -> t.titulo));


        // 2. ORDENAMOS POR PRIORIDAD
        List<Tema> Temas_OrdPri = new ArrayList<>(temas);
        Temas_OrdPri.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });

        // 3.USANDO ConcurrentHashMap<String, String> COMO REPOSITORIO
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Matemáticas", "https://recursos.edu/MatemáticasBásicas");
        recursos.put("Asertividad Emocional", "https://recursos.edu/Psicologia");
        recursos.put("Educación Financiera", "https://recursos.edu/FinanzasPersonales");
        recursos.put("Historia", "https://recursos.edu/Historia_de_Mexico");
        recursos.put("Educación Física", "https://recursos.edu/Deportes");

        // MOSTRAMOS LA LISTA DE TITULOS *******************************************************
        // 1. POR TITULOS
        System.out.println("\nTEMAS EN ORDEN ALFABETICO");
        for (Tema t : Temas_OrdAlf) {
            System.out.println(t);
        }

        // 2. POR PRIORIDAD 
        System.out.println("\nTEMAS ORDENADOS POR PRIORIDAD");
        for (Tema t : Temas_OrdPri) {
            System.out.println(t);
        }

        // MOSTRAMOS EL REPOSITORIO *******************************************************
        System.out.println("\nREPOSITORIO DE TEMAS ");
        for (String tema : recursos.keySet()) {
            System.out.println(tema + " > " + recursos.get(tema));
        }




    }

}