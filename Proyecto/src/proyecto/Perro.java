package proyecto;

class Perro extends Reserva {
    
    //declaracion de atributos de la clase perro
    private String nombre;
    private int edad;
    private String raza;
    private String tamano;
    private boolean condicion = false;
    
//constructor de la clase perror
    public Perro(String nombre, int edad, String raza, String tamano, 
            //constructo de la clase Reserva
                 String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        super(fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }
    
    
    //getters y setters de la clase perro (nombre, edad, raza y tamaño)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    @Override
    public int calculoReserva() {
        /*calculo de la reserva: 
             -tipo de habitación: 
             --cantidad de noches: 
             -servicio adicional: 
         
         */
        return getDias() * 50; 
    }

    @Override
    public String toString() {
        return "------------Perrito-Cliente-----------" 
                + "\nNombre: " + getNombre()
                + "\nEdad: " + getEdad()
                + "\nRaza: " + getRaza()
                + "\nTamaño: " + getTamano();
    }
}