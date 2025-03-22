package proyecto;

class Perro extends Reserva {
    private String nombre;
    private int edad;
    private String raza;
    private String tamano;
    private boolean condicion = false;

    public Perro(String nombre, int edad, String raza, String tamano, 
                 String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        super(fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }

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
        return getDias() * 50; 
    }

    @Override
    public String toString() {
        return "------------Perrito-Cliente-----------" 
                + "\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nRaza: " + raza
                + "\nTamaño: " + tamano;
    }
}