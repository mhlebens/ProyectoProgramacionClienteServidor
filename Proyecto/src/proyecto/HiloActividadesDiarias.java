package proyecto;

class HiloActividadesDiarias extends Thread {

    private ActividadesDiarias actividades;

    public HiloActividadesDiarias(ActividadesDiarias actividades) {
        this.actividades = actividades;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(actividades.obtenerActividadDelDia());
                Thread.sleep(5000); // Cada 5 segundos se muestra una nueva actividad
            } catch (InterruptedException e) {
                System.out.println("Error en la actualización de actividades");
            }
        }
    }
}
