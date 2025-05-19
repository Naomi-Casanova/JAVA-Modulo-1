package Reto1;

public class Vuelo {

    // DEFINIMOS LOS ATRIBUTOS **************************************************************
    final String codigoVuelo;     
    String destino;
    String horaSalida;
    Pasajero NumAsiento;      

    // DEFINIMOS LOS METODOS ****************************************************************
    // VUELO
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.NumAsiento = null;
    }
    
    // RESERVAR ASIENTO *********************************************************************
    public boolean reservarAsiento(Pasajero p) {

        // Verificamos que el pasajero no tenga una resrva echa 
        if ( NumAsiento == null) {
             NumAsiento = p;
            return true;
        } else {
            return false;
        }
    }

    public boolean reservarAsiento(String Nombre_Pasajero, String Pasaporte) {
        
        if (NumAsiento == null) {
            this.NumAsiento = new Pasajero(Nombre_Pasajero, Pasaporte);
            return true;
        }
        return false;
    }

    // CANCELAR RESERVACION *****************************************************************
    public void cancelarReserva() {
        NumAsiento = null;
    }

    // OBTENER INFORMACIÓN DE LA RESERVACIÓN ************************************************
    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        String aux ;

        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";

        if (NumAsiento != null) {
            aux = NumAsiento.Nombre_Pasajero;
        } else {
            aux = "[Sin reserva]";
        }

        info += "Pasajero: " + aux + "\n" ;

        return info;
    }

}