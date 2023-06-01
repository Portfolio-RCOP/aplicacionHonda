/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.*;
import aplicacion.vista.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlUsuarios implements ActionListener {
    
    Consultas_Admin con = new Consultas_Admin();
    
    InicioSesion is = new InicioSesion();
    
    ControladorPanel cp = new ControladorPanel();
    
    Administrador c = new Administrador();
    PageIniAd ia = new PageIniAd();
    ConsultarAdmin ca = new ConsultarAdmin();
    AgregarAdmin aggA = new AgregarAdmin();
    ModificarAdmin ma = new ModificarAdmin();
    EliminarAdmin ea = new EliminarAdmin();
    
    GerenteAdmin ga = new GerenteAdmin();
    PageIniGAd iga = new PageIniGAd();
    Page1BuscarVcl gabvcgt = new Page1BuscarVcl();
    Page2ConsFct cfga = new Page2ConsFct();
    Page3ConsCli cliga = new Page3ConsCli();
    Page4ConsCot cotga = new Page4ConsCot();
    Page5ElimCot ecotga = new Page5ElimCot();
    
    GerenteRH grh = new GerenteRH();
    PageIniGRH igrh = new PageIniGRH();
    Page1BuscarEmp cerh = new Page1BuscarEmp();
    Page2AggEmp aerh = new Page2AggEmp();
    Page3ModifEmp merh = new Page3ModifEmp();
    Page4EliminarEmp eerh = new Page4EliminarEmp();
    ConsDept cderh = new ConsDept();
    AggDept aderh = new AggDept();
    ModDept mderh = new ModDept();
    ElimDept ederh = new ElimDept();
    ConsDirEmp cdirh = new ConsDirEmp();
    AggDirEmp adirh = new AggDirEmp();
    ModDirEmp mdirh = new ModDirEmp();
    ElimDirEmp edirh = new ElimDirEmp();
    
    GerenteTaller gt = new GerenteTaller();
    PageIniGT igt = new PageIniGT();
    Page2AggVcl avcgt = new Page2AggVcl();
    Page3ModifVcl mvcgt = new Page3ModifVcl();
    Page4EliminarVcl evcgt = new Page4EliminarVcl();
    Page1BuscVers cvgt = new Page1BuscVers();
    Page2AggVrs avgt = new Page2AggVrs();
    Page3ModifVrs mvgt = new Page3ModifVrs();
    Page4ElimVrs evgt = new Page4ElimVrs();
    Page1BuscModelo cmgt = new Page1BuscModelo();
    Page2AggModelo amgt = new Page2AggModelo();
    Page3ModifModelo mmgt = new Page3ModifModelo();
    Page4EliminarModelo emgt = new Page4EliminarModelo();
    Page1BuscColor ccgt = new Page1BuscColor();
    Page2AggColor acgt = new Page2AggColor();
    Page3ModifColor mcgt = new Page3ModifColor();
    Page4EliminarColor ecgt = new Page4EliminarColor();
    
    VendedorPiso vp = new VendedorPiso();
    PageIniVP ivp = new PageIniVP();
    Page1ConsCot ccotvp = new Page1ConsCot();
    Page3BusCli cclivp = new Page3BusCli();
    Page4AggCli aclivp = new Page4AggCli();
    Page5ModifCli mclivp = new Page5ModifCli();
    Page6ElimCli eclivp = new Page6ElimCli();
    Page7BusFact cfvp = new Page7BusFact();
    Page8AggFact afvp = new Page8AggFact();
    Page9ModifFact mfvp = new Page9ModifFact();
    Page10ElimFact efvp = new Page10ElimFact();
    
    public ControlUsuarios(InicioSesion Is, Administrador Ad, GerenteAdmin Gad, 
                            GerenteTaller Gt, VendedorPiso Vp, Consultas_Admin cons){
        this.is = Is;
        this.con = cons;
        this.c = Ad;
        this.ga = Gad;
        this.gt = Gt;
        this.vp = Vp;
        
        this.is.btnIniciar.addActionListener(this);
        
        this.ia.btnCSesion.addActionListener(this);
        this.c.btnConsultar.addActionListener(this);
        this.c.btnAgregar.addActionListener(this);
        this.c.btnModificar.addActionListener(this);
        this.c.btnEliminar.addActionListener(this);
        
        this.ca.btnConsultar.addActionListener(this);        
        this.ca.listaEntidades.addActionListener(this);
        
        this.aggA.btnAgregarVcl.addActionListener(this);
        this.aggA.btnAgregarVrs.addActionListener(this);
        this.aggA.btnAgregarMdl.addActionListener(this);
        this.aggA.btnAgregarClr.addActionListener(this);
        this.aggA.btnAggEmp.addActionListener(this);
        this.aggA.btnAggDept.addActionListener(this);
        this.aggA.btnAggDirEmp.addActionListener(this);
        this.aggA.btnAggFact.addActionListener(this);
        this.aggA.btnAggCot.addActionListener(this);
        this.aggA.btnAggCli.addActionListener(this);
        this.aggA.btnAggDirCli.addActionListener(this);
        
        this.ma.btnModifVcl.addActionListener(this);
        this.ma.btnModifVrs.addActionListener(this);
        this.ma.btnModifMod.addActionListener(this);
        this.ma.btnModifColor.addActionListener(this);
        this.ma.btnModifEmp.addActionListener(this);
        this.ma.btnModifDpt.addActionListener(this);
        this.ma.btnModifDirEmp.addActionListener(this);
        this.ma.btnModifFacts.addActionListener(this);
        this.ma.btnModifCotiz.addActionListener(this);
        this.ma.btnModifCli.addActionListener(this);
        this.ma.btnModifDirCli.addActionListener(this);
        
        this.ea.btnEliminarVcl.addActionListener(this);
        this.ea.btnElimVrs.addActionListener(this);
        this.ea.btnElimMod.addActionListener(this);
        this.ea.btnElimClr.addActionListener(this);
        this.ea.btnElimEmp.addActionListener(this);
        this.ea.btnElimDept.addActionListener(this);
        this.ea.btnElimDirEmp.addActionListener(this);
        this.ea.btnElimFact.addActionListener(this);
        this.ea.btnElimCot.addActionListener(this);
        this.ea.btnElimCli.addActionListener(this);
        this.ea.btnElimDirCli.addActionListener(this);
        
        this.iga.btnCSesion.addActionListener(this);
        this.ga.btnVhcls.addActionListener(this);
        this.ga.btnFacturas.addActionListener(this);
        this.ga.btnClientes.addActionListener(this);
        this.ga.btnCotiz.addActionListener(this);
        this.ga.btnConsultarVcl.addActionListener(this);
        this.ga.btnConsultarFact.addActionListener(this);
        this.ga.btnConsultarCli.addActionListener(this);
        this.ga.btnConsultarCot.addActionListener(this);
        this.ga.btnEliminarCot.addActionListener(this);
        this.gabvcgt.btnConsultarV.addActionListener(this);
        this.cfga.btnConsFact.addActionListener(this);
        this.cliga.btnConsCli.addActionListener(this);
        this.cotga.btnConsultarCot.addActionListener(this);
        this.ecotga.btnElimCot.addActionListener(this);
        
        this.igt.btnCSesion.addActionListener(this);
        this.gt.btnVhcls.addActionListener(this);
        this.gt.btnVersiones.addActionListener(this);
        this.gt.btnModelos.addActionListener(this);
        this.gt.btnColores.addActionListener(this);
        this.gt.btnConsultar.addActionListener(this);
        this.gt.btnConsultarV.addActionListener(this);
        this.gt.btnConsultarM.addActionListener(this);
        this.gt.btnConsultarC.addActionListener(this);
        this.cvgt.btnConsultarVrs.addActionListener(this);
        this.cmgt.btnConsultar.addActionListener(this);
        this.ccgt.btnConsultar.addActionListener(this);
        this.avcgt.btnAgregar.addActionListener(this);       
        this.avgt.btnAgregar.addActionListener(this);       
        this.amgt.btnAgregar.addActionListener(this);       
        this.acgt.btnAgregar.addActionListener(this);
        this.mvcgt.btnModificar.addActionListener(this);
        this.mvgt.btnModificar.addActionListener(this);
        this.mmgt.btnModificar.addActionListener(this);
        this.mcgt.btnModificar.addActionListener(this);
        this.evcgt.btnElimVcl.addActionListener(this);
        this.evgt.btnElimVrs.addActionListener(this);
        this.emgt.btnElimMod.addActionListener(this);
        this.ecgt.btnElimClr.addActionListener(this);
        
        this.cerh.btnConsEmp.addActionListener(this);
        this.aerh.btnAggEmp.addActionListener(this);
        this.merh.btnModifEmp.addActionListener(this);
        this.eerh.btnElimEmp.addActionListener(this);
        this.cderh.btnConsDept.addActionListener(this);
//        this.aderh.btnAggDept.addActionListener(this); Botones que estén comentados es porque su acción 
//                                                          está importada a otro botón dentro de otro panel
//        this.mderh.btnModDept.addActionListener(this);
//        this.ederh.btnElimDept.addActionListener(this);
        this.cdirh.btnConsDirEmp.addActionListener(this);
//        this.adirh.btnAggDirEmp.addActionListener(this);
//        this.mdirh.btnModifDirEmp.addActionListener(this);
//        this.edirh.btnElimDirEmp.addActionListener(this);
        
//        this.gabvcgt.btnConsultarV.addActionListener(this);
        this.ccotvp.btnConsCot.addActionListener(this);
        this.cclivp.btnConsCli.addActionListener(this);
        this.aclivp.btnAggCli.addActionListener(this);
        this.mclivp.btnModifCli.addActionListener(this);
        this.eclivp.btnElimCli.addActionListener(this);
        this.cfvp.btnConsFact.addActionListener(this);
        this.afvp.btnAggFact.addActionListener(this);
        this.mfvp.btnModifFact.addActionListener(this);
        this.efvp.btnElimFact.addActionListener(this);
        
    }
    public void IniciarV(){
        is.setTitle("Ventana de Inicio de Sesión");
        is.pack();
        is.setDefaultCloseOperation(InicioSesion.EXIT_ON_CLOSE);
        is.setLocationRelativeTo(null);
        is.setVisible(true);
    }
    public void VistaUser() {
        if(is.txtUser.getText().equals("admin") && String.valueOf(is.passContr.getPassword()).equals("DLGNT_049")) {
            c.setTitle("Ventana de Usuario Administrador");
            c.pack();
            c.setDefaultCloseOperation(Administrador.DISPOSE_ON_CLOSE);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
            cp.ShowPanel(ia, c.pnlContent);
        } else if(is.txtUser.getText().equals("ANRM") && String.valueOf(is.passContr.getPassword()).equals("MEST_349")) {
            ga.setTitle("Ventana de Usuario Gerente Administrativo");
            ga.pack();
            ga.setDefaultCloseOperation(GerenteAdmin.DISPOSE_ON_CLOSE);
            ga.setLocationRelativeTo(null);
            ga.setVisible(true);
            cp.ShowPanel(iga, ga.pnlContent);
            this.OcultarOptions();
        } else if(is.txtUser.getText().equals("LUAC") && String.valueOf(is.passContr.getPassword()).equals("Crza_2023")) {
            gt.setTitle("Ventana de Usuario Gerente de Taller");
            gt.pack();
            gt.setDefaultCloseOperation(GerenteTaller.DISPOSE_ON_CLOSE);
            gt.setLocationRelativeTo(null);
            gt.setVisible(true);
            cp.ShowPanel(iga, gt.pnlContent);
            this.OcultarOptions();
        } else if(is.txtUser.getText().equals("CUBB") && String.valueOf(is.passContr.getPassword()).equals("LAIV-243")) {
            grh.setTitle("Ventana de Usuario Gerente de Recursos Humanos");
            grh.pack();
            grh.setDefaultCloseOperation(GerenteRH.DISPOSE_ON_CLOSE);
            grh.setLocationRelativeTo(null);
            grh.setVisible(true);
            cp.ShowPanel(igrh, grh.pnlContent);
            this.OcultarOptions();
        } else if(is.txtUser.getText().equals("ALRT") && String.valueOf(is.passContr.getPassword()).equals("Tramp-492")) {
            vp.setTitle("Ventana de Usuario Vendedor de Piso 1");
            vp.pack();
            vp.setDefaultCloseOperation(VendedorPiso.DISPOSE_ON_CLOSE);
            vp.setLocationRelativeTo(null);
            vp.setVisible(true);
            cp.ShowPanel(ivp, vp.pnlContent);
            this.OcultarOptions();
        } else if(is.txtUser.getText().equals("FRPR") && String.valueOf(is.passContr.getPassword()).equals("BRTK_165")) {
            vp.setTitle("Ventana de Usuario Vendedor de Piso 2");
            vp.pack();
            vp.setDefaultCloseOperation(VendedorPiso.DISPOSE_ON_CLOSE);
            vp.setLocationRelativeTo(null);
            vp.setVisible(true);
            cp.ShowPanel(ivp, vp.pnlContent);
            this.OcultarOptions();
        } else if(is.txtUser.getText().equals("PAAB") && String.valueOf(is.passContr.getPassword()).equals("CONC_034")) {
            vp.setTitle("Ventana de Usuario Vendedor de Piso 3");
            vp.pack();
            vp.setDefaultCloseOperation(VendedorPiso.DISPOSE_ON_CLOSE);
            vp.setLocationRelativeTo(null);
            vp.setVisible(true);
            cp.ShowPanel(ivp, vp.pnlContent);
            this.OcultarOptions();
        }
    }
    public void OcultarPanels () {
        ca.lblNSVcl.setVisible(false);
        ca.lblIdVrs.setVisible(false);
        ca.lblIdMod.setVisible(false);
        ca.lblIdColor.setVisible(false);
        ca.lblIdEmp.setVisible(false);
        ca.lblIdDept.setVisible(false);
        ca.lblIdDirEmp.setVisible(false);
        ca.lblIdCot.setVisible(false);
        ca.lblCodFact.setVisible(false);
        ca.lblIdCli.setVisible(false);
        ca.lblIdDirCli.setVisible(false);
        aggA.AggVcls.setVisible(false);
        aggA.AggVrs.setVisible(false);
        aggA.AggModelos.setVisible(false);
        aggA.AggColors.setVisible(false);
        aggA.AggEmp.setVisible(false);
        aggA.AggDept.setVisible(false);
        aggA.AggDirEmp.setVisible(false);
        aggA.AggCotiz.setVisible(false);
        aggA.AggFacts.setVisible(false);
        aggA.AggCli.setVisible(false);
        aggA.AggDirCli.setVisible(false);
    }
    private void OcultarOptions() {
        ga.pnlOpcionVcl.setVisible(false);
        ga.pnlOpcionFct.setVisible(false);
        ga.pnlOpcionCli.setVisible(false);
        ga.pnlOpcionCot.setVisible(false);
        gt.pnlSVcl.setVisible(false);
        gt.pnlSVersiones.setVisible(false);
        gt.pnlSModelos.setVisible(false);
        gt.pnlSColores.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Ventana Iniciar Sesión
        if(this.is.btnIniciar == e.getSource()){
            try {
                this.VistaUser();
                javax.swing.JOptionPane.showMessageDialog(is, "Intento de inicio de sesión con los datos:\nUsuario: " + 
                    is.txtUser.getText() + "\nContraseña: " + String.valueOf(is.passContr.getPassword()), "Sesión Iniciada", 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }catch(HeadlessException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        
        // Ventana Usuario Administrador Consultar
        else if(this.c.btnConsultar == e.getSource()){
            try {
                cp.ShowPanel(ca, c.pnlContent);
                this.OcultarPanels();
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.ca.listaEntidades == e.getSource()) {
            try {
                switch (ca.listaEntidades.getSelectedItem().toString()) {
                    case "Vehículos":
                        this.OcultarPanels();
                        ca.lblNSVcl.setVisible(true);
                        break;
                    case "Versiones":
                        this.OcultarPanels();
                        ca.lblIdVrs.setVisible(true);
                        break;
                    case "Modelos":
                        this.OcultarPanels();
                        ca.lblIdMod.setVisible(true);
                        break;
                    case "Colores":
                        this.OcultarPanels();
                        ca.lblIdColor.setVisible(true);
                        break;
                    case "Empleados":
                        this.OcultarPanels();
                        ca.lblIdEmp.setVisible(true);
                        break;
                    case "Departamentos":
                        this.OcultarPanels();
                        ca.lblIdDept.setVisible(true);
                        break;
                    case "DireccionesEmpleados":
                        this.OcultarPanels();
                        ca.lblIdDirEmp.setVisible(true);
                        break;
                    case "Cotizaciones":
                        this.OcultarPanels();
                        ca.lblIdCot.setVisible(true);
                        break;
                    case "Facturas":
                        this.OcultarPanels();
                        ca.lblCodFact.setVisible(true);
                        break;
                    case "Clientes":
                        this.OcultarPanels();
                        ca.lblIdCli.setVisible(true);
                        break;
                    case "DireccionesClientes":
                        this.OcultarPanels();
                        ca.lblIdDirCli.setVisible(true);
                        break;
                    default:
                        break;
                }
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.ca.btnConsultar == e.getSource()) {
            try {
                if (ca.lblNSVcl.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsVehcls(ca.txtBuscar.getText()));
                } else if(ca.lblIdVrs.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsVers(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdMod.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsMod(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdColor.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsColor(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdEmp.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsEmp(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdDept.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsDep(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdDirEmp.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsDirEmp(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdCot.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsCoti(ca.txtBuscar.getText()));
                    
                } else if(ca.lblCodFact.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsFact(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdCli.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsCli(ca.txtBuscar.getText()));
                    
                } else if(ca.lblIdDirCli.isVisible()) {
                    ca.tableConsultarVrs.setModel(con.ConsDirCli(ca.txtBuscar.getText()));
                    
                }
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        
        // Ventana GerenteAdmin
        else if(this.ga.btnVhcls == e.getSource()){
            try {
                if (ga.pnlOpcionVcl.isVisible()) {
                    ga.pnlOpcionVcl.setVisible(false);
                }else{
                    OcultarOptions();
                    ga.pnlOpcionVcl.setVisible(true);
                }
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnFacturas == e.getSource()){
            try {
                if (ga.pnlOpcionFct.isVisible()) {
                    ga.pnlOpcionFct.setVisible(false);
                }else{
                    OcultarOptions();
                    ga.pnlOpcionFct.setVisible(true);
                }
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnClientes == e.getSource()){
            try {
                if (ga.pnlOpcionCli.isVisible()) {
                    ga.pnlOpcionCli.setVisible(false);
                }else{
                    OcultarOptions();
                    ga.pnlOpcionCli.setVisible(true);
                }
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnCotiz == e.getSource()){
            try {
                if (ga.pnlOpcionCot.isVisible()) {
                    ga.pnlOpcionCot.setVisible(false);
                }else{
                    OcultarOptions();
                    ga.pnlOpcionCot.setVisible(true);
                }
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnConsultarVcl == e.getSource()){
            try {
                gabvcgt.lblUsuario.setText("Gerente Administrativo");
                cp.ShowPanel(gabvcgt, ga.pnlContent);
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.gabvcgt.btnConsultarV == e.getSource()){
            try {
                gabvcgt.tableConsultarVcl.setModel(con.ConsVehcls(gabvcgt.txtBuscar.getText()));
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnConsultarFact == e.getSource()){
            try {
                cp.ShowPanel(cfga, ga.pnlContent);
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.cfga.btnConsFact == e.getSource()){
            try {
                cfga.tableConsultarFct.setModel(con.ConsFact(cfga.txtBuscar.getText()));
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnConsultarCli == e.getSource()){
            try {
                cp.ShowPanel(cliga, ga.pnlContent);
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.cliga.btnConsCli == e.getSource()){
            try {
                cliga.tableConsultarCli.setModel(con.ConsCli(cliga.txtBuscar.getText()));
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.ga.btnConsultarCot == e.getSource()){
            try {
                cp.ShowPanel(cotga, ga.pnlContent);
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(this.cotga.btnConsultarCot == e.getSource()){
            try {
                cotga.tableConsultarCot.setModel(con.ConsCoti(cotga.txtBuscar.getText()));
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
        //Ventana Gerente Administrativo Eliminar Cotizaciones
        else if(ecotga.btnElimCot == e.getSource()) {
            try{
                con.EliminarCotizaciones(Integer.parseInt(ecotga.txtBuscar.getText()));
                javax.swing.JOptionPane.showMessageDialog(ecotga, "La cotización " + ecotga.txtBuscar.getText() + " se ha eliminado correctamente", "Acción completada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Ventana Administrador Agregar
        else if(this.c.btnAgregar == e.getSource()){
            try {
                cp.ShowPanel(aggA, c.pnlContent);
            }catch(Exception ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarVcl == e.getSource()) {
            try {
                con.AltVeh(aggA.txtNumSerie.getText(), aggA.txtPaisP.getText(), aggA.txtStock.getText(), 
                            aggA.txtPrecio.getText(), aggA.txtModelo.getText(), aggA.txtVersion.getText(), 
                            aggA.txtColor.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }else if (this.aggA.btnAgregarVrs == e.getSource()) {
            try {
                con.AltVer(aggA.txtId.getText(), aggA.txtNombreVrs.getText(), aggA.txtMotorMt.getText(), aggA.txtTransmision.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }else if (this.aggA.btnAgregarMdl == e.getSource()) {
            try {
                con.AltMod(aggA.txtIdModelo.getText(), aggA.txtNombreMod.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarClr == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAggEmp == e.getSource()) {
            try {
                con.AltEmp(aggA.txtIdEmp.getText(), aggA.txtNombreEmp.getText(), aggA.txtApellEmp.getText(), 
                        aggA.txtUserEmp.getText(), aggA.txtContrEmp.getText(), aggA.txtComiEmp.getText(), 
                        aggA.txtNSSEmp.getText(), aggA.txtTelefEmp.getText(), aggA.txtNombreEmp.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAggEmp == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarClr == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarClr == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarClr == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarClr == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.btnAgregarClr == e.getSource()) {
            try {
                con.AltCol(aggA.txtIdColor.getText(), aggA.txtNombreClr.getText());
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (this.aggA.listaEntidades == e.getSource()) {
            try {
                switch (aggA.listaEntidades.getSelectedItem().toString()) {
                    case "Vehículos":
                        OcultarPanels();
                        aggA.AggVcls.setVisible(true);
                        break;
                    case "Versiones":
                        OcultarPanels();
                        aggA.AggVrs.setVisible(true);
                        break;
                    case "Modelos":
                        OcultarPanels();
                        aggA.AggModelos.setVisible(true);
                        break;
                    case "Colores":
                        OcultarPanels();
                        aggA.AggColors.setVisible(true);
                        break;
                    case "Empleados":
                        OcultarPanels();
                        aggA.AggEmp.setVisible(true);
                        break;
                    case "Departamentos":
                        OcultarPanels();
                        aggA.AggDept.setVisible(true);
                        break;
                    case "DireccionesEmpleados":
                        OcultarPanels();
                        aggA.AggDirEmp.setVisible(true);
                        break;
                    case "Cotizaciones":
                        OcultarPanels();
                        aggA.AggCotiz.setVisible(true);
                        break;
                    case "Facturas":
                        OcultarPanels();
                        aggA.AggFacts.setVisible(true);
                        break;
                    case "Clientes":
                        OcultarPanels();
                        aggA.AggCli.setVisible(true);
                        break;
                    case "DireccionesClientes":
                        OcultarPanels();
                        aggA.AggDirCli.setVisible(true);
                        break;
                    default:
                        break;
        }
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        //Ventana Administrador Modificar
        else if(c.btnModificar == e.getSource()){
            try{
                cp.ShowPanel(ma, c.pnlContent);
            } catch(Exception exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifVcl == e.getSource()){
            try{
                con.ModificarVehiculos(Integer.parseInt(ma.txtNumSerie.getText()), ma.txtPaisP.getText(), ma.txtStock.getText(), 
                        ma.txtPrecio.getText());
            } catch(NumberFormatException exc){
                javax.swing.JOptionPane.showMessageDialog(is, exc, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifVrs == e.getSource()){
            try {
                con.ModificarVersiones(Integer.parseInt(ma.txtIdVrs.getText()), ma.txtNombreVrs.getText(), ma.txtMotorVrs.getText(), ma.txtTransVrs.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifMod == e.getSource()){
            try {
                con.ModificarModelos(Integer.parseInt(ma.txtIdModelo.getText()), ma.txtModelo.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifColor == e.getSource()){
            try {
                con.ModificarColores(Integer.parseInt(ma.txtIdColor.getText()), ma.txtColor.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifEmp == e.getSource()){
            try {
                con.ModificarEmpleados(Integer.parseInt(ma.txtIdEmp.getText()),
                                        ma.txtNombreEmp.getText(), ma.txtApellEmp.getText(),ma.txtComsEmp.getText(), 
                                        ma.txtNSSEmp.getText(), ma.txtUsuarioEmp.getText(), ma.txtContrEmp.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifDpt == e.getSource()){
            try {
                con.ModificarDepartamentos(Integer.parseInt(ma.txtIdDept.getText()), ma.txtNombreDept.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifDirEmp == e.getSource()){
            try {
                con.ModificarDireccionesEmpleados(Integer.parseInt(ma.txtIdDirEmp.getText()), ma.txtColonia.getText(), ma.txtCalle.getText(), ma.txtNumExt.getText(), ma.txtCP.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.ModCotiz == e.getSource()){
            try {
                con.ModificarCotizaciones(Integer.parseInt(ma.txtIdCot.getText()), ma.txtFechCot.getText(), ma.txtUsuarioCot.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.ModFacts == e.getSource()){
            try {
                con.ModificarFacturas(Integer.parseInt(ma.txtIdFacts.getText()), ma.txtMetPago.getText(), ma.txtFechVent.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.ModCli == e.getSource()){
            try {
                con.ModificarClientes(Integer.parseInt(ma.txtIdCli.getText()), ma.txtNombreCli.getText(), ma.txtApellCli.getText(), 
                                        ma.txtHCredCli.getText(), ma.txtFechRegCli.getText(), ma.txtSueldoCli.getText(), ma.txtRFCcli.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } else if(ma.btnModifDirCli == e.getSource()){
            try {
                con.ModificarDireccionesClientes(Integer.parseInt(ma.txtIdCli.getText()), ma.txtColonia.getText(), ma.txtCalleCli.getText(), ma.txtNumExt.getText(), ma.txtCP.getText());
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        } //Ventana administrador eliminar
        else if(ea.btnEliminarVcl == e.getSource()) {
            try{
                con.EliminarVehiculos(Integer.parseInt(ea.txtElimVcl.getText()));
                javax.swing.JOptionPane.showMessageDialog(ea, "El vehiculo " + ea.txtElimVcl.getText() + " se ha eliminado correctamente", "Acción completada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }else if(ea.btnElimVrs == e.getSource()) {
            try{
                con.EliminarVersiones(Integer.parseInt(ea.txtElimVrs.getText()));
                javax.swing.JOptionPane.showMessageDialog(ea, "La version " + ea.txtElimVrs.getText() + " se ha eliminado correctamente", "Acción completada", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }catch(NumberFormatException ex){
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }  else if(ca.btnConsultar == e.getSource()) {
            try{
                if(Integer.parseInt(ca.txtBuscar.getText()) == 34223) {
                    ca.tableConsultarVrs.setModel(con.ConsVehcls(ca.txtBuscar.getText()));
                } 
            }catch(NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(is, ex, "Error encontrado", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
        
    
    
}