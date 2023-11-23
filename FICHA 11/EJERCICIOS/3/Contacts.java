import java.util.Scanner;

public class Contacts {
    private Diccionario<String, String> contactos;

    public Contacts() {
        this.contactos = new Diccionario<>();
    }

    public void agregarContacto(String dni, String datosPersona) {
        contactos.add(dni, datosPersona);
        System.out.println("Contacto agregado exitosamente.");
    }

    public void eliminarContacto(String dni) {
        if (contactos.delete(dni)) {
            System.out.println("Contacto eliminado exitosamente.");
        } else {
            System.out.println("El contacto con DNI '" + dni + "' no existe.");
        }
    }

    public void mostrarContacto(String dni) {
        try {
            String datosPersona = contactos.getValue(dni);
            System.out.println("Datos del contacto con DNI '" + dni + "': " + datosPersona);
        } catch (ObjectNoExist e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarTodosLosContactos() {
        System.out.println("Lista de contactos:");
        System.out.println(contactos);
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de la opción numérica

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DNI del nuevo contacto: ");
                    String dniNuevoContacto = scanner.nextLine();
                    System.out.print("Ingrese los datos de la persona: ");
                    String datosNuevoContacto = scanner.nextLine();
                    agregarContacto(dniNuevoContacto, datosNuevoContacto);
                    break;
                case 2:
                    System.out.print("Ingrese el DNI del contacto a eliminar: ");
                    String dniEliminarContacto = scanner.nextLine();
                    eliminarContacto(dniEliminarContacto);
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del contacto a mostrar: ");
                    String dniMostrarContacto = scanner.nextLine();
                    mostrarContacto(dniMostrarContacto);
                    break;
                case 4:
                    mostrarTodosLosContactos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void main(String[] args) {
        Contacts gestionContactos = new Contacts();
        gestionContactos.mostrarMenu();
    }
}
