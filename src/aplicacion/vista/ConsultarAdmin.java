/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

public class ConsultarAdmin extends javax.swing.JPanel {

    public ConsultarAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableConsultarVrs = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        listaEntidades = new javax.swing.JComboBox<>();
        lblInstruct = new javax.swing.JLabel();
        lblNSVcl = new javax.swing.JLabel();
        lblIdVrs = new javax.swing.JLabel();
        lblIdMod = new javax.swing.JLabel();
        lblIdColor = new javax.swing.JLabel();
        lblIdEmp = new javax.swing.JLabel();
        lblIdDept = new javax.swing.JLabel();
        lblIdDirEmp = new javax.swing.JLabel();
        lblIdCot = new javax.swing.JLabel();
        lblCodFact = new javax.swing.JLabel();
        lblIdCli = new javax.swing.JLabel();
        lblIdDirCli = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador de base de datos");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 280, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consultar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 147, -1));

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setText("Introduzca algun valor para buscar...");
        txtBuscar.setBorder(null);
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 244, 35));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 280, 10));

        tableConsultarVrs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableConsultarVrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableConsultarVrs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 230));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 450, 30));

        btnConsultar.setBackground(new java.awt.Color(214, 5, 5));
        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 100, 40));

        listaEntidades.setBackground(new java.awt.Color(214, 5, 5));
        listaEntidades.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        listaEntidades.setForeground(new java.awt.Color(255, 255, 255));
        listaEntidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehículos", "Versiones", "Modelos", "Colores", "Empleados", "Departamentos", "DireccionesEmpleados", "Cotizaciones", "Facturas", "Clientes", "DireccionesClientes" }));
        listaEntidades.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(listaEntidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 170, 40));

        lblInstruct.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblInstruct.setForeground(new java.awt.Color(153, 153, 153));
        lblInstruct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruct.setText("Seleccione una entidad para consultar sus campos");
        jPanel1.add(lblInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, -1));

        lblNSVcl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNSVcl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNSVcl.setText("Número de Serie:");
        jPanel1.add(lblNSVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 130, 40));

        lblIdVrs.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdVrs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdVrs.setText("Id:");
        jPanel1.add(lblIdVrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdMod.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdMod.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdMod.setText("Id:");
        jPanel1.add(lblIdMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdColor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdColor.setText("Id:");
        jPanel1.add(lblIdColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdEmp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdEmp.setText("Id:");
        jPanel1.add(lblIdEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdDept.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdDept.setText("Id:");
        jPanel1.add(lblIdDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdDirEmp.setText("Id:");
        jPanel1.add(lblIdDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdCot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdCot.setText("Id:");
        jPanel1.add(lblIdCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblCodFact.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCodFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodFact.setText("Código:");
        jPanel1.add(lblCodFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdCli.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdCli.setText("Id:");
        jPanel1.add(lblIdCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        lblIdDirCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdDirCli.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdDirCli.setText("Id:");
        jPanel1.add(lblIdDirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel lblCodFact;
    public javax.swing.JLabel lblIdCli;
    public javax.swing.JLabel lblIdColor;
    public javax.swing.JLabel lblIdCot;
    public javax.swing.JLabel lblIdDept;
    public javax.swing.JLabel lblIdDirCli;
    public javax.swing.JLabel lblIdDirEmp;
    public javax.swing.JLabel lblIdEmp;
    public javax.swing.JLabel lblIdMod;
    public javax.swing.JLabel lblIdVrs;
    private javax.swing.JLabel lblInstruct;
    private javax.swing.JLabel lblMessage;
    public javax.swing.JLabel lblNSVcl;
    public javax.swing.JComboBox<String> listaEntidades;
    public javax.swing.JTable tableConsultarVrs;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
