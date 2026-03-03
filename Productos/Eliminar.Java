public static void Eliminar(int ID) 
throws IOException {

    List<usuario> lista = Leer();
    BufferedWriter bw = 
        new BufferedWriter(new FileWriter("usuarios.txt"));

    for (Usuario u : lista) {
        if (u.getId() != ID) {
            bw.write(u.toString());
            bw.newLine();
        }
    }
    bw.close();
}
      </usuario>