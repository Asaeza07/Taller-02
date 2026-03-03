public class Teclado extends Producto {   
    private String tipo;
    private String layout;
    private boolean inalambrico;
    
    public Teclado(int ID, String nombre, double precio, int cantidad, 
                  String Marca, int RAM, String sistemaOperativo) {
        super(ID, nombre, precio, cantidad);
        this.Marca = Marca;
        this.RAM = RAM;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + procesador + "," + RAM + "," + sistemaOperativo;
    }
}