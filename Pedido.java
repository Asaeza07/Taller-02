public class Pedido {
    private String nombre;
    private int precio;
    private int cantidad;

    public Pedido(String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre(String nombre) {
        return nombre;
    }
    public int getPrecio(int precio) {
        return precio;
    }
    public int getCantidad(int cantidad) {
        return cantidad;
    }
    @Override
    public String toString(){
        return nombre+","+precio+","+cantidad;
    }

}
