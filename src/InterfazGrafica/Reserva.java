
package InterfazGrafica;

import ConectarBD.ConexionBD;
import java.sql.Connection;

/**
 *
 * @author marif
 */
public class Reserva extends javax.swing.JFrame {

    //Para navegar por el MenuBar
    private MenuPrincipal menuPrincipal;
    
    //Constructor Principal
    public Reserva(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        
        //Conexión con la base de datos
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
        txtNomPerro = new javax.swing.JTextField();
        txtFechaIn = new javax.swing.JTextField();
        txtNomDueno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaSa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumHabitacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumReserva = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbMenuP = new javax.swing.JMenu();
        mitRegresarMP = new javax.swing.JMenuItem();
        mbCliente = new javax.swing.JMenu();
        mitRegistroP = new javax.swing.JMenuItem();
        mitRegistroD = new javax.swing.JMenuItem();
        mbReserva = new javax.swing.JMenu();
        mbActividadesD = new javax.swing.JMenu();
        mitGestionAD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del perro:");

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de Ingreso:");

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del dueño:");

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Salida:");

        txtNomPerro.setBackground(new java.awt.Color(220, 201, 201));
        txtNomPerro.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNomPerro.setForeground(new java.awt.Color(0, 0, 0));

        txtFechaIn.setBackground(new java.awt.Color(220, 201, 201));
        txtFechaIn.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtFechaIn.setForeground(new java.awt.Color(0, 0, 0));

        txtNomDueno.setBackground(new java.awt.Color(220, 201, 201));
        txtNomDueno.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNomDueno.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("A continuación, ingrese los datos necesarios para hacer la reserva");

        txtFechaSa.setBackground(new java.awt.Color(220, 201, 201));
        txtFechaSa.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtFechaSa.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("N° habitación:");

        txtNumHabitacion.setBackground(new java.awt.Color(220, 201, 201));
        txtNumHabitacion.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNumHabitacion.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("N° reserva:");

        txtNumReserva.setBackground(new java.awt.Color(220, 201, 201));
        txtNumReserva.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtNumReserva.setForeground(new java.awt.Color(0, 0, 0));

        txtDescuento.setBackground(new java.awt.Color(220, 201, 201));
        txtDescuento.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtDescuento.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descuento:");

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio Total");

        txtPrecioF.setBackground(new java.awt.Color(220, 201, 201));
        txtPrecioF.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtPrecioF.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPrecioF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(txtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaSa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(txtNomPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208)))
                        .addGap(50, 152, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaSa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomPerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNumHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPrecioF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Reservas");

        btnReservar.setBackground(new java.awt.Color(153, 102, 0));
        btnReservar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setActionCommand("");

        btnBuscar.setBackground(new java.awt.Color(204, 153, 0));
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
                        .addGap(52, 52, 52)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(768, 60));

        mbMenuP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Dog's House Icon.png"))); // NOI18N

        mitRegresarMP.setText("Regresar a menú principal");
        mitRegresarMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRegresarMPActionPerformed(evt);
            }
        });
        mbMenuP.add(mitRegresarMP);

        jMenuBar1.add(mbMenuP);

        mbCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Client Icon.png"))); // NOI18N
        mbCliente.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitRegistroP.setText("Registro de Perros");
        mitRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRegistroPActionPerformed(evt);
            }
        });
        mbCliente.add(mitRegistroP);

        mitRegistroD.setText("Registro de Dueños");
        mitRegistroD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitRegistroDActionPerformed(evt);
            }
        });
        mbCliente.add(mitRegistroD);

        jMenuBar1.add(mbCliente);

        mbReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Booking Icon.png"))); // NOI18N
        mbReserva.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jMenuBar1.add(mbReserva);

        mbActividadesD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/5.png"))); // NOI18N
        mbActividadesD.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitGestionAD.setText("Gestión de Actividades Diarias");
        mitGestionAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitGestionADActionPerformed(evt);
            }
        });
        mbActividadesD.add(mitGestionAD);

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

    //Regresar a Menú Principal
    private void mitRegresarMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRegresarMPActionPerformed
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mitRegresarMPActionPerformed

    //Ir a Registro de Perros
    private void mitRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRegistroPActionPerformed
        RegistroP regP = new RegistroP();
        regP.setVisible(true);
        regP.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mitRegistroPActionPerformed

    //Ir a Registro de Dueños
    private void mitRegistroDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitRegistroDActionPerformed
        RegistroD regD = new RegistroD(menuPrincipal);
        regD.setVisible(true);
        regD.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_mitRegistroDActionPerformed

    //Ir a Gestión Actividades Diarias
    private void mitGestionADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitGestionADActionPerformed
        Actividades actividades = new Actividades();
        actividades.setVisible(true);
        actividades.setLocationRelativeTo(null);
    }//GEN-LAST:event_mitGestionADActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mbActividadesD;
    private javax.swing.JMenu mbCliente;
    private javax.swing.JMenu mbMenuP;
    private javax.swing.JMenu mbReserva;
    private javax.swing.JMenuItem mitGestionAD;
    private javax.swing.JMenuItem mitRegistroD;
    private javax.swing.JMenuItem mitRegistroP;
    private javax.swing.JMenuItem mitRegresarMP;
    public javax.swing.JTextField txtDescuento;
    public javax.swing.JTextField txtFechaIn;
    public javax.swing.JTextField txtFechaSa;
    public javax.swing.JTextField txtNomDueno;
    public javax.swing.JTextField txtNomPerro;
    public javax.swing.JTextField txtNumHabitacion;
    public javax.swing.JTextField txtNumReserva;
    public javax.swing.JTextField txtPrecioF;
    // End of variables declaration//GEN-END:variables
}
