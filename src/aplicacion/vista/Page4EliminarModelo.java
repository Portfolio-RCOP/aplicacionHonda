/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Page4EliminarModelo extends javax.swing.JPanel {

    /**
     * Creates new form Page4Eliminar
     */
    public Page4EliminarModelo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnElimMod = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerente de Taller");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar Modelo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 160, -1));

        txtId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setText("Introduzca el Id del modelo a eliminar...");
        txtId.setBorder(null);
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 340, 35));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 250, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 450, 30));

        lblId.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setText("Id:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 50));

        btnElimMod.setBackground(new java.awt.Color(214, 5, 5));
        btnElimMod.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimMod.setForeground(new java.awt.Color(255, 255, 255));
        btnElimMod.setText("Eliminar");
        jPanel1.add(btnElimMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed

    }//GEN-LAST:event_txtIdMousePressed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnElimMod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMessage;
    public javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
