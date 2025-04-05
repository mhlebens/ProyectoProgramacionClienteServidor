package proyecto;

class Cliente extends Perro implements ServicioAdicional {

    //Atributos de la clase Cliente
    private String nombreDueño;
    private String telefono;
    private String correo;
    private String habitacion;
        
    //Constructor de la clas Cliente
    public Cliente(String nombreDueño, String telefono, String correo,
            //constructor de la clase perro
            String nombrePerro, int edad, String raza, String tamano,
            //Constructor de la clase RESERVA 
            String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        super(nombrePerro, edad, raza, tamano, fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);
        this.nombreDueño = nombreDueño;
        this.telefono = telefono;
        this.correo = correo;
    }
    
     public String getCorreo() {
         return correo;
     }
 
     public void setCorreo(String correo) {
         this.correo = correo;
     }
 
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

    @Override
    public void asignarHabitacion() {
        this.habitacion = "Habitación Premium"; // Ejemplo de asignación
    }

    @Override
    public void aplicarDescuento() {
        System.out.println("Aplicando descuento para " + getNombreDueño());
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
                + "\nNombre: " + getNombreDueño()
                + "\nTeléfono: " + getTelefono()
                + "\nCorreo Electrónico: " + getCorreo()
                + "\nHabitación asignada: " + habitacionTexto;
    }
}