import java.util.Scanner;

public class Funciones {

    static Cliente[] clientes = new Cliente[100];
    static int contadorClientes = 0;

    public static void registrarCliente(Scanner sc) {

        if (contadorClientes >= clientes.length) {
            System.out.println("No se pueden registrar más clientes.");
            return;
        }

        System.out.print("Pedido activo? (true/false): ");
        boolean activo = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Digite ID del cliente: ");
        int id_cliente = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite su Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Digite su Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Digite su Teléfono: ");
        String telefono = sc.nextLine();

        clientes[contadorClientes] =
                new Cliente(id_cliente, nombre, apellido, telefono);

        clientes[contadorClientes].setActivo(activo);

        contadorClientes++;

        System.out.println("Cliente registrado correctamente.");
    }

    
    public static void listarClientes() {

        if (contadorClientes == 0) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        for (int i = 0; i < contadorClientes; i++) {
            if (clientes[i].isActivo()) {
                System.out.println(clientes[i]);
            }
        }
       
    }
     public static void eliminar_Cliente() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite el ID del cliente que desea eliminar;");
    int id = sc.nextInt();
    for (int i = 0; i < contadorClientes; i++) {
        if (clientes[i].getId() == id && clientes[i].isActivo()) {
            clientes[i].setActivo(false);
            System.out.println("Cliente marcado como inactivo");
            return;
        }
    }

    System.out.println("Cliente no encontrado o Inactivo");
            


    }
}


