package Servicios;

import java.util.Random;

public class ActividadesDiarias {

    private static final String[] ACTIVIDADES = {
        "Se realizarán actividades en la piscina",
        "Se enseñarán trucos al perrito",
        "Se hará una carrera de obstáculos entre los perritos",
        "Se realizará la limpieza semanal de los perros",
        "Se realizará un masaje a su perro",
        "Los perros jugarán al aire libre"
    };

    public String obtenerActividadDelDia() {
        Random aleatorio = new Random();
        int dia = aleatorio.nextInt(ACTIVIDADES.length);
        return ACTIVIDADES[dia];
    }

    @Override
    public String toString() {
        return "------- Actividad diaria ------\n" + obtenerActividadDelDia();
    }
}