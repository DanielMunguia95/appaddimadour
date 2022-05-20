/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import static Controleur.CtrlLogin.mostrarFrm;
import Modele.DB.QueryLabo;
import Modele.Labo;
import Vue.frmLabo;
import Vue.frmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Altair
 */
public class CtrlMenu implements ActionListener {

    private frmMenu frmMenu;
    private String user;

    public CtrlMenu(frmMenu frmMenu, String user) {
        this.frmMenu = frmMenu;
        this.user = user;

        this.frmMenu.btnMenuLabo.addActionListener(this);
    }

    public void iniciar() {
        frmMenu.setTitle("Labo");
        frmMenu.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmMenu.btnMenuLabo)) {
            Labo labo = new Labo();

            QueryLabo queryLabo = new QueryLabo();
            frmLabo frmLabo = new frmLabo();

            CtrlLabo ctrlLabo = new CtrlLabo(labo, queryLabo, frmLabo, user);

            ctrlLabo.iniciar();
            mostrarFrm(frmLabo);
            frmMenu.setVisible(false);
        }
       }

}
