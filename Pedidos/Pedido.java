package Pedidos;
public class Pedido {
    private String nombre;
    private int precio;
    private int cantidad;
    private int IDCliente;
    private int IDPedido;
    private int Activo;

    public Pedido(String nombre, int precio, int cantidad, int IDCliente, int IDPedido, int Activo) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.IDCliente = IDCliente;
        this.IDPedido = IDPedido;
        this.Activo = Activo;
    }

    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getIDCliente() {
        return IDCliente;
    }
    public int getIDPedido() {
        return IDPedido;
    }
    public int getActivo() {
        return Activo;
    }
    @Override
    public String toString(){
        return  IDPedido+","+IDCliente+","+nombre+","+precio+","+cantidad+","+Activo;
    }

}
