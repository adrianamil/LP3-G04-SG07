import java.io.Serializable;
class Empleado implements Serializable {
    private int numero;
    private String nombre;
    private double sueldo;

    public Empleado(int numero, String nombre, double sueldo) {
        this.numero = numero;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Número: " + numero + ", Nombre: " + nombre + ", Sueldo: " + sueldo;
    }
}
