/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controleur;

import Modele.DB.QueryLabo;
import Modele.DB.QueryLaboTon;
import Modele.Labo;
import Modele.LaboTon;
import Vue.frmLabo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Altair
 */
public class CtrLaboTon extends CtrlLabo implements ActionListener {

    private LaboTon laboTon;
    private QueryLaboTon queryLaboTon;
    private frmLabo frmLabo;
    private String user;

    public CtrLaboTon(Labo labo, QueryLabo queryLabo, frmLabo frmLabo, String user, LaboTon laboTon, QueryLaboTon queryLaboTon) {
        super(labo, queryLabo, frmLabo, user);
        this.frmLabo = frmLabo;
        this.laboTon = laboTon;
        this.queryLaboTon = queryLaboTon;
        this.user = user;
        this.frmLabo.Panel2_Tron_btnConsulter.addActionListener(this);
        this.frmLabo.Panel2_Tron_btnEnregistrer.addActionListener(this);
        this.frmLabo.Panel2_Tron_btnMettre.addActionListener(this);
        this.frmLabo.Panel2_Tron_btnSupprimmer.addActionListener(this);
    }

    public void Iniciar() {

        System.out.println("iniciado");

    }

    @Override
    public void limpiar() {

        frmLabo.Panel2_Tron_TxtRef1.setText(null);
        frmLabo.Panel2_Tron_TxtRef2.setText(null);
        frmLabo.Panel2_Tron_TxtRef3.setText(null);
        frmLabo.Panel2_Tron_TxtRef4.setText(null);
        frmLabo.Panel2_Tron_TxtRef5.setText(null);
        frmLabo.Panel2_Tron_TxtRef6.setText(null);
        frmLabo.Panel2_Tron_TxtDisque1.setText(null);
        frmLabo.Panel2_Tron_TxtDisque2.setText(null);
        frmLabo.Panel2_Tron_TxtDisque3.setText(null);
        frmLabo.Panel2_Tron_TxtDisque4.setText(null);
        frmLabo.Panel2_Tron_TxtDisque5.setText(null);
        frmLabo.Panel2_Tron_TxtDisque6.setText(null);
        frmLabo.Panel2_Tron_TxtObser1.setText(null);
        frmLabo.Panel2_Tron_TxtObser2.setText(null);
        frmLabo.Panel2_Tron_TxtObser3.setText(null);
        frmLabo.Panel2_Tron_TxtObser4.setText(null);
        frmLabo.Panel2_Tron_TxtObser5.setText(null);
        frmLabo.Panel2_Tron_TxtObser6.setText(null);
        frmLabo.Panel2_Tron_TxtSchema1.setText(null);
        frmLabo.Panel2_Tron_TxtSchema2.setText(null);
        frmLabo.Panel2_Tron_TxtSchema3.setText(null);
        frmLabo.Panel2_Tron_TxtSchema4.setText(null);
        frmLabo.Panel2_Tron_TxtSchema5.setText(null);
        frmLabo.Panel2_Tron_TxtSchema6.setText(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(frmLabo.Panel2_Tron_btnConsulter)) {

            limpiar();
            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);

            laboTon = queryLaboTon.getLabTon(selecLabo);

            frmLabo.Panel2_Tron_TxtRef1.setText(laboTon.getRef1());
            frmLabo.Panel2_Tron_TxtRef2.setText(laboTon.getRef2());
            frmLabo.Panel2_Tron_TxtRef3.setText(laboTon.getRef3());
            frmLabo.Panel2_Tron_TxtRef4.setText(laboTon.getRef4());
            frmLabo.Panel2_Tron_TxtRef5.setText(laboTon.getRef5());
            frmLabo.Panel2_Tron_TxtRef6.setText(laboTon.getRef6());
            frmLabo.Panel2_Tron_TxtDisque1.setText(laboTon.getDisque1());
            frmLabo.Panel2_Tron_TxtDisque2.setText(laboTon.getDisque2());
            frmLabo.Panel2_Tron_TxtDisque3.setText(laboTon.getDisque3());
            frmLabo.Panel2_Tron_TxtDisque4.setText(laboTon.getDisque4());
            frmLabo.Panel2_Tron_TxtDisque5.setText(laboTon.getDisque5());
            frmLabo.Panel2_Tron_TxtDisque6.setText(laboTon.getDisque6());
            frmLabo.Panel2_Tron_TxtObser1.setText(laboTon.getObser1());
            frmLabo.Panel2_Tron_TxtObser2.setText(laboTon.getObser2());
            frmLabo.Panel2_Tron_TxtObser3.setText(laboTon.getObser3());
            frmLabo.Panel2_Tron_TxtObser4.setText(laboTon.getObser4());
            frmLabo.Panel2_Tron_TxtObser5.setText(laboTon.getObser5());
            frmLabo.Panel2_Tron_TxtObser6.setText(laboTon.getObser6());
            frmLabo.Panel2_Tron_TxtSchema1.setText(laboTon.getSchema1());
            frmLabo.Panel2_Tron_TxtSchema2.setText(laboTon.getSchema2());
            frmLabo.Panel2_Tron_TxtSchema3.setText(laboTon.getSchema3());
            frmLabo.Panel2_Tron_TxtSchema4.setText(laboTon.getSchema4());
            frmLabo.Panel2_Tron_TxtSchema5.setText(laboTon.getSchema5());
            frmLabo.Panel2_Tron_TxtSchema6.setText(laboTon.getSchema6());

        }

