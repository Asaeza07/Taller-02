public static void Crear(Usuario usuario)
throws IOException {
FileWriter fw = new FileWriter("usuarios.txt", true);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(usuario.toString());
    bw.newLine();
    bw.close();
    Laptop laptop = new Laptop(1, "Lenovo", 800.0, 5, "Intel i7", 16, "Windows");
Teclado teclado = new Teclado(2, "Logitech K120", 25.0, 10, "Membrana", "QWERTY", false);
Mouse mouse = new Mouse(3, "Razer DeathAdder", 70.0, 8, 16000, 5, true);

Crear.Crear(laptop);
Crear.Crear(teclado);
Crear.Crear(mouse);
}