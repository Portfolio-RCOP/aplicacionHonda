/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.vista;

/**
 *
 * @author Usuario
 */
public class Page3ModifVcl extends javax.swing.JPanel {

    /**
     * Creates new form Page3Modif
     */
    public Page3ModifVcl() {
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
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblMessage = new javax.swing.JLabel();
        lblNumSerie = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblPaisP = new javax.swing.JLabel();
        txtPaisP = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblVersion = new javax.swing.JLabel();
        txtVersion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        lblMotor = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        lblTrans = new javax.swing.JLabel();
        txtTrans = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        lblStock = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        lblNumSerie1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 470));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gerente de Taller");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 220, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modificar Vehículos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 180, 20));

        txtBuscar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscar.setText("Introduzca algun Núm de serie para modificar un vehículo...");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 370, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 370, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 10, 470));

        lblMessage.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 193, 75));
        jPanel1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 450, 20));

        lblNumSerie.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblNumSerie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumSerie.setText("Número de serie:");
        jPanel1.add(lblNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, 30));

        txtNumSerie.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNumSerie.setBorder(null);
        jPanel1.add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 240, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 260, 10));

        lblPrecio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Precio:");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 30));

        txtPrecio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPrecio.setBorder(null);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 240, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 260, 10));

        lblPaisP.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblPaisP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPaisP.setText("País de procedencia:");
        jPanel1.add(lblPaisP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        txtPaisP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtPaisP.setBorder(null);
        jPanel1.add(txtPaisP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 240, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 260, 10));

        lblVersion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVersion.setText("Versión:");
        jPanel1.add(lblVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, 30));

        txtVersion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtVersion.setBorder(null);
        jPanel1.add(txtVersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 240, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 260, 10));

        lblMotor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblMotor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMotor.setText("Motor:");
        jPanel1.add(lblMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, 30));

        txtMotor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtMotor.setBorder(null);
        jPanel1.add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 240, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 260, 10));

        lblTrans.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblTrans.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTrans.setText("Transmisión:");
        jPanel1.add(lblTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, 30));

        txtTrans.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtTrans.setBorder(null);
        jPanel1.add(txtTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 240, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 260, 10));

        lblModelo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblModelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModelo.setText("Modelo:");
        jPanel1.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 50, 30));

        txtModelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtModelo.setBorder(null);
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 130, 30));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 140, 10));

        lblColor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblColor.setText("Color:");
        jPanel1.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 40, 30));

        txtColor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtColor.setBorder(null);
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 120, 30));

        btnModificar.setBackground(new java.awt.Color(214, 5, 5));
        btnModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 100, 30));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 150, 10));

        lblStock.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock.setText("Stock:");
        jPanel1.add(lblStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        txtStock.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtStock.setBorder(null);
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 240, 30));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 260, 10));

        lblNumSerie1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNumSerie1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumSerie1.setText("Número de serie:");
        jPanel1.add(lblNumSerie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed

    }//GEN-LAST:event_txtBuscarMousePressed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblNumSerie;
    private javax.swing.JLabel lblNumSerie1;
    private javax.swing.JLabel lblPaisP;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JLabel lblVersion;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtColor;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtMotor;
    public javax.swing.JTextField txtNumSerie;
    public javax.swing.JTextField txtPaisP;
    public javax.swing.JTextField txtPrecio;
    public javax.swing.JTextField txtStock;
    public javax.swing.JTextField txtTrans;
    public javax.swing.JTextField txtVersion;
    // End of variables declaration//GEN-END:variables
}