/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

public class GerenteTaller extends javax.swing.JFrame {
    
    int xMouse, yMouse;
            
    public GerenteTaller() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menusPnl = new javax.swing.JPanel();
        logoHonda = new javax.swing.JLabel();
        lblPacif = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnModelos = new javax.swing.JButton();
        btnVhcls = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        btnVersiones = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        btnColores = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        pnlSVcl = new javax.swing.JScrollPane();
        pnlOpcion = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnConsultar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        lblLogos2 = new javax.swing.JLabel();
        pnlSVersiones = new javax.swing.JScrollPane();
        pnlOpcion1 = new javax.swing.JPanel();
        jSeparator12 = new javax.swing.JSeparator();
        btnAgregarV = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        btnConsultarV = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        btnModificarV = new javax.swing.JButton();
        btnEliminarV = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        lblLogos4 = new javax.swing.JLabel();
        pnlSModelos = new javax.swing.JScrollPane();
        pnlOpcion2 = new javax.swing.JPanel();
        jSeparator16 = new javax.swing.JSeparator();
        btnAgregarM = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        btnConsultarM = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JSeparator();
        btnModificarM = new javax.swing.JButton();
        btnEliminarM = new javax.swing.JButton();
        jSeparator19 = new javax.swing.JSeparator();
        lblLogos3 = new javax.swing.JLabel();
        pnlSColores = new javax.swing.JScrollPane();
        pnlOpcion3 = new javax.swing.JPanel();
        jSeparator20 = new javax.swing.JSeparator();
        btnAgregarC = new javax.swing.JButton();
        jSeparator21 = new javax.swing.JSeparator();
        btnConsultarC = new javax.swing.JButton();
        jSeparator22 = new javax.swing.JSeparator();
        btnModificarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        jSeparator23 = new javax.swing.JSeparator();
        lblLogos1 = new javax.swing.JLabel();
        pnlCerrar = new javax.swing.JPanel();
        pnlColorCerrar = new javax.swing.JPanel();
        lblBtnCerrar = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menusPnl.setBackground(new java.awt.Color(153, 153, 153));
        menusPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHonda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hondaLogo-removebg-preview (1).png"))); // NOI18N
        menusPnl.add(logoHonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblPacif.setFont(new java.awt.Font("Hondafont", 0, 10)); // NOI18N
        lblPacif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacif.setText("Pacíifico");
        menusPnl.add(lblPacif, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 20));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 10));

        btnModelos.setBackground(new java.awt.Color(153, 153, 153));
        btnModelos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_tesla_model_x_20px_2.png"))); // NOI18N
        btnModelos.setText("Modelos");
        btnModelos.setBorder(null);
        btnModelos.setContentAreaFilled(false);
        btnModelos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModelos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModelos.setOpaque(true);
        menusPnl.add(btnModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 30));

        btnVhcls.setBackground(new java.awt.Color(153, 153, 153));
        btnVhcls.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVhcls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car (1).png"))); // NOI18N
        btnVhcls.setText("Vehículos");
        btnVhcls.setBorder(null);
        btnVhcls.setContentAreaFilled(false);
        btnVhcls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVhcls.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVhcls.setOpaque(true);
        menusPnl.add(btnVhcls, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 10));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagina-de-inicio (1).png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setOpaque(true);
        menusPnl.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 190, 30));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, 10));

        btnVersiones.setBackground(new java.awt.Color(153, 153, 153));
        btnVersiones.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVersiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/motor-electrico (1).png"))); // NOI18N
        btnVersiones.setText("Versiones");
        btnVersiones.setBorder(null);
        btnVersiones.setContentAreaFilled(false);
        btnVersiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVersiones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVersiones.setOpaque(true);
        menusPnl.add(btnVersiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 190, 30));

        jSeparator10.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 10));

        btnColores.setBackground(new java.awt.Color(153, 153, 153));
        btnColores.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnColores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_color_wheel_20px.png"))); // NOI18N
        btnColores.setText("Colores");
        btnColores.setBorder(null);
        btnColores.setContentAreaFilled(false);
        btnColores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnColores.setOpaque(true);
        menusPnl.add(btnColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 30));

        jSeparator11.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 10));

        pnlSVcl.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));

        btnAgregar.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setOpaque(true);

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultar.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setBorder(null);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultar.setOpaque(true);

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));

        btnModificar.setBackground(new java.awt.Color(153, 153, 153));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setOpaque(true);

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setOpaque(true);

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));

        lblLogos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcionLayout = new javax.swing.GroupLayout(pnlOpcion);
        pnlOpcion.setLayout(pnlOpcionLayout);
        pnlOpcionLayout.setHorizontalGroup(
            pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionLayout.createSequentialGroup()
                .addComponent(lblLogos2)
                .addGap(28, 28, 28)
                .addGroup(pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator5)
                        .addComponent(jSeparator4)
                        .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlOpcionLayout.setVerticalGroup(
            pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionLayout.createSequentialGroup()
                .addGroup(pnlOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSVcl.setViewportView(pnlOpcion);

        menusPnl.add(pnlSVcl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 186, 120));

        pnlSVersiones.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion1.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator12.setBackground(new java.awt.Color(51, 51, 51));

        btnAgregarV.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAgregarV.setText("Agregar");
        btnAgregarV.setBorder(null);
        btnAgregarV.setContentAreaFilled(false);
        btnAgregarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarV.setOpaque(true);

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultarV.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsultarV.setText("Consultar");
        btnConsultarV.setBorder(null);
        btnConsultarV.setContentAreaFilled(false);
        btnConsultarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarV.setOpaque(true);

        jSeparator14.setBackground(new java.awt.Color(51, 51, 51));

        btnModificarV.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarV.setText("Modificar");
        btnModificarV.setBorder(null);
        btnModificarV.setContentAreaFilled(false);
        btnModificarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarV.setOpaque(true);

        btnEliminarV.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnEliminarV.setText("Eliminar");
        btnEliminarV.setBorder(null);
        btnEliminarV.setContentAreaFilled(false);
        btnEliminarV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarV.setOpaque(true);

        jSeparator15.setBackground(new java.awt.Color(51, 51, 51));

        lblLogos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/motor-electrico (1).png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcion1Layout = new javax.swing.GroupLayout(pnlOpcion1);
        pnlOpcion1.setLayout(pnlOpcion1Layout);
        pnlOpcion1Layout.setHorizontalGroup(
            pnlOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcion1Layout.createSequentialGroup()
                .addComponent(lblLogos4)
                .addGap(14, 14, 14)
                .addGroup(pnlOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminarV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator12)
                        .addComponent(jSeparator13)
                        .addComponent(btnModificarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(btnConsultarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlOpcion1Layout.setVerticalGroup(
            pnlOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcion1Layout.createSequentialGroup()
                .addGroup(pnlOpcion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnAgregarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnEliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSVersiones.setViewportView(pnlOpcion1);

        menusPnl.add(pnlSVersiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 186, 120));

        pnlSModelos.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion2.setBackground(new java.awt.Color(153, 153, 153));

        jSeparator16.setBackground(new java.awt.Color(51, 51, 51));

        btnAgregarM.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarM.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAgregarM.setText("Agregar");
        btnAgregarM.setBorder(null);
        btnAgregarM.setContentAreaFilled(false);
        btnAgregarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarM.setOpaque(true);

        jSeparator17.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultarM.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarM.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsultarM.setText("Consultar");
        btnConsultarM.setBorder(null);
        btnConsultarM.setContentAreaFilled(false);
        btnConsultarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarM.setOpaque(true);

        jSeparator18.setBackground(new java.awt.Color(51, 51, 51));

        btnModificarM.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarM.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarM.setText("Modificar");
        btnModificarM.setBorder(null);
        btnModificarM.setContentAreaFilled(false);
        btnModificarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarM.setOpaque(true);

        btnEliminarM.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarM.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnEliminarM.setText("Eliminar");
        btnEliminarM.setBorder(null);
        btnEliminarM.setContentAreaFilled(false);
        btnEliminarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarM.setOpaque(true);

        jSeparator19.setBackground(new java.awt.Color(51, 51, 51));

        lblLogos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_tesla_model_x_20px_2.png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcion2Layout = new javax.swing.GroupLayout(pnlOpcion2);
        pnlOpcion2.setLayout(pnlOpcion2Layout);
        pnlOpcion2Layout.setHorizontalGroup(
            pnlOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcion2Layout.createSequentialGroup()
                .addComponent(lblLogos3)
                .addGap(14, 14, 14)
                .addGroup(pnlOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminarM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregarM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator16)
                        .addComponent(jSeparator17)
                        .addComponent(btnModificarM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(btnConsultarM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlOpcion2Layout.setVerticalGroup(
            pnlOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcion2Layout.createSequentialGroup()
                .addGroup(pnlOpcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAgregarM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnEliminarM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlSModelos.setViewportView(pnlOpcion2);

        menusPnl.add(pnlSModelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 186, 120));

        pnlSColores.setBackground(new java.awt.Color(153, 153, 153));

        pnlOpcion3.setBackground(new java.awt.Color(153, 153, 153));
        pnlOpcion3.setPreferredSize(new java.awt.Dimension(210, 240));
        pnlOpcion3.setVerifyInputWhenFocusTarget(false);

        jSeparator20.setBackground(new java.awt.Color(51, 51, 51));

        btnAgregarC.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnAgregarC.setText("Agregar");
        btnAgregarC.setBorder(null);
        btnAgregarC.setContentAreaFilled(false);
        btnAgregarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarC.setOpaque(true);

        jSeparator21.setBackground(new java.awt.Color(51, 51, 51));

        btnConsultarC.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsultarC.setText("Consultar");
        btnConsultarC.setBorder(null);
        btnConsultarC.setContentAreaFilled(false);
        btnConsultarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarC.setOpaque(true);

        jSeparator22.setBackground(new java.awt.Color(51, 51, 51));

        btnModificarC.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-mas (1).png"))); // NOI18N
        btnModificarC.setText("Modificar");
        btnModificarC.setBorder(null);
        btnModificarC.setContentAreaFilled(false);
        btnModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarC.setOpaque(true);

        btnEliminarC.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_database_20px_1.png"))); // NOI18N
        btnEliminarC.setText("Eliminar");
        btnEliminarC.setBorder(null);
        btnEliminarC.setContentAreaFilled(false);
        btnEliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarC.setOpaque(true);

        jSeparator23.setBackground(new java.awt.Color(51, 51, 51));

        lblLogos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_color_wheel_20px.png"))); // NOI18N

        javax.swing.GroupLayout pnlOpcion3Layout = new javax.swing.GroupLayout(pnlOpcion3);
        pnlOpcion3.setLayout(pnlOpcion3Layout);
        pnlOpcion3Layout.setHorizontalGroup(
            pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcion3Layout.createSequentialGroup()
                .addComponent(lblLogos1)
                .addGap(20, 20, 20)
                .addGroup(pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator20)
                        .addComponent(btnModificarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addComponent(jSeparator21)
                        .addComponent(btnConsultarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnlOpcion3Layout.setVerticalGroup(
            pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcion3Layout.createSequentialGroup()
                .addGroup(pnlOpcion3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSColores.setViewportView(pnlOpcion3);

        menusPnl.add(pnlSColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 186, 120));

        background.add(menusPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 480));

        pnlCerrar.setBackground(new java.awt.Color(185, 5, 12));
        pnlCerrar.setPreferredSize(new java.awt.Dimension(25, 25));
        pnlCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlCerrarMouseDragged(evt);
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
        System.exit(GerenteTaller.DISPOSE_ON_CLOSE);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            public void run() {
                new GerenteTaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAgregarC;
    public javax.swing.JButton btnAgregarM;
    public javax.swing.JButton btnAgregarV;
    public javax.swing.JButton btnColores;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnConsultarC;
    public javax.swing.JButton btnConsultarM;
    public javax.swing.JButton btnConsultarV;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminarC;
    public javax.swing.JButton btnEliminarM;
    public javax.swing.JButton btnEliminarV;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnModelos;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnModificarC;
    public javax.swing.JButton btnModificarM;
    public javax.swing.JButton btnModificarV;
    public javax.swing.JButton btnVersiones;
    public javax.swing.JButton btnVhcls;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBtnCerrar;
    private javax.swing.JLabel lblLogos1;
    public javax.swing.JLabel lblLogos2;
    private javax.swing.JLabel lblLogos3;
    private javax.swing.JLabel lblLogos4;
    private javax.swing.JLabel lblPacif;
    private javax.swing.JLabel logoHonda;
    private javax.swing.JPanel menusPnl;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlColorCerrar;
    public javax.swing.JPanel pnlContent;
    public javax.swing.JPanel pnlOpcion;
    public javax.swing.JPanel pnlOpcion1;
    public javax.swing.JPanel pnlOpcion2;
    public javax.swing.JPanel pnlOpcion3;
    public javax.swing.JScrollPane pnlSColores;
    public javax.swing.JScrollPane pnlSModelos;
    public javax.swing.JScrollPane pnlSVcl;
    public javax.swing.JScrollPane pnlSVersiones;
    // End of variables declaration//GEN-END:variables

}
