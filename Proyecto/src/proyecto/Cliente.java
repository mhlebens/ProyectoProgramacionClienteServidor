package proyecto;

class Cliente extends Perro implements ServicioAdicional {

    private String nombreDueño;
    private String telefono;
    private String correo;
    private String habitacion;

    public Cliente(String nombreDueño, String telefono, String correo,
            String nombrePerro, int edad, String raza, String tamano,
            String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        super(nombrePerro, edad, raza, tamano, fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);
        this.nombreDueño = nombreDueño;
        this.telefono = telefono;
        this.correo = correo;
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
        String habitacionTexto;
        if (habitacion != null) {
            habitacionTexto = habitacion;
        } else {
            habitacionTexto = "No asignada";
        }

        return super.toString() + "\n---------Dueño del perro: ------------"
                + "\nNombre: " + nombreDueño
                + "\nTeléfono: " + telefono
                + "\nCorreo Electrónico: " + correo
                + "\nHabitación asignada: " + habitacionTexto;
    }
}