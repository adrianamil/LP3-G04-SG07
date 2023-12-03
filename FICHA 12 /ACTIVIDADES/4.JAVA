import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class EjemploRowSet {

public static void main(String[] args) {
    
        String jdbcUrl = "jdbc:mysql://localhost:3306/actividad";
        String usuario = "root";
        String contrasena = "root";

        try {
            // Crear un JdbcRowSet
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            
            // Configurar la conexión
            rowSet.setUrl(jdbcUrl);
            rowSet.setUsername(usuario);
            rowSet.setPassword(contrasena);

            // Establecer la consulta
            rowSet.setCommand("SELECT * FROM clientes");

            // Ejecutar la consulta y cargar los datos en el RowSet
            rowSet.execute();

            // Iterar a través de los resultados
            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String nombre = rowSet.getString("nombre");
                String apellido = rowSet.getString("apellido");
                int edad = rowSet.getInt("edad");

                System.out.println("ID: " + id + ", Nombre: " + nombre + "Apellido;" + apellido + ", Edad: " + edad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
