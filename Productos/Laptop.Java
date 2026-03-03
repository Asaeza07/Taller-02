public class Laptop extends Producto {
    private String procesador;
    private int RAM;
    private String sistemaOperativo;
    
    public Laptop(int ID, String nombre, double precio, int cantidad, 
                  String procesador, int RAM, String sistemaOperativo) {
        super(ID, nombre, precio, cantidad);
        this.procesador = procesador;
        this.RAM = RAM;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + procesador + "," + RAM + "," + sistemaOperativo;
    }
}