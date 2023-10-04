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
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public int getDiasVacaciones() {
        return diasVacaciones;
    }
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
    @Override
    public String toString() {
        return "Información del asalariado: \n" +
               "Nombre: " + getNombre() + "\n" +
               "DNI: " + getDni() + "\n" +
               "Días de vacaciones: " + getDiasVacaciones() + "\n";
    }
}
///////
public class EmpleadoProduccion extends Asalariado {
    private String turno;
    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno) {
        super(nombre, dni, diasVacaciones);
        this.turno = turno;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    @Override
    public String toString() {
        return super.toString() + "Turno: " + getTurno() + "\n";
    }
}
/////////////////
public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region) {
        super(nombre, dni, diasVacaciones);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return super.toString() + "Región: " + getRegion() + "\n";
    }
}
//////////////
public class TestHerencia {
    public static void main(String[] args){
        Asalariado e1 = new Asalariado("Manuel Cortina", 12345678, 28);
        EmpleadoProduccion e2 = new EmpleadoProduccion("Juan Mota", 55333222, 30, "noche");
        EmpleadoDistribucion e3 = new EmpleadoDistribucion("Antonio Camino", 55333222, 30, "Granada");
        System.out.println("Nombre del empleado 1: " + e1.getNombre());
        System.out.println("Nombre del empleado 2: " + e2.getNombre());
        System.out.println("Turno del empleado 2: " + e2.getTurno());
        System.out.println("Nombre del empleado 3: " + e3.getNombre());
        System.out.println("Región del empleado 3: " + e3.getRegion());
    }    
}
