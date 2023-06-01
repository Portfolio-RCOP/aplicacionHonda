/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

import java.awt.Color;

public class VendedorPiso extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public VendedorPiso() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menusPnl = new javax.swing.JPanel();
        logoHonda = new javax.swing.JLabel();
        lblPacif = new javax.swing.JLabel();
        btnCli = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCotizacion = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnVehc = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        btnFa = new javax.swing.JButton();
        pnlConsVehc = new javax.swing.JPanel();
        lblVcl3 = new javax.swing.JLabel();
        logoCar3 = new javax.swing.JLabel();
        btnConsVehiculos = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        pnlConsCot = new javax.swing.JPanel();
        btnConsultarCot = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        pnlConsFac = new javax.swing.JScrollPane();
        pnlConsFa = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        btnAgregarFa = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        btnConsultarFa = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        btnModificarFa = new javax.swing.JButton();
        btnEliminarFa = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        pnlConsClie = new javax.swing.JScrollPane();
        pnlConsCli = new javax.swing.JPanel();
        jSeparator9 = new javax.swing.JSeparator();
        btnAgregarC = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        btnConsultarC = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        btnModificarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
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

        btnCli.setBackground(new java.awt.Color(153, 153, 153));
        btnCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_20px_2.png"))); // NOI18N
        btnCli.setText("Clientes");
        btnCli.setBorder(null);
        btnCli.setContentAreaFilled(false);
        btnCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCli.setOpaque(true);
        menusPnl.add(btnCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 30));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 190, 30));

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagina-de-inicio (1).png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setOpaque(true);
        menusPnl.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 190, 30));

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        btnCotizacion.setBackground(new java.awt.Color(153, 153, 153));
        btnCotizacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCotizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_file_20px.png"))); // NOI18N
        btnCotizacion.setText("Cotizacion");
        btnCotizacion.setBorder(null);
        btnCotizacion.setContentAreaFilled(false);
        btnCotizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCotizacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCotizacion.setOpaque(true);
        menusPnl.add(btnCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 30));

        btnVehc.setBackground(new java.awt.Color(153, 153, 153));
        btnVehc.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVehc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car (1).png"))); // NOI18N
        btnVehc.setText("Vehiculos");
        btnVehc.setBorder(null);
        btnVehc.setContentAreaFilled(false);
        btnVehc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVehc.setOpaque(true);
        menusPnl.add(btnVehc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 30));

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 30));

        btnFa.setBackground(new java.awt.Color(153, 153, 153));
        btnFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_finance_document_20px.png"))); // NOI18N
        btnFa.setText("Facturas");
        btnFa.setBorder(null);
        btnFa.setContentAreaFilled(false);
        btnFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFa.setOpaque(true);
        menusPnl.add(btnFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 190, 30));

        pnlConsVehc.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsVehc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsVehc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVcl3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblVcl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVcl3.setText("Facturas");
        lblVcl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsVehc.add(lblVcl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, 20));

        logoCar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_file_20px.png"))); // NOI18N
        logoCar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsVehc.add(logoCar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        btnConsVehiculos.setBackground(new java.awt.Color(153, 153, 153));
        btnConsVehiculos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscando-coche.png"))); // NOI18N
        btnConsVehiculos.setText("Consultar");
        btnConsVehiculos.setBorder(null);
        btnConsVehiculos.setContentAreaFilled(false);
        btnConsVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsVehiculos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsVehiculos.setOpaque(true);
        pnlConsVehc.add(btnConsVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 116, 40));

        jSeparator12.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsVehc.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 140, 10));

        menusPnl.add(pnlConsVehc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 45));

        jSeparator14.setBackground(new java.awt.Color(102, 102, 102));
        menusPnl.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 190, 30));

        pnlConsCot.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsCot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultarCot.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarCot.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarCot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_account_20px_1.png"))); // NOI18N
        btnConsultarCot.setText("Consultar");
        btnConsultarCot.setBorder(null);
        btnConsultarCot.setContentAreaFilled(false);
        btnConsultarCot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarCot.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarCot.setOpaque(true);
        pnlConsCot.add(btnConsultarCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 116, 40));

        jSeparator13.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCot.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 49, 140, 10));

        menusPnl.add(pnlConsCot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 210, -1));

        pnlConsFac.setBackground(new java.awt.Color(153, 153, 153));

        pnlConsFa.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsFa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 111, 116, 10));

        btnAgregarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnAgregarFa.setText("Agregar");
        btnAgregarFa.setBorder(null);
        btnAgregarFa.setContentAreaFilled(false);
        btnAgregarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarFa.setOpaque(true);
        pnlConsFa.add(btnAgregarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, 116, 40));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 49, 116, 10));

        btnConsultarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_client_25px_1.png"))); // NOI18N
        btnConsultarFa.setText("Consultar");
        btnConsultarFa.setBorder(null);
        btnConsultarFa.setContentAreaFilled(false);
        btnConsultarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarFa.setOpaque(true);
        pnlConsFa.add(btnConsultarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 116, 40));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 179, 116, 10));

        btnModificarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarFa.setText("Modificar");
        btnModificarFa.setBorder(null);
        btnModificarFa.setContentAreaFilled(false);
        btnModificarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarFa.setOpaque(true);
        pnlConsFa.add(btnModificarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, 116, 40));

        btnEliminarFa.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarFa.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarFa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnEliminarFa.setText("Eliminar");
        btnEliminarFa.setBorder(null);
        btnEliminarFa.setContentAreaFilled(false);
        btnEliminarFa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarFa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarFa.setOpaque(true);
        pnlConsFa.add(btnEliminarFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 198, 116, 40));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsFa.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 247, 116, 10));

        pnlConsFac.setViewportView(pnlConsFa);

        menusPnl.add(pnlConsFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 186, 116));

        pnlConsClie.setBackground(new java.awt.Color(153, 153, 153));

        pnlConsCli.setBackground(new java.awt.Color(153, 153, 153));
        pnlConsCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator9.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 111, 116, 10));

        btnAgregarC.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnAgregarC.setText("Agregar");
        btnAgregarC.setBorder(null);
        btnAgregarC.setContentAreaFilled(false);
        btnAgregarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarC.setOpaque(true);
        pnlConsCli.add(btnAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 62, 116, 40));

        jSeparator10.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 49, 116, 10));

        btnConsultarC.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnConsultarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_client_25px_1.png"))); // NOI18N
        btnConsultarC.setText("Consultar");
        btnConsultarC.setBorder(null);
        btnConsultarC.setContentAreaFilled(false);
        btnConsultarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsultarC.setOpaque(true);
        pnlConsCli.add(btnConsultarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 0, 116, 40));

        jSeparator11.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 179, 116, 10));

        btnModificarC.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_property_20px.png"))); // NOI18N
        btnModificarC.setText("Modificar");
        btnModificarC.setBorder(null);
        btnModificarC.setContentAreaFilled(false);
        btnModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarC.setOpaque(true);
        pnlConsCli.add(btnModificarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, 116, 40));

        btnEliminarC.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconmonstr-user-26-24.png"))); // NOI18N
        btnEliminarC.setText("Eliminar");
        btnEliminarC.setBorder(null);
        btnEliminarC.setContentAreaFilled(false);
        btnEliminarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarC.setOpaque(true);
        pnlConsCli.add(btnEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 198, 116, 40));

        jSeparator17.setBackground(new java.awt.Color(51, 51, 51));
        pnlConsCli.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 247, 116, 10));

        pnlConsClie.setViewportView(pnlConsCli);

        menusPnl.add(pnlConsClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 190, 118));

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
        System.exit(0);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendedorPiso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VendedorPiso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnAgregarC;
    public javax.swing.JButton btnAgregarFa;
    public javax.swing.JButton btnCli;
    public javax.swing.JButton btnConsVehiculos;
    public javax.swing.JButton btnConsultarC;
    public javax.swing.JButton btnConsultarCot;
    public javax.swing.JButton btnConsultarFa;
    public javax.swing.JButton btnCotizacion;
    public javax.swing.JButton btnEliminarC;
    public javax.swing.JButton btnEliminarFa;
    public javax.swing.JButton btnFa;
    public javax.swing.JButton btnInicio;
    public javax.swing.JButton btnModificarC;
    public javax.swing.JButton btnModificarFa;
    public javax.swing.JButton btnVehc;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBtnCerrar;
    public javax.swing.JLabel lblPacif;
    public javax.swing.JLabel lblVcl3;
    public javax.swing.JLabel logoCar3;
    public javax.swing.JLabel logoHonda;
    public javax.swing.JPanel menusPnl;
    private javax.swing.JPanel pnlCerrar;
    private javax.swing.JPanel pnlColorCerrar;
    public javax.swing.JPanel pnlConsCli;
    public javax.swing.JScrollPane pnlConsClie;
    public javax.swing.JPanel pnlConsCot;
    public javax.swing.JPanel pnlConsFa;
    public javax.swing.JScrollPane pnlConsFac;
    public javax.swing.JPanel pnlConsVehc;
    public javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables

}
