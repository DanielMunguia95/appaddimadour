/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.DB.QueryLabo;
import Modele.DB.QueryLaboPoli;
import Modele.Labo;
import Modele.LaboPoli;
import Vue.frmLabo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Altair
 */
public class CtrlLaboPoli extends CtrlLabo implements ActionListener {

    private LaboPoli laboPoli;
    private QueryLaboPoli queryPoli;
    private frmLabo frmLabo;
    private String user;

    public CtrlLaboPoli(LaboPoli laboPoli, QueryLaboPoli queryPoli, frmLabo frmLabo, String user, Labo labo, QueryLabo queryLabo) {
        super(labo, queryLabo, frmLabo, user);
        this.laboPoli = laboPoli;
        this.queryPoli = queryPoli;
        this.frmLabo = frmLabo;
        this.user = user;

        this.frmLabo.Panel4btnConsulter.addActionListener(this);
        this.frmLabo.Panel4btnEnregistrer.addActionListener(this);
        this.frmLabo.Panel4btnMettre.addActionListener(this);
        this.frmLabo.Panel4btnSupprimmer.addActionListener(this);
    }

    
    public void Iniciar() {

        System.out.println("Inicia Poli");

    }

    @Override
    public void limpiar() {

        frmLabo.Panel4txtFait1.setText(null);
        frmLabo.Panel4txtFait2.setText(null);
        frmLabo.Panel4txtFait3.setText(null);
        frmLabo.Panel4txtFait4.setText(null);
        frmLabo.Panel4txtFait5.setText(null);
        frmLabo.Panel4txtFait6.setText(null);

        frmLabo.Panel4txtGamme1.setText(null);
        frmLabo.Panel4txtGamme2.setText(null);
        frmLabo.Panel4txtGamme3.setText(null);
        frmLabo.Panel4txtGamme4.setText(null);
        frmLabo.Panel4txtGamme5.setText(null);
        frmLabo.Panel4txtGamme6.setText(null);

        frmLabo.Panel4txtObservation1.setText(null);
        frmLabo.Panel4txtObservation2.setText(null);
        frmLabo.Panel4txtObservation3.setText(null);
        frmLabo.Panel4txtObservation4.setText(null);
        frmLabo.Panel4txtObservation5.setText(null);
        frmLabo.Panel4txtObservation6.setText(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmLabo.Panel4btnConsulter)) {
            int index = frmLabo.Panel4cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel4cmbLabo.getItemAt(index);

            laboPoli = queryPoli.getLabPoli(selecLabo);

            frmLabo.Panel4txtFait1.setText(laboPoli.getFait1());
            frmLabo.Panel4txtFait2.setText(laboPoli.getFait2());
            frmLabo.Panel4txtFait3.setText(laboPoli.getFait3());
            frmLabo.Panel4txtFait4.setText(laboPoli.getFait4());
            frmLabo.Panel4txtFait5.setText(laboPoli.getFait5());
            frmLabo.Panel4txtFait6.setText(laboPoli.getFait6());

            frmLabo.Panel4txtGamme1.setText(laboPoli.getGamme1());
            frmLabo.Panel4txtGamme2.setText(laboPoli.getGamme2());
            frmLabo.Panel4txtGamme3.setText(laboPoli.getGamme3());
            frmLabo.Panel4txtGamme4.setText(laboPoli.getGamme4());
            frmLabo.Panel4txtGamme5.setText(laboPoli.getGamme5());
            frmLabo.Panel4txtGamme6.setText(laboPoli.getGamme6());

            frmLabo.Panel4txtObservation1.setText(laboPoli.getObservation1());
            frmLabo.Panel4txtObservation2.setText(laboPoli.getObservation2());
            frmLabo.Panel4txtObservation3.setText(laboPoli.getObservation3());
            frmLabo.Panel4txtObservation4.setText(laboPoli.getObservation4());
            frmLabo.Panel4txtObservation5.setText(laboPoli.getObservation5());
            frmLabo.Panel4txtObservation6.setText(laboPoli.getObservation6());

        }

