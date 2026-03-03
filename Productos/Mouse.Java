public class Mouse extends Producto {
    private int DPI;
    private int botones;
    private boolean inalambrico;
    
    public Mouse(int ID, String nombre, double precio, int cantidad, 
                 int DPI, int botones, boolean inalambrico) {
        super(ID, nombre, precio, cantidad);
        this.DPI = DPI;
        this.botones = botones;
        this.inalambrico = inalambrico;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + DPI + "," + botones + "," + inalambrico;
    }
}
