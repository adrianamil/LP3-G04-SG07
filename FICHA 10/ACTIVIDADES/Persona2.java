//ACTIVIDAD 2
class Persona2 implements Comparable<Persona2> {
    private String dni;
    private String nombres;
    private String direccion;

    public Persona2(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    @Override
    public int compareTo(Persona2 otraPersona) {
        // Comparacion de nombres
        return this.nombres.compareTo(otraPersona.nombres);
    }

    @Override
    public String toString() {
        return "Persona  [" + "dni=" + dni + " , nombres= " + nombres + " , direccion= " + direccion + ']';
    }
    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;

        if (b.compareTo(min) < 0) {
            min = b;
        }

        if (c.compareTo(min) < 0) {
            min = c;
        }

        if (d.compareTo(min) < 0) {
            min = d;
        }

        return min;
    }

    public static void main(String[] args) {
        // int
        Integer minInt = minimo(5, 2, 8, 1);
        System.out.println("Minimo Integer: " + minInt);

        // double
        Double minDouble = minimo(3.5, 1.2, 4.7, 2.1);
        System.out.println("Minimo Double: " + minDouble);

        // String
        String minString = minimo("perro", "gato", "elefante", "ardilla");
        System.out.println("Minimo String: " + minString);

        // Persona
        Persona2 minPersona = minimo(
                new Persona2("98765432", "Ana Garcia", "Urb. D"),
                new Persona2("12345678", "Juan Perez", "Urb. A"),
                new Persona2("87654321", "Maria Rodriguez", "Urb. B"),
                new Persona2("55555555", "Pedro Gomez", "Urb. C")

        );
        System.out.println("Mínimo Persona2: " + minPersona);
    }
}