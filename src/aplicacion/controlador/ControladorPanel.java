/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import appVendedorPiso.ConsultarAdmin;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Steph
 */
public class ControladorPanel {
    
    ConsultarAdmin ca = new ConsultarAdmin();
    
    public void ShowPanel(JPanel p, JPanel pnlContent){
        p.setSize(540, 480);
        p.setLocation(0, 0);
        
        pnlContent.removeAll();
        pnlContent.add(p, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
    }
}
