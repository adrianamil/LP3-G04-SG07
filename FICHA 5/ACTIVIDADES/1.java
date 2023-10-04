class Cuenta {
    private int numero;
    private double saldo;
    
    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public Cuenta(int numero){
        this(numero, 0);
    }
    
    @Override
    public String toString(){
        retunr "Numero: " + numero + ", Saldo: "+saldo;
    }
}
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(id, 1000);
    }

    @Override
    public String toString() {
        return "Persona : " + nombre + " " + apellido + ", Cuenta: " + cuenta;
    }
}
public class TestComposicion {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "Taylor", "Swift");
        System.out.println(persona1);
    }
}

