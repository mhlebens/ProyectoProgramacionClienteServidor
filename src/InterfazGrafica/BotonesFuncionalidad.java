package InterfazGrafica;

import ConectarBD.ConexionBD;
import Entidades.Perro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Servicios.ActividadesDiarias;

public class BotonesFuncionalidad {

    ConexionBD conexion = new ConexionBD(); // Objeto para obtener conexión

    // ============== FUNCIONALIDAD PARA REGISTROP ==============

    // Método para registrar un perro en la base de datos
    public boolean registrarPerro(Perro perro) {
        Connection con = conexion.getConexion();

        if (con != null) {
            String sql = "INSERT INTO perros (nombre, edad, raza, tamano, condicion, fecha_ingreso, fecha_salida, dias, num_reserva, descuentos, costo_total) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, perro.getNombrePerro());
                ps.setInt(2, perro.getEdad());
                ps.setString(3, perro.getRaza());
                ps.setString(4, perro.getTamano());
                ps.setBoolean(5, perro.isCondicion());
                ps.setString(6, perro.getFechaIngreso());
                ps.setString(7, perro.getFechaSalida());
                ps.setInt(8, perro.getDias());
                ps.setInt(9, perro.getNumReserva());
                ps.setDouble(10, perro.getDescuentos());
                ps.setDouble(11, perro.calculoReserva());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro guardado correctamente.");
                return true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al registrar: " + e.getMessage());
            }
        }
        return false;
    }

    // Método para buscar un perro por nombre
    public boolean buscarPerroPorNombre(String nombreBuscado) {
    Connection con = conexion.getConexion();

    if (con != null) {
        String sql = "SELECT * FROM perros WHERE nombre = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreBuscado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Mostrar los datos directamente (o llenar el objeto desde afuera)
                String datos = "Nombre: " + rs.getString("nombre") +
                               "\nEdad: " + rs.getInt("edad") +
                               "\nRaza: " + rs.getString("raza") +
                               "\nTamaño: " + rs.getString("tamano") +
                               "\nCondición: " + (rs.getBoolean("condicion") ? "Sí" : "No") +
                               "\nFecha Ingreso: " + rs.getString("fecha_ingreso") +
                               "\nFecha Salida: " + rs.getString("fecha_salida") +
                               "\nDías: " + rs.getInt("dias") +
                               "\nReserva N°: " + rs.getInt("num_reserva") +
                               "\nDescuentos: " + rs.getDouble("descuentos") +
                               "\nCosto Total: " + rs.getDouble("costo_total");

                JOptionPane.showMessageDialog(null, datos);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Perro no encontrado.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        }
    }

    return false;
}

    // ============== FUNCIONALIDAD PARA REGISTROD ==============

    // Método para registrar un dueño en la base de datos
    public boolean registrarDueno(String nombreDueno, String correo, String telefono, String nombrePerro) {
    Connection con = conexion.getConexion();

    if (con != null) {
        String sql = "INSERT INTO duenos (nombre_dueno, correo, telefono, nombre_perro) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreDueno);
            ps.setString(2, correo);
            ps.setString(3, telefono);
            ps.setString(4, nombrePerro);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dueño registrado correctamente.");
            return true; 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar dueño: " + e.getMessage());
        }
    }

    return false; 
}

    // Método para buscar un dueño por nombre
    public boolean buscarDuenoPorNombre(String nombreBuscado) {
    Connection con = conexion.getConexion();

    if (con != null) {
        String sql = "SELECT * FROM duenos WHERE nombre_dueno = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreBuscado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String datos = "Nombre: " + rs.getString("nombre_dueno")
                             + "\nCorreo: " + rs.getString("correo")
                             + "\nTeléfono: " + rs.getString("telefono")
                             + "\nNombre del Perro: " + rs.getString("nombre_perro");

                JOptionPane.showMessageDialog(null, datos);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Dueño no encontrado.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar dueño: " + e.getMessage());
        }
    }

    return false; 
}

    // funcionalidad de servicios

    // Método para registrar una reserva de servicio
    public void registrarServicio(String nombrePerro, String tipoServicio, String fechaInicio, String fechaFin, int dias, double costoPorDia) {
        Connection con = conexion.getConexion();

        if (con != null) {
            String sql = "INSERT INTO servicios (nombre_perro, tipo_servicio, fecha_inicio, fecha_fin, dias, costo_por_dia, costo_total) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, nombrePerro);
                ps.setString(2, tipoServicio);
                ps.setString(3, fechaInicio);
                ps.setString(4, fechaFin);
                ps.setInt(5, dias);
                ps.setDouble(6, costoPorDia);
                ps.setDouble(7, dias * costoPorDia); // cálculo directo

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Servicio reservado correctamente.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al registrar servicio: " + e.getMessage());
            }
        }
    }

    // Método para buscar una reserva de servicio por el nombre del perro
    public void buscarServicioPorNombrePerro(String nombreBuscado) {
        Connection con = conexion.getConexion();

        if (con != null) {
            String sql = "SELECT * FROM servicios WHERE nombre_perro = ?";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, nombreBuscado);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String datos = "Nombre del Perro: " + rs.getString("nombre_perro")
                                 + "\nTipo de Servicio: " + rs.getString("tipo_servicio")
                                 + "\nFecha Inicio: " + rs.getString("fecha_inicio")
                                 + "\nFecha Fin: " + rs.getString("fecha_fin")
                                 + "\nDías: " + rs.getInt("dias")
                                 + "\nCosto por Día: " + rs.getDouble("costo_por_dia")
                                 + "\nCosto Total: " + rs.getDouble("costo_total");

                    JOptionPane.showMessageDialog(null, datos);
                } else {
                    JOptionPane.showMessageDialog(null, "Servicio no encontrado.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al buscar servicio: " + e.getMessage());
            }
        }
    }
    // ============== FUNCIONALIDAD PARA ACTIVIDADES ==============

// Método para obtener 6 actividades aleatorias del día
public java.util.List<String> obtenerActividadesAleatorias() {
    ActividadesDiarias generador = new ActividadesDiarias();
    java.util.Set<String> actividadesUnicas = new java.util.HashSet<>();

    // Generar 6 actividades únicas
    while (actividadesUnicas.size() < 6) {
        String actividad = generador.obtenerActividadDelDia();
        actividadesUnicas.add(actividad);
    }

    return new java.util.ArrayList<>(actividadesUnicas);
}

    }

