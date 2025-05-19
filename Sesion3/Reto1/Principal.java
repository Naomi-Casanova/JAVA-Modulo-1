package Reto1;


public class Principal {
    public static void main(String[] args) {

        // Crear un pasajero
        Pasajero pasajero = new Pasajero( "Isabel Rivera",
                                          "P347101");

        // CREANDO UN VUELO **********************************************************
        Vuelo vuelo = new Vuelo( "HC123", 
                                 "Holanda", 
                                 "05:45");

        // RESERVAR NUM ASIENTO  *****************************************************
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("\n✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // MOSTRAR EL ITINERARIO  ****************************************************
        System.out.println(vuelo.obtenerItinerario());

        // CANCELAR RESERVACIÓN ******************************************************
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // MOSTRAR EL ITINERARIO  ****************************************************
        System.out.println(vuelo.obtenerItinerario());

        // RESERVAR NUM ASIENTO  *****************************************************
        vuelo.reservarAsiento( "Naomi Casanova",
                               "P986214");

        System.out.println(vuelo.obtenerItinerario());
    }

}