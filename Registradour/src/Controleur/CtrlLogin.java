package Controleur;

import Modele.Labo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modele.DB.QueryLogin;
import Modele.Login;
import Modele.DB.QueryLabo;
import Vue.frmLabo;
import Vue.frmWam;
import Vue.frmDepot;
import Vue.frmLogin1;
import Vue.frmMenu;
import Vue.frmLMD;
import javax.swing.JOptionPane;

/**
 *
 * @author Altair
 */
public class CtrlLogin implements ActionListener {

    private Login login;
    private QueryLogin queryL;
    private frmLogin1 frmLogin1;

    public CtrlLogin(Login login, QueryLogin queryL, frmLogin1 frmLogin) {

        this.login = login;
        this.queryL = queryL;
        this.frmLogin1 = frmLogin;
        this.frmLogin1.btnLogin.addActionListener(this);
        //se agregan los demas botones.
    }

    public void iniciar() {
        //sE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmLogin1.setTitle("Login");
        frmLogin1.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//action de cada objeto que esta en el formulario
        String user = "";
        if (e.getSource() == frmLogin1.btnLogin) {

            System.out.println(frmLogin1.txtUser.getText());
            login.setUser(frmLogin1.txtUser.getText());
            user = frmLogin1.txtUser.getText();
            login.setPassword(frmLogin1.txtPassword.getText());

            if (queryL.getUser(login)) {
                JOptionPane.showMessageDialog(frmLogin1, "Bienvenue" + user);
                frmMenu frmMenu=new frmMenu();
                
                CtrlMenu ctrMenu=new CtrlMenu(frmMenu, user);
                ctrMenu.iniciar();
                frmMenu.setVisible(true);
              
                frmLogin1.setVisible(false);

                //enviar a la siguiente pantalla
                limpiar();
            } else {
                JOptionPane.showMessageDialog(frmLogin1, "Le nom d'utilisateur n'existe pas" + user);
                           limpiar();
            }
        }

    }

    public static void mostrarFrm(frmLabo frmLabo) {
        frmLabo.setVisible(true);

    }
    
    public static void mostrarFrmWaam(frmWam frmWaam) {
        frmWaam.setVisible(true);

    }
    
    public static void mostrarFrmDepot(frmDepot frmDepot) {
        frmDepot.setVisible(true);

    }
    
    public static void mostrarFrmLmd(frmLMD frmLmd) {
        frmLmd.setVisible(true);

    }

    public void limpiar() {

        frmLogin1.txtPassword.setText(null);
        frmLogin1.txtUser.setText(null);
    }

}