        if (e.getSource().equals(frmLabo.Panel4btnEnregistrer)) {
            boolean save = false;
            int index = frmLabo.Panel4cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel4cmbLabo.getItemAt(index);
            laboPoli.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboPoli.setFait1(frmLabo.Panel4txtFait1.getText() == null ? "" : frmLabo.Panel4txtFait1.getText());
            laboPoli.setFait2(frmLabo.Panel4txtFait2.getText() == null ? "" : frmLabo.Panel4txtFait2.getText());
            laboPoli.setFait3(frmLabo.Panel4txtFait3.getText() == null ? "" : frmLabo.Panel4txtFait3.getText());
            laboPoli.setFait4(frmLabo.Panel4txtFait4.getText() == null ? "" : frmLabo.Panel4txtFait4.getText());
            laboPoli.setFait5(frmLabo.Panel4txtFait5.getText() == null ? "" : frmLabo.Panel4txtFait5.getText());
            laboPoli.setFait6(frmLabo.Panel4txtFait6.getText() == null ? "" : frmLabo.Panel4txtFait6.getText());

            laboPoli.setGamme1(frmLabo.Panel4txtGamme1.getText() == null ? "" : frmLabo.Panel4txtGamme1.getText());
            laboPoli.setGamme2(frmLabo.Panel4txtGamme2.getText() == null ? "" : frmLabo.Panel4txtGamme2.getText());
            laboPoli.setGamme3(frmLabo.Panel4txtGamme3.getText() == null ? "" : frmLabo.Panel4txtGamme3.getText());
            laboPoli.setGamme4(frmLabo.Panel4txtGamme4.getText() == null ? "" : frmLabo.Panel4txtGamme4.getText());
            laboPoli.setGamme5(frmLabo.Panel4txtGamme5.getText() == null ? "" : frmLabo.Panel4txtGamme5.getText());
            laboPoli.setGamme6(frmLabo.Panel4txtGamme6.getText() == null ? "" : frmLabo.Panel4txtGamme6.getText());

            laboPoli.setObservation1(frmLabo.Panel4txtObservation1.getText() == null ? "" : frmLabo.Panel4txtObservation1.getText());
            laboPoli.setObservation2(frmLabo.Panel4txtObservation2.getText() == null ? "" : frmLabo.Panel4txtObservation2.getText());
            laboPoli.setObservation3(frmLabo.Panel4txtObservation3.getText() == null ? "" : frmLabo.Panel4txtObservation3.getText());
            laboPoli.setObservation4(frmLabo.Panel4txtObservation4.getText() == null ? "" : frmLabo.Panel4txtObservation4.getText());
            laboPoli.setObservation5(frmLabo.Panel4txtObservation5.getText() == null ? "" : frmLabo.Panel4txtObservation5.getText());
            laboPoli.setObservation6(frmLabo.Panel4txtObservation6.getText() == null ? "" : frmLabo.Panel4txtObservation6.getText());

            save = queryPoli.saveLaboPoli(laboPoli);

            if (save) {
                System.out.println("LaboTON INSERTADO");
            } else {
                System.out.println("LaboTON NO INSERTADO");

            }

            limpiar();
        }

        if (e.getSource().equals(frmLabo.Panel4btnMettre)) {

            int index = frmLabo.Panel4cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel4cmbLabo.getItemAt(index);
            laboPoli.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboPoli.setFait1(frmLabo.Panel4txtFait1.getText() == null ? "" : frmLabo.Panel4txtFait1.getText());
            laboPoli.setFait2(frmLabo.Panel4txtFait2.getText() == null ? "" : frmLabo.Panel4txtFait2.getText());
            laboPoli.setFait3(frmLabo.Panel4txtFait3.getText() == null ? "" : frmLabo.Panel4txtFait3.getText());
            laboPoli.setFait4(frmLabo.Panel4txtFait4.getText() == null ? "" : frmLabo.Panel4txtFait4.getText());
            laboPoli.setFait5(frmLabo.Panel4txtFait5.getText() == null ? "" : frmLabo.Panel4txtFait5.getText());
            laboPoli.setFait6(frmLabo.Panel4txtFait6.getText() == null ? "" : frmLabo.Panel4txtFait6.getText());

            laboPoli.setGamme1(frmLabo.Panel4txtGamme1.getText() == null ? "" : frmLabo.Panel4txtGamme1.getText());
            laboPoli.setGamme2(frmLabo.Panel4txtGamme2.getText() == null ? "" : frmLabo.Panel4txtGamme2.getText());
            laboPoli.setGamme3(frmLabo.Panel4txtGamme3.getText() == null ? "" : frmLabo.Panel4txtGamme3.getText());
            laboPoli.setGamme4(frmLabo.Panel4txtGamme4.getText() == null ? "" : frmLabo.Panel4txtGamme4.getText());
            laboPoli.setGamme5(frmLabo.Panel4txtGamme5.getText() == null ? "" : frmLabo.Panel4txtGamme5.getText());
            laboPoli.setGamme6(frmLabo.Panel4txtGamme6.getText() == null ? "" : frmLabo.Panel4txtGamme6.getText());

            laboPoli.setObservation1(frmLabo.Panel4txtObservation1.getText() == null ? "" : frmLabo.Panel4txtObservation1.getText());
            laboPoli.setObservation2(frmLabo.Panel4txtObservation2.getText() == null ? "" : frmLabo.Panel4txtObservation2.getText());
            laboPoli.setObservation3(frmLabo.Panel4txtObservation3.getText() == null ? "" : frmLabo.Panel4txtObservation3.getText());
            laboPoli.setObservation4(frmLabo.Panel4txtObservation4.getText() == null ? "" : frmLabo.Panel4txtObservation4.getText());
            laboPoli.setObservation5(frmLabo.Panel4txtObservation5.getText() == null ? "" : frmLabo.Panel4txtObservation5.getText());
            laboPoli.setObservation6(frmLabo.Panel4txtObservation6.getText() == null ? "" : frmLabo.Panel4txtObservation6.getText());

            if (queryPoli.updateLaboPoli(laboPoli)) {
                System.out.println("update poli");
            } else {
                System.out.println("No se puede actualizar poli");
            }

            this.limpiar();

        }

        if (e.getSource().equals(frmLabo.Panel4btnSupprimmer)) {

            boolean delete = false;
            int index = frmLabo.Panel4cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel4cmbLabo.getItemAt(index);

            delete = queryPoli.deleteLaboPoli(selecLabo);
            if (delete) {
                System.out.println("Elemento elimando");
            } else {
                System.out.println("No puede eliminar5");
            }
            limpiar();

        }

    }
}
