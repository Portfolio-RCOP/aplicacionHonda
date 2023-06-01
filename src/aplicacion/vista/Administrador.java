/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

public class Administrador extends javax.swing.JFrame {
    
    int xMouse, yMouse;

    public Administrador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnlCerrar = new javax.swing.JPanel();
        pnlColorCerrar = new javax.swing.JPanel();
        lblBtnCerrar = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        menusPnl = new javax.swing.JPanel();
        logoHonda = new javax.swing.JLabel();
        lblPacif = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        btnConsultar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCerrar.setBackground(new java.awt.Color(185, 5, 12));
        pnlCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseDragged(evt);
            }
        });
        pnlCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseEntered(evt);
            }
        });

        pnlColorCerrar.setBackground(new java.awt.Color(185, 5, 12));

        lblBtnCerrar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblBtnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnCerrar.setText("X");
        lblBtnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        lblBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBtnCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlColorCerrarLayout = new javax.swing.GroupLayout(pnlColorCerrar);
        pnlColorCerrar.setLayout(pnlColorCerrarLayout);
        pnlColorCerrarLayout.setHorizontalGroup(
            pnlColorCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        pnlColorCerrarLayout.setVerticalGroup(
            pnlColorCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCerrarLayout = new javax.swing.GroupLayout(pnlCerrar);
        pnlCerrar.setLayout(pnlCerrarLayout);
        pnlCerrarLayout.setHorizontalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarLayout.createSequentialGroup()
                .addGap(0, 717, Short.MAX_VALUE)
                .addComponent(pnlColorCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCerrarLayout.setVerticalGroup(
            pnlCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlColorCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(pnlCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        background.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 540, 480));

        menusPnl.setBackground(new java.awt.Color(153, 153, 153));
        menusPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hondaLogo-removebg-preview (1).png"))); // NOI18N
        menusPnl.add(logoHonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblPacif.setFont(new java.awt.Font("Hondafont", 0, 10)); // NOI18N
        lblPacif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacif.setText("Pacíifico");
        menusPnl.add(lblPacif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 20));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 10));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 10));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagina-de-inicio (1).png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setOpaque(true);
        menusPnl.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 30));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 10));

        jSeparator10.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 10));

        jSeparator11.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 10));

        btnConsultar.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(null);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultar.setOpaque(true);
        menusPnl.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 40));

        btnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setOpaque(true);
        menusPnl.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 40));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setOpaque(true);
        menusPnl.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 40));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setOpaque(true);
        menusPnl.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, 40));

        background.add(menusPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseClicked
        System.exit(Administrador.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_lblBtnCerrarMouseClicked

    private void lblBtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseEntered
        pnlColorCerrar.setBackground(Color.red);
        lblBtnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_lblBtnCerrarMouseEntered

    private void lblBtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBtnCerrarMouseExited
        pnlColorCerrar.setBackground(new Color(185, 5, 12));
        lblBtnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_lblBtnCerrarMouseExited

    private void pnlCerrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_pnlCerrarMouseDragged

    private void pnlCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCerrarMouseEntered

    }//GEN-LAST:event_pnlCerrarMouseEntered

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnModificar;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblPacif;
    private javax.swing.JLabel logoHonda;
    public javax.swing.JPanel menusPnl;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlColorCerrar;
    public javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

}
