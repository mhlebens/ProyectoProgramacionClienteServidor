package proyecto;

//import java.util.Random;


public class habitacion extends Perro{
    private String numHabitacion;
    private String tipo;
    private boolean disponibilidad;
    private String mensaje;
    //private int numeroCuarto;
    
//constructor de la clase habitacion
    public habitacion(String numHabitacion, String tipo, boolean disponibilidad, 
            //constructor de la clase perro
            String nom, int edad, String raza, String tamano, 
            //constructor de la clase reserva
            String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        super(nom, edad, raza, tamano, fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);
        this.numHabitacion = numHabitacion;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        if (disponibilidad==true) {
            mensaje="libre";
        } else {
            mensaje="Ocupado";
        }
        this.mensaje = mensaje;
    }
       
/*
    public int getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setNumeroCuarto(int numeroCuarto) {
        Random aleatorio = new Random();
        int aux = 0;
        aux = aleatorio.nextInt(1, 8);
        numeroCuarto=aux;
        this.numeroCuarto = numeroCuarto;
    }
*/
        
    @Override
    public String toString() {
        return super.toString()+
                "\n-----------Habitaciones:---------"
                +"\nHabitacion" +getNumHabitacion()
                + "\nTipo=" + getTipo() 
                + "\nDisponibilidad"+ getMensaje();
    }

   
        
}
