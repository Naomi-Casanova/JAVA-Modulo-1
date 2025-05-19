

public class Factura {

    // ATRIBUTOS ****************************************************************************************
    private String Folio;
    private String Cliente;
    private double Total;

    // INICIALIZAMOS TODOS LOS ATRIBUTOS ****************************************************************
    public Factura(String Folio, String Cliente, double Total) {
        this.Folio = Folio;
        this.Cliente = Cliente;
        this.Total = Total;
    }

    // MÉTODO toString() ********************************************************************************
    @Override
    public String toString() {

        return "Factura [Folio =" + Folio + ", Cliente = " + Cliente + ", Total = $" + Total + "]";

    }

    // MÉTODO equals() **********************************************************************************
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura factura_nueva = (Factura) obj;
        return this.Folio.equals(factura_nueva.Folio); 

    }

    // MÉTODO hashCode() ********************************************************************************
    @Override
    public int hashCode() {

        return Folio.hashCode();

    }
    
}
