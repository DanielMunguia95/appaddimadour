/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.DB.QueryLabo;
import Modele.DB.QueryLaboAttaque;
import Modele.LaboAttaque;
import Vue.frmLabo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Altair
 */
public class CtrlLaboAttaque extends QueryLabo implements ActionListener {

    private LaboAttaque laboAttaque;
    private QueryLaboAttaque queryLaboAttaque;
    private frmLabo frmLabo;
    private String user;

    public CtrlLaboAttaque(LaboAttaque laboAttaque, QueryLaboAttaque queryLaboAttaque, frmLabo frmLabo, String user) {
        this.laboAttaque = laboAttaque;
        this.queryLaboAttaque = queryLaboAttaque;
        this.frmLabo = frmLabo;
        this.user = user;
        this.frmLabo.Panel5btnConsulter.addActionListener(this);
        this.frmLabo.Panel5btnEnregistrer.addActionListener(this);
        this.frmLabo.Panel5btnMettre.addActionListener(this);
        this.frmLabo.Panel5btnSupprimmer.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(frmLabo.Panel5btnConsulter)) {

            int index = frmLabo.Panel4cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel4cmbLabo.getItemAt(index);

            if (index != -1) {
                laboAttaque = queryLaboAttaque.getLabAttaque(selecLabo);

                frmLabo.Panel5txtTemp1.setText(laboAttaque.getTemps1());
                frmLabo.Panel5txtTemp2.setText(laboAttaque.getTemps2());
                frmLabo.Panel5txtTemp3.setText(laboAttaque.getTemps3());
                frmLabo.Panel5txtTemp4.setText(laboAttaque.getTemps4());
                frmLabo.Panel5txtTemp5.setText(laboAttaque.getTemps5());
                frmLabo.Panel5txtTemp6.setText(laboAttaque.getTemps6());

                frmLabo.Panel5txtReactif1.setText(laboAttaque.getReactif1());
                frmLabo.Panel5txtReactif2.setText(laboAttaque.getReactif2());
                frmLabo.Panel5txtReactif3.setText(laboAttaque.getReactif3());
                frmLabo.Panel5txtReactif4.setText(laboAttaque.getReactif4());
                frmLabo.Panel5txtReactif5.setText(laboAttaque.getReactif5());
                frmLabo.Panel5txtReactif6.setText(laboAttaque.getReactif6());

                frmLabo.Panel5txtObservation1.setText(laboAttaque.getObservation1());
                frmLabo.Panel5txtObservation2.setText(laboAttaque.getObservation2());
                frmLabo.Panel5txtObservation3.setText(laboAttaque.getObservation3());
                frmLabo.Panel5txtObservation4.setText(laboAttaque.getObservation4());
                frmLabo.Panel5txtObservation5.setText(laboAttaque.getObservation5());
                frmLabo.Panel5txtObservation6.setText(laboAttaque.getObservation6());
            } else {
                System.out.println("Selecciona un lab");
                JOptionPane.showMessageDialog(frmLabo, "Choisis une option");

            }
        }
        if (e.getSource().equals(frmLabo.Panel5btnEnregistrer)) {
            boolean save = false;
            int index = frmLabo.Panel5cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel5cmbLabo.getItemAt(index);
            laboAttaque.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboAttaque.setReactif1(frmLabo.Panel5txtReactif1.getText() == null ? "" : frmLabo.Panel5txtReactif1.getText());
            laboAttaque.setReactif2(frmLabo.Panel5txtReactif2.getText() == null ? "" : frmLabo.Panel5txtReactif2.getText());
            laboAttaque.setReactif3(frmLabo.Panel5txtReactif3.getText() == null ? "" : frmLabo.Panel5txtReactif3.getText());
            laboAttaque.setReactif4(frmLabo.Panel5txtReactif4.getText() == null ? "" : frmLabo.Panel5txtReactif4.getText());
            laboAttaque.setReactif5(frmLabo.Panel5txtReactif5.getText() == null ? "" : frmLabo.Panel5txtReactif5.getText());
            laboAttaque.setReactif6(frmLabo.Panel5txtReactif6.getText() == null ? "" : frmLabo.Panel5txtReactif6.getText());

            laboAttaque.setTemps1(frmLabo.Panel5txtTemp1.getText() == null ? "" : frmLabo.Panel5txtTemp1.getText());
            laboAttaque.setTemps2(frmLabo.Panel5txtTemp2.getText() == null ? "" : frmLabo.Panel5txtTemp2.getText());
            laboAttaque.setTemps3(frmLabo.Panel5txtTemp3.getText() == null ? "" : frmLabo.Panel5txtTemp3.getText());
            laboAttaque.setTemps4(frmLabo.Panel5txtTemp4.getText() == null ? "" : frmLabo.Panel5txtTemp4.getText());
            laboAttaque.setTemps5(frmLabo.Panel5txtTemp5.getText() == null ? "" : frmLabo.Panel5txtTemp5.getText());
            laboAttaque.setTemps6(frmLabo.Panel5txtTemp6.getText() == null ? "" : frmLabo.Panel5txtTemp6.getText());

            laboAttaque.setObservation1(frmLabo.Panel5txtObservation1.getText() == null ? "" : frmLabo.Panel5txtObservation1.getText());
            laboAttaque.setObservation2(frmLabo.Panel5txtObservation2.getText() == null ? "" : frmLabo.Panel5txtObservation2.getText());
            laboAttaque.setObservation3(frmLabo.Panel5txtObservation3.getText() == null ? "" : frmLabo.Panel5txtObservation3.getText());
            laboAttaque.setObservation4(frmLabo.Panel5txtObservation4.getText() == null ? "" : frmLabo.Panel5txtObservation4.getText());
            laboAttaque.setObservation5(frmLabo.Panel5txtObservation5.getText() == null ? "" : frmLabo.Panel5txtObservation5.getText());
            laboAttaque.setObservation6(frmLabo.Panel5txtObservation6.getText() == null ? "" : frmLabo.Panel5txtObservation6.getText());

            save = queryLaboAttaque.saveLaboAttaque(laboAttaque);

            if (save) {
                JOptionPane.showMessageDialog(frmLabo, "Élément enregistré avec succès");
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Élément mal enregistré");

            }

            limpiar();

        }

