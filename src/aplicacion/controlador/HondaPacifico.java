/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.vista.*;
import aplicacion.modelo.*;

public class HondaPacifico {
    
    
    public static void main(String[] args) {
        InicioSesion i = new InicioSesion();
        Administrador a = new Administrador();
        GerenteAdmin ga = new GerenteAdmin();
        GerenteTaller gt = new GerenteTaller();
        VendedorPiso vp = new VendedorPiso();
        Consultas_Admin c = new Consultas_Admin();
        ControlUsuarios cu = new ControlUsuarios(i, a, ga, gt, vp, c);
        
        cu.IniciarV();
    }
}
