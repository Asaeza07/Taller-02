public class Producto {
    protected int ID;
    protected String nombre;
    protected double precio;
    protected int cantidad;
    
    public Producto(int ID, String nombre, double precio, int cantidad) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return ID + "," + nombre + "," + precio + "," + cantidad;
    }
}