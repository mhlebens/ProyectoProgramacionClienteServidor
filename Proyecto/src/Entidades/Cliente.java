package Entidades;

import Servicios.ServicioAdicional;

public class Cliente extends Habitacion implements ServicioAdicional {

    //Atributos de la clase Cliente
    private String nombreDueño;
    private String telefono;
    private String correo;
    private String habitacion;

    // Constructor adicional para leer desde archivo (más corto)
    public Cliente(String nombreDueño, String telefono, String correo, String nombrePerro,
                   int edad, String raza, String tamano, String fechaIngreso, String fechaSalida,
                   int dias, int numReserva, double Descuentos, double costoTotal) {

        // Usamos super() con valores por defecto para los parámetros que no vienen del archivo
        super("", "", true, "", nombrePerro, edad, raza, tamano, fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);

        this.nombreDueño = nombreDueño;
        this.telefono = telefono;
        this.correo = correo;
        this.habitacion = ""; // lo puedes dejar en blanco o null si no lo tienes en el archivo
    }

  
    
    
    
    //Métodos Getters y Setter

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void asignarHabitacion() {
        this.habitacion = "Habitación Premium"; // Ejemplo de asignación
    }

    @Override
    public void aplicarDescuento() {
        System.out.println("Aplicando descuento para " + nombreDueño);
    }

    @Override
    public String toString() {
        // Variable local para almacenar el texto de la habitación
        String habitacionTexto;
        if (habitacion != null) {
            habitacionTexto = habitacion; // Si se cumple, usa ese valor
        } else {
            habitacionTexto = "No asignada"; // Si no se cumple, indica que no hay habitación asignada
        }

        // Retorna una cadena que representa toda la información del cliente y del perro
        // Incluye también la llamada al método toString() de la clase padre (Perro)
        return super.toString() + "\n---------Dueño del perro: ------------"
                + "\nNombre: " + getNombreDueño() // Agrega el nombre del dueño
                + "\nTeléfono: " + getTelefono() // Agrega el teléfono del dueño
                + "\nCorreo Electrónico: " + getCorreo()  // Agrega el correo del dueño
                + "\nHabitación asignada: " + habitacionTexto; // Muestra la habitación asignada 
                                                               //(o "No asignada")
    }
}
