package ConectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    Connection con = null;

    String base = "hotel_perros"; // Asegurate que esta sea tu base de datos correcta
    String url = "jdbc:mysql://localhost:3306/" + base;
    String user = "root"; // Usuario
    String password = ""; // Contraseña (ajustala si es necesario)

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // Para connector 5.1.39
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return con;
    }
}
