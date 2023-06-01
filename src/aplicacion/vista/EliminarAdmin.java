/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

public class EliminarAdmin extends javax.swing.JPanel {

    public EliminarAdmin() {
        initComponents();
        
        OcultarPanels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        ElimVcls = new javax.swing.JPanel();
        txtElimVcl = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNSElimVcl = new javax.swing.JLabel();
        btnEliminarVcl = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        ElimVrs = new javax.swing.JPanel();
        txtElimVrs = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblMessage1 = new javax.swing.JLabel();
        lblIdElimVrs = new javax.swing.JLabel();
        btnElimVrs = new javax.swing.JButton();
        ElimMod = new javax.swing.JPanel();
        txtIdModelo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblMessage2 = new javax.swing.JLabel();
        lblIdElimMdl = new javax.swing.JLabel();
        btnElimMod = new javax.swing.JButton();
        ElimColor = new javax.swing.JPanel();
        txtElimColor = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblMessage3 = new javax.swing.JLabel();
        lblIdElimClr = new javax.swing.JLabel();
        btnElimClr = new javax.swing.JButton();
        ElimEmp = new javax.swing.JPanel();
        txtElimEmp = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblMessage4 = new javax.swing.JLabel();
        lblIdElimEmp = new javax.swing.JLabel();
        btnElimEmp = new javax.swing.JButton();
        ElimDept = new javax.swing.JPanel();
        txtElimDept = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblMessage5 = new javax.swing.JLabel();
        lblIdElimDept = new javax.swing.JLabel();
        btnElimDept = new javax.swing.JButton();
        ElimDirEmp = new javax.swing.JPanel();
        txtElimDirEmp = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblMessage6 = new javax.swing.JLabel();
        lblIdElimDirEmp = new javax.swing.JLabel();
        btnElimDirEmp = new javax.swing.JButton();
        ElimCotiz = new javax.swing.JPanel();
        txtElimCot = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblMessage7 = new javax.swing.JLabel();
        lblIdElimCot = new javax.swing.JLabel();
        btnElimCot = new javax.swing.JButton();
        ElimFacts = new javax.swing.JPanel();
        txtElimFact = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lblMessage8 = new javax.swing.JLabel();
        lblIdElimFact = new javax.swing.JLabel();
        btnElimFact = new javax.swing.JButton();
        ElimClientes = new javax.swing.JPanel();
        txtElimCli = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        lblMessage9 = new javax.swing.JLabel();
        lblIdElimCli = new javax.swing.JLabel();
        btnElimCli = new javax.swing.JButton();
        ElimDirCli = new javax.swing.JPanel();
        txtElimDirCli = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        lblMessage10 = new javax.swing.JLabel();
        lblIdDirCli = new javax.swing.JLabel();
        btnElimDirCli = new javax.swing.JButton();
        listaEntidades = new javax.swing.JComboBox<>();
        lblInstruct = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblAccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccion.setText("Eliminar");
        jPanel1.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 160, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Administrador de base de datos");
        lblUsuario.setToolTipText("");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 260, 30));

        ElimVcls.setBackground(new java.awt.Color(255, 255, 255));
        ElimVcls.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimVcl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimVcl.setForeground(new java.awt.Color(153, 153, 153));
        txtElimVcl.setText("Introduzca el número de serie del vehículo a eliminar...");
        txtElimVcl.setBorder(null);
        ElimVcls.add(txtElimVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 340, 35));
        ElimVcls.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 340, 10));

        lblNSElimVcl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNSElimVcl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNSElimVcl.setText("Número de Serie:");
        ElimVcls.add(lblNSElimVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

        btnEliminarVcl.setBackground(new java.awt.Color(214, 5, 5));
        btnEliminarVcl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarVcl.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVcl.setText("Eliminar");
        ElimVcls.add(btnEliminarVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, 30));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        ElimVcls.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 450, 30));

        jPanel1.add(ElimVcls, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimVrs.setBackground(new java.awt.Color(255, 255, 255));
        ElimVrs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimVrs.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimVrs.setForeground(new java.awt.Color(153, 153, 153));
        txtElimVrs.setText("Introduzca el Id de la versión a eliminar...");
        txtElimVrs.setBorder(null);
        txtElimVrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimVrsMousePressed(evt);
            }
        });
        txtElimVrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimVrsActionPerformed(evt);
            }
        });
        ElimVrs.add(txtElimVrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 340, 40));
        ElimVrs.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, 10));

        lblMessage1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage1.setForeground(new java.awt.Color(0, 193, 75));
        ElimVrs.add(lblMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 450, 30));

        lblIdElimVrs.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimVrs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimVrs.setText("Id:");
        ElimVrs.add(lblIdElimVrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 40));

        btnElimVrs.setBackground(new java.awt.Color(214, 5, 5));
        btnElimVrs.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimVrs.setForeground(new java.awt.Color(255, 255, 255));
        btnElimVrs.setText("Eliminar");
        ElimVrs.add(btnElimVrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, 30));

        jPanel1.add(ElimVrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimMod.setBackground(new java.awt.Color(255, 255, 255));
        ElimMod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdModelo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtIdModelo.setForeground(new java.awt.Color(153, 153, 153));
        txtIdModelo.setText("Introduzca el Id del modelo a eliminar...");
        txtIdModelo.setBorder(null);
        txtIdModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdModeloMousePressed(evt);
            }
        });
        txtIdModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdModeloActionPerformed(evt);
            }
        });
        ElimMod.add(txtIdModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 340, 30));
        ElimMod.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, 10));

        lblMessage2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage2.setForeground(new java.awt.Color(0, 193, 75));
        ElimMod.add(lblMessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 450, 30));

        lblIdElimMdl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimMdl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimMdl.setText("Id:");
        ElimMod.add(lblIdElimMdl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 40));

        btnElimMod.setBackground(new java.awt.Color(214, 5, 5));
        btnElimMod.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimMod.setForeground(new java.awt.Color(255, 255, 255));
        btnElimMod.setText("Eliminar");
        ElimMod.add(btnElimMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, 30));

        jPanel1.add(ElimMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimColor.setBackground(new java.awt.Color(255, 255, 255));
        ElimColor.setPreferredSize(new java.awt.Dimension(510, 320));
        ElimColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimColor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimColor.setForeground(new java.awt.Color(153, 153, 153));
        txtElimColor.setText("Introduzca el Id del Color a eliminar...");
        txtElimColor.setBorder(null);
        txtElimColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimColorMousePressed(evt);
            }
        });
        txtElimColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimColorActionPerformed(evt);
            }
        });
        ElimColor.add(txtElimColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 240, 35));
        ElimColor.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 240, 10));

        lblMessage3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage3.setForeground(new java.awt.Color(0, 193, 75));
        ElimColor.add(lblMessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 450, 30));

        lblIdElimClr.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimClr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimClr.setText("Id:");
        ElimColor.add(lblIdElimClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 50));

        btnElimClr.setBackground(new java.awt.Color(214, 5, 5));
        btnElimClr.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimClr.setForeground(new java.awt.Color(255, 255, 255));
        btnElimClr.setText("Eliminar");
        ElimColor.add(btnElimClr, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 90, 30));

        jPanel1.add(ElimColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimEmp.setBackground(new java.awt.Color(255, 255, 255));
        ElimEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimEmp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimEmp.setForeground(new java.awt.Color(153, 153, 153));
        txtElimEmp.setText("Introduzca el Id del empleado a eliminar...");
        txtElimEmp.setBorder(null);
        txtElimEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimEmpMousePressed(evt);
            }
        });
        txtElimEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimEmpActionPerformed(evt);
            }
        });
        ElimEmp.add(txtElimEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 260, 35));
        ElimEmp.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, 10));

        lblMessage4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage4.setForeground(new java.awt.Color(0, 193, 75));
        ElimEmp.add(lblMessage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdElimEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimEmp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimEmp.setText("Id:");
        ElimEmp.add(lblIdElimEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 40, 50));

        btnElimEmp.setBackground(new java.awt.Color(214, 5, 5));
        btnElimEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnElimEmp.setText("Eliminar");
        ElimEmp.add(btnElimEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimDept.setBackground(new java.awt.Color(255, 255, 255));
        ElimDept.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimDept.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimDept.setForeground(new java.awt.Color(153, 153, 153));
        txtElimDept.setText("Introduzca el Id del departamento a eliminar...");
        txtElimDept.setBorder(null);
        txtElimDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimDeptMousePressed(evt);
            }
        });
        txtElimDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimDeptActionPerformed(evt);
            }
        });
        ElimDept.add(txtElimDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 290, 40));
        ElimDept.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 290, 10));

        lblMessage5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage5.setForeground(new java.awt.Color(0, 193, 75));
        ElimDept.add(lblMessage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdElimDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimDept.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimDept.setText("Id:");
        ElimDept.add(lblIdElimDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 40, 40));

        btnElimDept.setBackground(new java.awt.Color(214, 5, 5));
        btnElimDept.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimDept.setForeground(new java.awt.Color(255, 255, 255));
        btnElimDept.setText("Eliminar");
        ElimDept.add(btnElimDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimDirEmp.setBackground(new java.awt.Color(255, 255, 255));
        ElimDirEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimDirEmp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimDirEmp.setForeground(new java.awt.Color(153, 153, 153));
        txtElimDirEmp.setText("Introduzca el Id de la dirección a eliminar...");
        txtElimDirEmp.setBorder(null);
        txtElimDirEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimDirEmpMousePressed(evt);
            }
        });
        txtElimDirEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimDirEmpActionPerformed(evt);
            }
        });
        ElimDirEmp.add(txtElimDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 270, 30));
        ElimDirEmp.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 270, 10));

        lblMessage6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage6.setForeground(new java.awt.Color(0, 193, 75));
        ElimDirEmp.add(lblMessage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdElimDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimDirEmp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimDirEmp.setText("Id:");
        ElimDirEmp.add(lblIdElimDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        btnElimDirEmp.setBackground(new java.awt.Color(214, 5, 5));
        btnElimDirEmp.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimDirEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnElimDirEmp.setText("Eliminar");
        ElimDirEmp.add(btnElimDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimDirEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimCotiz.setBackground(new java.awt.Color(255, 255, 255));
        ElimCotiz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimCot.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimCot.setForeground(new java.awt.Color(153, 153, 153));
        txtElimCot.setText("Introduzca el Id de la cotización a eliminar...");
        txtElimCot.setBorder(null);
        txtElimCot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimCotMousePressed(evt);
            }
        });
        txtElimCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimCotActionPerformed(evt);
            }
        });
        ElimCotiz.add(txtElimCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 280, 30));
        ElimCotiz.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 270, 10));

        lblMessage7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage7.setForeground(new java.awt.Color(0, 193, 75));
        ElimCotiz.add(lblMessage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdElimCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimCot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimCot.setText("Id:");
        ElimCotiz.add(lblIdElimCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        btnElimCot.setBackground(new java.awt.Color(214, 5, 5));
        btnElimCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimCot.setForeground(new java.awt.Color(255, 255, 255));
        btnElimCot.setText("Eliminar");
        ElimCotiz.add(btnElimCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimCotiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimFacts.setBackground(new java.awt.Color(255, 255, 255));
        ElimFacts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimFact.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimFact.setForeground(new java.awt.Color(153, 153, 153));
        txtElimFact.setText("Introduzca el Código de la factura a eliminar...");
        txtElimFact.setBorder(null);
        txtElimFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimFactMousePressed(evt);
            }
        });
        txtElimFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimFactActionPerformed(evt);
            }
        });
        ElimFacts.add(txtElimFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 290, 30));
        ElimFacts.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 290, 10));

        lblMessage8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage8.setForeground(new java.awt.Color(0, 193, 75));
        ElimFacts.add(lblMessage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdElimFact.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimFact.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimFact.setText("Código:");
        ElimFacts.add(lblIdElimFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, 40));

        btnElimFact.setBackground(new java.awt.Color(214, 5, 5));
        btnElimFact.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimFact.setForeground(new java.awt.Color(255, 255, 255));
        btnElimFact.setText("Eliminar");
        ElimFacts.add(btnElimFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimFacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimClientes.setBackground(new java.awt.Color(255, 255, 255));
        ElimClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimCli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimCli.setForeground(new java.awt.Color(153, 153, 153));
        txtElimCli.setText("Introduzca el Id del cliente a eliminar...");
        txtElimCli.setBorder(null);
        txtElimCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimCliMousePressed(evt);
            }
        });
        txtElimCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimCliActionPerformed(evt);
            }
        });
        ElimClientes.add(txtElimCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 270, 30));
        ElimClientes.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 270, 10));

        lblMessage9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage9.setForeground(new java.awt.Color(0, 193, 75));
        ElimClientes.add(lblMessage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdElimCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdElimCli.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdElimCli.setText("Id:");
        ElimClientes.add(lblIdElimCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        btnElimCli.setBackground(new java.awt.Color(214, 5, 5));
        btnElimCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimCli.setForeground(new java.awt.Color(255, 255, 255));
        btnElimCli.setText("Eliminar");
        ElimClientes.add(btnElimCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        ElimDirCli.setBackground(new java.awt.Color(255, 255, 255));
        ElimDirCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtElimDirCli.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtElimDirCli.setForeground(new java.awt.Color(153, 153, 153));
        txtElimDirCli.setText("Introduzca el Id de la dirección a eliminar...");
        txtElimDirCli.setBorder(null);
        txtElimDirCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtElimDirCliMousePressed(evt);
            }
        });
        txtElimDirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtElimDirCliActionPerformed(evt);
            }
        });
        ElimDirCli.add(txtElimDirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, 270, 30));
        ElimDirCli.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 270, 10));

        lblMessage10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblMessage10.setForeground(new java.awt.Color(0, 193, 75));
        ElimDirCli.add(lblMessage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 450, 30));

        lblIdDirCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblIdDirCli.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIdDirCli.setText("Id:");
        ElimDirCli.add(lblIdDirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        btnElimDirCli.setBackground(new java.awt.Color(214, 5, 5));
        btnElimDirCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnElimDirCli.setForeground(new java.awt.Color(255, 255, 255));
        btnElimDirCli.setText("Eliminar");
        ElimDirCli.add(btnElimDirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 30));

        jPanel1.add(ElimDirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 510, 320));

        listaEntidades.setBackground(new java.awt.Color(214, 5, 5));
        listaEntidades.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        listaEntidades.setForeground(new java.awt.Color(255, 255, 255));
        listaEntidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehículos", "Versiones", "Modelos", "Colores", "Empleados", "Departamentos", "DireccionesEmpleados", "Cotizaciones", "Facturas", "Clientes", "DireccionesClientes" }));
        listaEntidades.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(listaEntidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 170, 40));

        lblInstruct.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblInstruct.setForeground(new java.awt.Color(153, 153, 153));
        lblInstruct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruct.setText("Seleccione una entidad para eliminar información:");
        jPanel1.add(lblInstruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, -1));

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

    private void txtElimVrsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimVrsMousePressed
        if (txtElimVrs.getText().equals("Introduzca el Id de la versión a eliminar...")) {
            txtElimVrs.setText("");
            txtElimVrs.setForeground(Color.black);
        }else if(txtElimVrs.getText().isEmpty()) {
            txtElimVrs.setText("Introduzca el Id de la versión a eliminar...");
            txtElimVrs.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimVrsMousePressed

    private void txtElimVrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimVrsActionPerformed

    }//GEN-LAST:event_txtElimVrsActionPerformed

    private void txtIdModeloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdModeloMousePressed
        if (txtIdModelo.getText().equals("Introduzca el Id del modelo a eliminar...")) {
            txtIdModelo.setText("");
            txtIdModelo.setForeground(Color.black);
        }else if(txtIdModelo.getText().isEmpty()) {
            txtIdModelo.setText("Introduzca el Id del modelo a eliminar...");
            txtIdModelo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtIdModeloMousePressed

    private void txtIdModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdModeloActionPerformed

    }//GEN-LAST:event_txtIdModeloActionPerformed

    private void txtElimColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimColorMousePressed
        if (txtElimColor.getText().equals("Introduzca el Id del Color a eliminar...")) {
            txtElimColor.setText("");
            txtElimColor.setForeground(Color.black);
        }else if(txtElimColor.getText().isEmpty()) {
            txtElimColor.setText("Introduzca el Id del Color a eliminar...");
            txtElimColor.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimColorMousePressed

    private void txtElimColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimColorActionPerformed

    }//GEN-LAST:event_txtElimColorActionPerformed

    private void txtElimEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimEmpMousePressed
        if (txtElimEmp.getText().equals("Introduzca el Id del empleado a eliminar...")) {
            txtElimEmp.setText("");
            txtElimEmp.setForeground(Color.black);
        }else if(txtElimEmp.getText().isEmpty()) {
            txtElimEmp.setText("Introduzca el Id del empleado a eliminar...");
            txtElimEmp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimEmpMousePressed

    private void txtElimEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimEmpActionPerformed

    private void txtElimDeptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimDeptMousePressed
        if (txtElimDept.getText().equals("Introduzca el Id del departamento a eliminar...")) {
            txtElimDept.setText("");
            txtElimDept.setForeground(Color.black);
        }else if(txtElimDept.getText().isEmpty()) {
            txtElimDept.setText("Introduzca el Id del departamento a eliminar...");
            txtElimDept.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimDeptMousePressed

    private void txtElimDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimDeptActionPerformed

    private void txtElimDirEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimDirEmpMousePressed
        if (txtElimDirEmp.getText().equals("Introduzca el Id de la dirección a eliminar...")) {
            txtElimDirEmp.setText("");
            txtElimDirEmp.setForeground(Color.black);
        }else if(txtElimDirEmp.getText().isEmpty()) {
            txtElimDirEmp.setText("Introduzca el Id de la dirección a eliminar...");
            txtElimDirEmp.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimDirEmpMousePressed

    private void txtElimDirEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimDirEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimDirEmpActionPerformed

    private void txtElimCotMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimCotMousePressed
        if (txtElimCot.getText().equals("Introduzca el Id de la cotización a eliminar...")) {
            txtElimCot.setText("");
            txtElimCot.setForeground(Color.black);
        }else if(txtElimCot.getText().isEmpty()) {
            txtElimCot.setText("Introduzca el Id de la cotización a eliminar...");
            txtElimCot.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimCotMousePressed

    private void txtElimCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimCotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimCotActionPerformed

    private void txtElimFactMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimFactMousePressed
        if (txtElimFact.getText().equals("Introduzca el Id de la factura a eliminar...")) {
            txtElimFact.setText("");
            txtElimFact.setForeground(Color.black);
        }else if(txtElimFact.getText().isEmpty()) {
            txtElimFact.setText("Introduzca el Id de la factura a eliminar...");
            txtElimFact.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimFactMousePressed

    private void txtElimFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimFactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimFactActionPerformed

    private void txtElimCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimCliMousePressed
        if (txtElimCli.getText().equals("Introduzca el Id del cliente a eliminar...")) {
            txtElimCli.setText("");
            txtElimCli.setForeground(Color.black);
        }else if(txtElimCli.getText().isEmpty()) {
            txtElimCli.setText("Introduzca el Id del cliente a eliminar...");
            txtElimCli.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimCliMousePressed

    private void txtElimCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimCliActionPerformed

    private void txtElimDirCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtElimDirCliMousePressed
        if (txtElimDirCli.getText().equals("Introduzca el Id de la dirección a eliminar...")) {
            txtElimDirCli.setText("");
            txtElimDirCli.setForeground(Color.black);
        }else if(txtElimDirCli.getText().isEmpty()) {
            txtElimDirCli.setText("Introduzca el Id de la dirección a eliminar...");
            txtElimDirCli.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtElimDirCliMousePressed

    private void txtElimDirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtElimDirCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtElimDirCliActionPerformed

    private void OcultarPanels() {
        ElimVcls.setVisible(false);
        ElimVrs.setVisible(false);
        ElimMod.setVisible(false);
        ElimColor.setVisible(false);
        ElimEmp.setVisible(false);
        ElimDept.setVisible(false);
        ElimDirEmp.setVisible(false);
        ElimCotiz.setVisible(false);
        ElimFacts.setVisible(false);
        ElimClientes.setVisible(false);
        ElimDirCli.setVisible(false);
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel ElimClientes;
    public javax.swing.JPanel ElimColor;
    public javax.swing.JPanel ElimCotiz;
    public javax.swing.JPanel ElimDept;
    public javax.swing.JPanel ElimDirCli;
    public javax.swing.JPanel ElimDirEmp;
    public javax.swing.JPanel ElimEmp;
    public javax.swing.JPanel ElimFacts;
    public javax.swing.JPanel ElimMod;
    public javax.swing.JPanel ElimVcls;
    public javax.swing.JPanel ElimVrs;
    public javax.swing.JButton btnElimCli;
    public javax.swing.JButton btnElimClr;
    public javax.swing.JButton btnElimCot;
    public javax.swing.JButton btnElimDept;
    public javax.swing.JButton btnElimDirCli;
    public javax.swing.JButton btnElimDirEmp;
    public javax.swing.JButton btnElimEmp;
    public javax.swing.JButton btnElimFact;
    public javax.swing.JButton btnElimMod;
    public javax.swing.JButton btnElimVrs;
    public javax.swing.JButton btnEliminarVcl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblIdDirCli;
    private javax.swing.JLabel lblIdElimCli;
    private javax.swing.JLabel lblIdElimClr;
    private javax.swing.JLabel lblIdElimCot;
    private javax.swing.JLabel lblIdElimDept;
    private javax.swing.JLabel lblIdElimDirEmp;
    private javax.swing.JLabel lblIdElimEmp;
    private javax.swing.JLabel lblIdElimFact;
    private javax.swing.JLabel lblIdElimMdl;
    private javax.swing.JLabel lblIdElimVrs;
    private javax.swing.JLabel lblInstruct;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblMessage10;
    private javax.swing.JLabel lblMessage2;
    private javax.swing.JLabel lblMessage3;
    private javax.swing.JLabel lblMessage4;
    private javax.swing.JLabel lblMessage5;
    private javax.swing.JLabel lblMessage6;
    private javax.swing.JLabel lblMessage7;
    private javax.swing.JLabel lblMessage8;
    private javax.swing.JLabel lblMessage9;
    private javax.swing.JLabel lblNSElimVcl;
    private javax.swing.JLabel lblUsuario;
    public javax.swing.JComboBox<String> listaEntidades;
    public javax.swing.JTextField txtElimCli;
    public javax.swing.JTextField txtElimColor;
    public javax.swing.JTextField txtElimCot;
    public javax.swing.JTextField txtElimDept;
    public javax.swing.JTextField txtElimDirCli;
    public javax.swing.JTextField txtElimDirEmp;
    public javax.swing.JTextField txtElimEmp;
    public javax.swing.JTextField txtElimFact;
    public javax.swing.JTextField txtElimVcl;
    public javax.swing.JTextField txtElimVrs;
    public javax.swing.JTextField txtIdModelo;
    // End of variables declaration//GEN-END:variables
}
