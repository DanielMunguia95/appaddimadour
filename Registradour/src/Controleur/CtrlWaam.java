/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.DB.QueryWaam;
import Modele.DB.QueryWaamParametros;
import Modele.DB.QueryWaamResultado;
import Modele.WaamCabecer;
import Vue.frmWam;
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
public class CtrlWaam implements ActionListener {
    private WaamCabecer waam;
    private QueryWaam queryWaam;
    private QueryWaamParametros queryWaamParametros;
    private QueryWaamResultado queryWaamResultadotad;
    private frmWam frmWam;
    private String user;
        
    public CtrlWaam(WaamCabecer waam, QueryWaam queryWaam, frmWam frmWam, String user) {

        this.waam = waam;
        this.queryWaam = queryWaam;
        this.frmWam = frmWam;
        this.user = user;
        this.frmWam.btnPanel1_Guardar.addActionListener(this);
        this.frmWam.btnPanel1_Consulter.addActionListener(this);
        this.frmWam.btnMettreAJour1.addActionListener(this);
        this.frmWam.btnSupprimmer.addActionListener(this);
    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmWam.setTitle("Waam");
        frmWam.setLocationRelativeTo(null);
        getAllLabs();

        //LOS DEMÁS TABS SE INICIAN AQUÍ 
        QueryWaamParametros queryWaamParametros = new QueryWaamParametros();
        WaamCabecer waamCabecer = new WaamCabecer();
        CtrlWaaParametros ctrlWaaParametros = new CtrlWaaParametros(waam, queryWaamParametros, frmWam, user);
        
        QueryWaamResultado queryWaamResultado = new QueryWaamResultado();
        CtrlWaamResultados ctrlWaamResultados = new CtrlWaamResultados(waam, queryWaamResultado, frmWam, user);
        
        //getAllLabs();

    }
    
