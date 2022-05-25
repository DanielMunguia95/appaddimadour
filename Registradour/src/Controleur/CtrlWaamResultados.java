/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.WaamCabecer;
import Modele.DB.QueryWaamResultado;
import Modele.DB.QueryWaam;
//import Modele.DB.QueryLaboEnrobage;
//import Modele.DB.QueryLaboTon;
//import Modele.LaboEnrobage;
import Vue.frmWam;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
/**
 *
 * @author admon
 */
public class CtrlWaamResultados implements ActionListener {
    private WaamCabecer waam;
    private QueryWaamResultado queryWaamResultado;
    private frmWam frmWam;
    private String user;

    public CtrlWaamResultados(WaamCabecer waam, QueryWaamResultado queryWaamResultado, frmWam frmWam, String user) {
        this.waam = waam;
        this.queryWaamResultado = queryWaamResultado;
        this.frmWam = frmWam;
        this.user = user;
        //BOTONES
        this.frmWam.btnPanel3_Consulter.addActionListener(this);
        this.frmWam.btnPanel3_btnMettreAJour.addActionListener(this);
    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmWam.setTitle("Waam");
        frmWam.setLocationRelativeTo(null);
        getAllLabs();
    }
    
    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryWaamResultado.getAllWaam();
            frmWam.cmbWaamResultados.removeAllItems();
            frmWam.cmbWaamParametros.removeAllItems();
            frmWam.cmbWaam.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmWam.cmbWaamResultados.addItem(z));
                labs.forEach(x -> frmWam.cmbWaam.addItem(x));
                labs.forEach(y -> frmWam.cmbWaamParametros.addItem(y));

            } else {
                frmWam.cmbWaam.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }
    
    public void limpiar() {
   frmWam.txttramiteTermico.setText(null);
   frmWam.txtmecanizado.setText(null);
   frmWam.txtresultados.setText(null);
   getAllLabs();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmWam.btnPanel3_Consulter) {

                int index = frmWam.cmbWaamResultados.getSelectedIndex();
                String selecWaamParametros = frmWam.cmbWaamResultados.getItemAt(index);

                if (index != -1) {

                   waam = queryWaamResultado.getWaam(selecWaamParametros);                  
                   frmWam.txttramiteTermico.setText(waam.getTratamientoTermico());
                   frmWam.txtmecanizado.setText(waam.getMecanizado());
                   frmWam.txtresultados.setText(waam.getResultados());
                } else {
                    System.out.println("Selecciona un Numéro fiche");
                }
            }
            
            if (e.getSource() == frmWam.btnPanel3_btnMettreAJour) {
                
                waam.setTratamientoTermico(frmWam.txttramiteTermico.getText()== null ? "" : frmWam.txttramiteTermico.getText());
                waam.setMecanizado(frmWam.txtmecanizado.getText()== null ? "" : frmWam.txtmecanizado.getText());
                System.out.println("REsultados:"+frmWam.txtresultados.getText());
                waam.setResultados(frmWam.txtresultados.getText()== null ? "" : frmWam.txtresultados.getText());
                                
                int index = frmWam.cmbWaamResultados.getSelectedIndex();
                String selecWaamParametros = frmWam.cmbWaamResultados.getItemAt(index);
                waam.setNumeroFiche(selecWaamParametros);
                
                queryWaamResultado.updateWaam(waam);
                this.limpiar();

            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }
    
    
}
