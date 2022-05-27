/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.DB.QueryLmd;
import Modele.DB.QueryLmdResultado;
import Modele.LmdCabecer;
import Vue.frmLMD;
import Vue.frmLabo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author admon
 */
public class CtrlLmdResultado implements ActionListener {
    private LmdCabecer lmd;
    private QueryLmdResultado queryLmdResultado;
    private frmLMD frmLMD;
    private String user;
    
    public CtrlLmdResultado(LmdCabecer lmd, QueryLmdResultado queryLmdResultado,frmLMD frmLMD, String user) {
        this.lmd = lmd;
        this.queryLmdResultado = queryLmdResultado;
        this.frmLMD = frmLMD;
        this.user = user;
        this.frmLMD.btnPanel3_Consulter.addActionListener(this);
        this.frmLMD.btnPanel3_btnMettreAJour.addActionListener(this);
    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmLMD.setTitle("Waam");
        frmLMD.setLocationRelativeTo(null);
        getAllLabs();
    }
    
    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryLmdResultado.getAllLmd();
            frmLMD.cmblmdParametros.removeAllItems();
            frmLMD.cmbLMDResultados.removeAllItems();
            frmLMD.cmbLMD.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmLMD.cmblmdParametros.addItem(z));
                labs.forEach(x -> frmLMD.cmbLMDResultados.addItem(x));
                labs.forEach(y -> frmLMD.cmbLMD.addItem(y));

            } else {
                frmLMD.cmbLMDResultados.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }
    
    public void limpiar() {
   frmLMD.txttramiteTermico.setText(null);
   frmLMD.txtmecanizado.setText(null);
   frmLMD.txtresultados1.setText(null);
   getAllLabs();
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmLMD.btnPanel3_Consulter) {

                int index = frmLMD.cmbLMDResultados.getSelectedIndex();
                String selecLmdParametros = frmLMD.cmbLMDResultados.getItemAt(index);

                if (index != -1) {

                   lmd = queryLmdResultado.getLmd(selecLmdParametros);                  
                   frmLMD.txttramiteTermico.setText(lmd.getTratamientoTermico());
                   frmLMD.txtmecanizado.setText(lmd.getMecanizado());
                   frmLMD.txtresultados1.setText(lmd.getResultados());
                } else {
                        JOptionPane.showMessageDialog(frmLMD, "Choisis une option");
                }
            }
            
            if (e.getSource() == frmLMD.btnPanel3_btnMettreAJour) {
                
                lmd.setTratamientoTermico(frmLMD.txttramiteTermico.getText()== null ? "" : frmLMD.txttramiteTermico.getText());
                lmd.setMecanizado(frmLMD.txtmecanizado.getText()== null ? "" : frmLMD.txtmecanizado.getText());
                System.out.println("REsultados:"+frmLMD.txtresultados1.getText());
                lmd.setResultados(frmLMD.txtresultados1.getText()== null ? "" : frmLMD.txtresultados1.getText());
                                
                int index = frmLMD.cmbLMDResultados.getSelectedIndex();
                String selecWaamParametros = frmLMD.cmbLMDResultados.getItemAt(index);
                lmd.setNumeroFiche(selecWaamParametros);
                
                //queryLmdResultado.updateLmd(lmd);
                if (queryLmdResultado.updateLmd(lmd)) {
                    JOptionPane.showMessageDialog(frmLMD, "Élément mis à jour avec succès");

                } else {
                    JOptionPane.showMessageDialog(frmLMD, "Élément pas mis à jour correctement");

                }
                this.limpiar();

            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }
}
