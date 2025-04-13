package Hilo;

import Servicios.ActividadesDiarias;

public class HiloActividadesDiarias extends Thread {

    // Referencia a una clase que define las actividades diarias
    private ActividadesDiarias actividades;

    // Constructor que recibe un objeto que implementa ActividadesDiarias
    public HiloActividadesDiarias(ActividadesDiarias actividades) {
        this.actividades = actividades;
    }

    // Método que se ejecuta cuando se inicia el hilo
    @Override
    public void run() {
        // Bucle infinito para repetir indefinidamente
        while (true) {
            try {
                // Muestra una actividad diaria (supuestamente aleatoria o del día)
                System.out.println(actividades.obtenerActividadDelDia());
                
                // Pausa la ejecución del hilo por 5 segundos (5000 milisegundos)
                Thread.sleep(5000); // Cada 5 segundos se muestra una nueva actividad
            } catch (InterruptedException e) {
                // Manejo de error si el hilo es interrumpido durante el sleep
                System.out.println("Error en la actualización de actividades");
            }
        }
    }
}