        if (e.getSource().equals(frmLabo.Panel5btnMettre)) {
            int index = frmLabo.Panel4cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel4cmbLabo.getItemAt(index);
            laboAttaque.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboAttaque.setReactif1(frmLabo.Panel5txtReactif1.getText() == null ? "" : frmLabo.Panel5txtReactif1.getText());
            laboAttaque.setReactif2(frmLabo.Panel5txtReactif2.getText() == null ? "" : frmLabo.Panel5txtReactif2.getText());
            laboAttaque.setReactif3(frmLabo.Panel5txtReactif3.getText() == null ? "" : frmLabo.Panel5txtReactif3.getText());
            laboAttaque.setReactif4(frmLabo.Panel5txtReactif4.getText() == null ? "" : frmLabo.Panel5txtReactif4.getText());
            laboAttaque.setReactif5(frmLabo.Panel5txtReactif5.getText() == null ? "" : frmLabo.Panel5txtReactif5.getText());
            laboAttaque.setReactif6(frmLabo.Panel5txtReactif6.getText() == null ? "" : frmLabo.Panel5txtReactif6.getText());

            laboAttaque.setTemps1(frmLabo.Panel5txtTemp1.getText() == null ? "" : frmLabo.Panel5txtTemp1.getText());
            laboAttaque.setTemps2(frmLabo.Panel5txtTemp2.getText() == null ? "" : frmLabo.Panel5txtTemp2.getText());
            laboAttaque.setTemps3(frmLabo.Panel5txtTemp3.getText() == null ? "" : frmLabo.Panel5txtTemp3.getText());
            laboAttaque.setTemps4(frmLabo.Panel5txtTemp4.getText() == null ? "" : frmLabo.Panel5txtTemp4.getText());
            laboAttaque.setTemps5(frmLabo.Panel5txtTemp5.getText() == null ? "" : frmLabo.Panel5txtTemp5.getText());
            laboAttaque.setTemps6(frmLabo.Panel5txtTemp6.getText() == null ? "" : frmLabo.Panel5txtTemp6.getText());

            laboAttaque.setObservation1(frmLabo.Panel5txtObservation1.getText() == null ? "" : frmLabo.Panel5txtObservation1.getText());
            laboAttaque.setObservation2(frmLabo.Panel5txtObservation2.getText() == null ? "" : frmLabo.Panel5txtObservation2.getText());
            laboAttaque.setObservation3(frmLabo.Panel5txtObservation3.getText() == null ? "" : frmLabo.Panel5txtObservation3.getText());
            laboAttaque.setObservation4(frmLabo.Panel5txtObservation4.getText() == null ? "" : frmLabo.Panel5txtObservation4.getText());
            laboAttaque.setObservation5(frmLabo.Panel5txtObservation5.getText() == null ? "" : frmLabo.Panel5txtObservation5.getText());
            laboAttaque.setObservation6(frmLabo.Panel5txtObservation6.getText() == null ? "" : frmLabo.Panel5txtObservation6.getText());

            if (queryLaboAttaque.updateAttaque(laboAttaque)) {
                JOptionPane.showMessageDialog(frmLabo, "Élément mis à jour avec succès");
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Élément pas mis à jour correctement");
            }

            this.limpiar();

        }

        if (e.getSource().equals(frmLabo.Panel5btnSupprimmer)) {
            boolean delete = false;
            int index = frmLabo.Panel5cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel5cmbLabo.getItemAt(index);

            delete = queryLaboAttaque.deleteLaboAttaque(selecLabo);
            if (delete) {
                JOptionPane.showMessageDialog(frmLabo, "Élément supprimé");
            } else {
              JOptionPane.showMessageDialog(frmLabo, "Impossible de supprimer l'élément");
            }
            limpiar();
        }

    }

    public void limpiar() {

        frmLabo.Panel5txtReactif1.setText(null);
        frmLabo.Panel5txtReactif2.setText(null);
        frmLabo.Panel5txtReactif3.setText(null);
        frmLabo.Panel5txtReactif4.setText(null);
        frmLabo.Panel5txtReactif5.setText(null);
        frmLabo.Panel5txtReactif6.setText(null);

        frmLabo.Panel5txtTemp1.setText(null);
        frmLabo.Panel5txtTemp2.setText(null);
        frmLabo.Panel5txtTemp3.setText(null);
        frmLabo.Panel5txtTemp4.setText(null);
        frmLabo.Panel5txtTemp5.setText(null);
        frmLabo.Panel5txtTemp6.setText(null);

        frmLabo.Panel5txtObservation1.setText(null);
        frmLabo.Panel5txtObservation2.setText(null);
        frmLabo.Panel5txtObservation3.setText(null);
        frmLabo.Panel5txtObservation4.setText(null);
        frmLabo.Panel5txtObservation5.setText(null);
        frmLabo.Panel5txtObservation6.setText(null);

    }

}
