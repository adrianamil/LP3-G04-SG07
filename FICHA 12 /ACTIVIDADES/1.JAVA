import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            // Desactivar el modo de autocommit
            connection.setAutoCommit(false);

            try {
                // Operaciones dentro de la transacción
                insertData(connection, "Usuario1", 25);
                updateData(connection, "Usuario1", 30);

                // Confirmar la transacción
                connection.commit();
                System.out.println("Transacción confirmada.");

            } catch (SQLException e) {
                // Deshacer la transacción en caso de error
                connection.rollback();
                System.out.println("Transacción deshecha debido a un error.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
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

    private static void updateData(Connection connection, String nombre, int nuevaEdad) throws SQLException {
        String updateSQL = "UPDATE clientes SET edad = ? WHERE nombre = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setInt(1, nuevaEdad);
            preparedStatement.setString(2, nombre);
            preparedStatement.executeUpdate();
            System.out.println("Datos actualizados correctamente.");
        }
    }
}
