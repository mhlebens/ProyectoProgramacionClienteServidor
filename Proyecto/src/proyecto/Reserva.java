package proyecto;


public abstract class Reserva {
    private String fechaIngreso;
    private String fechaSalida;
    private double costoTotal;
    private int dias;
    private int numReserva;
    
    private double Descuentos;
    
    //metodo abstracto para calcular el costo de reserva
    public abstract int calculoReserva();

    public Reserva(String fechaIngreso, String fechaSalida, int dias,int numReserva,  double Descuentos, double costoTotal) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costoTotal = costoTotal;
        this.numReserva = numReserva;
        this.Descuentos = Descuentos;
    }

    public double getDescuentos() {
        return Descuentos;
    }

    public void setDescuentos(double Descuentos) {
        this.Descuentos = Descuentos;
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

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }
   
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    @Override
    public String toString() {
        return super.toString()+
                "\n---------------Factura Reserva--------------" 
                + "\nFecha de ingreso del perro: " + getFechaIngreso() 
                + "\nFecha de salida del perro: " + getFechaSalida()
                +"\nDias reservados: "+getDias()
                +  "\nNumero de Reserva: " + getNumReserva() 
                +  "\nDescuentos aplicados: " + getDescuentos()*100+" %" ;
    }
    
}
