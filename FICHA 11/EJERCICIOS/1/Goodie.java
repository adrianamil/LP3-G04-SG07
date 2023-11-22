import java.util.Objects;

class Goodie {
    private String nombre;
    private double precio;

    public Goodie(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Goodie goodie = (Goodie) obj;
        return Double.compare(goodie.precio, precio) == 0 && nombre.equals(goodie.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }
}
