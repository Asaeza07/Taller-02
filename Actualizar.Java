public static void Actualizar(int Id, String nuevoNombre, String nuevoEmail) 
throws IOException {
List<usuario> lista = Leer();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("usuarios.txt"));

    for (Usuario u : lista) {
        if (u.getId() == ID) {
            u.setNombre(nuevoNombre);
            u.setEmail(nuevoEmail);
        }
        bw.write(u.toString());
        bw.newLine();
    }
    bw.close();
}
      </usuario>



