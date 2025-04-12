package InterfazGrafica;

import BD.BDfrm;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JOptionPane;
import Entidades.Cliente;
import ConectarBD.BotonesFuncionalidad;

public class ControladorBD {
     //instancia de la clase Cliente, porque es la última que recibe la herencia de las clases
    //por lo que recolecta todos los atributos y metodos de las clases anteriores (habitacion, perro y Reserva)
    private final Cliente reserva;
    //instancia del formularios para manejar la base de datos
    private final BDfrm formulario;
    //instancia de la clase donde se brinda la funcionalidad de los botones
    private final BotonesFuncionalidad botones;

    public ControladorBD(Cliente reserva, BDfrm formulario, BotonesFuncionalidad botones) {
        this.reserva = reserva;
        this.formulario = formulario;
        this.botones = botones;
        //inicializacion de los botones del formulario
        this.formulario.btnBuscar.addActionListener(this);
        this.formulario.btnGuardar.addActionListener(this);
        this.formulario.btnModificar.addActionListener(this);
    }
    
     public void iniciar() {
        formulario.setTitle("Control de Reservas");
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }
     
      public void limpiar() {
        formulario.txtCedula.setText("");
        formulario.txtEmail.setText("");
        formulario.txtNombre.setText("");
        formulario.txtTelefono.setText("");
}
      //implemntacion de la accion de presionar los botones
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
