package InterfazGrafica;

import Servicios.ActividadesDiarias;

public class Actividades extends javax.swing.JFrame {

    public Actividades() {
        initComponents();
    }

    private void mostrarActividades() {
        ActividadesDiarias actividades = new ActividadesDiarias();

        // Llenar los 6 campos de texto con una actividad diferente
        txtActividad.setText(actividades.obtenerActividadDelDia());
        txtActividad2.setText(actividades.obtenerActividadDelDia());
        txtActividad3.setText(actividades.obtenerActividadDelDia());
        txtActividad4.setText(actividades.obtenerActividadDelDia());
        txtActividad5.setText(actividades.obtenerActividadDelDia());
        txtActividad6.setText(actividades.obtenerActividadDelDia());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtActividad2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtActividad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtActividad3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtActividad4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtActividad5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtActividad6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Listar = new javax.swing.JButton();
        NuevaLista = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbPrincipal = new javax.swing.JMenu();
        mitRegresarMP = new javax.swing.JMenuItem();
        mbCliente = new javax.swing.JMenu();
        mitRegistrar = new javax.swing.JMenuItem();
        mbReservas = new javax.swing.JMenu();
        mitCrearNR = new javax.swing.JMenuItem();
        mbActividadesD = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel7.setText("A continuación se presenta una lista con distintas actividades por realizar:");

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel9.setText("Actividad N°1");

        txtActividad2.setBackground(new java.awt.Color(220, 201, 201));
        txtActividad2.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel10.setText("Actividad N°2");

        txtActividad.setBackground(new java.awt.Color(220, 201, 201));
        txtActividad.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel11.setText("Actividad N°3");

        txtActividad3.setBackground(new java.awt.Color(220, 201, 201));
        txtActividad3.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel12.setText("Actividad N°4");

        txtActividad4.setBackground(new java.awt.Color(220, 201, 201));
        txtActividad4.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel13.setText("Actividad N°5");

        txtActividad5.setBackground(new java.awt.Color(220, 201, 201));
        txtActividad5.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel14.setText("Actividad N°6");

        txtActividad6.setBackground(new java.awt.Color(220, 201, 201));
        txtActividad6.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividad6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividad5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividad4, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividad3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtActividad2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtActividad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtActividad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtActividad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtActividad5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txtActividad6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actividades Diarias");

        Listar.setBackground(new java.awt.Color(255, 204, 0));
        Listar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        Listar.setText("Listar");
        Listar.setActionCommand("");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });

        NuevaLista.setBackground(new java.awt.Color(204, 153, 0));
        NuevaLista.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        NuevaLista.setText("Nueva Lista");
        NuevaLista.setAlignmentY(0.0F);
        NuevaLista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NuevaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaListaActionPerformed(evt);
            }
        });

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
                        .addGap(205, 205, 205)
                        .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(NuevaLista))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1)))
                .addContainerGap(112, Short.MAX_VALUE))
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
                    .addComponent(Listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NuevaLista))
                .addGap(135, 135, 135))
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

        jMenuBar1.add(mbCliente);

        mbReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Booking Icon.png"))); // NOI18N
        mbReservas.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        mitCrearNR.setText("Crear Nueva Reserva");
        mbReservas.add(mitCrearNR);

        jMenuBar1.add(mbReservas);

        mbActividadesD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/5.png"))); // NOI18N
        mbActividadesD.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
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

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        mostrarActividades();
    }//GEN-LAST:event_ListarActionPerformed

    private void NuevaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaListaActionPerformed
        ActividadesDiarias actividades = new ActividadesDiarias();
        String[] lista = actividades.generarListaSinRepetir(6);

        txtActividad.setText(lista[0]);
        txtActividad2.setText(lista[1]);
        txtActividad3.setText(lista[2]);
        txtActividad4.setText(lista[3]);
        txtActividad5.setText(lista[4]);
        txtActividad6.setText(lista[5]);
    }//GEN-LAST:event_NuevaListaActionPerformed

    public static void main(String args[]) {

//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Listar;
    private javax.swing.JButton NuevaLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mbActividadesD;
    private javax.swing.JMenu mbCliente;
    private javax.swing.JMenu mbPrincipal;
    private javax.swing.JMenu mbReservas;
    private javax.swing.JMenuItem mitCrearNR;
    private javax.swing.JMenuItem mitRegistrar;
    private javax.swing.JMenuItem mitRegresarMP;
    public javax.swing.JTextField txtActividad;
    public javax.swing.JTextField txtActividad2;
    public javax.swing.JTextField txtActividad3;
    public javax.swing.JTextField txtActividad4;
    public javax.swing.JTextField txtActividad5;
    public javax.swing.JTextField txtActividad6;
    // End of variables declaration//GEN-END:variables
}
