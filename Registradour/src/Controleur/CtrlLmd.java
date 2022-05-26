/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.LmdCabecer;
import Modele.DB.QueryLmd;
import Modele.DB.QueryLmdParametros;
import Modele.DB.QueryLmdResultado;

import Vue.frmLMD;
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
public class CtrlLmd  implements ActionListener {
    private LmdCabecer lmd;
    private QueryLmd queryLmd;
    private QueryLmdParametros queryLmdParametros;
    private QueryLmdResultado queryLmdResultadotad;
    private frmLMD frmLMD;
    private String user;
    
    public CtrlLmd(LmdCabecer lmd, QueryLmd queryLmd, frmLMD frmLMD, String user) {
        this.lmd = lmd;
        this.queryLmd = queryLmd;
        this.frmLMD = frmLMD;
        this.user = user;
        this.frmLMD.btnPanel1_Guardar.addActionListener(this);
        this.frmLMD.btnPanel1_Consulter.addActionListener(this);
        this.frmLMD.btnMettreAJour1.addActionListener(this);
        this.frmLMD.btnSupprimmer.addActionListener(this);
    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmLMD.setTitle("LMD");
        frmLMD.setLocationRelativeTo(null);
        getAllLabs();

        //LOS DEMÁS TABS SE INICIAN AQUÍ 
//        QueryLmdParametros queryLmdParametros = new QueryLmdParametros();
//        LmdCabecer lmdCabecer = new LmdCabecer();
//        CtrlLmdParametros ctrlLmdParametros = new CtrlLmdParametros(lmd, queryLmdParametros, frmLMD, user);
//        
//        QueryLmdResultado queryLmdResultado = new QueryLmdResultado();
//        CtrlLmdResultado ctrlLmdResultado = new CtrlLmdResultado(lmd, QueryLmdResultado, frmLMD, user);
    }
    
    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryLmd.getAllLmd();
            frmLMD.cmbLMD.removeAllItems();
            frmLMD.cmblmdParametros.removeAllItems();
            frmLMD.cmbLMDResultados.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmLMD.cmbLMD.addItem(z));
                labs.forEach(x -> frmLMD.cmblmdParametros.addItem(x));
                labs.forEach(y -> frmLMD.cmbLMDResultados.addItem(y));

            } else {
                frmLMD.cmbLMD.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }
    
    public void limpiar() {

        frmLMD.txtDia.setDate(null);
        frmLMD.txtHora.setText(null);
        frmLMD.txtMaquina.setText(null);
        frmLMD.txtNumPag.setText(null);
        frmLMD.txtNumCas.setText(null);
        frmLMD.txtNumPla.setText(null);
        frmLMD.txtRefMat.setText(null);
        frmLMD.txtPreProc.setText(null);
        frmLMD.txtMetas.setText(null);
        frmLMD.txtCentroLaser.setText(null);
        frmLMD.txtLlenadoCaj.setText(null);
        frmLMD.txtOperador.setText(null);
        frmLMD.txtMaterial.setText(null);
        frmLMD.txtLlenadoCaj.setText(null);
        frmLMD.txtTamSust.setText(null);
        frmLMD.txtTamHab.setText(null);
        frmLMD.txtCroquis.setText(null);

        getAllLabs();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmLMD.btnPanel1_Guardar) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmLMD.txtDia.getDate() == null ? new Date() : frmLMD.txtDia.getDate());
                lmd.setDate(date1);
                lmd.setHeure(frmLMD.txtHora.getText()== null ? "" : frmLMD.txtHora.getText());
                lmd.setMachine(frmLMD.txtMaquina.getText()== null ? "" : frmLMD.txtMaquina.getText());
                lmd.setNumeroFiche(frmLMD.txtNumPag.getText()== null ? "" : frmLMD.txtNumPag.getText());
                lmd.setNumeroCaso(frmLMD.txtNumCas.getText()== null ? "" : frmLMD.txtNumCas.getText());
                lmd.setNumeroPlaca(frmLMD.txtNumPla.getText()== null ? "" : frmLMD.txtNumPla.getText());
                lmd.setRefMateriales(frmLMD.txtRefMat.getText()== null ? "" : frmLMD.txtRefMat.getText());
                lmd.setPreProceso(frmLMD.txtPreProc.getText()== null ? "" : frmLMD.txtPreProc.getText());
                lmd.setMetas(frmLMD.txtMetas.getText()== null ? "" : frmLMD.txtMetas.getText());
                lmd.setOpeVerificacion(frmLMD.txtCentroLaser.getText()== null ? "" : frmLMD.txtCentroLaser.getText());
                lmd.setLlenGas(frmLMD.txtLlenadoCaj.getText()== null ? "" : frmLMD.txtLlenadoCaj.getText());
                lmd.setOperador(frmLMD.txtOperador.getText()== null ? "" : frmLMD.txtOperador.getText());
                lmd.setMaterial(frmLMD.txtMaterial.getText()== null ? "" : frmLMD.txtMaterial.getText());
                lmd.setBoquillaUtilizada(frmLMD.txtBoquillaUtilizada.getText()== null ? "" : frmLMD.txtBoquillaUtilizada.getText());
                lmd.setTamSustrato(frmLMD.txtTamSust.getText()== null ? "" : frmLMD.txtTamSust.getText());
                lmd.setTamHabitacion(frmLMD.txtTamHab.getText()== null ? "" : frmLMD.txtTamHab.getText());
                lmd.setCroquis(frmLMD.txtCroquis.getText()== null ? "" : frmLMD.txtCroquis.getText());

                queryLmd.saveLmd(lmd);
                this.limpiar();

            }
            if (e.getSource() == frmLMD.btnPanel1_Consulter) {

                /*int index = frmLabo.cmbLabo.getSelectedIndex();
                String selecLabo = frmLabo.cmbLabo.getItemAt(index);
                */
                int index = frmLMD.cmbLMD.getSelectedIndex();
                String selecLmd = frmLMD.cmbLMD.getItemAt(index);

                if (index != -1) {

                    lmd = queryLmd.getLmd(selecLmd);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataFormateada = formato.parse(lmd.getDate());
                    frmLMD.txtDia.setDate(dataFormateada);
                    frmLMD.txtHora.setText(lmd.getHeure());
                    frmLMD.txtMaquina.setText(lmd.getMachine());
                    frmLMD.txtNumPag.setText(lmd.getNumeroFiche());
                    frmLMD.txtNumCas.setText(lmd.getNumeroCaso());
                    frmLMD.txtNumPla.setText(lmd.getNumeroPlaca());
                    frmLMD.txtRefMat.setText(lmd.getRefMateriales());
                    frmLMD.txtPreProc.setText(lmd.getPreProceso());
                    frmLMD.txtMetas.setText(lmd.getMetas());
                    //frmLMD.txttamHabutacio.setText(waam.getOpeVerificacion());
                    frmLMD.txtLlenadoCaj.setText(lmd.getLlenGas());
                    frmLMD.txtOperador.setText(lmd.getOperador());
                    frmLMD.txtMaterial.setText(lmd.getMaterial());
                    //frmLMD.txtTamCable.setText(waam.getTamClave());
                    frmLMD.txtTamSust.setText(lmd.getTamSustrato());
                    frmLMD.txtTamHab.setText(lmd.getTamHabitacion());
                    frmLMD.txtCroquis.setText(lmd.getCroquis());
                } else {
                    System.out.println("Selecciona un Numéro fiche");
                }
            }
            
            if (e.getSource() == frmLMD.btnSupprimmer) {
                boolean delete = false;
                int index = frmLMD.cmbLMD.getSelectedIndex();
                String selecWaam = frmLMD.cmbLMD.getItemAt(index);

                delete = queryLmd.deleteLmd(selecWaam);
                if (delete) {
                    System.out.println("Elemento elimando");
                } else {
                    System.out.println("No puede eliminar5");
                }
                this.limpiar();
            }

            if (e.getSource() == frmLMD.btnMettreAJour1) {

               SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmLMD.txtDia.getDate() == null ? new Date() : frmLMD.txtDia.getDate());
                lmd.setDate(date1);
                lmd.setHeure(frmLMD.txtHora.getText()== null ? "" : frmLMD.txtHora.getText());
                lmd.setMachine(frmLMD.txtMaquina.getText()== null ? "" : frmLMD.txtMaquina.getText());
                lmd.setNumeroFiche(frmLMD.txtNumPag.getText()== null ? "" : frmLMD.txtNumPag.getText());
                lmd.setNumeroCaso(frmLMD.txtNumCas.getText()== null ? "" : frmLMD.txtNumCas.getText());
                lmd.setNumeroPlaca(frmLMD.txtNumPla.getText()== null ? "" : frmLMD.txtNumPla.getText());
                lmd.setRefMateriales(frmLMD.txtRefMat.getText()== null ? "" : frmLMD.txtRefMat.getText());
                lmd.setRefMateriales(frmLMD.txtPreProc.getText()== null ? "" : frmLMD.txtPreProc.getText());
                lmd.setMetas(frmLMD.txtMetas.getText()== null ? "" : frmLMD.txtMetas.getText());
                //lmd.setOpeVerificacion(frmLMD.txtOperVer.getText()== null ? "" : frmLMD.txtOperVer.getText());
                lmd.setLlenGas(frmLMD.txtLlenadoCaj.getText()== null ? "" : frmLMD.txtLlenadoCaj.getText());
                lmd.setOperador(frmLMD.txtOperador.getText()== null ? "" : frmLMD.txtOperador.getText());
                lmd.setMaterial(frmLMD.txtMaterial.getText()== null ? "" : frmLMD.txtMaterial.getText());
                //lmd.setTamClave(frmLMD.txtTamCable.getText()== null ? "" : frmLMD.txtTamCable.getText());
                lmd.setTamSustrato(frmLMD.txtTamSust.getText()== null ? "" : frmLMD.txtTamSust.getText());
                lmd.setTamHabitacion(frmLMD.txtTamHab.getText()== null ? "" : frmLMD.txtTamHab.getText());
                lmd.setCroquis(frmLMD.txtCroquis.getText()== null ? "" : frmLMD.txtCroquis.getText());
                queryLmd.updateLmd(lmd);
                this.limpiar();

            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }
}
