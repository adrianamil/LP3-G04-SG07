import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

    public static void main(String[] args) {
        String jdbcUrl = "\"jdbc:mysql://localhost:3306/actividad\"";
        String usuario = "root";
        String contraseña = "root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            // Crear una tabla de ejemplo
            createSampleTable(connection);

            // Usar PreparedStatement para insertar datos
            insertData(connection, "Elena", 28);

            // Usar PreparedStatement para seleccionar datos
            selectData(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createSampleTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS clientes (id INT PRIMARY KEY, nombre VARCHAR(50), edad INT)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL)) {
            preparedStatement.executeUpdate();
        }
    }

    private static void insertData(Connection connection, String nombre, int edad) throws SQLException {
        String insertSQL = "INSERT INTO clientes (nombre, edad) VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setInt(2, edad);
            preparedStatement.executeUpdate();
            System.out.println("Datos ingresados correctamente.");
        }
    }

    private static void selectData(Connection connection) throws SQLException {
        String selectSQL = "SELECT id, nombre, edad FROM clientes";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }
        }
    }
}
