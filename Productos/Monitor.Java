public class Monitor extends Producto {
    private double tamanoPantalla;
    private String resolucion;
    private int frecuenciaRefresco;
    
    public Monitor(int ID, String nombre, double precio, int cantidad, 
                   double tamanoPantalla, String resolucion, int frecuenciaRefresco) {
        super(ID, nombre, precio, cantidad);
        this.tamanoPantalla = tamanoPantalla;
        this.resolucion = resolucion;
        this.frecuenciaRefresco = frecuenciaRefresco;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + tamanoPantalla + "," + resolucion + "," + frecuenciaRefresco;
    }
}
