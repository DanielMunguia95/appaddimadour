/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.Labo;
import Modele.DB.QueryLabo;
import Modele.DB.QueryLaboAttaque;
import Modele.DB.QueryLaboEnrobage;
import Modele.DB.QueryLaboObservation;
import Modele.DB.QueryLaboTon;
import Modele.DB.QueryLaboPoli;
import Modele.LaboAttaque;
import Modele.LaboEnrobage;
import Modele.LaboObservation;
import Modele.LaboPoli;

import Modele.LaboTon;
import Vue.frmLabo;
import Vue.frmMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Altair
 */
public class CtrlLabo implements ActionListener {

    private Labo labo;
    private QueryLabo queryLabo;
    private frmLabo frmLabo;
    private String user;
    private frmMenu menu;

    public CtrlLabo(Labo labo, QueryLabo queryLabo, frmLabo frmLabo, String user) {

        this.labo = labo;
        this.queryLabo = queryLabo;
        this.frmLabo = frmLabo;
        this.user = user;
        this.frmLabo.btnPanel1_Save.addActionListener(this);
        this.frmLabo.btnPanel1_Consulter.addActionListener(this);
        this.frmLabo.btnMettreAJour1.addActionListener(this);
        this.frmLabo.btnSupprimmer.addActionListener(this);
        this.frmLabo.Panel1btnReturner.addActionListener(this);

    }

    public void iniciar() {
        //sE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmLabo.setTitle("Labo");
        frmLabo.setLocationRelativeTo(null);

        QueryLaboTon queryLaboTon = new QueryLaboTon();
        LaboTon laboTon = new LaboTon();
        CtrLaboTon ctrLaboTon = new CtrLaboTon(labo, queryLabo, frmLabo, user, laboTon, queryLaboTon);

        ctrLaboTon.Iniciar();

        LaboEnrobage laboEnrobage = new LaboEnrobage();
        QueryLaboEnrobage queryLaboEnrobage = new QueryLaboEnrobage();
        CtrlLaboEnrobage ctrLaboEnrobage = new CtrlLaboEnrobage(labo, queryLabo, frmLabo, user, laboEnrobage, queryLaboEnrobage);

        LaboPoli laboPoli = new LaboPoli();
        QueryLaboPoli queryPoli = new QueryLaboPoli();
        CtrlLaboPoli ctrLaboPoli = new CtrlLaboPoli(laboPoli, queryPoli, frmLabo, user, labo, queryLabo);

        LaboAttaque laboAtt = new LaboAttaque();
        QueryLaboAttaque queryAtt = new QueryLaboAttaque();
        CtrlLaboAttaque ctrLaboAtt = new CtrlLaboAttaque(laboAtt, queryAtt, frmLabo, user);

        LaboObservation laboObs = new LaboObservation();
        QueryLaboObservation queryObs = new QueryLaboObservation();
        CtrlLaboObservation ctrLaboObs = new CtrlLaboObservation(laboObs, queryObs, frmLabo, user, labo, queryLabo);

        getAllLabs();

    }

