
package ejercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia de Contacts
        Contacts myContacts = new Contacts();
        Scanner scanner = new Scanner(System.in);

        // Agregar algunos contactos
        myContacts.addContact("Pedro", "123-456-7890");
        myContacts.addContact("Manuel", "987-654-3210");
        myContacts.addContact("Carlos", "555-123-4567");

        // Mostrar la lista de contactos
        myContacts.displayContacts();

        // Eliminar un contacto
        myContacts.deleteContact("Maria");

        // Mostrar la lista de contactos después de la eliminación
        myContacts.displayContacts();

        // Intentar obtener el número de teléfono de un contacto que ya no existe
        try {
            String phoneNumber = myContacts.getPhoneNumber("Maria");
            System.out.println("Número de teléfono: " + phoneNumber);
        } catch (Dictionary.ObjectNoExistException e) {
            System.out.println(e.getMessage());
        }

        // Crear una instancia de Dictionary
        Dictionary<String, String> dictionary = new Dictionary<>();

        // Agregar algunos pares al diccionario
        dictionary.add("clave1", "valor1");
        dictionary.add("clave2", "valor2");
        dictionary.add("clave3", "valor3");

        // Mostrar el diccionario
        System.out.println(dictionary);

        // Eliminar un par existente
        dictionary.delete("clave2");

        // Mostrar el diccionario después de la eliminación
        System.out.println(dictionary);

        // Menú de opciones
        int choice;

        do {
            // Mostrar el menú
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar clave-valor al diccionario (DNI)");
            System.out.println("2. Eliminar clave del diccionario");
            System.out.println("3. Mostrar diccionario");
            System.out.println("4. Obtener valor de una clave");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            System.out.print("Ingrese su eleccion: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Agregar clave-valor al diccionario
                    System.out.print("Ingrese el DNI: ");
                    String dni = scanner.next();
                    System.out.print("Ingrese el nombre: ");
                    String name = scanner.next();
                    System.out.print("Ingrese la dirección: ");
                    String address = scanner.next();
                    System.out.print("Ingrese el número de teléfono: ");
                    String phone = scanner.next();
                    dictionary.add(dni, "Nombre: " + name + ", Dirección: " + address + ", Teléfono: " + phone);
                    break;
                case 2:
                    // Eliminar clave del diccionario
                    System.out.print("Ingrese la clave a eliminar (DNI): ");
                    String keyToDelete = scanner.next();
                    if (dictionary.delete(keyToDelete)) {
                        System.out.println("Clave eliminada exitosamente.");
                    } else {
                        System.out.println("La clave no existe.");
                    }
                    break;
                case 3:
                    // Mostrar diccionario
                    System.out.println(dictionary);
                    break;
                case 4:
                    // Obtener valor de una clave
                    System.out.print("Ingrese la clave (DNI): ");
                    String keyToFind = scanner.next();
                    try {
                        String val = dictionary.getValue(keyToFind);
                        System.out.println("Valor obtenido: " + val);
                    } catch (Dictionary.ObjectNoExistException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}
