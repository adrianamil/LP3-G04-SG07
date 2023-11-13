//ACTIVIDAD 1
public class Persona {
    private String dni;
    private String nombres;
    private String direccion;

    public Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona[" + "dni= " + dni + " , nombres= " + nombres  + " , direccion= " + direccion + ']';
    }
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
    public static void main(String[] args) {
        // Float
        Float[] arrayFloat = {1.5f, 2.5f, 3.5f};
        System.out.println("Array de Float:");
        imprimirArray(arrayFloat);

        // Boolean
        Boolean[] arrayBoolean = {true, false, true};
        System.out.println("\nArray de Boolean:");
        imprimirArray(arrayBoolean);

        // Persona
        Persona[] arrayPersona = {
                new Persona("12345678", "Juan Perez", "Calle A"),
                new Persona("87654321", "Maria Rodriguez", "Calle B"),
                new Persona("01890998", "Pedro Gomez", "Calle C")
        };
        System.out.println("Array de Personas:");
        imprimirArray(arrayPersona);
    }
}