        if (e.getSource().equals(frmLabo.Panel2_Tron_btnEnregistrer)) {
            boolean save = false;
            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);
            laboTon.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboTon.setRef1(frmLabo.Panel2_Tron_TxtRef1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef1.getText());
            laboTon.setRef2(frmLabo.Panel2_Tron_TxtRef2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef2.getText());
            laboTon.setRef3(frmLabo.Panel2_Tron_TxtRef3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef3.getText());
            laboTon.setRef4(frmLabo.Panel2_Tron_TxtRef4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef4.getText());
            laboTon.setRef5(frmLabo.Panel2_Tron_TxtRef5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef5.getText());
            laboTon.setRef6(frmLabo.Panel2_Tron_TxtRef6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef6.getText());

            laboTon.setDisque1(frmLabo.Panel2_Tron_TxtDisque1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque1.getText());
            laboTon.setDisque2(frmLabo.Panel2_Tron_TxtDisque2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque2.getText());
            laboTon.setDisque3(frmLabo.Panel2_Tron_TxtDisque3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque3.getText());
            laboTon.setDisque4(frmLabo.Panel2_Tron_TxtDisque4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque4.getText());
            laboTon.setDisque5(frmLabo.Panel2_Tron_TxtDisque5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque5.getText());
            laboTon.setDisque6(frmLabo.Panel2_Tron_TxtDisque6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque6.getText());

            laboTon.setSchema1(frmLabo.Panel2_Tron_TxtSchema1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema1.getText());
            laboTon.setSchema2(frmLabo.Panel2_Tron_TxtSchema2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema2.getText());
            laboTon.setSchema3(frmLabo.Panel2_Tron_TxtSchema3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema3.getText());
            laboTon.setSchema4(frmLabo.Panel2_Tron_TxtSchema4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema4.getText());
            laboTon.setSchema5(frmLabo.Panel2_Tron_TxtSchema5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema5.getText());
            laboTon.setSchema6(frmLabo.Panel2_Tron_TxtSchema6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema6.getText());

            laboTon.setObser1(frmLabo.Panel2_Tron_TxtObser1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser1.getText());
            laboTon.setObser2(frmLabo.Panel2_Tron_TxtObser2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser2.getText());
            laboTon.setObser3(frmLabo.Panel2_Tron_TxtObser3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser3.getText());
            laboTon.setObser4(frmLabo.Panel2_Tron_TxtObser4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser4.getText());
            laboTon.setObser5(frmLabo.Panel2_Tron_TxtObser5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser5.getText());
            laboTon.setObser6(frmLabo.Panel2_Tron_TxtObser6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser6.getText());

