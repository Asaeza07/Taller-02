import java.util.Scanner;

public class Funciones {

    static Cliente[] clientes = new Cliente[100];
    static int contadorClientes = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Registrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Registrar pedido");
            System.out.println("5. Listar pedidos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    registrarCliente(sc);
                    break;

                case 2:
                    listarClientes();
                    break;

                case 3:
                    eliminar_Cliente();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    opcion=3;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);
    }

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
            System.out.println(clientes[i]);
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


     public static void registrar_pedido(){



     }
    public static void listar_pedido(){






    }
    
}


