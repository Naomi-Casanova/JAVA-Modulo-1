
package Reto1;

public class CentralEmergencias {
    public static void main(String[] args) {

        Ambulancia unidad_ambulancia = new Ambulancia("Ambulancia A", "María");
        Patrulla unidad_patrulla = new Patrulla("Patrulla X", "Rafael");
        UnidadBomberos unidad_bomberos = new UnidadBomberos("UnidadBomberos 02", "Evelyn");

        unidad_ambulancia.iniciarOperacion();
        System.out.println();

        unidad_patrulla.iniciarOperacion();
        System.out.println();

        unidad_bomberos.iniciarOperacion();

    }

}
