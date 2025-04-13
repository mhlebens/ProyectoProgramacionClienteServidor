package InterfazGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JOptionPane;
import Entidades.Cliente;
import Entidades.Perro;
import ConectarBD.BotonesFuncionalidad;

public class ControladorBD implements ActionListener {
    //instancia de la clase Cliente, porque es la última que recibe la herencia de las clases
    //por lo que recolecta todos los atributos y metodos de las clases anteriores (habitacion, perro y Reserva)

    private final Cliente persona;
    private final Perro perrito;
    //instancia del formularios para manejar la base de datos
    private final RegistroP registro;
    private final Servicios reserva;
    private final MenuPrincipal menu;
    //instancia de la clase donde se brinda la funcionalidad de los botones
    private final BotonesFuncionalidad botones;

    //constructor para inicializar las instancias
    public ControladorBD(Cliente persona, Perro perrito, RegistroP registro, Servicios reserva, MenuPrincipal menu, BotonesFuncionalidad botones) {
        this.persona = persona;
        this.perrito = perrito;
        this.registro = registro;
        this.reserva = reserva;
        this.menu = menu;
        this.botones = botones;

        //inicializacion de la accion de cickear el boton
        //botones del dormulario de registro
        this.registro.btnBuscar.addActionListener(this);
        this.registro.btnRegistrar.addActionListener(this);
        //botones del forumulario de la reserva
        this.reserva.btnReservar.addActionListener(this);
        this.reserva.btnBuscar.addActionListener(this);
    }

    public void iniciar() {
        menu.setTitle("Hotel para Perros");
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }

    public void limpiarRegistro() {
        registro.txtNombrePerro.setText("");
        registro.txtEdad.setText("");
        registro.txtRaza.setText("");
        //falta el combo box
    }

    public void limpiarReserva() {
        reserva.txtNumReserva.setText("");
        reserva.txtFechaIn.setText("");
        reserva.txtFechaSa.setText("");
        reserva.txtNomPerro.setText("");
        reserva.txtNomDueno.setText("");
        reserva.txtNumHabitacion.setText("");
        reserva.txtDescuento.setText("");
        reserva.txtPrecioF.setText("");
    }

    
    //implemntacion de la accion de presionar los botones
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    /*
    
        //boton de registrar
        if (e.getSource() == registro.btnRegistrar) {
            perrito.setNombrePerro(registro.txtNombrePerro.getText());
            perrito.setRaza(registro.txtRaza.getText());

            /* Espacio para el combo box, 
            perrito.setTamano(registro.cbTamano.getText()));
             
            perrito.setEdad(Integer.parseInt(registro.txtEdad.getText()));

            if (botones.registrar(perrito)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiarRegistro();

            } else {
                JOptionPane.showMessageDialog(null, "Error modificar");
                limpiarRegistro();
            }
        }

        //boton buscar
        if (e.getSource() == registro.btnBuscar) {
            perrito.setNombrePerro(registro.txtNombrePerro.getText());
            if (botones.buscar(registro)) {
                registro.txtEdad.setText(String.valueOf(perrito.getEdad()));
                registro.txtNombrePerro.setText(perrito.getNombrePerro());
                registro.txtRaza.setText(perrito.getRaza());
                /*espacio para el combo box
                registro.cbTamano.setText(String.valueOf(perrito.getTamano()));

                JOptionPane.showMessageDialog(null, "Registro encontrado");

            } else {
                JOptionPane.showMessageDialog(null, "Error no se encontro el registro");
                limpiarRegistro();
            }
        }
    
        //--------------------------------------------------------------------------------------------------------------
        //Aqui inician los botones del formulario Servicios
         if (e.getSource() == reserva.btnReservar) {
            persona.setFechaIngreso(reserva.txtFechaIn.getText());
            persona.setFechaSalida(reserva.txtFechaSa.getText());
            persona.setNombrePerro(reserva.txtNomPerro.getText());
            persona.setNombreDueño(reserva.txtNomDueno.getText());
            persona.setDescuentos(Double.parseDouble(reserva.txtDescuento.getText()));
         

            if (botones.reservar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiarReserva();

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiarReserva();
            }
            
            //boton de buscar
            
              if (e.getSource() == reserva.btnBuscar) {
            persona.setNumReserva(Integer.parseInt(reserva.txtNumReserva.getText()));
            if (botones.buscar(reserva)) {
                reserva.txtNumReserva.setText(String.valueOf(persona.getNumReserva()));
                reserva.txtFechaIn.setText(persona.getFechaIngreso());
                reserva.txtFechaSa.setText(persona.getFechaSalida());
                reserva.txtNomPerro.setText(persona.getNombrePerro());
                reserva.txtNomDueno.setText(persona.getNombreDueño());
                reserva.txtNumHabitacion.setText(String.valueOf(persona.getNumHabitacion()));
                reserva.txtDescuento.setText(String.valueOf(persona.getDescuentos()));
                reserva.txtPrecioF.setText(String.valueOf(persona.getCostoTotal()));
           
                JOptionPane.showMessageDialog(null, "Registro encontrado");

            } else {
                JOptionPane.showMessageDialog(null, "Error no se encontro el registro");
                limpiarRegistro();
            }
        }
*/
    
            
        }
        

    
    
       

    
}



