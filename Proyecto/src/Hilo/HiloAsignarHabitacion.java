package Hilo;

import Entidades.Cliente;

public class HiloAsignarHabitacion extends Thread {

    // Referencia al cliente al que se le va a asignar una habitación
    private Cliente cliente;

    // Constructor que recibe el cliente
    public HiloAsignarHabitacion(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            // Muestra mensaje indicando el inicio del proceso de asignación
            System.out.println("Asignando habitación para " + cliente.getNombrePerro());
            // Simula un retardo de 2 segundos antes de asignar la habitación
            Thread.sleep(2000); // Simulamos un tiempo de espera
            // Llama al método que asigna la habitación en el objeto cliente
            cliente.asignarHabitacion();
            // Muestra mensaje indicando que la habitación fue asignada
            System.out.println("Habitación asignada para " + cliente.getNombrePerro());
        } catch (InterruptedException e) {
            // Captura cualquier interrupción del hilo durante el sleep
            System.out.println("Error al asignar habitación");
        }
    }
}
