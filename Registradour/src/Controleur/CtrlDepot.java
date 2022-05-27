/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.DB.QueryDepot;
import Modele.DB.QueryDepotParametros;
import Modele.DB.QueryDepotResultado;
import Modele.depotCabecer;
import Vue.frmDepot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Modele.depotCabecer;
import Vue.frmMenu;

import java.util.List;

/**
 *
 * @author admon
 */
public class CtrlDepot implements ActionListener {

    private depotCabecer depot;
    private QueryDepot queryDepot;
    private QueryDepotParametros queryDepotParametros;
    private QueryDepotResultado queryDepotResultado;
    private frmDepot frmDepot;
    private String user;

    public CtrlDepot(depotCabecer depot, QueryDepot queryDepot, frmDepot frmDepot, String user) {

        this.depot = depot;
        this.queryDepot = queryDepot;
        this.frmDepot = frmDepot;
        this.user = user;
        this.frmDepot.btnPanel1_Guardar.addActionListener(this);
        this.frmDepot.btnPanel1_Consulter.addActionListener(this);
        this.frmDepot.btnMettreAJour1.addActionListener(this);
        this.frmDepot.btnSupprimmer.addActionListener(this);
        this.frmDepot.btnDepoReturner.addActionListener(this);
    }

    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmDepot.setTitle("Depot");
        frmDepot.setLocationRelativeTo(null);
        getAllLabs();

//        //LOS DEMÁS TABS SE INICIAN AQUÍ 
        QueryDepotParametros queryDepotParametros = new QueryDepotParametros();
        depotCabecer depotCabecer = new depotCabecer();
        CtrlDepotParametros ctrlDepotParametros = new CtrlDepotParametros(depot, queryDepotParametros, frmDepot, user);
//        
        QueryDepotResultado queryDepotResultado = new QueryDepotResultado();
        CtrlDepotResultado ctrlDepotResultado = new CtrlDepotResultado(depot, queryDepotResultado, frmDepot, user);

