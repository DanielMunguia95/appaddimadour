/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.depotCabecer;
import Modele.DB.QueryDepotParametros;
import Modele.DB.QueryDepot;
import Vue.frmDepot;
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
public class CtrlDepotParametros implements ActionListener {
    private depotCabecer depot;
    private QueryDepotParametros queryDepotParametros;
    private frmDepot frmDepot;
    private String user;
    
    public CtrlDepotParametros(depotCabecer depot, QueryDepotParametros queryDepotParametros, frmDepot frmDepot, String user) {
        this.depot = depot;
        this.queryDepotParametros = queryDepotParametros;
        this.frmDepot = frmDepot;
        this.user = user;
        //BOTONES
        this.frmDepot.btnPanel2_Consulter.addActionListener(this);
        this.frmDepot.btnPanel2_btnMettreAJour.addActionListener(this);
        //this.frmWam.btnSupprimmer.addActionListener(this);
    }
    
     public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryDepotParametros.getAllDepot();
            frmDepot.cmbDepotParametros.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmDepot.cmbDepotParametros.addItem(z));

            } else {
                frmDepot.cmbDepotParametros.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmDepot.setTitle("Depot");
        frmDepot.setLocationRelativeTo(null);
        getAllLabs();
    }
    
    public void limpiar() {
        frmDepot.txtpotenciaLaser1.setText(null);
        frmDepot.txtpotenciaLaser2.setText(null);
    frmDepot.txtaltura1.setText(null);
    frmDepot.txtaltura10.setText(null);
    frmDepot.txtaltura2.setText(null);
    frmDepot.txtaltura3.setText(null);
    frmDepot.txtaltura4.setText(null);
    frmDepot.txtaltura5.setText(null);
    frmDepot.txtaltura6.setText(null);
    frmDepot.txtaltura7.setText(null);
    frmDepot.txtaltura8.setText(null);
    frmDepot.txtaltura9.setText(null);
    frmDepot.txtalturaTotal.setText(null);
    frmDepot.txtpotenciaLaser10.setText(null);
    frmDepot.txtpotenciaLaser3.setText(null);
    frmDepot.txtpotenciaLaser4.setText(null);
    frmDepot.txtpotenciaLaser5.setText(null);
    frmDepot.txtpotenciaLaser6.setText(null);
    frmDepot.txtpotenciaLaser7.setText(null);
    frmDepot.txtpotenciaLaser8.setText(null);
    frmDepot.txtpotenciaLaser9.setText(null);
    frmDepot.txtpotenciaLaserTotal.setText(null);
    frmDepot.txtvelocidadCable1.setText(null);
    frmDepot.txtvelocidadCable10.setText(null);
    frmDepot.txtvelocidadCable2.setText(null);
    frmDepot.txtvelocidadCable3.setText(null);
    frmDepot.txtvelocidadCable4.setText(null);
    frmDepot.txtvelocidadCable5.setText(null);
    frmDepot.txtvelocidadCable6.setText(null);
    frmDepot.txtvelocidadCable7.setText(null);
    frmDepot.txtvelocidadCable8.setText(null);
    frmDepot.txtvelocidadCable9.setText(null);
    frmDepot.txtvelocidadCableTotal.setText(null);
    frmDepot.txtboquillaPza1.setText(null);
    frmDepot.txtboquillaPza10.setText(null);
    frmDepot.txtboquillaPza2.setText(null);
    frmDepot.txtboquillaPza3.setText(null);
    frmDepot.txtboquillaPza4.setText(null);
    frmDepot.txtboquillaPza5.setText(null);
    frmDepot.txtboquillaPza6.setText(null);
    frmDepot.txtboquillaPza7.setText(null);
    frmDepot.txtboquillaPza8.setText(null);
    frmDepot.txtboquillaPza9.setText(null);
    frmDepot.txtboquillaPzaTotal.setText(null);
    frmDepot.txtcomentariosParametros.setText(null);
    frmDepot.txtleySinergica1.setText(null);
    frmDepot.txtleySinergica10.setText(null);
    frmDepot.txtleySinergica2.setText(null);
    frmDepot.txtleySinergica3.setText(null);
    frmDepot.txtleySinergica4.setText(null);
    frmDepot.txtleySinergica5.setText(null);
    frmDepot.txtleySinergica6.setText(null);
    frmDepot.txtleySinergica7.setText(null);
    frmDepot.txtleySinergica8.setText(null);
    frmDepot.txtleySinergica9.setText(null);
    frmDepot.txtleySinergicaTotal.setText(null);
    frmDepot.txtlvelRobto1.setText(null);
    frmDepot.txtlvelRobto10.setText(null);
    frmDepot.txtlvelRobto2.setText(null);
    frmDepot.txtlvelRobto3.setText(null);
    frmDepot.txtlvelRobto4.setText(null);
    frmDepot.txtlvelRobto5.setText(null);
    frmDepot.txtlvelRobto6.setText(null);
    frmDepot.txtlvelRobto7.setText(null);
    frmDepot.txtlvelRobto8.setText(null);
    frmDepot.txtlvelRobto9.setText(null);
    frmDepot.txtlvelRobtoTotal.setText(null);
    frmDepot.txtreferencias1.setText(null);
    frmDepot.txtreferencias10.setText(null);
    frmDepot.txtreferencias2.setText(null);
    frmDepot.txtreferencias3.setText(null);
    frmDepot.txtreferencias4.setText(null);
    frmDepot.txtreferencias5.setText(null);
    frmDepot.txtreferencias6.setText(null);
    frmDepot.txtreferencias7.setText(null);
    frmDepot.txtreferencias8.setText(null);
    frmDepot.txtreferencias9.setText(null);
    frmDepot.txtreferenciasTotal.setText(null);
    frmDepot.txttemperatura1.setText(null);
    frmDepot.txttemperatura10.setText(null);
    frmDepot.txttemperatura2.setText(null);
    frmDepot.txttemperatura3.setText(null);
    frmDepot.txttemperatura4.setText(null);
    frmDepot.txttemperatura5.setText(null);
    frmDepot.txttemperatura6.setText(null);
    frmDepot.txttemperatura7.setText(null);
    frmDepot.txttemperatura8.setText(null);
    frmDepot.txttemperatura9.setText(null);
    frmDepot.txttemperaturaTotal.setText(null);
    frmDepot.txttemporizador1.setText(null);
    frmDepot.txttemporizador10.setText(null);
    frmDepot.txttemporizador2.setText(null);
    frmDepot.txttemporizador3.setText(null);
    frmDepot.txttemporizador4.setText(null);
    frmDepot.txttemporizador5.setText(null);
    frmDepot.txttemporizador6.setText(null);
    frmDepot.txttemporizador7.setText(null);
    frmDepot.txttemporizador8.setText(null);
    frmDepot.txttemporizador9.setText(null);
    frmDepot.txttemporizadorTotal.setText(null);
    frmDepot.txtvelocidadCable1.setText(null);
    frmDepot.txtvelocidadCable10.setText(null);
    frmDepot.txtvelocidadCable2.setText(null);
    frmDepot.txtvelocidadCable3.setText(null);
    frmDepot.txtvelocidadCable4.setText(null);
    frmDepot.txtvelocidadCable5.setText(null);
    frmDepot.txtvelocidadCable6.setText(null);
    frmDepot.txtvelocidadCable7.setText(null);
    frmDepot.txtvelocidadCable8.setText(null);
    frmDepot.txtvelocidadCable9.setText(null);
    frmDepot.txtvelocidadCableTotal.setText(null);
    frmDepot.txty1.setText(null);
    frmDepot.txty10.setText(null);
    frmDepot.txty2.setText(null);
    frmDepot.txty3.setText(null);
    frmDepot.txty4.setText(null);
    frmDepot.txty5.setText(null);
    frmDepot.txty6.setText(null);
    frmDepot.txty7.setText(null);
    frmDepot.txty8.setText(null);
    frmDepot.txty9.setText(null);
    frmDepot.txtyTotal.setText(null);
    frmDepot.txtz1.setText(null);
    frmDepot.txtz10.setText(null);
    frmDepot.txtz2.setText(null);
    frmDepot.txtz3.setText(null);
    frmDepot.txtz4.setText(null);
    frmDepot.txtz5.setText(null);
    frmDepot.txtz6.setText(null);
    frmDepot.txtz7.setText(null);
    frmDepot.txtz8.setText(null);
    frmDepot.txtz9.setText(null);
    frmDepot.txtzTotal.setText(null);
    
    frmDepot.txtpatronEscaneo1.setText(null);
    frmDepot.txtpatronEscaneo2.setText(null);
    frmDepot.txtpatronEscaneo3.setText(null);
    frmDepot.txtpatronEscaneo4.setText(null);
    frmDepot.txtpatronEscaneo5.setText(null);
    frmDepot.txtpatronEscaneo6.setText(null);
    frmDepot.txtpatronEscaneo7.setText(null);
    frmDepot.txtpatronEscaneo8.setText(null);
    frmDepot.txtpatronEscaneo9.setText(null);
    frmDepot.txtpatronEscaneo10.setText(null);
    frmDepot.txtpatronEscaneoTotal.setText(null);
    frmDepot.txtlargo1.setText(null);
    frmDepot.txtlargo2.setText(null);
    frmDepot.txtlargo3.setText(null);
    frmDepot.txtlargo4.setText(null);
    frmDepot.txtlargo5.setText(null);
    frmDepot.txtlargo6.setText(null);
    frmDepot.txtlargo7.setText(null);
    frmDepot.txtlargo8.setText(null);
    frmDepot.txtlargo9.setText(null);
    frmDepot.txtlargo10.setText(null);
    frmDepot.txtlargoTotal.setText(null);
    frmDepot.txtaltura1.setText(null);
    frmDepot.txtaltura2.setText(null);
    frmDepot.txtaltura3.setText(null);
    frmDepot.txtaltura4.setText(null);
    frmDepot.txtaltura5.setText(null);
    frmDepot.txtaltura6.setText(null);
    frmDepot.txtaltura7.setText(null);
    frmDepot.txtaltura8.setText(null);
    frmDepot.txtaltura9.setText(null);
    frmDepot.txtaltura10.setText(null);
    frmDepot.txtalturaTotal.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
    if (e.getSource() == frmDepot.btnPanel2_Consulter) {

        int index = frmDepot.cmbDepotParametros.getSelectedIndex();
        String selecdepotParametros = frmDepot.cmbDepotParametros.getItemAt(index);

        if (index != -1) {

            depot = queryDepotParametros.getDepot(selecdepotParametros);
                      
           frmDepot.txtpotenciaLaser1.setText(depot.getPotenciaLaser1());
           frmDepot.txtpotenciaLaser10.setText(depot.getPotenciaLaser10());
           frmDepot.txtpotenciaLaser2.setText(depot.getPotenciaLaser2());
           frmDepot.txtpotenciaLaser3.setText(depot.getPotenciaLaser3());
           frmDepot.txtpotenciaLaser4.setText(depot.getPotenciaLaser4());
           frmDepot.txtpotenciaLaser5.setText(depot.getPotenciaLaser5());
           frmDepot.txtpotenciaLaser6.setText(depot.getPotenciaLaser6());
           frmDepot.txtpotenciaLaser7.setText(depot.getPotenciaLaser7());
           frmDepot.txtpotenciaLaser8.setText(depot.getPotenciaLaser8());
           frmDepot.txtpotenciaLaser9.setText(depot.getPotenciaLaser9());
           frmDepot.txtpotenciaLaserTotal.setText(depot.getPotenciaLaserTotal());
           frmDepot.txtvelocidadCable1.setText(depot.getVelocidadCable1());
           frmDepot.txtvelocidadCable10.setText(depot.getVelocidadCable0());
           frmDepot.txtvelocidadCable2.setText(depot.getVelocidadCable2());
           frmDepot.txtvelocidadCable3.setText(depot.getVelocidadCable3());
           frmDepot.txtvelocidadCable4.setText(depot.getVelocidadCable4());
           frmDepot.txtvelocidadCable5.setText(depot.getVelocidadCable5());
           frmDepot.txtvelocidadCable6.setText(depot.getVelocidadCable6());
           frmDepot.txtvelocidadCable7.setText(depot.getVelocidadCable7());
           frmDepot.txtvelocidadCable8.setText(depot.getVelocidadCable8());
           frmDepot.txtvelocidadCable9.setText(depot.getVelocidadCable9());
           frmDepot.txtvelocidadCableTotal.setText(depot.getVelocidadCableTotal());
           frmDepot.txtboquillaPza1.setText(depot.getBoquillaPza1());
           frmDepot.txtboquillaPza10.setText(depot.getBoquillaPza10());
           frmDepot.txtboquillaPza2.setText(depot.getBoquillaPza2());
           frmDepot.txtboquillaPza3.setText(depot.getBoquillaPza3());
           frmDepot.txtboquillaPza4.setText(depot.getBoquillaPza4());
           frmDepot.txtboquillaPza5.setText(depot.getBoquillaPza5());
           frmDepot.txtboquillaPza6.setText(depot.getBoquillaPza6());
           frmDepot.txtboquillaPza7.setText(depot.getBoquillaPza7());
           frmDepot.txtboquillaPza8.setText(depot.getBoquillaPza8());
           frmDepot.txtboquillaPza9.setText(depot.getBoquillaPza9());
           frmDepot.txtboquillaPzaTotal.setText(depot.getBoquillaPzaTotal());
           frmDepot.txtcomentariosParametros.setText(depot.getComentarios());
           frmDepot.txtleySinergica1.setText(depot.getLeySinergica1());
           frmDepot.txtleySinergica10.setText(depot.getLeySinergica10());
           frmDepot.txtleySinergica2.setText(depot.getLeySinergica2());
           frmDepot.txtleySinergica3.setText(depot.getLeySinergica3());
           frmDepot.txtleySinergica4.setText(depot.getLeySinergica4());
           frmDepot.txtleySinergica5.setText(depot.getLeySinergica5());
           frmDepot.txtleySinergica6.setText(depot.getLeySinergica6());
           frmDepot.txtleySinergica7.setText(depot.getLeySinergica7());
           frmDepot.txtleySinergica8.setText(depot.getLeySinergica8());
           frmDepot.txtleySinergica9.setText(depot.getLeySinergica9());
           frmDepot.txtleySinergicaTotal.setText(depot.getLeySinergicaTotal());
           frmDepot.txtlvelRobto1.setText(depot.getVelRobto1());
           frmDepot.txtlvelRobto10.setText(depot.getVelRobto10());
           frmDepot.txtlvelRobto2.setText(depot.getVelRobto2());
           frmDepot.txtlvelRobto3.setText(depot.getVelRobto3());
           frmDepot.txtlvelRobto4.setText(depot.getVelRobto4());
           frmDepot.txtlvelRobto5.setText(depot.getVelRobto5());
           frmDepot.txtlvelRobto6.setText(depot.getVelRobto6());
           frmDepot.txtlvelRobto7.setText(depot.getVelRobto7());
           frmDepot.txtlvelRobto8.setText(depot.getVelRobto8());
           frmDepot.txtlvelRobto9.setText(depot.getVelRobto9());
           frmDepot.txtlvelRobtoTotal.setText(depot.getVelRobtoTotal());
           
           frmDepot.txtreferencias1.setText(depot.getReferencias1());
           frmDepot.txtreferencias10.setText(depot.getReferencias10());
           frmDepot.txtreferencias2.setText(depot.getReferencias2());
           frmDepot.txtreferencias3.setText(depot.getReferencias3());
           frmDepot.txtreferencias4.setText(depot.getReferencias4());
           frmDepot.txtreferencias5.setText(depot.getReferencias5());
           frmDepot.txtreferencias6.setText(depot.getReferencias6());
           frmDepot.txtreferencias7.setText(depot.getReferencias7());
           frmDepot.txtreferencias8.setText(depot.getReferencias8());
           frmDepot.txtreferencias9.setText(depot.getReferencias9());
           frmDepot.txtreferenciasTotal.setText(depot.getReferenciasTotal());
           frmDepot.txttemperatura1.setText(depot.getTemperatura1());
           frmDepot.txttemperatura10.setText(depot.getTemperatura10());
           frmDepot.txttemperatura2.setText(depot.getTemperatura2());
           frmDepot.txttemperatura3.setText(depot.getTemperatura3());
           frmDepot.txttemperatura4.setText(depot.getTemperatura4());
           frmDepot.txttemperatura5.setText(depot.getTemperatura5());
           frmDepot.txttemperatura6.setText(depot.getTemperatura6());
           frmDepot.txttemperatura7.setText(depot.getTemperatura7());
           frmDepot.txttemperatura8.setText(depot.getTemperatura8());
           frmDepot.txttemperatura9.setText(depot.getTemperatura9());
           frmDepot.txttemperaturaTotal.setText(depot.getTemperaturaTotal());
           frmDepot.txttemporizador1.setText(depot.getTemporizador1());
           frmDepot.txttemporizador10.setText(depot.getTemporizador10());
           frmDepot.txttemporizador2.setText(depot.getTemporizador2());
           frmDepot.txttemporizador3.setText(depot.getTemporizador3());
           frmDepot.txttemporizador4.setText(depot.getTemporizador4());
           frmDepot.txttemporizador5.setText(depot.getTemporizador5());
           frmDepot.txttemporizador6.setText(depot.getTemporizador6());
           frmDepot.txttemporizador7.setText(depot.getTemporizador7());
           frmDepot.txttemporizador8.setText(depot.getTemporizador8());
           frmDepot.txttemporizador9.setText(depot.getTemporizador9());
           frmDepot.txttemporizadorTotal.setText(depot.getTemporizadorTotal());
           frmDepot.txtvelocidadCable1.setText(depot.getVelocidadCable1());
           frmDepot.txtvelocidadCable10.setText(depot.getVelocidadCable0());
           frmDepot.txtvelocidadCable2.setText(depot.getVelocidadCable2());
           frmDepot.txtvelocidadCable3.setText(depot.getVelocidadCable3());
           frmDepot.txtvelocidadCable4.setText(depot.getVelocidadCable4());
           frmDepot.txtvelocidadCable5.setText(depot.getVelocidadCable5());
           frmDepot.txtvelocidadCable6.setText(depot.getVelocidadCable6());
           frmDepot.txtvelocidadCable7.setText(depot.getVelocidadCable7());
           frmDepot.txtvelocidadCable8.setText(depot.getVelocidadCable8());
           frmDepot.txtvelocidadCable9.setText(depot.getVelocidadCable9());
           frmDepot.txtvelocidadCableTotal.setText(depot.getVelocidadCableTotal());
           frmDepot.txty1.setText(depot.getY1());
           frmDepot.txty10.setText(depot.getY10());
           frmDepot.txty2.setText(depot.getY2());
           frmDepot.txty3.setText(depot.getY3());
           frmDepot.txty4.setText(depot.getY4());
           frmDepot.txty5.setText(depot.getY5());
           frmDepot.txty6.setText(depot.getY6());
           frmDepot.txty7.setText(depot.getY7());
           frmDepot.txty8.setText(depot.getY8());
           frmDepot.txty9.setText(depot.getY9());
           frmDepot.txtyTotal.setText(depot.getyTotal());
           frmDepot.txtz1.setText(depot.getZ1());
           frmDepot.txtz10.setText(depot.getZ10());
           frmDepot.txtz2.setText(depot.getZ2());
           frmDepot.txtz3.setText(depot.getZ3());
           frmDepot.txtz4.setText(depot.getZ4());
           frmDepot.txtz5.setText(depot.getZ5());
           frmDepot.txtz6.setText(depot.getZ6());
           frmDepot.txtz7.setText(depot.getZ7());
           frmDepot.txtz8.setText(depot.getZ8());
           frmDepot.txtz9.setText(depot.getZ9());
           frmDepot.txtzTotal.setText(depot.getzTotal());
           
           frmDepot.txtpatronEscaneo1.setText(depot.getPatronEscaneo1());
           frmDepot.txtpatronEscaneo10.setText(depot.getPatronEscaneo10());
           frmDepot.txtpatronEscaneo2.setText(depot.getPatronEscaneo2());
           frmDepot.txtpatronEscaneo3.setText(depot.getPatronEscaneo3());
           frmDepot.txtpatronEscaneo4.setText(depot.getPatronEscaneo4());
           frmDepot.txtpatronEscaneo5.setText(depot.getPatronEscaneo5());
           frmDepot.txtpatronEscaneo6.setText(depot.getPatronEscaneo6());
           frmDepot.txtpatronEscaneo7.setText(depot.getPatronEscaneo7());
           frmDepot.txtpatronEscaneo8.setText(depot.getPatronEscaneo8());
           frmDepot.txtpatronEscaneo9.setText(depot.getPatronEscaneo9());
           frmDepot.txtpatronEscaneoTotal.setText(depot.getPatronEscaneoTotal());
           
           frmDepot.txtlargo1.setText(depot.getLargo1());
           frmDepot.txtlargo10.setText(depot.getLargo10());
           frmDepot.txtlargo2.setText(depot.getLargo2());
           frmDepot.txtlargo3.setText(depot.getLargo3());
           frmDepot.txtlargo4.setText(depot.getLargo4());
           frmDepot.txtlargo5.setText(depot.getLargo5());
           frmDepot.txtlargo6.setText(depot.getLargo6());
           frmDepot.txtlargo7.setText(depot.getLargo7());
           frmDepot.txtlargo8.setText(depot.getLargo8());
           frmDepot.txtlargo9.setText(depot.getLargo9());
           frmDepot.txtlargoTotal.setText(depot.getLargoTotal());
           
           frmDepot.txtaltura1.setText(depot.getAltura1());
           frmDepot.txtaltura10.setText(depot.getAltura10());
           frmDepot.txtaltura2.setText(depot.getAltura2());
           frmDepot.txtaltura3.setText(depot.getAltura3());
           frmDepot.txtaltura4.setText(depot.getAltura4());
           frmDepot.txtaltura5.setText(depot.getAltura5());
           frmDepot.txtaltura6.setText(depot.getAltura6());
           frmDepot.txtaltura7.setText(depot.getAltura7());
           frmDepot.txtaltura8.setText(depot.getAltura8());
           frmDepot.txtaltura9.setText(depot.getAltura9());
           frmDepot.txtalturaTotal.setText(depot.getAlturaTotal());
        } else {
            System.out.println("Selecciona un Numéro fiche");
        }
    }
    
    if (e.getSource() == frmDepot.btnPanel2_btnMettreAJour) {
        
        depot.setPotenciaLaser1(frmDepot.txtpotenciaLaser1.getText()== null ? "" : frmDepot.txtpotenciaLaser1.getText());
        depot.setPotenciaLaser2(frmDepot.txtpotenciaLaser2.getText()== null ? "" : frmDepot.txtpotenciaLaser2.getText());
        depot.setPotenciaLaser3(frmDepot.txtpotenciaLaser3.getText()== null ? "" : frmDepot.txtpotenciaLaser3.getText());
        depot.setPotenciaLaser4(frmDepot.txtpotenciaLaser4.getText()== null ? "" : frmDepot.txtpotenciaLaser4.getText());
        depot.setPotenciaLaser5(frmDepot.txtpotenciaLaser5.getText()== null ? "" : frmDepot.txtpotenciaLaser5.getText());
        depot.setPotenciaLaser6(frmDepot.txtpotenciaLaser6.getText()== null ? "" : frmDepot.txtpotenciaLaser6.getText());
        depot.setPotenciaLaser7(frmDepot.txtpotenciaLaser7.getText()== null ? "" : frmDepot.txtpotenciaLaser7.getText());
        depot.setPotenciaLaser8(frmDepot.txtpotenciaLaser8.getText()== null ? "" : frmDepot.txtpotenciaLaser8.getText());
        depot.setPotenciaLaser9(frmDepot.txtpotenciaLaser9.getText()== null ? "" : frmDepot.txtpotenciaLaser9.getText());
        depot.setPotenciaLaser10(frmDepot.txtpotenciaLaser10.getText()== null ? "" : frmDepot.txtpotenciaLaser10.getText());
        depot.setPotenciaLaserTotal(frmDepot.txtpotenciaLaserTotal.getText()== null ? "" : frmDepot.txtpotenciaLaserTotal.getText());
        
        depot.setVelocidadCable1(frmDepot.txtvelocidadCable1.getText()== null ? "" : frmDepot.txtvelocidadCable1.getText());
        depot.setVelocidadCable2(frmDepot.txtvelocidadCable2.getText()== null ? "" : frmDepot.txtvelocidadCable2.getText());
        depot.setVelocidadCable3(frmDepot.txtvelocidadCable3.getText()== null ? "" : frmDepot.txtvelocidadCable3.getText());
        depot.setVelocidadCable4(frmDepot.txtvelocidadCable4.getText()== null ? "" : frmDepot.txtvelocidadCable4.getText());
        depot.setVelocidadCable5(frmDepot.txtvelocidadCable5.getText()== null ? "" : frmDepot.txtvelocidadCable5.getText());
        depot.setVelocidadCable6(frmDepot.txtvelocidadCable6.getText()== null ? "" : frmDepot.txtvelocidadCable6.getText());
        depot.setVelocidadCable7(frmDepot.txtvelocidadCable7.getText()== null ? "" : frmDepot.txtvelocidadCable7.getText());
        depot.setVelocidadCable8(frmDepot.txtvelocidadCable8.getText()== null ? "" : frmDepot.txtvelocidadCable8.getText());
        depot.setVelocidadCable9(frmDepot.txtvelocidadCable9.getText()== null ? "" : frmDepot.txtvelocidadCable9.getText());
        depot.setVelocidadCable0(frmDepot.txtvelocidadCable10.getText()== null ? "" : frmDepot.txtvelocidadCable10.getText());
        depot.setVelocidadCableTotal(frmDepot.txtvelocidadCableTotal.getText()== null ? "" : frmDepot.txtvelocidadCableTotal.getText());
        
        depot.setBoquillaPza1(frmDepot.txtboquillaPza1.getText()== null ? "" : frmDepot.txtboquillaPza1.getText());
        depot.setBoquillaPza2(frmDepot.txtboquillaPza2.getText()== null ? "" : frmDepot.txtboquillaPza2.getText());
        depot.setBoquillaPza3(frmDepot.txtboquillaPza3.getText()== null ? "" : frmDepot.txtboquillaPza3.getText());
        depot.setBoquillaPza4(frmDepot.txtboquillaPza4.getText()== null ? "" : frmDepot.txtboquillaPza4.getText());
        depot.setBoquillaPza5(frmDepot.txtboquillaPza5.getText()== null ? "" : frmDepot.txtboquillaPza5.getText());
        depot.setBoquillaPza6(frmDepot.txtboquillaPza6.getText()== null ? "" : frmDepot.txtboquillaPza6.getText());
        depot.setBoquillaPza7(frmDepot.txtboquillaPza7.getText()== null ? "" : frmDepot.txtboquillaPza7.getText());
        depot.setBoquillaPza8(frmDepot.txtboquillaPza8.getText()== null ? "" : frmDepot.txtboquillaPza8.getText());
        depot.setBoquillaPza9(frmDepot.txtboquillaPza9.getText()== null ? "" : frmDepot.txtboquillaPza9.getText());
        depot.setBoquillaPza10(frmDepot.txtboquillaPza10.getText()== null ? "" : frmDepot.txtboquillaPza10.getText());
        depot.setBoquillaPzaTotal(frmDepot.txtboquillaPzaTotal.getText()== null ? "" : frmDepot.txtboquillaPzaTotal.getText());
        
        depot.setComentarios(frmDepot.txtcomentariosParametros.getText()== null ? "" : frmDepot.txtcomentariosParametros.getText());
        
        depot.setLeySinergica1(frmDepot.txtleySinergica1.getText()== null ? "" : frmDepot.txtleySinergica1.getText());
        depot.setLeySinergica2(frmDepot.txtleySinergica2.getText()== null ? "" : frmDepot.txtleySinergica2.getText());
        depot.setLeySinergica3(frmDepot.txtleySinergica3.getText()== null ? "" : frmDepot.txtleySinergica3.getText());
        depot.setLeySinergica4(frmDepot.txtleySinergica4.getText()== null ? "" : frmDepot.txtleySinergica4.getText());
        depot.setLeySinergica5(frmDepot.txtleySinergica5.getText()== null ? "" : frmDepot.txtleySinergica5.getText());
        depot.setLeySinergica6(frmDepot.txtleySinergica6.getText()== null ? "" : frmDepot.txtleySinergica6.getText());
        depot.setLeySinergica7(frmDepot.txtleySinergica7.getText()== null ? "" : frmDepot.txtleySinergica7.getText());
        depot.setLeySinergica8(frmDepot.txtleySinergica8.getText()== null ? "" : frmDepot.txtleySinergica8.getText());
        depot.setLeySinergica9(frmDepot.txtleySinergica9.getText()== null ? "" : frmDepot.txtleySinergica9.getText());
        depot.setLeySinergica10(frmDepot.txtleySinergica10.getText()== null ? "" : frmDepot.txtleySinergica10.getText());
        depot.setLeySinergicaTotal(frmDepot.txtleySinergicaTotal.getText()== null ? "" : frmDepot.txtleySinergicaTotal.getText());
        
        depot.setVelRobto1(frmDepot.txtlvelRobto1.getText()== null ? "" : frmDepot.txtlvelRobto1.getText());
        depot.setVelRobto2(frmDepot.txtlvelRobto2.getText()== null ? "" : frmDepot.txtlvelRobto2.getText());
        depot.setVelRobto3(frmDepot.txtlvelRobto3.getText()== null ? "" : frmDepot.txtlvelRobto3.getText());
        depot.setVelRobto4(frmDepot.txtlvelRobto4.getText()== null ? "" : frmDepot.txtlvelRobto4.getText());
        depot.setVelRobto5(frmDepot.txtlvelRobto5.getText()== null ? "" : frmDepot.txtlvelRobto5.getText());
        depot.setVelRobto6(frmDepot.txtlvelRobto6.getText()== null ? "" : frmDepot.txtlvelRobto6.getText());
        depot.setVelRobto7(frmDepot.txtlvelRobto7.getText()== null ? "" : frmDepot.txtlvelRobto7.getText());
        depot.setVelRobto8(frmDepot.txtlvelRobto8.getText()== null ? "" : frmDepot.txtlvelRobto8.getText());
        depot.setVelRobto9(frmDepot.txtlvelRobto9.getText()== null ? "" : frmDepot.txtlvelRobto9.getText());
        depot.setVelRobto10(frmDepot.txtlvelRobto10.getText()== null ? "" : frmDepot.txtlvelRobto10.getText());
        depot.setVelRobtoTotal(frmDepot.txtlvelRobtoTotal.getText()== null ? "" : frmDepot.txtlvelRobtoTotal.getText());
                
        depot.setReferencias1(frmDepot.txtreferencias1.getText()== null ? "" : frmDepot.txtreferencias1.getText());
        depot.setReferencias2(frmDepot.txtreferencias2.getText()== null ? "" : frmDepot.txtreferencias2.getText());
        depot.setReferencias3(frmDepot.txtreferencias3.getText()== null ? "" : frmDepot.txtreferencias3.getText());
        depot.setReferencias4(frmDepot.txtreferencias4.getText()== null ? "" : frmDepot.txtreferencias4.getText());
        depot.setReferencias5(frmDepot.txtreferencias5.getText()== null ? "" : frmDepot.txtreferencias5.getText());
        depot.setReferencias6(frmDepot.txtreferencias6.getText()== null ? "" : frmDepot.txtreferencias6.getText());
        depot.setReferencias7(frmDepot.txtreferencias7.getText()== null ? "" : frmDepot.txtreferencias7.getText());
        depot.setReferencias8(frmDepot.txtreferencias8.getText()== null ? "" : frmDepot.txtreferencias8.getText());
        depot.setReferencias9(frmDepot.txtreferencias9.getText()== null ? "" : frmDepot.txtreferencias9.getText());
        depot.setReferencias10(frmDepot.txtreferencias10.getText()== null ? "" : frmDepot.txtreferencias10.getText());
        depot.setReferenciasTotal(frmDepot.txtreferenciasTotal.getText()== null ? "" : frmDepot.txtreferenciasTotal.getText());
        
        depot.setTemperatura1(frmDepot.txttemperatura1.getText()== null ? "" : frmDepot.txttemperatura1.getText());
        depot.setTemperatura2(frmDepot.txttemperatura2.getText()== null ? "" : frmDepot.txttemperatura2.getText());
        depot.setTemperatura3(frmDepot.txttemperatura3.getText()== null ? "" : frmDepot.txttemperatura3.getText());
        depot.setTemperatura4(frmDepot.txttemperatura4.getText()== null ? "" : frmDepot.txttemperatura4.getText());
        depot.setTemperatura5(frmDepot.txttemperatura5.getText()== null ? "" : frmDepot.txttemperatura5.getText());
        depot.setTemperatura6(frmDepot.txttemperatura6.getText()== null ? "" : frmDepot.txttemperatura6.getText());
        depot.setTemperatura7(frmDepot.txttemperatura7.getText()== null ? "" : frmDepot.txttemperatura7.getText());
        depot.setTemperatura8(frmDepot.txttemperatura8.getText()== null ? "" : frmDepot.txttemperatura8.getText());
        depot.setTemperatura9(frmDepot.txttemperatura9.getText()== null ? "" : frmDepot.txttemperatura9.getText());
        depot.setTemperatura10(frmDepot.txttemperatura10.getText()== null ? "" : frmDepot.txttemperatura10.getText());
        depot.setTemperaturaTotal(frmDepot.txttemperaturaTotal.getText()== null ? "" : frmDepot.txttemperaturaTotal.getText());               
        
        depot.setTemporizador1(frmDepot.txttemporizador1.getText()== null ? "" : frmDepot.txttemporizador1.getText());
        depot.setTemporizador2(frmDepot.txttemporizador2.getText()== null ? "" : frmDepot.txttemporizador2.getText());
        depot.setTemporizador3(frmDepot.txttemporizador3.getText()== null ? "" : frmDepot.txttemporizador3.getText());
        depot.setTemporizador4(frmDepot.txttemporizador4.getText()== null ? "" : frmDepot.txttemporizador4.getText());
        depot.setTemporizador5(frmDepot.txttemporizador5.getText()== null ? "" : frmDepot.txttemporizador5.getText());
        depot.setTemporizador6(frmDepot.txttemporizador6.getText()== null ? "" : frmDepot.txttemporizador6.getText());
        depot.setTemporizador7(frmDepot.txttemporizador7.getText()== null ? "" : frmDepot.txttemporizador7.getText());
        depot.setTemporizador8(frmDepot.txttemporizador8.getText()== null ? "" : frmDepot.txttemporizador8.getText());
        depot.setTemporizador9(frmDepot.txttemporizador9.getText()== null ? "" : frmDepot.txttemporizador9.getText());
        depot.setTemporizador10(frmDepot.txttemporizador10.getText()== null ? "" : frmDepot.txttemporizador10.getText());
        depot.setTemporizadorTotal(frmDepot.txttemporizadorTotal.getText()== null ? "" : frmDepot.txttemporizadorTotal.getText());
        
        depot.setVelocidadCable1(frmDepot.txtvelocidadCable1.getText()== null ? "" : frmDepot.txtvelocidadCable1.getText());
        depot.setVelocidadCable2(frmDepot.txtvelocidadCable2.getText()== null ? "" : frmDepot.txtvelocidadCable2.getText());
        depot.setVelocidadCable3(frmDepot.txtvelocidadCable3.getText()== null ? "" : frmDepot.txtvelocidadCable3.getText());
        depot.setVelocidadCable4(frmDepot.txtvelocidadCable4.getText()== null ? "" : frmDepot.txtvelocidadCable4.getText());
        depot.setVelocidadCable5(frmDepot.txtvelocidadCable5.getText()== null ? "" : frmDepot.txtvelocidadCable5.getText());
        depot.setVelocidadCable6(frmDepot.txtvelocidadCable6.getText()== null ? "" : frmDepot.txtvelocidadCable6.getText());
        depot.setVelocidadCable7(frmDepot.txtvelocidadCable7.getText()== null ? "" : frmDepot.txtvelocidadCable7.getText());
        depot.setVelocidadCable8(frmDepot.txtvelocidadCable8.getText()== null ? "" : frmDepot.txtvelocidadCable8.getText());
        depot.setVelocidadCable9(frmDepot.txtvelocidadCable9.getText()== null ? "" : frmDepot.txtvelocidadCable9.getText());
        depot.setVelocidadCable1(frmDepot.txtvelocidadCable10.getText()== null ? "" : frmDepot.txtvelocidadCable10.getText());
        depot.setVelocidadCableTotal(frmDepot.txtvelocidadCableTotal.getText()== null ? "" : frmDepot.txtvelocidadCableTotal.getText());
        
        depot.setY1(frmDepot.txty1.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY2(frmDepot.txty2.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY3(frmDepot.txty3.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY4(frmDepot.txty4.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY5(frmDepot.txty5.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY6(frmDepot.txty6.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY7(frmDepot.txty7.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY8(frmDepot.txty8.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY9(frmDepot.txty9.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setY10(frmDepot.txty10.getText()== null ? "" : frmDepot.txty1.getText());
        depot.setyTotal(frmDepot.txty1.getText()== null ? "" : frmDepot.txty1.getText());
        
        depot.setZ1(frmDepot.txtz1.getText()== null ? "" : frmDepot.txtz1.getText());
        depot.setZ2(frmDepot.txtz2.getText()== null ? "" : frmDepot.txtz2.getText());
        depot.setZ3(frmDepot.txtz3.getText()== null ? "" : frmDepot.txtz3.getText());
        depot.setZ4(frmDepot.txtz4.getText()== null ? "" : frmDepot.txtz4.getText());
        depot.setZ5(frmDepot.txtz5.getText()== null ? "" : frmDepot.txtz5.getText());
        depot.setZ6(frmDepot.txtz6.getText()== null ? "" : frmDepot.txtz6.getText());
        depot.setZ7(frmDepot.txtz7.getText()== null ? "" : frmDepot.txtz7.getText());
        depot.setZ8(frmDepot.txtz8.getText()== null ? "" : frmDepot.txtz8.getText());
        depot.setZ9(frmDepot.txtz9.getText()== null ? "" : frmDepot.txtz9.getText());
        depot.setZ10(frmDepot.txtz10.getText()== null ? "" : frmDepot.txtz10.getText());
        depot.setzTotal(frmDepot.txtzTotal.getText()== null ? "" : frmDepot.txtzTotal.getText());
        
        depot.setPatronEscaneo1(frmDepot.txtpatronEscaneo1.getText()== null ? "" : frmDepot.txtpatronEscaneo1.getText());
        depot.setPatronEscaneo2(frmDepot.txtpatronEscaneo2.getText()== null ? "" : frmDepot.txtpatronEscaneo2.getText());
        depot.setPatronEscaneo3(frmDepot.txtpatronEscaneo3.getText()== null ? "" : frmDepot.txtpatronEscaneo3.getText());
        depot.setPatronEscaneo4(frmDepot.txtpatronEscaneo4.getText()== null ? "" : frmDepot.txtpatronEscaneo4.getText());
        depot.setPatronEscaneo5(frmDepot.txtpatronEscaneo5.getText()== null ? "" : frmDepot.txtpatronEscaneo5.getText());
        depot.setPatronEscaneo6(frmDepot.txtpatronEscaneo6.getText()== null ? "" : frmDepot.txtpatronEscaneo6.getText());
        depot.setPatronEscaneo7(frmDepot.txtpatronEscaneo7.getText()== null ? "" : frmDepot.txtpatronEscaneo7.getText());
        depot.setPatronEscaneo8(frmDepot.txtpatronEscaneo8.getText()== null ? "" : frmDepot.txtpatronEscaneo8.getText());
        depot.setPatronEscaneo9(frmDepot.txtpatronEscaneo9.getText()== null ? "" : frmDepot.txtpatronEscaneo9.getText());
        depot.setPatronEscaneo10(frmDepot.txtpatronEscaneo10.getText()== null ? "" : frmDepot.txtpatronEscaneo10.getText());
        depot.setPatronEscaneoTotal(frmDepot.txtpatronEscaneoTotal.getText()== null ? "" : frmDepot.txtpatronEscaneoTotal.getText());
        
        depot.setLargo1(frmDepot.txtlargo1.getText()== null ? "" : frmDepot.txtlargo1.getText());
        depot.setLargo2(frmDepot.txtlargo2.getText()== null ? "" : frmDepot.txtlargo2.getText());
        depot.setLargo3(frmDepot.txtlargo3.getText()== null ? "" : frmDepot.txtlargo3.getText());
        depot.setLargo4(frmDepot.txtlargo4.getText()== null ? "" : frmDepot.txtlargo4.getText());
        depot.setLargo5(frmDepot.txtlargo5.getText()== null ? "" : frmDepot.txtlargo5.getText());
        depot.setLargo6(frmDepot.txtlargo6.getText()== null ? "" : frmDepot.txtlargo6.getText());
        depot.setLargo7(frmDepot.txtlargo7.getText()== null ? "" : frmDepot.txtlargo7.getText());
        depot.setLargo8(frmDepot.txtlargo8.getText()== null ? "" : frmDepot.txtlargo8.getText());
        depot.setLargo9(frmDepot.txtlargo9.getText()== null ? "" : frmDepot.txtlargo9.getText());
        depot.setLargo10(frmDepot.txtlargo10.getText()== null ? "" : frmDepot.txtlargo10.getText());
        depot.setLargoTotal(frmDepot.txtlargoTotal.getText()== null ? "" : frmDepot.txtlargoTotal.getText());
        
        depot.setAltura1(frmDepot.txtaltura1.getText()== null ? "" : frmDepot.txtaltura1.getText());
        depot.setAltura2(frmDepot.txtaltura2.getText()== null ? "" : frmDepot.txtaltura2.getText());
        depot.setAltura3(frmDepot.txtaltura3.getText()== null ? "" : frmDepot.txtaltura3.getText());
        depot.setAltura4(frmDepot.txtaltura4.getText()== null ? "" : frmDepot.txtaltura4.getText());
        depot.setAltura5(frmDepot.txtaltura5.getText()== null ? "" : frmDepot.txtaltura5.getText());
        depot.setAltura6(frmDepot.txtaltura6.getText()== null ? "" : frmDepot.txtaltura6.getText());
        depot.setAltura7(frmDepot.txtaltura7.getText()== null ? "" : frmDepot.txtaltura7.getText());
        depot.setAltura8(frmDepot.txtaltura8.getText()== null ? "" : frmDepot.txtaltura8.getText());
        depot.setAltura9(frmDepot.txtaltura9.getText()== null ? "" : frmDepot.txtaltura9.getText());
        depot.setAltura10(frmDepot.txtaltura10.getText()== null ? "" : frmDepot.txtaltura10.getText());
        depot.setAlturaTotal(frmDepot.txtalturaTotal.getText()== null ? "" : frmDepot.txtalturaTotal.getText());
        
        int index = frmDepot.cmbDepotParametros.getSelectedIndex();
        String selecdepotParametros = frmDepot.cmbDepotParametros.getItemAt(index);
        depot.setNumeroFiche(selecdepotParametros);
        
        queryDepotParametros.updateDepot(depot);
        this.limpiar();

    }

} catch (Exception a) {
    a.printStackTrace();
}
}
}
