/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registradour;

import Modele.Login;
import Modele.DB.QueryLogin;
import Vue.frmLogin1;

import Controleur.CtrlLogin;

/**
 *
 * @author Altair
 */
public class Registradour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Login login = new Login();

            QueryLogin queryLogin = new QueryLogin();
            frmLogin1 frmLogin1 = new frmLogin1();

            CtrlLogin ctrlLogin = new CtrlLogin(login, queryLogin, frmLogin1);

            ctrlLogin.iniciar();
            frmLogin1.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}
