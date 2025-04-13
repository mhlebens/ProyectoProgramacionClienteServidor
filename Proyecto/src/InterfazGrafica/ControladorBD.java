package InterfazGrafica;


import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JOptionPane;
import Entidades.Cliente;
import ConectarBD.BotonesFuncionalidad;

public class ControladorBD {
     //instancia de la clase Cliente, porque es la última que recibe la herencia de las clases
    //por lo que recolecta todos los atributos y metodos de las clases anteriores (habitacion, perro y Reserva)
    private final Cliente persona;
    //instancia del formularios para manejar la base de datos
    private final RegistroP registro;
    private final Servicios reserva;
    private final MenuPrincipal menu;
    //instancia de la clase donde se brinda la funcionalidad de los botones
    private final BotonesFuncionalidad botones;

    public ControladorBD(Cliente persona, RegistroP registro, Servicios reserva, MenuPrincipal menu, BotonesFuncionalidad botones) {
        this.persona = persona;
        this.registro = registro;
        this.reserva = reserva;
        this.menu = menu;
        this.botones = botones;
    }

   
    
    

   

}
