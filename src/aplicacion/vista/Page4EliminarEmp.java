/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

/**
 *
 * @author zamud
 */
public class Page4EliminarEmp extends javax.swing.JPanel {

    /**
     * Creates new form Page4Eliminar
     */
    public Page4EliminarEmp() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblAccion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        btnElimEmp = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        lblIdEmpM = new javax.swing.JLabel();
        lblIdEmpM2 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JTextField();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Gerente de Recursos Humanos");
        lblUsuario.setToolTipText("");
        jPanel4.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 280, 50));

        lblAccion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText("Eliminar Empleado");
        jPanel4.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 200, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        jPanel4.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 450, 30));

        btnElimEmp.setBackground(new java.awt.Color(214, 5, 5));
        btnElimEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmp.setText("Eliminar");
        jPanel4.add(btnElimEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 90, 30));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 310, 10));

        lblIdEmpM.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIdEmpM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmpM.setText("a eliminar:");
        jPanel4.add(lblIdEmpM, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 20));

        lblIdEmpM2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblIdEmpM2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmpM2.setText("Id del Empleado ");
        jPanel4.add(lblIdEmpM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 20));

        txtEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(153, 153, 153));
        txtEliminar.setText("Introduzca el Id del empleado que desee eliminar");
        txtEliminar.setBorder(null);
        txtEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEliminarMousePressed(evt);
            }
        });
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });
        jPanel4.add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 340, 35));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliminarMousePressed

    }//GEN-LAST:event_txtEliminarMousePressed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed

    }//GEN-LAST:event_txtEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnElimEmp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblIdEmpM;
    private javax.swing.JLabel lblIdEmpM2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JTextField txtEliminar;
    // End of variables declaration//GEN-END:variables
}
