package Entidades;

public abstract class Reserva {
    private String fechaIngreso;
    private String fechaSalida;
    private double costoTotal;
    private int dias;
    private int numReserva;
    private double descuentos;

    public Reserva(String fechaIngreso, String fechaSalida, int dias, int numReserva, double Descuentos, double costoTotal) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.dias = dias;
        this.numReserva = numReserva;
        this.descuentos = Descuentos;
        this.costoTotal = costoTotal;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double Descuentos) {
        this.descuentos = Descuentos;
    }

    public abstract int calculoReserva(); // Método abstracto

    @Override
    public String toString() {
        return "\n---------------Factura Reserva--------------" 
                + "\nFecha de ingreso: " + fechaIngreso
                + "\nFecha de salida: " + fechaSalida
                + "\nDías reservados: " + dias
                + "\nNúmero de Reserva: " + numReserva
                + "\nDescuentos aplicados: " + (descuentos * 100) + " %";
    }
}