package Entidades;

public abstract class Reserva {
    private String fechaIngreso;
    private String fechaSalida;
    private double costoTotal;
    private int dias;
    private int numReserva;
    private double descuentos;
    
//constructor clase Reserva
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
                + "\nFecha de ingreso: " + getFechaIngreso()
                + "\nFecha de salida: " + getFechaSalida()
                + "\nDías reservados: " + getDias()
                + "\nNúmero de Reserva: " + getNumReserva()
                + "\nDescuentos aplicados: " + (getDescuentos() * 100) + " %";
    }
}
