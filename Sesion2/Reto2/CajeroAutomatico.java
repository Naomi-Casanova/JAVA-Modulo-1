package Reto2;

// LIBRERIAS 
import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        // Definimos un saldo inicial
        var Saldo_Inicial = 1_500.0; 

        // Opcion que seleccionara el usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // MENU DEL CAJERO ********************************************************************
        do {
            // Mostramos el menú con las operaciones disponibles
            System.out.println("\n Bienvenido al cajero automático");
            System.out.println("Presiona el número de la operación que deseas realizar ");

            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            
            // Leemos la entrada del usuario 
            opcion = scanner.nextInt(); 

            switch (opcion) {
                // 1. CONSULTAR SALDO **********************************************************
                case 1:
                    System.out.println("Tu saldo actual es: $" + Saldo_Inicial);
                    break;

                // 2. DEPOSITAR DINERO *********************************************************
                case 2:
                    System.out.print("Ingresa el monto que deseas depositar: ");
                    double Monto_Depositado = scanner.nextDouble();
                    
                    // Hacemos una validación para que el usuario ingrese montos válidos
                    if ( Monto_Depositado <= 0 ) {
                        System.out.println("Por favor ingresa un monto mayor a 0.");
                        break;
                    }
                    
                    // Sumamos el Monto Depositado al Saldo Inicial
                    Saldo_Inicial += Monto_Depositado;
                    System.out.println("Operación realizada con éxito :) ");
                    break;

                // 3. RETIRAR DINERO ************************************************************
                case 3:
                    System.out.print("Ingresa el monto que deseas retirar: ");
                    double Monto_Retirar = scanner.nextDouble();

                    // Validaciones para que el usuario ingrese montos correctos
                    if ( Monto_Retirar <= 0) {
                        System.out.println("Por favor ingresa un monto mayor a 0.");
                        break; 
                    }
                    else if ( Monto_Retirar > Saldo_Inicial) {
                        System.out.println("No cuentas con el saldo suficiente para realizar esta operación. \n Intenta con otro monto");
                    } 
                    else {
                        Saldo_Inicial -= Monto_Retirar ; 
                        System.out.println("Operación realizada con éxito :) ");
                    }
                    break;

                // 4. SALIR **********************************************************************
                case 4:
                    System.out.println("Gracias por preferir nuestros servicios , Lindo día :) ");
                    break;

                // CUANDO LA OPCION NO ES VALIDA *************************************************
                default:
                    System.out.println("Ingresa una opcion que esté dentro del menú");
                    break;
            }

        } while ( opcion != 4 );

        scanner.close(); // Cerrar el Scanner

    }
}



