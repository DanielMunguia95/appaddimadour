/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.DB.QueryLabo;
import Modele.DB.QueryLaboEnrobage;
import Modele.Labo;
import Modele.LaboEnrobage;
import Vue.frmLabo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Altair
 */
public class CtrlLaboEnrobage extends CtrlLabo implements ActionListener {

    private LaboEnrobage laboEnrobage;
    private QueryLaboEnrobage queryLaboEnrobage;
    private frmLabo frmLabo;
    private String user;

    public CtrlLaboEnrobage(Labo labo, QueryLabo queryLabo, frmLabo frmLabo, String user, LaboEnrobage laboEnrobage, QueryLaboEnrobage queryLaboEnrobage) {
        super(labo, queryLabo, frmLabo, user);
        this.frmLabo = frmLabo;
        this.queryLaboEnrobage = queryLaboEnrobage;
        this.laboEnrobage = laboEnrobage;
        this.user = user;

        this.frmLabo.Panel3btnConsulter.addActionListener(this);
        this.frmLabo.Panel3btnSupprimmer.addActionListener(this);
        this.frmLabo.Panel3btnEnregistrer.addActionListener(this);
        this.frmLabo.Panel3btnMettre.addActionListener(this);

    }

    @Override
    public void limpiar() {
        //super.iniciar();

        frmLabo.Panel3txtNEnrobage1.setText(null);
        frmLabo.Panel3txtNEnrobage2.setText(null);
        frmLabo.Panel3txtNEnrobage3.setText(null);
        frmLabo.Panel3txtNEnrobage4.setText(null);
        frmLabo.Panel3txtNEnrobage5.setText(null);
        frmLabo.Panel3txtNEnrobage6.setText(null);

        frmLabo.Panel3txtObservation1.setText(null);
        frmLabo.Panel3txtObservation2.setText(null);
        frmLabo.Panel3txtObservation3.setText(null);
        frmLabo.Panel3txtObservation4.setText(null);
        frmLabo.Panel3txtObservation5.setText(null);
        frmLabo.Panel3txtObservation6.setText(null);

        frmLabo.Panel3txtRef1.setText(null);
        frmLabo.Panel3txtRef2.setText(null);
        frmLabo.Panel3txtRef3.setText(null);
        frmLabo.Panel3txtRef4.setText(null);
        frmLabo.Panel3txtRef5.setText(null);
        frmLabo.Panel3txtRef6.setText(null);

        frmLabo.Panel3txtSchema1.setText(null);
        frmLabo.Panel3txtSchema2.setText(null);
        frmLabo.Panel3txtSchema3.setText(null);
        frmLabo.Panel3txtSchema4.setText(null);
        frmLabo.Panel3txtSchema5.setText(null);
        frmLabo.Panel3txtSchema6.setText(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //super.actionPerformed(e); 

        if (e.getSource().equals(frmLabo.Panel3btnConsulter)) {
            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);
            if (index != -1) {
                laboEnrobage = queryLaboEnrobage.getLaboEnrobage(selecLabo);

                frmLabo.Panel3txtNEnrobage1.setText(laboEnrobage.getNumDEnrobage1());
                frmLabo.Panel3txtNEnrobage2.setText(laboEnrobage.getNumDEnrobage2());
                frmLabo.Panel3txtNEnrobage3.setText(laboEnrobage.getNumDEnrobage3());
                frmLabo.Panel3txtNEnrobage4.setText(laboEnrobage.getNumDEnrobage4());
                frmLabo.Panel3txtNEnrobage5.setText(laboEnrobage.getNumDEnrobage5());
                frmLabo.Panel3txtNEnrobage6.setText(laboEnrobage.getNumDEnrobage6());

                frmLabo.Panel3txtObservation1.setText(laboEnrobage.getObservation1());
                frmLabo.Panel3txtObservation2.setText(laboEnrobage.getObservation2());
                frmLabo.Panel3txtObservation3.setText(laboEnrobage.getObservation3());
                frmLabo.Panel3txtObservation4.setText(laboEnrobage.getObservation4());
                frmLabo.Panel3txtObservation5.setText(laboEnrobage.getObservation5());
                frmLabo.Panel3txtObservation6.setText(laboEnrobage.getObservation6());

                frmLabo.Panel3txtRef1.setText(laboEnrobage.getReference1());
                frmLabo.Panel3txtRef2.setText(laboEnrobage.getReference2());
                frmLabo.Panel3txtRef3.setText(laboEnrobage.getReference3());
                frmLabo.Panel3txtRef4.setText(laboEnrobage.getReference4());
                frmLabo.Panel3txtRef5.setText(laboEnrobage.getReference5());
                frmLabo.Panel3txtRef6.setText(laboEnrobage.getReference6());

                frmLabo.Panel3txtSchema1.setText(laboEnrobage.getShema1());
                frmLabo.Panel3txtSchema2.setText(laboEnrobage.getShema2());
                frmLabo.Panel3txtSchema3.setText(laboEnrobage.getShema3());
                frmLabo.Panel3txtSchema4.setText(laboEnrobage.getShema4());
                frmLabo.Panel3txtSchema5.setText(laboEnrobage.getShema5());
                frmLabo.Panel3txtSchema6.setText(laboEnrobage.getShema6());
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Choisis une option");

            }

        }

        if (e.getSource().equals(frmLabo.Panel3btnEnregistrer)) {
            boolean save = false;
            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);

            laboEnrobage.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboEnrobage.setNumDEnrobage1(frmLabo.Panel3txtNEnrobage1.getText() == null ? "" : frmLabo.Panel3txtNEnrobage1.getText());
            laboEnrobage.setNumDEnrobage2(frmLabo.Panel3txtNEnrobage2.getText() == null ? "" : frmLabo.Panel3txtNEnrobage2.getText());
            laboEnrobage.setNumDEnrobage3(frmLabo.Panel3txtNEnrobage3.getText() == null ? "" : frmLabo.Panel3txtNEnrobage3.getText());
            laboEnrobage.setNumDEnrobage4(frmLabo.Panel3txtNEnrobage4.getText() == null ? "" : frmLabo.Panel3txtNEnrobage4.getText());
            laboEnrobage.setNumDEnrobage5(frmLabo.Panel3txtNEnrobage5.getText() == null ? "" : frmLabo.Panel3txtNEnrobage5.getText());
            laboEnrobage.setNumDEnrobage6(frmLabo.Panel3txtNEnrobage6.getText() == null ? "" : frmLabo.Panel3txtNEnrobage6.getText());

            laboEnrobage.setObservation1(frmLabo.Panel3txtObservation1.getText() == null ? "" : frmLabo.Panel3txtObservation1.getText());
            laboEnrobage.setObservation2(frmLabo.Panel3txtObservation2.getText() == null ? "" : frmLabo.Panel3txtObservation2.getText());
            laboEnrobage.setObservation3(frmLabo.Panel3txtObservation3.getText() == null ? "" : frmLabo.Panel3txtObservation3.getText());
            laboEnrobage.setObservation4(frmLabo.Panel3txtObservation4.getText() == null ? "" : frmLabo.Panel3txtObservation4.getText());
            laboEnrobage.setObservation5(frmLabo.Panel3txtObservation5.getText() == null ? "" : frmLabo.Panel3txtObservation5.getText());
            laboEnrobage.setObservation6(frmLabo.Panel3txtObservation6.getText() == null ? "" : frmLabo.Panel3txtObservation6.getText());

            laboEnrobage.setReference1(frmLabo.Panel3txtRef1.getText() == null ? "" : frmLabo.Panel3txtRef1.getText());
            laboEnrobage.setReference2(frmLabo.Panel3txtRef2.getText() == null ? "" : frmLabo.Panel3txtRef2.getText());
            laboEnrobage.setReference3(frmLabo.Panel3txtRef3.getText() == null ? "" : frmLabo.Panel3txtRef3.getText());
            laboEnrobage.setReference4(frmLabo.Panel3txtRef4.getText() == null ? "" : frmLabo.Panel3txtRef4.getText());
            laboEnrobage.setReference5(frmLabo.Panel3txtRef5.getText() == null ? "" : frmLabo.Panel3txtRef5.getText());
            laboEnrobage.setReference6(frmLabo.Panel3txtRef6.getText() == null ? "" : frmLabo.Panel3txtRef6.getText());

            laboEnrobage.setShema1(frmLabo.Panel3txtSchema1.getText() == null ? "" : frmLabo.Panel3txtSchema1.getText());
            laboEnrobage.setShema2(frmLabo.Panel3txtSchema2.getText() == null ? "" : frmLabo.Panel3txtSchema2.getText());
            laboEnrobage.setShema3(frmLabo.Panel3txtSchema3.getText() == null ? "" : frmLabo.Panel3txtSchema3.getText());
            laboEnrobage.setShema4(frmLabo.Panel3txtSchema4.getText() == null ? "" : frmLabo.Panel3txtSchema4.getText());
            laboEnrobage.setShema5(frmLabo.Panel3txtSchema5.getText() == null ? "" : frmLabo.Panel3txtSchema5.getText());
            laboEnrobage.setShema6(frmLabo.Panel3txtSchema6.getText() == null ? "" : frmLabo.Panel3txtSchema6.getText());

            save = queryLaboEnrobage.saveLaboTon(laboEnrobage);
            if (save) {
                System.out.println("LaboTON INSERTADO");
            } else {
                System.out.println("LaboTON NO INSERTADO");

            }

            limpiar();

        }

