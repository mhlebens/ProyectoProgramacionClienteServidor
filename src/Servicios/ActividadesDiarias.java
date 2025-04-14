package Servicios;

import java.util.Random;

public class ActividadesDiarias {

    private static final String[] ACTIVIDADES = {
        "Se realizarán actividades en la piscina",
        "Se enseñarán trucos al perrito",
        "Se hará una carrera de obstáculos entre los perritos",
        "Se realizará la limpieza semanal de los perros",
        "Se realizará un masaje a su perro",
        "Los perros jugarán al aire libre",
        "Se tomarán fotos profesionales de los perritos",
        "Se realizará una caminata guiada con los cuidadores",
        "Hora de juegos con pelotas y juguetes",
        "Se preparará comida especial para los perritos",
        "Momento de relajación con música suave",
        "Pintura de huellitas para recuerdo del dueño"
    };

    public String obtenerActividadDelDia() {
        Random aleatorio = new Random();
        int dia = aleatorio.nextInt(ACTIVIDADES.length);
        return ACTIVIDADES[dia];
    }
    
    public String[] generarListaSinRepetir(int cantidad) {
        String[] copia = new String[ACTIVIDADES.length];
        boolean[] usados = new boolean[ACTIVIDADES.length];
        Random rand = new Random();
        String[] resultado = new String[Math.min(cantidad, ACTIVIDADES.length)];

        int count = 0;
        while (count < resultado.length) {
            int index = rand.nextInt(ACTIVIDADES.length);
            if (!usados[index]) {
                resultado[count] = ACTIVIDADES[index];
                usados[index] = true;
                count++;
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "------- Actividad diaria ------\n" + obtenerActividadDelDia();
    }
}