    public void limpiar() {

        frmWam.txtDia.setDate(null);
        frmWam.txtHora.setText(null);
        frmWam.txtMaquina.setText(null);
        frmWam.txtNumPag.setText(null);
        frmWam.txtNumCas.setText(null);
        frmWam.txtNumPla.setText(null);
        frmWam.txtRefMat.setText(null);
        frmWam.txtPreProc.setText(null);
        frmWam.txtMetas.setText(null);
        frmWam.txtOperVer.setText(null);
        frmWam.txtLlenadoCaj.setText(null);
        frmWam.txtOperador.setText(null);
        frmWam.txtMaterial.setText(null);
        frmWam.txtTamCable.setText(null);
        frmWam.txtTamSust.setText(null);
        frmWam.txtTamHab.setText(null);
        frmWam.txtCroquis.setText(null);

        getAllLabs();
    }
    
    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryWaam.getAllWaam();
            frmWam.cmbWaam.removeAllItems();
            frmWam.cmbWaamParametros.removeAllItems();
            frmWam.cmbWaamResultados.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmWam.cmbWaam.addItem(z));
                labs.forEach(x -> frmWam.cmbWaamParametros.addItem(x));
                labs.forEach(y -> frmWam.cmbWaamResultados.addItem(y));

            } else {
                frmWam.cmbWaam.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmWam.btnPanel1_Guardar) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmWam.txtDia.getDate() == null ? new Date() : frmWam.txtDia.getDate());

                waam.setDate(date1);
                waam.setHeure(frmWam.txtHora.getText()== null ? "" : frmWam.txtHora.getText());
                waam.setMachine(frmWam.txtMaquina.getText()== null ? "" : frmWam.txtMaquina.getText());
                waam.setNumeroFiche(frmWam.txtNumPag.getText()== null ? "" : frmWam.txtNumPag.getText());
                waam.setNumeroCaso(frmWam.txtNumCas.getText()== null ? "" : frmWam.txtNumCas.getText());
                waam.setNumeroPlaca(frmWam.txtNumPla.getText()== null ? "" : frmWam.txtNumPla.getText());
                waam.setRefMateriales(frmWam.txtRefMat.getText()== null ? "" : frmWam.txtRefMat.getText());
                waam.setPreProceso(frmWam.txtPreProc.getText()== null ? "" : frmWam.txtPreProc.getText());
                waam.setMetas(frmWam.txtMetas.getText()== null ? "" : frmWam.txtMetas.getText());
                waam.setOpeVerificacion(frmWam.txtOperVer.getText()== null ? "" : frmWam.txtOperVer.getText());
                waam.setLlenGas(frmWam.txtLlenadoCaj.getText()== null ? "" : frmWam.txtLlenadoCaj.getText());
                waam.setOperador(frmWam.txtOperador.getText()== null ? "" : frmWam.txtOperador.getText());
                waam.setMaterial(frmWam.txtMaterial.getText()== null ? "" : frmWam.txtMaterial.getText());
                waam.setTamClave(frmWam.txtTamCable.getText()== null ? "" : frmWam.txtTamCable.getText());
                waam.setTamSustrato(frmWam.txtTamSust.getText()== null ? "" : frmWam.txtTamSust.getText());
                waam.setTamHabitacion(frmWam.txtTamHab.getText()== null ? "" : frmWam.txtTamHab.getText());
                waam.setCroquis(frmWam.txtCroquis.getText()== null ? "" : frmWam.txtCroquis.getText());

                //queryWaam.saveWaam(waam);
                if (queryWaam.saveWaam(waam)) {
                    JOptionPane.showMessageDialog(frmWam, "Élément enregistré avec succès");

                } else {
                    JOptionPane.showMessageDialog(frmWam, "Élément mal enregistré");

                }
                this.limpiar();

            }

            if (e.getSource() == frmWam.btnPanel1_Consulter) {

                /*int index = frmLabo.cmbLabo.getSelectedIndex();
                String selecLabo = frmLabo.cmbLabo.getItemAt(index);
                */
                int index = frmWam.cmbWaam.getSelectedIndex();
                String selecWaam = frmWam.cmbWaam.getItemAt(index);

                if (index != -1) {

                    waam = queryWaam.getWaam(selecWaam);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataFormateada = formato.parse(waam.getDate());
                    frmWam.txtDia.setDate(dataFormateada);
                    frmWam.txtHora.setText(waam.getHeure());
                    frmWam.txtMaquina.setText(waam.getMachine());
                    frmWam.txtNumPag.setText(waam.getNumeroFiche());
                    frmWam.txtNumCas.setText(waam.getNumeroCaso());
                    frmWam.txtNumPla.setText(waam.getNumeroPlaca());
                    frmWam.txtRefMat.setText(waam.getRefMateriales());
                    frmWam.txtPreProc.setText(waam.getPreProceso());
                    frmWam.txtMetas.setText(waam.getMetas());
                    frmWam.txtOperVer.setText(waam.getOpeVerificacion());
                    frmWam.txtLlenadoCaj.setText(waam.getLlenGas());
                    frmWam.txtOperador.setText(waam.getOperador());
                    frmWam.txtMaterial.setText(waam.getMaterial());
                    frmWam.txtTamCable.setText(waam.getTamClave());
                    frmWam.txtTamSust.setText(waam.getTamSustrato());
                    frmWam.txtTamHab.setText(waam.getTamHabitacion());
                    frmWam.txtCroquis.setText(waam.getCroquis());
                } else {
                        JOptionPane.showMessageDialog(frmWam, "Choisis une option");
                }
            }
            if (e.getSource() == frmWam.btnSupprimmer) {
                boolean delete = false;
                int index = frmWam.cmbWaam.getSelectedIndex();
                String selecWaam = frmWam.cmbWaam.getItemAt(index);

                delete = queryWaam.deleteWaam(selecWaam);
                if (delete) {
                    JOptionPane.showMessageDialog(frmWam, "Élément supprimé");
                  
                } else {

                    JOptionPane.showMessageDialog(frmWam, "Impossible de supprimer l'élément");
                  
                }
//                if (delete) {
//                    System.out.println("Elemento elimando");
//                } else {
//                    System.out.println("No puede eliminar5");
//                }
                this.limpiar();
            }
            if (e.getSource() == frmWam.btnMettreAJour1) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmWam.txtDia.getDate() == null ? new Date() : frmWam.txtDia.getDate());
                waam.setDate(date1);
                waam.setHeure(frmWam.txtHora.getText()== null ? "" : frmWam.txtHora.getText());
                waam.setMachine(frmWam.txtMaquina.getText()== null ? "" : frmWam.txtMaquina.getText());
                waam.setNumeroFiche(frmWam.txtNumPag.getText()== null ? "" : frmWam.txtNumPag.getText());
                waam.setNumeroCaso(frmWam.txtNumCas.getText()== null ? "" : frmWam.txtNumCas.getText());
                waam.setNumeroPlaca(frmWam.txtNumPla.getText()== null ? "" : frmWam.txtNumPla.getText());
                waam.setRefMateriales(frmWam.txtRefMat.getText()== null ? "" : frmWam.txtRefMat.getText());
                waam.setRefMateriales(frmWam.txtPreProc.getText()== null ? "" : frmWam.txtPreProc.getText());
                waam.setMetas(frmWam.txtMetas.getText()== null ? "" : frmWam.txtMetas.getText());
                waam.setOpeVerificacion(frmWam.txtOperVer.getText()== null ? "" : frmWam.txtOperVer.getText());
                waam.setLlenGas(frmWam.txtLlenadoCaj.getText()== null ? "" : frmWam.txtLlenadoCaj.getText());
                waam.setOperador(frmWam.txtOperador.getText()== null ? "" : frmWam.txtOperador.getText());
                waam.setMaterial(frmWam.txtMaterial.getText()== null ? "" : frmWam.txtMaterial.getText());
                waam.setTamClave(frmWam.txtTamCable.getText()== null ? "" : frmWam.txtTamCable.getText());
                waam.setTamSustrato(frmWam.txtTamSust.getText()== null ? "" : frmWam.txtTamSust.getText());
                waam.setTamHabitacion(frmWam.txtTamHab.getText()== null ? "" : frmWam.txtTamHab.getText());
                waam.setCroquis(frmWam.txtCroquis.getText()== null ? "" : frmWam.txtCroquis.getText());
                queryWaam.updateWaam(waam);
                this.limpiar();

            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }
    
    
}
