public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("---------------------------");
    }
//asd
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        System.out.println("Libro 1:");
        libro1.imprimirInfo();

        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        System.out.println("Libro 2:");
        libro2.imprimirInfo();
    }
}
