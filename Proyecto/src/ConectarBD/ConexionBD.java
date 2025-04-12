package ConectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Variable que almacenará la conexión a la base de datos
    Connection con = null;

    // Nombre de la base de datos (debes asegurarte que esta existe en tu servidor MySQL)
    String base = "hotel_perros"; 
    
    // URL de conexión con el puerto
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root"; // Usuario
    String password = ""; // Contraseña 

     // Método público para obtener la conexión
    public Connection getConexion() {
        try {
            // Carga el driver JDBC para MySQL
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            // Si hay un error al conectar o al cargar el driver, lo muestra por consola
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}