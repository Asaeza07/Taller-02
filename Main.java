import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> System.out.println("Función en desarrollo...");
                case 2 -> System.out.println("Función 2 en desarrollo...");
                case 3 -> System.out.println("Función 3 en desarollo...");
                case 4 -> RegistrarPedidoCliente();
                case 5 -> ListaPedidosCliente();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 6);

        sc.close();
    }

    static void RegistrarPedidoCliente() throws IOException {
        String nombre = leerTexto("Ingrese el nombre del producto: ");
        int precio = leerEntero("Ingrese el precio del producto: ");
        int cantidad = leerEntero("Ingrese la cantidad del producto: ");
        Pedido pedido = new Pedido(nombre, precio, cantidad);
        PedidosFunciones.RegistrarPedidos(pedido);
    }
    static void ListaPedidosCliente() throws IOException {
        int ID = leerEntero("Ingrese el ID del cliente para listar sus pedidos: ");
        ArrayList<Pedido> pedidos = (ArrayList<Pedido>) PedidosFunciones.ListarPedidos();
        System.out.println("Pedidos del cliente ");
        for (Pedido pedido : pedidos) {
           System.out.println(pedido);
        }
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