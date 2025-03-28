package proyecto;

public class HiloAsignarHabitacion extends Thread {

    private Cliente cliente;

    public HiloAsignarHabitacion(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            System.out.println("Asignando habitación para " + cliente.getNombre());
            Thread.sleep(2000); // Simulamos un tiempo de espera
            cliente.asignarHabitacion();
            System.out.println("Habitación asignada para " + cliente.getNombre());
        } catch (InterruptedException e) {
            System.out.println("Error al asignar habitación");
        }
    }
}
