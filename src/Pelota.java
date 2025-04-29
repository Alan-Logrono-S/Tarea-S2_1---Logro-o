public class Pelota {
    String color;
    String tamaño;

    public Pelota(String color, String tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }

    public void mostrarDetalles() {
        System.out.println("Pelota de color " + color + " y tamaño " + tamaño);
    }

    public static void main(String[] args) {
        Pelota pelota1 = new Pelota("rojo", "grande");
        Pelota pelota2 = new Pelota("azul", "mediano");
        Pelota pelota3 = new Pelota("verde", "pequeño");

        pelota1.mostrarDetalles();
        pelota2.mostrarDetalles();
        pelota3.mostrarDetalles();
    }
}
