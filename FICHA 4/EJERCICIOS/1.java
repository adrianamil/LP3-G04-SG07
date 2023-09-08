import java.util.ArrayList;
import java.util.Scanner;

public class Contactos {
    private ArrayList<Contacto> contactos;

    public Contactos() {
        contactos = new ArrayList<>();
    }

    public void añadirContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto añadido.");
    }

    public void buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contacto);
                return;
            }
        }
        System.out.println("No se encontró el contacto.");
    }

    public void modificarContacto(String nombre, String nuevoNombre, String nuevoTelefono, String nuevadireccion) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contacto.setNombre(nuevoNombre);
                contacto.setTelefono(nuevoTelefono);
                contacto.setDireccion(nuevadireccion);
                System.out.println("Contacto modificado.");
                return;
            }
        }
        System.out.println("No se encontró el contacto.");
    }

    public void borrarTodosLosContactos() {
        contactos.clear();
        System.out.println("Todos los contactos han sido eliminados.");
    }

    public void eliminarContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(i);
                System.out.println("Contacto eliminado.");
                return;
            }
        }
        System.out.println("No se encontró el contacto.");
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La lista de contactos está vacía.");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }

    public static void main(String[] args) {
        Contactos agenda = new Contactos();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("Menú:");
            System.out.println("1) Añadir contacto");
            System.out.println("2) Buscar contacto");
            System.out.println("3) Modificar contacto");
            System.out.println("4) Borrar todos los contactos");
            System.out.println("5) Eliminar un contacto");
            System.out.println("6) Mostrar contactos");
            System.out.println("7) Salir");
            System.out.print("Ingrese una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese direccion del contacto: ");
                    String direccion=scanner.nextLine();
                    Contacto nuevoContacto = new Contacto(nombre, telefono,direccion);
                    agenda.añadirContacto(nuevoContacto);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto que desea buscar: ");
                    nombre = scanner.nextLine();
                    agenda.buscarContacto(nombre);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto que va a modificar: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el nombre nuevo del contacto: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Ingrese telefono nuevo del contacto: ");
                    String nuevoTelefono = scanner.nextLine();
                    System.out.print("Ingrese la nueva direccion: ");
                    String nuevadireccion = scanner.nextLine();
                    agenda.modificarContacto(nombre, nuevoNombre, nuevoTelefono, nuevadireccion);
                    break;
                case 4:
                    agenda.borrarTodosLosContactos();
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del contacto que va eliminar: ");
                    nombre = scanner.nextLine();
                    agenda.eliminarContacto(nombre);
                    break;
                case 6:
                    agenda.mostrarContactos();
                    break;
                case 7:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Invalido");
            }
        }

        scanner.close();
    }
}

class Contacto {
    private String nombre;
    private String telefono;
    private String direccion;

    public Contacto(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono + ", Direccion: " + direccion;
    }
}
