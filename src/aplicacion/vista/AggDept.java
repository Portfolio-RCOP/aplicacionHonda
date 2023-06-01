/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import aplicacion.vista.AgregarAdmin;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class AggDept extends javax.swing.JPanel {

    AgregarAdmin agg1 = new AgregarAdmin();
    
    public AggDept() {
        initComponents();
        
        ShowPanel(agg1.AggDept);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblAccion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        AggDeptCont = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Gerente de Recursos Humanos");
        lblUsuario.setToolTipText("");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 280, 50));

        lblAccion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText("Agregar Departamento");
        jPanel2.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 200, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        jPanel2.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 450, 30));

        AggDeptCont.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout AggDeptContLayout = new javax.swing.GroupLayout(AggDeptCont);
        AggDeptCont.setLayout(AggDeptContLayout);
        AggDeptContLayout.setHorizontalGroup(
            AggDeptContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        AggDeptContLayout.setVerticalGroup(
            AggDeptContLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel2.add(AggDeptCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 490, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ShowPanel(JPanel p){
        p.setSize(490, 320);
        p.setLocation(0, 0);
        
        AggDeptCont.removeAll();
        AggDeptCont.add(p, BorderLayout.CENTER);
        AggDeptCont.revalidate();
        AggDeptCont.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel AggDeptCont;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
