
package Reto2;

public record Entrada_Record(String Nombre, double Precio , LocalDate Fecha) {

    public void mostrarInformacion() {
        System.out.println("Fecha: " + Fecha + ""----------------------------------");");
        System.out.println("Evento: " + Nombre + " | Precio: $" + Precio);
    }

}
