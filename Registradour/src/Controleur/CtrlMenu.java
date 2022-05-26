/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import static Controleur.CtrlLogin.mostrarFrm;
import Modele.DB.QueryLabo;
import Modele.Labo;
import Vue.frmLabo;
//WAAM
import Vue.frmWam;
import Modele.WaamCabecer;
import Modele.DB.QueryWaam;

//Depot
import Vue.frmDepot;
import Modele.depotCabecer;
import Modele.DB.QueryDepot;

//LMD
import Vue.frmLMD;
import Modele.LmdCabecer;
import Modele.DB.QueryLmd;

import static Controleur.CtrlLogin.mostrarFrmWaam;

import static Controleur.CtrlLogin.mostrarFrmDepot;

import static Controleur.CtrlLogin.mostrarFrmLmd;
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
        this.frmMenu.btnMenuWaam.addActionListener(this);
        this.frmMenu.btnMenuDepot.addActionListener(this);
        this.frmMenu.btnMenuLmd.addActionListener(this);
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
        if (e.getSource().equals(frmMenu.btnMenuWaam)) {
            WaamCabecer waam = new WaamCabecer();

            QueryWaam queryWaam = new QueryWaam();
            frmWam frmWaam = new frmWam();

            CtrlWaam ctrlWaam = new CtrlWaam(waam, queryWaam, frmWaam, user);

            ctrlWaam.iniciar();
            mostrarFrmWaam(frmWaam);
            frmMenu.setVisible(false);
        }
        if (e.getSource().equals(frmMenu.btnMenuDepot)) {
            depotCabecer depot = new depotCabecer();

            QueryDepot queryDepot = new QueryDepot();
            frmDepot frmDepot = new frmDepot();

            CtrlDepot ctrlDepot = new CtrlDepot(depot, queryDepot, frmDepot, user);

            ctrlDepot.iniciar();
            mostrarFrmDepot(frmDepot);
            frmMenu.setVisible(false);
        }
        if (e.getSource().equals(frmMenu.btnMenuLmd)) {
            LmdCabecer lmd = new LmdCabecer();

            QueryLmd queryLmd = new QueryLmd();
            frmLMD frmLmd = new frmLMD();

            CtrlLmd ctrlLmd = new CtrlLmd(lmd, queryLmd, frmLmd, user);

            ctrlLmd.iniciar();
            mostrarFrmLmd(frmLmd);
            frmMenu.setVisible(false);
        }
       }

}
