Public class Usuario{
private int ID;
private String Nombre;
private int Telefono;
 public Usuario(int ID, String nombre, String Telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.Telefono = Telefono;
 }
 @Overrive
public String toString(){
    return ID + "," + nombre + "," + Telefono;
}

}