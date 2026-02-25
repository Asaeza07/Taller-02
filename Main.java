import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // prestamo = [idPrestamo, nombreUsuario, tituloLibro, diasPrestamo, multaPorDia]
    static ArrayList<ArrayList<Object>> prestamos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Función en desarrollo...");
                case 2 -> System.out.println("Función 2 en desarrollo...");
                case 3 -> System.out.println("Función 3 en desarollo...");
                case 4 -> System.out.println("Función 4 en desarollo...");
                case 5 -> System.out.println("Función 5 en desarollo...");
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 6);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("=== Información de Clientes y Pedidos ===");
        System.out.println("1. Registrar un cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Eliminar un cliente");
        System.out.println("4. Registrar un pedido");
        System.out.println("5. Listar pedidos de un cliente");
        System.out.println("6. Salir");
    }

    static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }

    static String leerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }
}