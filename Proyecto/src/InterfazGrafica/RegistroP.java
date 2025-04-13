/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import ConectarBD.ConexionBD;
import java.sql.Connection;

/**
 *
 * @author marif
 */
public class RegistroP extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public RegistroP() {
        initComponents();
         ConexionBD conexion = new ConexionBD();
    Connection conn = conexion.getConexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombrePerro = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        cbTamano = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbPrincipal = new javax.swing.JMenu();
        mitRegresarMP = new javax.swing.JMenuItem();
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

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Raza:");

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tamaño:");

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("¿Presenta alguna condición en especial?");

        txtNombrePerro.setBackground(new java.awt.Color(220, 201, 201));
        txtNombrePerro.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNombrePerro.setForeground(new java.awt.Color(0, 0, 0));

        txtRaza.setBackground(new java.awt.Color(220, 201, 201));
        txtRaza.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));

        txtEdad.setBackground(new java.awt.Color(220, 201, 201));
        txtEdad.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));

        cbTamano.setBackground(new java.awt.Color(220, 201, 201));
        cbTamano.setEditable(true);
        cbTamano.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        cbTamano.setForeground(new java.awt.Color(0, 0, 0));
        cbTamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tamaño", "Pequeño", "Mediano", "Grande" }));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("Sí");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("No");

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("A continuación, ingrese los datos del perro, ya sea para registrarlo o buscarlo.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEdad)
                                    .addComponent(cbTamano, 0, 200, Short.MAX_VALUE))
                                .addGap(0, 53, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2)
                                .addGap(335, 335, 335)))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbTamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(34, 34, 34))
        );

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Perros");

        btnRegistrar.setBackground(new java.awt.Color(0, 153, 153));
        btnRegistrar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnRegistrar.setText("Registar");

        btnBuscar.setBackground(new java.awt.Color(0, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setAlignmentY(0.0F);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(768, 60));

        mbPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Dog's House Icon.png"))); // NOI18N

        mitRegresarMP.setText("Regresar al Menú Principal");
        mitRegresarMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRegresarMPActionPerformed(evt);
            }
        });
        mbPrincipal.add(mitRegresarMP);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitRegresarMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRegresarMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitRegresarMPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegistroP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbTamano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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
    private javax.swing.JMenuItem mitRegresarMP;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtNombrePerro;
    public javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
