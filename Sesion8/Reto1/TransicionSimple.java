
package Sesion8.Reto1;

public class TransicionSimple implements TransicionHistoria {

    @Override
    public void realizarTransicion(String decision) {

        if (decision.equalsIgnoreCase("A")) {
            System.out.println("La historia se traslada a un pantano. Donde Burro inrrumpe en la casa de Sherk ...");

        } else {
            System.out.println("La historia se traslada al Reino de Muy Muy Lejado. Donde los padres de Fiona esperan conocer a Sherk ");
        }

    }

}