        if (e.getSource().equals(frmLabo.Panel3btnMettre)) {

            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);

            laboEnrobage.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboEnrobage.setNumDEnrobage1(frmLabo.Panel3txtNEnrobage1.getText() == null ? "" : frmLabo.Panel3txtNEnrobage1.getText());
            laboEnrobage.setNumDEnrobage2(frmLabo.Panel3txtNEnrobage2.getText() == null ? "" : frmLabo.Panel3txtNEnrobage2.getText());
            laboEnrobage.setNumDEnrobage3(frmLabo.Panel3txtNEnrobage3.getText() == null ? "" : frmLabo.Panel3txtNEnrobage3.getText());
            laboEnrobage.setNumDEnrobage4(frmLabo.Panel3txtNEnrobage4.getText() == null ? "" : frmLabo.Panel3txtNEnrobage4.getText());
            laboEnrobage.setNumDEnrobage5(frmLabo.Panel3txtNEnrobage5.getText() == null ? "" : frmLabo.Panel3txtNEnrobage5.getText());
            laboEnrobage.setNumDEnrobage6(frmLabo.Panel3txtNEnrobage6.getText() == null ? "" : frmLabo.Panel3txtNEnrobage6.getText());

            laboEnrobage.setObservation1(frmLabo.Panel3txtObservation1.getText() == null ? "" : frmLabo.Panel3txtObservation1.getText());
            laboEnrobage.setObservation2(frmLabo.Panel3txtObservation2.getText() == null ? "" : frmLabo.Panel3txtObservation2.getText());
            laboEnrobage.setObservation3(frmLabo.Panel3txtObservation3.getText() == null ? "" : frmLabo.Panel3txtObservation3.getText());
            laboEnrobage.setObservation4(frmLabo.Panel3txtObservation4.getText() == null ? "" : frmLabo.Panel3txtObservation4.getText());
            laboEnrobage.setObservation5(frmLabo.Panel3txtObservation5.getText() == null ? "" : frmLabo.Panel3txtObservation5.getText());
            laboEnrobage.setObservation6(frmLabo.Panel3txtObservation6.getText() == null ? "" : frmLabo.Panel3txtObservation6.getText());