            save = queryLaboTon.saveLaboTon(laboTon);
            if (save) {
                System.out.println("LaboTON INSERTADO");
            } else {
                System.out.println("LaboTON NO INSERTADO");

            }

            limpiar();
        }

        if (e.getSource().equals(frmLabo.Panel2_Tron_btnMettre)) {

            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);
            laboTon.setNameLabo(selecLabo == null ? "" : selecLabo);

            laboTon.setRef1(frmLabo.Panel2_Tron_TxtRef1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef1.getText());
            laboTon.setRef2(frmLabo.Panel2_Tron_TxtRef2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef2.getText());
            laboTon.setRef3(frmLabo.Panel2_Tron_TxtRef3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef3.getText());
            laboTon.setRef4(frmLabo.Panel2_Tron_TxtRef4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef4.getText());
            laboTon.setRef5(frmLabo.Panel2_Tron_TxtRef5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef5.getText());
            laboTon.setRef6(frmLabo.Panel2_Tron_TxtRef6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtRef6.getText());

            laboTon.setDisque1(frmLabo.Panel2_Tron_TxtDisque1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque1.getText());
            laboTon.setDisque2(frmLabo.Panel2_Tron_TxtDisque2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque2.getText());
            laboTon.setDisque3(frmLabo.Panel2_Tron_TxtDisque3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque3.getText());
            laboTon.setDisque4(frmLabo.Panel2_Tron_TxtDisque4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque4.getText());
            laboTon.setDisque5(frmLabo.Panel2_Tron_TxtDisque5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque5.getText());
            laboTon.setDisque6(frmLabo.Panel2_Tron_TxtDisque6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtDisque6.getText());

            laboTon.setSchema1(frmLabo.Panel2_Tron_TxtSchema1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema1.getText());
            laboTon.setSchema2(frmLabo.Panel2_Tron_TxtSchema2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema2.getText());
            laboTon.setSchema3(frmLabo.Panel2_Tron_TxtSchema3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema3.getText());
            laboTon.setSchema4(frmLabo.Panel2_Tron_TxtSchema4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema4.getText());
            laboTon.setSchema5(frmLabo.Panel2_Tron_TxtSchema5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema5.getText());
            laboTon.setSchema6(frmLabo.Panel2_Tron_TxtSchema6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtSchema6.getText());

            laboTon.setObser1(frmLabo.Panel2_Tron_TxtObser1.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser1.getText());
            laboTon.setObser2(frmLabo.Panel2_Tron_TxtObser2.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser2.getText());
            laboTon.setObser3(frmLabo.Panel2_Tron_TxtObser3.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser3.getText());
            laboTon.setObser4(frmLabo.Panel2_Tron_TxtObser4.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser4.getText());
            laboTon.setObser5(frmLabo.Panel2_Tron_TxtObser5.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser5.getText());
            laboTon.setObser6(frmLabo.Panel2_Tron_TxtObser6.getText() == null ? "" : frmLabo.Panel2_Tron_TxtObser6.getText());

            if (queryLaboTon.updateLaboTon(laboTon)) {
                System.out.println("updateTON");
            } else {
                System.out.println("No se puede actualizar ton");
            }

            limpiar();
        }
        if (e.getSource().equals(frmLabo.Panel2_Tron_btnSupprimmer)) {

            boolean delete = false;
            int index = frmLabo.Panel2_Tron_cmbIdFiche.getSelectedIndex();
            String selecLabo = frmLabo.Panel2_Tron_cmbIdFiche.getItemAt(index);

            delete = queryLaboTon.deleteLaboTon(selecLabo);
            if (delete) {
                System.out.println("Elemento elimando");
            } else {
                System.out.println("No puede eliminar5");
            }
            this.limpiar();
        }

    }

}
