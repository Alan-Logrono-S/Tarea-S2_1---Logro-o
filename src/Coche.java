public class Coche {
    String marca;
    String modelo;
    int anio;

    public Coche() {
        this.marca = "Toyota";
        this.modelo = "Corolla";
        this.anio = 2020;
    }

    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.println("Coche 1:");
        coche1.mostrarInfo();

        Coche coche2 = new Coche("Honda", "Civic", 2023);
        System.out.println("Coche 2:");
        coche2.mostrarInfo();
    }
}
