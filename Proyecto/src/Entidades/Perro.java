package Entidades;

public class Perro extends Reserva {
    private String nombrePerro;
    private int edad;
    private String raza;
    private String tamano;
    private boolean condicion = false;

    public Perro(String nombre, int edad, String raza, String tamano, 
                 String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        super(fechaIngreso, fechaSalida, dias, numReserva, Descuentos, costoTotal);
        this.nombrePerro = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombre(String nombre) {
        this.nombrePerro = nombre;
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
                + "\nNombre: " + nombrePerro
                + "\nEdad: " + edad
                + "\nRaza: " + raza
                + "\nTamaño: " + tamano;
    }
}