        //getAllLabs();
    }

    public void limpiar() {

        frmDepot.txtDia.setDate(null);
        frmDepot.txtHora.setText(null);
        frmDepot.txtMaquina.setText(null);
        frmDepot.txtNumPag.setText(null);
        frmDepot.txtNumCas.setText(null);
        frmDepot.txtNumPla.setText(null);
        frmDepot.txtRefMat.setText(null);
        frmDepot.txtPreProc.setText(null);
        frmDepot.txtMetas.setText(null);
        frmDepot.txtOperVer.setText(null);
        frmDepot.txtLlenadoCaj.setText(null);
        frmDepot.txtOperador.setText(null);
        frmDepot.txtMaterial.setText(null);
        frmDepot.txtTamCable.setText(null);
        frmDepot.txtTamSust.setText(null);
        frmDepot.txtTamHab.setText(null);
        frmDepot.txtCroquis.setText(null);

        getAllLabs();
    }

    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryDepot.getAllWaam();
            frmDepot.cmbDepot.removeAllItems();
            frmDepot.cmbDepotParametros.removeAllItems();
            //frmWam.Panel3_cmbLabo.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmDepot.cmbDepot.addItem(z));
                labs.forEach(x -> frmDepot.cmbDepotParametros.addItem(x));
                labs.forEach(y -> frmDepot.cmbDepotResultados.addItem(y));

            } else {
                frmDepot.cmbDepot.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmDepot.btnPanel1_Guardar) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmDepot.txtDia.getDate() == null ? new Date() : frmDepot.txtDia.getDate());

                depot.setDate(date1);
                depot.setHeure(frmDepot.txtHora.getText() == null ? "" : frmDepot.txtHora.getText());
                depot.setMachine(frmDepot.txtMaquina.getText() == null ? "" : frmDepot.txtMaquina.getText());
                depot.setNumeroFiche(frmDepot.txtNumPag.getText() == null ? "" : frmDepot.txtNumPag.getText());
                depot.setNumeroCaso(frmDepot.txtNumCas.getText() == null ? "" : frmDepot.txtNumCas.getText());
                depot.setNumeroPlaca(frmDepot.txtNumPla.getText() == null ? "" : frmDepot.txtNumPla.getText());
                depot.setRefMateriales(frmDepot.txtRefMat.getText() == null ? "" : frmDepot.txtRefMat.getText());
                depot.setPreProceso(frmDepot.txtPreProc.getText() == null ? "" : frmDepot.txtPreProc.getText());
                depot.setMetas(frmDepot.txtMetas.getText() == null ? "" : frmDepot.txtMetas.getText());
                depot.setOpeVerificacion(frmDepot.txtOperVer.getText() == null ? "" : frmDepot.txtOperVer.getText());
                depot.setLlenGas(frmDepot.txtLlenadoCaj.getText() == null ? "" : frmDepot.txtLlenadoCaj.getText());
                depot.setOperador(frmDepot.txtOperador.getText() == null ? "" : frmDepot.txtOperador.getText());
                depot.setMaterial(frmDepot.txtMaterial.getText() == null ? "" : frmDepot.txtMaterial.getText());
                depot.setTamClave(frmDepot.txtTamCable.getText() == null ? "" : frmDepot.txtTamCable.getText());
                depot.setTamSustrato(frmDepot.txtTamSust.getText() == null ? "" : frmDepot.txtTamSust.getText());
                depot.setTamHabitacion(frmDepot.txtTamHab.getText() == null ? "" : frmDepot.txtTamHab.getText());
                depot.setCroquis(frmDepot.txtCroquis.getText() == null ? "" : frmDepot.txtCroquis.getText());

                queryDepot.saveDepot(depot);
                this.limpiar();

            }

            if (e.getSource() == frmDepot.btnPanel1_Consulter) {

                /*int index = frmLabo.cmbLabo.getSelectedIndex();
                String selecLabo = frmLabo.cmbLabo.getItemAt(index);
                 */
                int index = frmDepot.cmbDepot.getSelectedIndex();
                String cmbDepot = frmDepot.cmbDepot.getItemAt(index);

                if (index != -1) {

                    depot = queryDepot.getDepot(cmbDepot);

                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataFormateada = formato.parse(depot.getDate());
                    frmDepot.txtDia.setDate(dataFormateada);
                    frmDepot.txtHora.setText(depot.getHeure());
                    frmDepot.txtMaquina.setText(depot.getMachine());
                    frmDepot.txtNumPag.setText(depot.getNumeroFiche());
                    frmDepot.txtNumCas.setText(depot.getNumeroCaso());
                    frmDepot.txtNumPla.setText(depot.getNumeroPlaca());
                    frmDepot.txtRefMat.setText(depot.getRefMateriales());
                    frmDepot.txtPreProc.setText(depot.getPreProceso());
                    frmDepot.txtMetas.setText(depot.getMetas());
                    frmDepot.txtOperVer.setText(depot.getOpeVerificacion());
                    frmDepot.txtLlenadoCaj.setText(depot.getLlenGas());
                    frmDepot.txtOperador.setText(depot.getOperador());
                    frmDepot.txtMaterial.setText(depot.getMaterial());
                    frmDepot.txtTamCable.setText(depot.getTamClave());
                    frmDepot.txtTamSust.setText(depot.getTamSustrato());
                    frmDepot.txtTamHab.setText(depot.getTamHabitacion());
                    frmDepot.txtCroquis.setText(depot.getCroquis());
                } else {
                    System.out.println("Selecciona un Numéro fiche");
                }
            }
            if (e.getSource() == frmDepot.btnSupprimmer) {
                boolean delete = false;
                int index = frmDepot.cmbDepot.getSelectedIndex();
                String selecWaam = frmDepot.cmbDepot.getItemAt(index);

                delete = queryDepot.deleteDepot(selecWaam);
                if (delete) {
                    System.out.println("Elemento elimando");
                } else {
                    System.out.println("No puede eliminar5");
                }
                this.limpiar();
            }
            if (e.getSource() == frmDepot.btnMettreAJour1) {

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String date1 = formato.format(frmDepot.txtDia.getDate() == null ? new Date() : frmDepot.txtDia.getDate());
                depot.setDate(date1);
                depot.setHeure(frmDepot.txtHora.getText() == null ? "" : frmDepot.txtHora.getText());
                depot.setMachine(frmDepot.txtMaquina.getText() == null ? "" : frmDepot.txtMaquina.getText());
                depot.setNumeroFiche(frmDepot.txtNumPag.getText() == null ? "" : frmDepot.txtNumPag.getText());
                depot.setNumeroCaso(frmDepot.txtNumCas.getText() == null ? "" : frmDepot.txtNumCas.getText());
                depot.setNumeroPlaca(frmDepot.txtNumPla.getText() == null ? "" : frmDepot.txtNumPla.getText());
                depot.setRefMateriales(frmDepot.txtRefMat.getText() == null ? "" : frmDepot.txtRefMat.getText());
                depot.setRefMateriales(frmDepot.txtPreProc.getText() == null ? "" : frmDepot.txtPreProc.getText());
                depot.setMetas(frmDepot.txtMetas.getText() == null ? "" : frmDepot.txtMetas.getText());
                depot.setOpeVerificacion(frmDepot.txtOperVer.getText() == null ? "" : frmDepot.txtOperVer.getText());
                depot.setLlenGas(frmDepot.txtLlenadoCaj.getText() == null ? "" : frmDepot.txtLlenadoCaj.getText());
                depot.setOperador(frmDepot.txtOperador.getText() == null ? "" : frmDepot.txtOperador.getText());
                depot.setMaterial(frmDepot.txtMaterial.getText() == null ? "" : frmDepot.txtMaterial.getText());
                depot.setTamClave(frmDepot.txtTamCable.getText() == null ? "" : frmDepot.txtTamCable.getText());
                depot.setTamSustrato(frmDepot.txtTamSust.getText() == null ? "" : frmDepot.txtTamSust.getText());
                depot.setTamHabitacion(frmDepot.txtTamHab.getText() == null ? "" : frmDepot.txtTamHab.getText());
                depot.setCroquis(frmDepot.txtCroquis.getText() == null ? "" : frmDepot.txtCroquis.getText());
                queryDepot.updateDepot(depot);
                this.limpiar();

            }

            if (e.getSource() == frmDepot.btnDepoReturner) {
                getMenu();
                frmDepot.setVisible(false);
            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }

    public void getMenu() {
        frmMenu frmMenu = new frmMenu();
        CtrlMenu ctrMenu = new CtrlMenu(frmMenu, user);
        ctrMenu.iniciar();
        frmMenu.setVisible(true);
    }

}
