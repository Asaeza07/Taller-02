
public class Cliente {
    // Archivo ahora editable

    private int id;
    private boolean activo;
    private String nombre;
    private String apellido;
    private String telefono;

    public Cliente(int id, String nombre, String apellido, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.activo = true;
    }

    public void setActivo(boolean b) {
        this.activo = b;
    }

    public int getId() {
        return this.id;
    }

    public boolean isActivo() {
        return this.activo;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + telefono + ", Activo: " + activo;
    }

}