            laboEnrobage.setReference1(frmLabo.Panel3txtRef1.getText() == null ? "" : frmLabo.Panel3txtRef1.getText());
            laboEnrobage.setReference2(frmLabo.Panel3txtRef2.getText() == null ? "" : frmLabo.Panel3txtRef2.getText());
            laboEnrobage.setReference3(frmLabo.Panel3txtRef3.getText() == null ? "" : frmLabo.Panel3txtRef3.getText());
            laboEnrobage.setReference4(frmLabo.Panel3txtRef4.getText() == null ? "" : frmLabo.Panel3txtRef4.getText());
            laboEnrobage.setReference5(frmLabo.Panel3txtRef5.getText() == null ? "" : frmLabo.Panel3txtRef5.getText());
            laboEnrobage.setReference6(frmLabo.Panel3txtRef6.getText() == null ? "" : frmLabo.Panel3txtRef6.getText());

            laboEnrobage.setShema1(frmLabo.Panel3txtSchema1.getName() == null ? "" : frmLabo.Panel3txtSchema1.getText());
            laboEnrobage.setShema2(frmLabo.Panel3txtSchema2.getName() == null ? "" : frmLabo.Panel3txtSchema2.getText());
            laboEnrobage.setShema3(frmLabo.Panel3txtSchema3.getName() == null ? "" : frmLabo.Panel3txtSchema3.getText());
            laboEnrobage.setShema4(frmLabo.Panel3txtSchema4.getName() == null ? "" : frmLabo.Panel3txtSchema4.getText());
            laboEnrobage.setShema5(frmLabo.Panel3txtSchema5.getName() == null ? "" : frmLabo.Panel3txtSchema5.getText());
            laboEnrobage.setShema6(frmLabo.Panel3txtSchema6.getName() == null ? "" : frmLabo.Panel3txtSchema6.getText());

            if (queryLaboEnrobage.updateLaboEnrobage(laboEnrobage)) {
                JOptionPane.showMessageDialog(frmLabo, "Élément mis à jour avec succès");
            } else {
                JOptionPane.showMessageDialog(frmLabo, "Élément pas mis à jour correctement");
            }

            limpiar();

        }

        if (e.getSource().equals(frmLabo.Panel3btnSupprimmer)) {

            boolean delete = false;
            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);

            delete = queryLaboEnrobage.deleteLaboTon(selecLabo);
            if (delete) {
               JOptionPane.showMessageDialog(frmLabo, "Élément supprimé");
            } else {
                 JOptionPane.showMessageDialog(frmLabo, "Impossible de supprimer l'élément");
             }
            this.limpiar();
        }
    }

}
