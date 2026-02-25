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
            lista.add(new Pedido(datos[0], Integer.parseInt(datos[1]), Integer.parseInt(datos[2])));
        }
        sc.close();
        return lista;
    }
}
