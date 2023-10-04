public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;

    public Asalariado(String nombre, long dni, int diasVacaciones) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long nuevoDni) {
        this.dni = nuevoDni;
    }

    public int getDiasVacaciones() {
        return this.diasVacaciones;
    }

    public void setDiasVacaciones(int nuevoDiasVacaciones) {
        this.diasVacaciones = nuevoDiasVacaciones;
    }
}
………..
public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno) {
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String nuevoTurno) {
        this.turno = nuevoTurno;
    }
}
………
public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region) {
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String nuevaRegion) {
        this.region = nuevaRegion;
    }
}
…………………….
public class TestHerencia {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 12345678, 28);
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan Mota", 55333222, 30, "noche");
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Camino", 55333666, 35, "Granada");

        System.out.println("El nombre del empleado1 es " + empleado1.getNombre());
        System.out.println("El nombre del empleado2 es " + empleado2.getNombre());
        System.out.println("El turno del empleado2 es " + empleado2.getTurno());
        System.out.println("El nombre del empleado3 es " + empleado3.getNombre());
        System.out.println("La región del empleado3 es " + empleado3.getRegion());
    }
}
…………………………………………………………….
EJERCICIO 5
public abstract class FiguraGeometrica {
    private String nombre;

    abstract public double area();

    public FiguraGeometrica(String nombreFigura) {
        this.nombre = nombreFigura;
    }

    final public boolean mayorQue(FiguraGeometrica otra) {
        return this.area() > otra.area();
    }

    final public String toString() {
        return this.nombre + " con area " + this.area();
    }
}

--------------------------------
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double largo, double ancho) {
        super("Rectangulo");
        this.base = largo;
        this.altura = ancho;
    }

    public double area() {
        return this.base * this.altura;
    }
}
-----------------------------------------

public class TestAbstracto {
    public static void main(String[] args) {
        Rectangulo r1;
        r1 = new Rectangulo(12.5, 23.7);
        System.out.println("Área de r1 = " + r1.area());

        Rectangulo r2 = new Rectangulo(8.6, 33.1);
        System.out.println("Área de r2 = " + r2);

        if (r1.mayorQue(r2))
            System.out.println("El rectángulo de mayor área es r1");
        else
            System.out.println("El rectángulo de mayor área es r2");
    }
}
