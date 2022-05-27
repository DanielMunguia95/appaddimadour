/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.depotCabecer;
import Modele.DB.QueryDepotResultado;
import Modele.DB.QueryDepot;
import Vue.frmDepot;
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
public class CtrlDepotResultado implements ActionListener {
    private depotCabecer depot;
    private QueryDepotResultado queryDepotResultado;
    private frmDepot frmDepot;
    private String user;
    
    public CtrlDepotResultado(depotCabecer depot, QueryDepotResultado queryDepotResultado, frmDepot frmDepot, String user) {
        this.depot = depot;
        this.queryDepotResultado = queryDepotResultado;
        this.frmDepot = frmDepot;
        this.user = user;
        //BOTONES
        this.frmDepot.btnPanel3_Consulter.addActionListener(this);
        this.frmDepot.btnPanel3_btnMettreAJour.addActionListener(this);
    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmDepot.setTitle("Depot");
        frmDepot.setLocationRelativeTo(null);
        getAllLabs();
    }

    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryDepotResultado.getAllDepot();
            frmDepot.cmbDepot.removeAllItems();
            frmDepot.cmbDepotParametros.removeAllItems();
            frmDepot.cmbDepotResultados.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmDepot.cmbDepot.addItem(z));
                labs.forEach(x -> frmDepot.cmbDepotParametros.addItem(x));
                labs.forEach(y -> frmDepot.cmbDepotResultados.addItem(y));

            } else {
                frmDepot.cmbDepotResultados.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }
    
    public void limpiar() {
   frmDepot.txttramiteTermico.setText(null);
   frmDepot.txtmecanizado.setText(null);
   frmDepot.txtresultados.setText(null);
   getAllLabs();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmDepot.btnPanel3_Consulter) {

                int index = frmDepot.cmbDepotResultados.getSelectedIndex();
                String selecDepotParametros = frmDepot.cmbDepotResultados.getItemAt(index);

                if (index != -1) {

                   depot = queryDepotResultado.getDepot(selecDepotParametros);                  
                   frmDepot.txttramiteTermico.setText(depot.getTratamientoTermico());
                   frmDepot.txtmecanizado.setText(depot.getMecanizado());
                   frmDepot.txtresultados1.setText(depot.getResultados());
                    System.out.println(depot.getResultados());
                } else {
                    JOptionPane.showMessageDialog(frmDepot, "Choisis une option");
                }
            }
            
            if (e.getSource() == frmDepot.btnPanel3_btnMettreAJour) {
                
                depot.setTratamientoTermico(frmDepot.txttramiteTermico.getText()== null ? "" : frmDepot.txttramiteTermico.getText());
                depot.setMecanizado(frmDepot.txtmecanizado.getText()== null ? "" : frmDepot.txtmecanizado.getText());
                System.out.println("REsultados:"+frmDepot.txtresultados.getText());
                depot.setResultados(frmDepot.txtresultados.getText()== null ? "" : frmDepot.txtresultados.getText());
                                
                int index = frmDepot.cmbDepotResultados.getSelectedIndex();
                String selecWaamParametros = frmDepot.cmbDepotResultados.getItemAt(index);
                depot.setNumeroFiche(selecWaamParametros);
                
                //queryDepotResultado.updateDepot(depot);
                if (queryDepotResultado.updateDepot(depot)) {
                    JOptionPane.showMessageDialog(frmDepot, "Élément mis à jour avec succès");

                } else {
                    JOptionPane.showMessageDialog(frmDepot, "Élément pas mis à jour correctement");

                }
                this.limpiar();

            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }
    
}
