package proyecto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.ArrayList; 

public class ArchivoUtil {

    public static void guardarClientesEnArchivo(List<Cliente> clientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("clientes.txt"))) {
            for (Cliente cliente : clientes) {
                
                writer.write(cliente.getNombreDueño() + "," +
                             cliente.getTelefono() + "," +
                             cliente.getCorreo() + "," +
                             cliente.getNombrePerro() + "," +
                             cliente.getEdad() + "," +
                             cliente.getRaza() + "," +
                             cliente.getTamano() + "," +
                             cliente.getFechaIngreso() + "," +
                             cliente.getFechaSalida() + "," +
                             cliente.getDias() + "," +
                             cliente.getNumReserva() + "," +
                             cliente.getDescuentos() + "," +
                             cliente.getCostoTotal());
                writer.newLine();  
            }
            System.out.println("Clientes guardados correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar clientes en el archivo: " + e.getMessage());
        }
    }

    public static List<Cliente> leerClientesDesdeArchivo() {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("clientes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] datos = line.split(",");
               
                Cliente cliente = new Cliente(
                        datos[0],  // Nombre del dueño
                        datos[1],  // Teléfono
                        datos[2],  // Correo
                        datos[3],  // Nombre del perro
                        Integer.parseInt(datos[4]),  // Edad
                        datos[5],  // Raza
                        datos[6],  // Tamaño
                        datos[7],  // Fecha de ingreso
                        datos[8],  // Fecha de salida
                        Integer.parseInt(datos[9]),  // Días
                        Integer.parseInt(datos[10]), // Número de reserva
                        Double.parseDouble(datos[11]), // Descuento
                        Double.parseDouble(datos[12])  // Costo total
                );
                clientes.add(cliente);
            }
            System.out.println("Clientes leídos correctamente desde el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer clientes desde el archivo: " + e.getMessage());
        }
        return clientes;
    }
}
