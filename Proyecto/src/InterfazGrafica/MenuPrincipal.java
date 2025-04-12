/*

 */
package InterfazGrafica;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marif
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazGrafica2
     */
    public MenuPrincipal() {
        initComponents();
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbPrincipal = new javax.swing.JMenu();
        mbCliente = new javax.swing.JMenu();
        mitRegistrar = new javax.swing.JMenuItem();
        mitBuscar = new javax.swing.JMenuItem();
        mitListaT = new javax.swing.JMenuItem();
        mbReservas = new javax.swing.JMenu();
        mitCrearNR = new javax.swing.JMenuItem();
        mitBuscarR = new javax.swing.JMenuItem();
        mitCancelarR = new javax.swing.JMenuItem();
        mbServiciosE = new javax.swing.JMenu();
        mitAgregarSE = new javax.swing.JMenuItem();
        mitListaSE = new javax.swing.JMenuItem();
        mbActividadesD = new javax.swing.JMenu();
        mitAgendarAD = new javax.swing.JMenuItem();
        mitListaAD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Frame de MenuInicial.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(768, 60));

        mbPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Dog's House Icon.png"))); // NOI18N
        jMenuBar1.add(mbPrincipal);

        mbCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Client Icon.png"))); // NOI18N
        mbCliente.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitRegistrar.setText("Registrar");
        mbCliente.add(mitRegistrar);

        mitBuscar.setText("Buscar");
        mbCliente.add(mitBuscar);

        mitListaT.setText("Lista Total");
        mbCliente.add(mitListaT);

        jMenuBar1.add(mbCliente);

        mbReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Booking Icon.png"))); // NOI18N
        mbReservas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitCrearNR.setText("Crear Nueva Reserva");
        mbReservas.add(mitCrearNR);

        mitBuscarR.setText("Buscar Reserva");
        mbReservas.add(mitBuscarR);

        mitCancelarR.setText("Cancelar Reserva");
        mbReservas.add(mitCancelarR);

        jMenuBar1.add(mbReservas);

        mbServiciosE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ExtraServices Icon.png"))); // NOI18N
        mbServiciosE.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitAgregarSE.setText("Agregar Servicio Extra");
        mbServiciosE.add(mitAgregarSE);

        mitListaSE.setText("Lista de Servicios Extras");
        mbServiciosE.add(mitListaSE);

        jMenuBar1.add(mbServiciosE);

        mbActividadesD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/5.png"))); // NOI18N
        mbActividadesD.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitAgendarAD.setText("Agendar Actividades Diarias");
        mbActividadesD.add(mitAgendarAD);

        mitListaAD.setText("Lista de Actividades Diarias");
        mbActividadesD.add(mitListaAD);

        jMenuBar1.add(mbActividadesD);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mbActividadesD;
    private javax.swing.JMenu mbCliente;
    private javax.swing.JMenu mbPrincipal;
    private javax.swing.JMenu mbReservas;
    private javax.swing.JMenu mbServiciosE;
    private javax.swing.JMenuItem mitAgendarAD;
    private javax.swing.JMenuItem mitAgregarSE;
    private javax.swing.JMenuItem mitBuscar;
    private javax.swing.JMenuItem mitBuscarR;
    private javax.swing.JMenuItem mitCancelarR;
    private javax.swing.JMenuItem mitCrearNR;
    private javax.swing.JMenuItem mitListaAD;
    private javax.swing.JMenuItem mitListaSE;
    private javax.swing.JMenuItem mitListaT;
    private javax.swing.JMenuItem mitRegistrar;
    // End of variables declaration//GEN-END:variables
}
