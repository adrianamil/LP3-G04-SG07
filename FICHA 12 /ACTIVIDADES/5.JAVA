import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatement1 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contraseña = "root";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, usuario, contraseña)) {
            // Llamada a la función
            String callFunction = "{? = call calcular_edad_promedio()}";

            try (CallableStatement callableStatement = connection.prepareCall(callFunction)) {
                // Definir el tipo de retorno
                callableStatement.registerOutParameter(1, java.sql.Types.DOUBLE);

                // Ejecutar la llamada a la función
                callableStatement.execute();

                // Obtener el resultado
                double edadPromedio = callableStatement.getDouble(1);
                System.out.println("Edad Promedio: " + edadPromedio);
            }

            // Llamada al procedimiento almacenado
            String callProcedure = "{call obtener_datos(?)}";
            int idParam = 1; 

            try (CallableStatement callableStatement = connection.prepareCall(callProcedure)) {
                callableStatement.setInt(1, idParam);

                // Ejecutar la llamada al procedimiento almacenado
                ResultSet resultSet = callableStatement.executeQuery();

                // Procesar los resultados
                while (resultSet.next()) {
                    String nombre = resultSet.getString("nombre");
                    int edad = resultSet.getInt("edad");
                    System.out.println("Nombre: " + nombre + ", Edad: " + edad);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
