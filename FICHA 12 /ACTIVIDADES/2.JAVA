import java.sql.*;
import java.util.Scanner;

public class OperacionesCRUD{

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try {
            // Establecer conexión
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);

            // Crear un Scanner para la entrada de datos
            Scanner scanner = new Scanner(System.in);

            // Menú de operaciones
            int opcion;
            do {
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Insertar persona");
                System.out.println("2. Recuperar personas");
                System.out.println("3. Actualizar persona");
                System.out.println("4. Borrar persona");
                System.out.println("0. Salir");
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> // Insertar persona
                        insertarPersona(conexion, scanner);
                    case 2 -> // Recuperar personas
                        recuperarPersonas(conexion);
                    case 3 -> // Actualizar persona
                        actualizarPersona(conexion, scanner);
                    case 4 -> // Borrar persona
                        borrarPersona(conexion, scanner);
                    case 0 -> {
                    }
                    default -> System.out.println("Opcion no valida. Intentelo de nuevo.");
                }
                // Salir
                            } while (opcion != 0);

            // Cerrar conexión y Scanner
            conexion.close();
            scanner.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertarPersona(Connection conexion, Scanner scanner) throws SQLException {
        System.out.print("Ingrese el ID (maximo 5 caracteres): ");
        String id = scanner.next();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese los apellido: ");
        String apellido = scanner.next();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        String query = "INSERT INTO clientes (id, nombre, apellido, edad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellido);
            pstmt.setInt(4, edad);
            pstmt.executeUpdate();
            System.out.println("Persona insertada con exito.");
        }
    }

    private static void recuperarPersonas(Connection conexion) throws SQLException {
        String query = "SELECT * FROM clientes";
        try (Statement stmt = conexion.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getString("id") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Apellido: " + rs.getString("apellido") +
                        ", Edad: " + rs.getInt("edad"));
            }
        }
    }

    private static void actualizarPersona(Connection conexion, Scanner scanner) throws SQLException {
        System.out.print("Ingrese el ID del cliente a actualizar: ");
        String id = scanner.next();

        System.out.print("Ingrese el nuevo nombre: ");
        String nuevoNombre = scanner.next();

        System.out.print("Ingrese los nuevos apellido: ");
        String nuevosApellidos = scanner.next();

        System.out.print("Ingrese la nueva edad: ");
        int nuevaEdad = scanner.nextInt();

        String query = "UPDATE clientes SET nombre=?, apellido=?, edad=? WHERE id=?";
        try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, nuevoNombre);
            pstmt.setString(2, nuevosApellidos);
            pstmt.setInt(3, nuevaEdad);
            pstmt.setString(4, id);
            pstmt.executeUpdate();
            System.out.println("Cliente actualizado con exito.");
        }
    }

    private static void borrarPersona(Connection conexion, Scanner scanner) throws SQLException {
        System.out.print("Ingrese el ID del cliente a borrar: ");
        String id = scanner.next();

        String query = "DELETE FROM clientes WHERE id=?";
        try (PreparedStatement pstmt = conexion.prepareStatement(query)) {
            pstmt.setString(1, id);
            pstmt.executeUpdate();
            System.out.println("Cliente borrado con exito.");
        }
    }
}

