package Pedidos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidosFunciones {
    public static void RegistrarPedidos(Pedido pedido) throws IOException{
        FileWriter fw = new FileWriter("Pedidos.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(pedido.toString());
        bw.newLine();
        bw.close();
    }
    public static List<Pedido> ListarPedidos() throws IOException{
        List<Pedido> lista = new ArrayList<>();
        Scanner sc = new Scanner(new File("Pedidos.txt"));
        while (sc.hasNextLine()){
            String[] datos = sc.nextLine().split(",");
            int IDPedido = Integer.parseInt(datos[0]);
            int IDCliente = Integer.parseInt(datos[1]);
            String nombre = datos[2];
            int precio = Integer.parseInt(datos[3]);
            int cantidad = Integer.parseInt(datos[4]);
            int activo = Integer.parseInt(datos[5]);
            lista.add(new Pedido(nombre, precio, cantidad, IDCliente, IDPedido, activo));
        }
        sc.close();
        return lista;
    }
}
