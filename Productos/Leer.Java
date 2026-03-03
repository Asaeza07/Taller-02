public static List<usuario> Leer() throws IOException {
    List<usuario> lista = new ArrayList<>();
    Scanner sc = new Scanner(new File("usuarios.txt"));

    while (sc.hasNextLine()) {
        String[] datos = sc.nextLine().split(",");
        lista.add(new Usuario(
            Integer.parseInt(datos[0]),
            datos[1],
            datos[2]));
    }
    sc.close();
    return lista;
}
      </usuario></usuario>