    public void limpiar() {

        frmLabo.jDatePanel1.setDate(null);
        frmLabo.txtNomLabo.setText(null);
        frmLabo.txtHeure.setText(null);
        frmLabo.txtOperateur.setText(null);
        frmLabo.txtNumFiche.setText(null);
        frmLabo.txtFicheEssaiAss.setText(null);
        frmLabo.txtMate.setText(null);
        frmLabo.txtNumeroPlaque.setText(null);
        frmLabo.txtRefMate.setText(null);
        frmLabo.txtNumDaffaire.setText(null);
        frmLabo.jTxtObjectfis.setText(null);
        frmLabo.jtxtResultats.setText(null);

        getAllLabs();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmLabo.btnPanel1_Save) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmLabo.jDatePanel1.getDate() == null ? new Date() : frmLabo.jDatePanel1.getDate());

                labo.setDateLabo(date1);
                labo.setNomLLabo(frmLabo.txtNomLabo.getText() == null ? "" : frmLabo.txtNomLabo.getText());
                labo.setHeureLabo(frmLabo.txtHeure.getText() == null ? "" : frmLabo.txtHeure.getText());
                labo.setOperateur(frmLabo.txtOperateur.getText() == null ? "" : frmLabo.txtOperateur.getText());
                labo.setNumeroFiche(frmLabo.txtNumFiche.getText() == null ? "" : frmLabo.txtNumFiche.getText());
                labo.setFicheEssaiAssociee(frmLabo.txtFicheEssaiAss.getText() == null ? "" : frmLabo.txtFicheEssaiAss.getText());
                labo.setMateriau(frmLabo.txtMate.getText() == null ? "" : frmLabo.txtMate.getText());
                labo.setNumeroPlaque(frmLabo.txtNumeroPlaque.getText() == null ? "" : frmLabo.txtNumeroPlaque.getText());
                labo.setReferenceMatiere(frmLabo.txtRefMate.getText() == null ? "" : frmLabo.txtRefMate.getText());
                labo.setNumerodAffaire(frmLabo.txtNumDaffaire.getText() == null ? "" : frmLabo.txtNumDaffaire.getText());
                labo.setObjectifs(frmLabo.jTxtObjectfis.getText() == null ? "" : frmLabo.jTxtObjectfis.getText());
                labo.setResultats(frmLabo.jtxtResultats.getText() == null ? "" : frmLabo.jTxtObjectfis.getText());

                if (queryLabo.saveLabo(labo)) {
                    JOptionPane.showMessageDialog(frmLabo, "Élément enregistré avec succès");

                } else {
                    JOptionPane.showMessageDialog(frmLabo, "Élément mal enregistré");

                }
                this.limpiar();

            }

            if (e.getSource() == frmLabo.btnPanel1_Consulter) {

                int index = frmLabo.cmbLabo.getSelectedIndex();
                String selecLabo = frmLabo.cmbLabo.getItemAt(index);

                if (index != -1) {

                    labo = queryLabo.getLabo(selecLabo);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataFormateada = formato.parse(labo.getDateLabo());
                    frmLabo.jDatePanel1.setDate(dataFormateada);
                    frmLabo.txtNomLabo.setText(labo.getNomLLabo());
                    frmLabo.txtHeure.setText(labo.getHeureLabo());
                    frmLabo.txtOperateur.setText(labo.getOperateur());
                    frmLabo.txtNumFiche.setText(labo.getNumeroFiche());
                    frmLabo.txtFicheEssaiAss.setText(labo.getFicheEssaiAssociee());
                    frmLabo.txtMate.setText(labo.getMateriau());
                    frmLabo.txtNumeroPlaque.setText(labo.getNumeroPlaque());
                    frmLabo.txtRefMate.setText(labo.getReferenceMatiere());
                    frmLabo.txtNumDaffaire.setText(labo.getNumerodAffaire());
                    frmLabo.jTxtObjectfis.setText(labo.getObjectifs());
                    frmLabo.jtxtResultats.setText(labo.getResultats());
                } else {
                    System.out.println("Selecciona un lab");
                    JOptionPane.showMessageDialog(frmLabo, "Choisis une option");

                }
            }
            if (e.getSource() == frmLabo.btnSupprimmer) {
                boolean delete = false;
                int index = frmLabo.cmbLabo.getSelectedIndex();
                String selecLabo = frmLabo.cmbLabo.getItemAt(index);

                delete = queryLabo.deleteLabo(selecLabo);
                if (delete) {
                    JOptionPane.showMessageDialog(frmLabo, "Élément supprimé");
                  
                } else {

                    JOptionPane.showMessageDialog(frmLabo, "Impossible de supprimer l'élément");
                  
                }
                this.limpiar();
            }
            if (e.getSource() == frmLabo.btnMettreAJour1) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmLabo.jDatePanel1.getDate() == null ? new Date() : frmLabo.jDatePanel1.getDate());

                labo.setDateLabo(date1);
                labo.setNomLLabo(frmLabo.txtNomLabo.getText() == null ? "" : frmLabo.txtNomLabo.getText());
                labo.setHeureLabo(frmLabo.txtHeure.getText() == null ? "" : frmLabo.txtHeure.getText());
                labo.setOperateur(frmLabo.txtOperateur.getText() == null ? "" : frmLabo.txtOperateur.getText());
                labo.setNumeroFiche(frmLabo.txtNumFiche.getText() == null ? "" : frmLabo.txtNumFiche.getText());
                labo.setFicheEssaiAssociee(frmLabo.txtFicheEssaiAss.getText() == null ? "" : frmLabo.txtFicheEssaiAss.getText());
                labo.setMateriau(frmLabo.txtMate.getText() == null ? "" : frmLabo.txtMate.getText());
                labo.setNumeroPlaque(frmLabo.txtNumeroPlaque.getText() == null ? "" : frmLabo.txtNumeroPlaque.getText());
                labo.setReferenceMatiere(frmLabo.txtRefMate.getText() == null ? "" : frmLabo.txtRefMate.getText());
                labo.setNumerodAffaire(frmLabo.txtNumDaffaire.getText() == null ? "" : frmLabo.txtNumDaffaire.getText());
                labo.setObjectifs(frmLabo.jTxtObjectfis.getText() == null ? "" : frmLabo.jTxtObjectfis.getText());
                labo.setResultats(frmLabo.jtxtResultats.getText() == null ? "" : frmLabo.jtxtResultats.getText());

                if (queryLabo.updateLabo(labo)) {
                    JOptionPane.showMessageDialog(frmLabo, "Élément mis à jour avec succès");

                } else {
                    JOptionPane.showMessageDialog(frmLabo, "Élément pas mis à jour correctement");

                }

                this.limpiar();

            }

            if (e.getSource() == frmLabo.Panel1btnReturner) {
                getMenu();
                frmLabo.setVisible(false);
            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }

    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryLabo.getAllLabo();
            frmLabo.cmbLabo.removeAllItems();
            frmLabo.Panel2_Tron_cmbIdFiche.removeAllItems();
            frmLabo.Panel3_cmbLabo.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmLabo.cmbLabo.addItem(z));
                labs.forEach(x -> frmLabo.Panel2_Tron_cmbIdFiche.addItem(x));
                labs.forEach(y -> frmLabo.Panel3_cmbLabo.addItem(y));
                labs.forEach(y -> frmLabo.Panel4cmbLabo.addItem(y));
                labs.forEach(y -> frmLabo.Panel5cmbLabo.addItem(y));
                labs.forEach(y -> frmLabo.Panel6cmbLabo.addItem(y));
            } else {

                frmLabo.cmbLabo.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }

    public void getMenu() {
        frmMenu frmMenu = new frmMenu();
        CtrlMenu ctrMenu = new CtrlMenu(frmMenu, user);
        ctrMenu.iniciar();
        frmMenu.setVisible(true);
    }
}
