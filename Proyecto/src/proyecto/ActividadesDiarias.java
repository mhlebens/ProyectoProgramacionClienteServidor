
package proyecto;

import java.util.Random;

public class ActividadesDiarias {

    public void dia() {
             int dia;
        String lista[]= new String[6];
    //llenado de la lista de actividades: 
    //estaba haciendo eso pero no se que le paso a mi compu y no me deja usar las variables
    //por lo que voy a escribir el código dentro de un metodo para que si alguno les sirve sin el metodo lo saque
    
        lista[0]="Se realizaran actividades en la piscina";
        lista[1]= "Se enseñaran trucos al perrito";
        lista[2]= "Se hará una carrera de obstaculos entre los perritos";
        lista[3]= "Se realizara la limpieza semanal de los perros";
        lista[4]="Se realizara un masaje a su perro";
        lista[5]="Los perros jugaran al aire libre";
        Random aleatorio = new Random();
        int aux = 0;
        aux = aleatorio.nextInt(0, 6);
        dia=aux;
    
}

    @Override
    public String toString(String lista[], int dia) {
        return super.toString()
                    +"-------Actividad diaria------"
                            +lista[dia];
    }
        
    
}
