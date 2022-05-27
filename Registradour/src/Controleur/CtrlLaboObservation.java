/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.DB.QueryLabo;
import Modele.DB.QueryLaboObservation;
import Modele.Labo;
import Modele.LaboObservation;
import Vue.frmLabo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Altair
 */
public class CtrlLaboObservation extends CtrlLabo implements ActionListener {

    private LaboObservation laboObs;
    private QueryLaboObservation queryLaboObs;
    private frmLabo frmLabo;
    private String user;

    public CtrlLaboObservation(LaboObservation laboObs, QueryLaboObservation queryLaboObs, frmLabo frmLabo, String user, Labo labo, QueryLabo queryLabo) {
        super(labo, queryLabo, frmLabo, user);
        this.laboObs = laboObs;
        this.queryLaboObs = queryLaboObs;
        this.frmLabo = frmLabo;
        this.user = user;
        this.frmLabo.Panel6btnConsulter1.addActionListener(this);
        this.frmLabo.Panel6btnEnregistre.addActionListener(this);
        this.frmLabo.Panel6btnModifier.addActionListener(this);
        this.frmLabo.Panel6btnSupprimer.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmLabo.Panel6btnConsulter1)) {

            limpiar();
            int index = frmLabo.Panel6cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel6cmbLabo.getItemAt(index);

            if (index != -1) {
                laboObs = queryLaboObs.getLabObs(selecLabo);

                if (laboObs != null) {

                    frmLabo.Panel6txtLaboMacro1.setText(laboObs.getMacro1() == null ? "" : laboObs.getMacro1());
                    frmLabo.Panel6txtLaboMacro2.setText(laboObs.getMacro2() == null ? "" : laboObs.getMacro2());
                    frmLabo.Panel6txtLaboMacro3.setText(laboObs.getMacro3() == null ? "" : laboObs.getMacro3());
                    frmLabo.Panel6txtLaboMacro4.setText(laboObs.getMacro4() == null ? "" : laboObs.getMacro4());
                    frmLabo.Panel6txtLaboMacro5.setText(laboObs.getMacro5() == null ? "" : laboObs.getMacro5());
                    frmLabo.Panel6txtLaboMacro6.setText(laboObs.getMacro6() == null ? "" : laboObs.getMacro6());

                    frmLabo.Panel6txtLaboNomAss1.setText(laboObs.getNomAssocie1() == null ? "" : laboObs.getNomAssocie1());
                    frmLabo.Panel6txtLaboNomAss2.setText(laboObs.getNomAssocie2() == null ? "" : laboObs.getNomAssocie2());
                    frmLabo.Panel6txtLaboNomAss3.setText(laboObs.getNomAssocie3() == null ? "" : laboObs.getNomAssocie3());
                    frmLabo.Panel6txtLaboNomAss4.setText(laboObs.getNomAssocie4() == null ? "" : laboObs.getNomAssocie4());
                    frmLabo.Panel6txtLaboNomAss5.setText(laboObs.getNomAssocie5() == null ? "" : laboObs.getNomAssocie5());
                    frmLabo.Panel6txtLaboNomAss6.setText(laboObs.getNomAssocie6() == null ? "" : laboObs.getNomAssocie6());

                    frmLabo.Panel6txtLaboRef1.setText(laboObs.getReference1() == null ? "" : laboObs.getReference1());
                    frmLabo.Panel6txtLaboRef2.setText(laboObs.getReference2() == null ? "" : laboObs.getReference2());
                    frmLabo.Panel6txtLaboRef3.setText(laboObs.getReference3() == null ? "" : laboObs.getReference3());
                    frmLabo.Panel6txtLaboRef4.setText(laboObs.getReference4() == null ? "" : laboObs.getReference4());
                    frmLabo.Panel6txtLaboRef5.setText(laboObs.getReference5() == null ? "" : laboObs.getReference5());
                    frmLabo.Panel6txtLaboRef6.setText(laboObs.getReference6() == null ? "" : laboObs.getReference6());

                    frmLabo.Panel6txtObservCommentaire.setText(laboObs.getCommentaires() == null ? "" : laboObs.getCommentaires());
                    frmLabo.Panel6txtLaboNomDossier.setText(laboObs.getNomDossier() == null ? "" : laboObs.getNomDossier());

                }
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Choisis une option");
            }
        }
        if (e.getSource().equals(frmLabo.Panel6btnEnregistre)) {

            boolean save = false;
            int index = frmLabo.Panel6cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel6cmbLabo.getItemAt(index);
            laboObs.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboObs.setMacro1(frmLabo.Panel6txtLaboMacro1.getText() == null ? "" : frmLabo.Panel6txtLaboMacro1.getText());
            laboObs.setMacro2(frmLabo.Panel6txtLaboMacro2.getText() == null ? "" : frmLabo.Panel6txtLaboMacro2.getText());
            laboObs.setMacro3(frmLabo.Panel6txtLaboMacro3.getText() == null ? "" : frmLabo.Panel6txtLaboMacro3.getText());
            laboObs.setMacro4(frmLabo.Panel6txtLaboMacro4.getText() == null ? "" : frmLabo.Panel6txtLaboMacro4.getText());
            laboObs.setMacro5(frmLabo.Panel6txtLaboMacro5.getText() == null ? "" : frmLabo.Panel6txtLaboMacro5.getText());
            laboObs.setMacro6(frmLabo.Panel6txtLaboMacro6.getText() == null ? "" : frmLabo.Panel6txtLaboMacro6.getText());

            laboObs.setNomAssocie1(frmLabo.Panel6txtLaboNomAss1.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss1.getText());
            laboObs.setNomAssocie2(frmLabo.Panel6txtLaboNomAss2.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss2.getText());
            laboObs.setNomAssocie3(frmLabo.Panel6txtLaboNomAss3.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss3.getText());
            laboObs.setNomAssocie4(frmLabo.Panel6txtLaboNomAss4.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss4.getText());
            laboObs.setNomAssocie5(frmLabo.Panel6txtLaboNomAss5.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss5.getText());
            laboObs.setNomAssocie6(frmLabo.Panel6txtLaboNomAss6.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss6.getText());

            laboObs.setReference1(frmLabo.Panel6txtLaboRef1.getText() == null ? "" : frmLabo.Panel6txtLaboRef1.getText());
            laboObs.setReference2(frmLabo.Panel6txtLaboRef2.getText() == null ? "" : frmLabo.Panel6txtLaboRef2.getText());
            laboObs.setReference3(frmLabo.Panel6txtLaboRef3.getText() == null ? "" : frmLabo.Panel6txtLaboRef3.getText());
            laboObs.setReference4(frmLabo.Panel6txtLaboRef4.getText() == null ? "" : frmLabo.Panel6txtLaboRef4.getText());
            laboObs.setReference5(frmLabo.Panel6txtLaboRef5.getText() == null ? "" : frmLabo.Panel6txtLaboRef5.getText());
            laboObs.setReference6(frmLabo.Panel6txtLaboRef6.getText() == null ? "" : frmLabo.Panel6txtLaboRef6.getText());

            laboObs.setCommentaires(frmLabo.Panel6txtObservCommentaire.getText() == null ? "" : frmLabo.Panel6txtObservCommentaire.getText());

            laboObs.setNomDossier(frmLabo.Panel6txtLaboNomDossier.getText() == null ? "" : frmLabo.Panel6txtLaboNomDossier.getText());

            save = queryLaboObs.saveLaboObservation(laboObs);
            if (save) {
                JOptionPane.showMessageDialog(frmLabo, "Élément enregistré avec succès");
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Élément mal enregistré");

            }

            limpiar();

        }
        if (e.getSource().equals(frmLabo.Panel6btnSupprimer)) {

            boolean delete = false;
            int index = frmLabo.Panel6cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel6cmbLabo.getItemAt(index);

            delete = queryLaboObs.deleteLaboObs(selecLabo);
            if (delete) {
                JOptionPane.showMessageDialog(frmLabo, "Élément supprimé");
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Impossible de supprimer l'élément");

            }
            this.limpiar();
        }
        if (e.getSource().equals(frmLabo.Panel6btnModifier)) {
            int index = frmLabo.Panel6cmbLabo.getSelectedIndex();
            String selecLabo = frmLabo.Panel6cmbLabo.getItemAt(index);
            laboObs.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboObs.setMacro1(frmLabo.Panel6txtLaboMacro1.getText() == null ? "" : frmLabo.Panel6txtLaboMacro1.getText());
            laboObs.setMacro2(frmLabo.Panel6txtLaboMacro2.getText() == null ? "" : frmLabo.Panel6txtLaboMacro2.getText());
            laboObs.setMacro3(frmLabo.Panel6txtLaboMacro3.getText() == null ? "" : frmLabo.Panel6txtLaboMacro3.getText());
            laboObs.setMacro4(frmLabo.Panel6txtLaboMacro4.getText() == null ? "" : frmLabo.Panel6txtLaboMacro4.getText());
            laboObs.setMacro5(frmLabo.Panel6txtLaboMacro5.getText() == null ? "" : frmLabo.Panel6txtLaboMacro5.getText());
            laboObs.setMacro6(frmLabo.Panel6txtLaboMacro6.getText() == null ? "" : frmLabo.Panel6txtLaboMacro6.getText());

            laboObs.setNomAssocie1(frmLabo.Panel6txtLaboNomAss1.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss1.getText());
            laboObs.setNomAssocie2(frmLabo.Panel6txtLaboNomAss2.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss2.getText());
            laboObs.setNomAssocie3(frmLabo.Panel6txtLaboNomAss3.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss3.getText());
            laboObs.setNomAssocie4(frmLabo.Panel6txtLaboNomAss4.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss4.getText());
            laboObs.setNomAssocie5(frmLabo.Panel6txtLaboNomAss5.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss5.getText());
            laboObs.setNomAssocie6(frmLabo.Panel6txtLaboNomAss6.getText() == null ? "" : frmLabo.Panel6txtLaboNomAss6.getText());

            laboObs.setReference1(frmLabo.Panel6txtLaboRef1.getText() == null ? "" : frmLabo.Panel6txtLaboRef1.getText());
            laboObs.setReference2(frmLabo.Panel6txtLaboRef2.getText() == null ? "" : frmLabo.Panel6txtLaboRef2.getText());
            laboObs.setReference3(frmLabo.Panel6txtLaboRef3.getText() == null ? "" : frmLabo.Panel6txtLaboRef3.getText());
            laboObs.setReference4(frmLabo.Panel6txtLaboRef4.getText() == null ? "" : frmLabo.Panel6txtLaboRef4.getText());
            laboObs.setReference5(frmLabo.Panel6txtLaboRef5.getText() == null ? "" : frmLabo.Panel6txtLaboRef5.getText());
            laboObs.setReference6(frmLabo.Panel6txtLaboRef6.getText() == null ? "" : frmLabo.Panel6txtLaboRef6.getText());

            laboObs.setCommentaires(frmLabo.Panel6lblCommentaire.getText() == null ? "" : frmLabo.Panel6lblCommentaire.getText());

            laboObs.setNomDossier(frmLabo.Panel6txtLaboNomDossier.getText() == null ? "" : frmLabo.Panel6txtLaboNomDossier.getText());
            if (queryLaboObs.updateLaboObs(laboObs)) {
                JOptionPane.showMessageDialog(frmLabo, "Élément mis à jour avec succès");
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Élément pas mis à jour correctement");

            }

            limpiar();

        }

    }

    @Override
    public void limpiar() {

        frmLabo.Panel6txtLaboMacro1.setText(null);
        frmLabo.Panel6txtLaboMacro2.setText(null);
        frmLabo.Panel6txtLaboMacro3.setText(null);
        frmLabo.Panel6txtLaboMacro4.setText(null);
        frmLabo.Panel6txtLaboMacro5.setText(null);
        frmLabo.Panel6txtLaboMacro6.setText(null);

        frmLabo.Panel6txtLaboNomAss1.setText(null);
        frmLabo.Panel6txtLaboNomAss2.setText(null);
        frmLabo.Panel6txtLaboNomAss3.setText(null);
        frmLabo.Panel6txtLaboNomAss4.setText(null);
        frmLabo.Panel6txtLaboNomAss5.setText(null);
        frmLabo.Panel6txtLaboNomAss6.setText(null);

        frmLabo.Panel6txtLaboRef1.setText(null);
        frmLabo.Panel6txtLaboRef2.setText(null);
        frmLabo.Panel6txtLaboRef3.setText(null);
        frmLabo.Panel6txtLaboRef4.setText(null);
        frmLabo.Panel6txtLaboRef5.setText(null);
        frmLabo.Panel6txtLaboRef6.setText(null);

        frmLabo.Panel6txtObservCommentaire.setText(null);
        frmLabo.Panel6txtLaboNomDossier.setText(null);

    }

}
