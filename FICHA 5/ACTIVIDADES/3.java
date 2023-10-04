public class Banco {
    private String nombre;
    private Persona[] clientes;
    private int numClientes;

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
        this.numClientes = 0;
    }
    // Getter para nombre
    public String getNombre() {
        return nombre;
    }
    // Setter para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Getter para clientes
    public Persona[] getClientes() {
        return clientes;
    }
    // Setter para clientes 
    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }
    // Getter para numClientes
    public int getNumClientes() {
        return numClientes;
    }
    // Setter para numClientes 
    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public boolean agregarCliente(Persona persona) {
        // Verificar si el cliente ya existe en la lista
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return false; // El cliente ya existe, no se puede duplicar
            }
        }
        // Verificar si hay capacidad en el arreglo para agregar al nuevo cliente
        if (numClientes < clientes.length) {
            clientes[numClientes] = persona;
            numClientes++; // Incrementar el contador de clientes
            return true; // Cliente agregado con éxito
        } else {
            return false; // No hay capacidad para agregar más clientes
        }
    }
    public Persona darBajaCliente(Persona persona) {
        // Buscar al cliente en la lista
        for (int i = 0; i < numClientes; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                Persona clienteDadoDeBaja = clientes[i]; // Guardar una referencia al cliente
                clientes[i] = null; // Eliminar el cliente
                numClientes--; // Decrementar el contador de clientes
                return clienteDadoDeBaja; // Retornar el cliente dado de baja
            }
        }
        return null; // El cliente no fue encontrado y no se pudo dar de baja
    }
    public boolean buscarCliente(Persona persona) {
        // Implementación para buscar un cliente en la lista de clientes del banco
        for (Persona cliente : clientes) {
            if (cliente != null && cliente.equals(persona)) {
                return true; // El cliente fue encontrado
            }
        }
        return false; // El cliente no fue encontrado
    }
    public void clientesTipo(char tipo) {
        System.out.println("Clientes de tipo " + tipo + ":");

        for (int i = 0; i < numClientes; i++) {
            Persona cliente = clientes[i];
            if (cliente != null && cliente.getTipo() == tipo) {
                System.out.println(cliente.toString());
            }
        }
    }
    public String toString() {
        StringBuilder infoClientes = new StringBuilder();
        infoClientes.append("Información de los clientes del banco ").append(nombre).append(":\n");

        for (int i = 0; i < numClientes; i++) {
            if (clientes[i] != null) {
                infoClientes.append("Cliente ").append(i + 1).append(":\n");
                infoClientes.append(clientes[i].toString()).append("\n");
            }
        }

        return infoClientes.toString();
    }
}
----------------------------------------------------------------------------------------------------------
public class Persona {
    private String nombre;
    private String dni;
    private char tipo;
    public Persona(String nombre, String dni, char tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public char getTipo() {
        return tipo;
    }
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        return dni.equals(persona.dni);
    }
    @Override
    public int hashCode() {
        return dni.hashCode();
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Tipo: " + tipo;
    }
}
import java.util.Scanner;
public class TestAsociacion {
    public static void main(String[] args) {
        Banco bcp = new Banco("BCP");
        Banco bbva = new Banco("BBVA", 30);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú Principal");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Listar clientes por tipo");
            System.out.println("4. Dar de baja cliente");
            System.out.println("5. Mostrar información de clientes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el DNI del cliente: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese el tipo del cliente (A o B): ");
                    char tipo = scanner.nextLine().charAt(0);
                    Persona nuevoCliente = new Persona(nombre, dni, tipo);
                    boolean resultado = bcp.agregarCliente(nuevoCliente);
                    if (resultado) {
                        System.out.println("Cliente agregado con éxito al BCP");
                    } else {
                        System.out.println("El cliente ya existe en el BCP");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el DNI del cliente a buscar: ");
                    String dniBuscar = scanner.nextLine();
                    Persona clienteBuscar = new Persona("", dniBuscar, ' ');

                    boolean encontrado = bcp.buscarCliente(clienteBuscar);

                    if (encontrado) {
                        System.out.println("El cliente fue encontrado en el BCP");
                    } else {
                        System.out.println("El cliente no fue encontrado en el BCP");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el tipo de cliente a listar (A o B): ");
                    char tipoListar = scanner.nextLine().charAt(0);
                    System.out.println("Clientes de tipo '" + tipoListar + "' en el BCP:");
                    bcp.clientesTipo(tipoListar);
                    break;
                case 4:
                    System.out.print("Ingrese el DNI del cliente a dar de baja: ");
                    String dniBaja = scanner.nextLine();
                    Persona clienteDarDeBaja = new Persona("", dniBaja, ' ')
                    Persona clienteDadoDeBaja = bcp.darBajaCliente(clienteDarDeBaja);
                    if (clienteDadoDeBaja != null) {
                        System.out.println("Cliente dado de baja en el BCP");
                    } else {
                        System.out.println("Cliente no encontrado en el BCP");
                    }
                    break;
                case 5:
                    System.out.println("Información de los clientes en el BBVA:");
                    System.out.println(bbva.toString());
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
    }
}

