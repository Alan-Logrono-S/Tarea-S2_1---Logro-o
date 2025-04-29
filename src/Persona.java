public class Persona {
    static class LaPersona {
        String nombre;
        int edad;

        void presentarse() {
            System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
        }
    }
    public static void main(String[] args) {
        LaPersona persona1 = new LaPersona();

        persona1.nombre = "Alan Logroño Soria";
        persona1.edad = 20;

        persona1.presentarse();
    }
}
