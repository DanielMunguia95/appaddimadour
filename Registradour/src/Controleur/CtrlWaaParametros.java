/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.WaamCabecer;
import Modele.DB.QueryWaamParametros;
import Modele.DB.QueryWaam;
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
public class CtrlWaaParametros implements ActionListener {
    private WaamCabecer waam;
    private QueryWaamParametros queryWaamParametros;
    private frmWam frmWam;
    private String user;
    
    public CtrlWaaParametros(WaamCabecer waam, QueryWaamParametros queryWaamParametros, frmWam frmWam, String user) {
        this.waam = waam;
        this.queryWaamParametros = queryWaamParametros;
        this.frmWam = frmWam;
        this.user = user;
        //BOTONES
        this.frmWam.btnPanel2_Consulter.addActionListener(this);
        this.frmWam.btnPanel2_btnMettreAJour.addActionListener(this);
        //this.frmWam.btnSupprimmer.addActionListener(this);
    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmWam.setTitle("Waam");
        frmWam.setLocationRelativeTo(null);
        getAllLabs();

        //LOS DEMÁS TABS SE INICIAN AQUÍ 
        
//        QueryWaam queryWaam = new QueryWaam();
//        Waam waamTon = new LaboTon();
//        CtrLaboTon ctrLaboTon = new CtrLaboTon(waam, queryLabo, frmWam, user, waamTon, queryLaboTon);
//
//        ctrLaboTon.Iniciar();
//        
//        
//        WaamCabecer waamEnrobage=new WaamCabecer();
//        QueryWaamParametros queryWaamParametros=new QueryWaamParametros();
//        CtrlWaamEnrobage ctrLaboEnrobage=new CtrlWaamEnrobage(waam, queryWaamParametros, frmWam, user, waamEnrobage, queryLaboEnrobage);
//        ctrLaboEnrobage.iniciar();

    }
    
    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryWaamParametros.getAllWaam();
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
    
    public void limpiar() {
   frmWam.txtalturaArco1.setText(null);
   frmWam.txtalturaArco10.setText(null);
   frmWam.txtalturaArco2.setText(null);
   frmWam.txtalturaArco3.setText(null);
   frmWam.txtalturaArco4.setText(null);
   frmWam.txtalturaArco5.setText(null);
   frmWam.txtalturaArco6.setText(null);
   frmWam.txtalturaArco7.setText(null);
   frmWam.txtalturaArco8.setText(null);
   frmWam.txtalturaArco9.setText(null);
   frmWam.txtalturaArcoTotal.setText(null);
   frmWam.txtarcoDinamico1.setText(null);
   frmWam.txtarcoDinamico10.setText(null);
   frmWam.txtarcoDinamico2.setText(null);
   frmWam.txtarcoDinamico3.setText(null);
   frmWam.txtarcoDinamico4.setText(null);
   frmWam.txtarcoDinamico5.setText(null);
   frmWam.txtarcoDinamico6.setText(null);
   frmWam.txtarcoDinamico7.setText(null);
   frmWam.txtarcoDinamico8.setText(null);
   frmWam.txtarcoDinamico9.setText(null);
   frmWam.txtarcoDinamicoTotal.setText(null);
   frmWam.txtarcoPulsado1.setText(null);
   frmWam.txtarcoPulsado10.setText(null);
   frmWam.txtarcoPulsado2.setText(null);
   frmWam.txtarcoPulsado3.setText(null);
   frmWam.txtarcoPulsado4.setText(null);
   frmWam.txtarcoPulsado5.setText(null);
   frmWam.txtarcoPulsado6.setText(null);
   frmWam.txtarcoPulsado7.setText(null);
   frmWam.txtarcoPulsado8.setText(null);
   frmWam.txtarcoPulsado9.setText(null);
   frmWam.txtarcoPulsadoTotal.setText(null);
   frmWam.txtboquillaPza1.setText(null);
   frmWam.txtboquillaPza10.setText(null);
   frmWam.txtboquillaPza2.setText(null);
   frmWam.txtboquillaPza3.setText(null);
   frmWam.txtboquillaPza4.setText(null);
   frmWam.txtboquillaPza5.setText(null);
   frmWam.txtboquillaPza6.setText(null);
   frmWam.txtboquillaPza7.setText(null);
   frmWam.txtboquillaPza8.setText(null);
   frmWam.txtboquillaPza9.setText(null);
   frmWam.txtboquillaPzaTotal.setText(null);
   frmWam.txtcomentariosParametros.setText(null);
   frmWam.txtleySinergica1.setText(null);
   frmWam.txtleySinergica10.setText(null);
   frmWam.txtleySinergica2.setText(null);
   frmWam.txtleySinergica3.setText(null);
   frmWam.txtleySinergica4.setText(null);
   frmWam.txtleySinergica5.setText(null);
   frmWam.txtleySinergica6.setText(null);
   frmWam.txtleySinergica7.setText(null);
   frmWam.txtleySinergica8.setText(null);
   frmWam.txtleySinergica9.setText(null);
   frmWam.txtleySinergicaTotal.setText(null);
   frmWam.txtlvelRobto1.setText(null);
   frmWam.txtlvelRobto10.setText(null);
   frmWam.txtlvelRobto2.setText(null);
   frmWam.txtlvelRobto3.setText(null);
   frmWam.txtlvelRobto4.setText(null);
   frmWam.txtlvelRobto5.setText(null);
   frmWam.txtlvelRobto6.setText(null);
   frmWam.txtlvelRobto7.setText(null);
   frmWam.txtlvelRobto8.setText(null);
   frmWam.txtlvelRobto9.setText(null);
   frmWam.txtlvelRobtoTotal.setText(null);
   frmWam.txtposgas.setText(null);
   frmWam.txtpregas.setText(null);
   frmWam.txtquemado.setText(null);
   frmWam.txtreferencias1.setText(null);
   frmWam.txtreferencias10.setText(null);
   frmWam.txtreferencias2.setText(null);
   frmWam.txtreferencias3.setText(null);
   frmWam.txtreferencias4.setText(null);
   frmWam.txtreferencias5.setText(null);
   frmWam.txtreferencias6.setText(null);
   frmWam.txtreferencias7.setText(null);
   frmWam.txtreferencias8.setText(null);
   frmWam.txtreferencias9.setText(null);
   frmWam.txtreferenciasTotal.setText(null);
   frmWam.txttemperatura1.setText(null);
   frmWam.txttemperatura10.setText(null);
   frmWam.txttemperatura2.setText(null);
   frmWam.txttemperatura3.setText(null);
   frmWam.txttemperatura4.setText(null);
   frmWam.txttemperatura5.setText(null);
   frmWam.txttemperatura6.setText(null);
   frmWam.txttemperatura7.setText(null);
   frmWam.txttemperatura8.setText(null);
   frmWam.txttemperatura9.setText(null);
   frmWam.txttemperaturaTotal.setText(null);
   frmWam.txttemporizador1.setText(null);
   frmWam.txttemporizador10.setText(null);
   frmWam.txttemporizador2.setText(null);
   frmWam.txttemporizador3.setText(null);
   frmWam.txttemporizador4.setText(null);
   frmWam.txttemporizador5.setText(null);
   frmWam.txttemporizador6.setText(null);
   frmWam.txttemporizador7.setText(null);
   frmWam.txttemporizador8.setText(null);
   frmWam.txttemporizador9.setText(null);
   frmWam.txttemporizadorTotal.setText(null);
   frmWam.txtvelocidadCable1.setText(null);
   frmWam.txtvelocidadCable10.setText(null);
   frmWam.txtvelocidadCable2.setText(null);
   frmWam.txtvelocidadCable3.setText(null);
   frmWam.txtvelocidadCable4.setText(null);
   frmWam.txtvelocidadCable5.setText(null);
   frmWam.txtvelocidadCable6.setText(null);
   frmWam.txtvelocidadCable7.setText(null);
   frmWam.txtvelocidadCable8.setText(null);
   frmWam.txtvelocidadCable9.setText(null);
   frmWam.txtvelocidadCableTotal.setText(null);
   frmWam.txty1.setText(null);
   frmWam.txty10.setText(null);
   frmWam.txty2.setText(null);
   frmWam.txty3.setText(null);
   frmWam.txty4.setText(null);
   frmWam.txty5.setText(null);
   frmWam.txty6.setText(null);
   frmWam.txty7.setText(null);
   frmWam.txty8.setText(null);
   frmWam.txty9.setText(null);
   frmWam.txtyTotal.setText(null);
   frmWam.txtz1.setText(null);
   frmWam.txtz10.setText(null);
   frmWam.txtz2.setText(null);
   frmWam.txtz3.setText(null);
   frmWam.txtz4.setText(null);
   frmWam.txtz5.setText(null);
   frmWam.txtz6.setText(null);
   frmWam.txtz7.setText(null);
   frmWam.txtz8.setText(null);
   frmWam.txtz9.setText(null);
   frmWam.txtzTotal.setText(null);

   getAllLabs();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == frmWam.btnPanel2_Consulter) {

                int index = frmWam.cmbWaamParametros.getSelectedIndex();
                String selecWaamParametros = frmWam.cmbWaamParametros.getItemAt(index);

                if (index != -1) {

                    waam = queryWaamParametros.getWaam(selecWaamParametros);
                    
                   frmWam.txtalturaArco1.setText(waam.getAlturaArco1());
                   
                   frmWam.txtalturaArco1.setText(waam.getAlturaArco1());
                   frmWam.txtalturaArco10.setText(waam.getAlturaArco10());
                   frmWam.txtalturaArco2.setText(waam.getAlturaArco2());
                   frmWam.txtalturaArco3.setText(waam.getAlturaArco3());
                   frmWam.txtalturaArco4.setText(waam.getAlturaArco4());
                   frmWam.txtalturaArco5.setText(waam.getAlturaArco5());
                   frmWam.txtalturaArco6.setText(waam.getAlturaArco6());
                   frmWam.txtalturaArco7.setText(waam.getAlturaArco7());
                   frmWam.txtalturaArco8.setText(waam.getAlturaArco8());
                   frmWam.txtalturaArco9.setText(waam.getAlturaArco9());
                   frmWam.txtalturaArcoTotal.setText(waam.getAlturaArcoTotal());
                   frmWam.txtarcoDinamico1.setText(waam.getArcoDinamico1());
                   frmWam.txtarcoDinamico10.setText(waam.getArcoDinamico10());
                   frmWam.txtarcoDinamico2.setText(waam.getArcoDinamico2());
                   frmWam.txtarcoDinamico3.setText(waam.getArcoDinamico3());
                   frmWam.txtarcoDinamico4.setText(waam.getArcoDinamico4());
                   frmWam.txtarcoDinamico5.setText(waam.getArcoDinamico5());
                   frmWam.txtarcoDinamico6.setText(waam.getArcoDinamico6());
                   frmWam.txtarcoDinamico7.setText(waam.getArcoDinamico7());
                   frmWam.txtarcoDinamico8.setText(waam.getArcoDinamico8());
                   frmWam.txtarcoDinamico9.setText(waam.getArcoDinamico9());
                   frmWam.txtarcoDinamicoTotal.setText(waam.getArcoDinamicoTotal());
                   frmWam.txtarcoPulsado1.setText(waam.getArcoPulsado1());
                   frmWam.txtarcoPulsado10.setText(waam.getArcoPulsado10());
                   frmWam.txtarcoPulsado2.setText(waam.getArcoPulsado2());
                   frmWam.txtarcoPulsado3.setText(waam.getArcoPulsado3());
                   frmWam.txtarcoPulsado4.setText(waam.getArcoPulsado4());
                   frmWam.txtarcoPulsado5.setText(waam.getArcoPulsado5());
                   frmWam.txtarcoPulsado6.setText(waam.getArcoPulsado6());
                   frmWam.txtarcoPulsado7.setText(waam.getArcoPulsado7());
                   frmWam.txtarcoPulsado8.setText(waam.getArcoPulsado8());
                   frmWam.txtarcoPulsado9.setText(waam.getArcoPulsado9());
                   frmWam.txtarcoPulsadoTotal.setText(waam.getArcoPulsadoTotal());
                   frmWam.txtboquillaPza1.setText(waam.getBoquillaPza1());
                   frmWam.txtboquillaPza10.setText(waam.getBoquillaPza10());
                   frmWam.txtboquillaPza2.setText(waam.getBoquillaPza2());
                   frmWam.txtboquillaPza3.setText(waam.getBoquillaPza3());
                   frmWam.txtboquillaPza4.setText(waam.getBoquillaPza4());
                   frmWam.txtboquillaPza5.setText(waam.getBoquillaPza5());
                   frmWam.txtboquillaPza6.setText(waam.getBoquillaPza6());
                   frmWam.txtboquillaPza7.setText(waam.getBoquillaPza7());
                   frmWam.txtboquillaPza8.setText(waam.getBoquillaPza8());
                   frmWam.txtboquillaPza9.setText(waam.getBoquillaPza9());
                   frmWam.txtboquillaPzaTotal.setText(waam.getBoquillaPzaTotal());
                   frmWam.txtcomentariosParametros.setText(waam.getComentarios());
                   frmWam.txtleySinergica1.setText(waam.getLeySinergica1());
                   frmWam.txtleySinergica10.setText(waam.getLeySinergica10());
                   frmWam.txtleySinergica2.setText(waam.getLeySinergica2());
                   frmWam.txtleySinergica3.setText(waam.getLeySinergica3());
                   frmWam.txtleySinergica4.setText(waam.getLeySinergica4());
                   frmWam.txtleySinergica5.setText(waam.getLeySinergica5());
                   frmWam.txtleySinergica6.setText(waam.getLeySinergica6());
                   frmWam.txtleySinergica7.setText(waam.getLeySinergica7());
                   frmWam.txtleySinergica8.setText(waam.getLeySinergica8());
                   frmWam.txtleySinergica9.setText(waam.getLeySinergica9());
                   frmWam.txtleySinergicaTotal.setText(waam.getLeySinergicaTotal());
                   frmWam.txtlvelRobto1.setText(waam.getVelRobto1());
                   frmWam.txtlvelRobto10.setText(waam.getVelRobto10());
                   frmWam.txtlvelRobto2.setText(waam.getVelRobto2());
                   frmWam.txtlvelRobto3.setText(waam.getVelRobto3());
                   frmWam.txtlvelRobto4.setText(waam.getVelRobto4());
                   frmWam.txtlvelRobto5.setText(waam.getVelRobto5());
                   frmWam.txtlvelRobto6.setText(waam.getVelRobto6());
                   frmWam.txtlvelRobto7.setText(waam.getVelRobto7());
                   frmWam.txtlvelRobto8.setText(waam.getVelRobto8());
                   frmWam.txtlvelRobto9.setText(waam.getVelRobto9());
                   frmWam.txtlvelRobtoTotal.setText(waam.getVelRobtoTotal());
                   frmWam.txtposgas.setText(waam.getPostGas());
                   frmWam.txtpregas.setText(waam.getPreGas());
                   frmWam.txtquemado.setText(waam.getQuemado());
                   frmWam.txtreferencias1.setText(waam.getReferencias1());
                   frmWam.txtreferencias10.setText(waam.getReferencias10());
                   frmWam.txtreferencias2.setText(waam.getReferencias2());
                   frmWam.txtreferencias3.setText(waam.getReferencias3());
                   frmWam.txtreferencias4.setText(waam.getReferencias4());
                   frmWam.txtreferencias5.setText(waam.getReferencias5());
                   frmWam.txtreferencias6.setText(waam.getReferencias6());
                   frmWam.txtreferencias7.setText(waam.getReferencias7());
                   frmWam.txtreferencias8.setText(waam.getReferencias8());
                   frmWam.txtreferencias9.setText(waam.getReferencias9());
                   frmWam.txtreferenciasTotal.setText(waam.getReferenciasTotal());
                   frmWam.txttemperatura1.setText(waam.getTemperatura1());
                   frmWam.txttemperatura10.setText(waam.getTemperatura10());
                   frmWam.txttemperatura2.setText(waam.getTemperatura2());
                   frmWam.txttemperatura3.setText(waam.getTemperatura3());
                   frmWam.txttemperatura4.setText(waam.getTemperatura4());
                   frmWam.txttemperatura5.setText(waam.getTemperatura5());
                   frmWam.txttemperatura6.setText(waam.getTemperatura6());
                   frmWam.txttemperatura7.setText(waam.getTemperatura7());
                   frmWam.txttemperatura8.setText(waam.getTemperatura8());
                   frmWam.txttemperatura9.setText(waam.getTemperatura9());
                   frmWam.txttemperaturaTotal.setText(waam.getTemperaturaTotal());
                   frmWam.txttemporizador1.setText(waam.getTemporizador1());
                   frmWam.txttemporizador10.setText(waam.getTemporizador10());
                   frmWam.txttemporizador2.setText(waam.getTemporizador2());
                   frmWam.txttemporizador3.setText(waam.getTemporizador3());
                   frmWam.txttemporizador4.setText(waam.getTemporizador4());
                   frmWam.txttemporizador5.setText(waam.getTemporizador5());
                   frmWam.txttemporizador6.setText(waam.getTemporizador6());
                   frmWam.txttemporizador7.setText(waam.getTemporizador7());
                   frmWam.txttemporizador8.setText(waam.getTemporizador8());
                   frmWam.txttemporizador9.setText(waam.getTemporizador9());
                   frmWam.txttemporizadorTotal.setText(waam.getTemporizadorTotal());
                   frmWam.txtvelocidadCable1.setText(waam.getVelocidadCable1());
                   frmWam.txtvelocidadCable10.setText(waam.getVelocidadCable10());
                   frmWam.txtvelocidadCable2.setText(waam.getVelocidadCable2());
                   frmWam.txtvelocidadCable3.setText(waam.getVelocidadCable3());
                   frmWam.txtvelocidadCable4.setText(waam.getVelocidadCable4());
                   frmWam.txtvelocidadCable5.setText(waam.getVelocidadCable5());
                   frmWam.txtvelocidadCable6.setText(waam.getVelocidadCable6());
                   frmWam.txtvelocidadCable7.setText(waam.getVelocidadCable7());
                   frmWam.txtvelocidadCable8.setText(waam.getVelocidadCable8());
                   frmWam.txtvelocidadCable9.setText(waam.getVelocidadCable9());
                   frmWam.txtvelocidadCableTotal.setText(waam.getVelocidadCableTotal());
                   frmWam.txty1.setText(waam.getY1());
                   frmWam.txty10.setText(waam.getY10());
                   frmWam.txty2.setText(waam.getY2());
                   frmWam.txty3.setText(waam.getY3());
                   frmWam.txty4.setText(waam.getY4());
                   frmWam.txty5.setText(waam.getY5());
                   frmWam.txty6.setText(waam.getY6());
                   frmWam.txty7.setText(waam.getY7());
                   frmWam.txty8.setText(waam.getY8());
                   frmWam.txty9.setText(waam.getY9());
                   frmWam.txtyTotal.setText(waam.getyTotal());
                   frmWam.txtz1.setText(waam.getZ1());
                   frmWam.txtz10.setText(waam.getZ10());
                   frmWam.txtz2.setText(waam.getZ2());
                   frmWam.txtz3.setText(waam.getZ3());
                   frmWam.txtz4.setText(waam.getZ4());
                   frmWam.txtz5.setText(waam.getZ5());
                   frmWam.txtz6.setText(waam.getZ6());
                   frmWam.txtz7.setText(waam.getZ7());
                   frmWam.txtz8.setText(waam.getZ8());
                   frmWam.txtz9.setText(waam.getZ9());
                   frmWam.txtzTotal.setText(waam.getzTotal());
                } else {
                    System.out.println("Selecciona un Numéro fiche");
                }
            }
            
            if (e.getSource() == frmWam.btnPanel2_btnMettreAJour) {
                
                waam.setAlturaArco1(frmWam.txtalturaArco1.getText()== null ? "" : frmWam.txtalturaArco1.getText());
                waam.setAlturaArco2(frmWam.txtalturaArco2.getText()== null ? "" : frmWam.txtalturaArco2.getText());
                waam.setAlturaArco3(frmWam.txtalturaArco3.getText()== null ? "" : frmWam.txtalturaArco3.getText());
                waam.setAlturaArco4(frmWam.txtalturaArco4.getText()== null ? "" : frmWam.txtalturaArco4.getText());
                waam.setAlturaArco5(frmWam.txtalturaArco5.getText()== null ? "" : frmWam.txtalturaArco5.getText());
                waam.setAlturaArco6(frmWam.txtalturaArco6.getText()== null ? "" : frmWam.txtalturaArco6.getText());
                waam.setAlturaArco7(frmWam.txtalturaArco7.getText()== null ? "" : frmWam.txtalturaArco7.getText());
                waam.setAlturaArco8(frmWam.txtalturaArco8.getText()== null ? "" : frmWam.txtalturaArco8.getText());
                waam.setAlturaArco9(frmWam.txtalturaArco9.getText()== null ? "" : frmWam.txtalturaArco9.getText());
                waam.setAlturaArco10(frmWam.txtalturaArco10.getText()== null ? "" : frmWam.txtalturaArco10.getText());
                waam.setAlturaArcoTotal(frmWam.txtalturaArcoTotal.getText()== null ? "" : frmWam.txtalturaArcoTotal.getText());
                
                waam.setArcoDinamico1(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico2(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico3(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico4(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico5(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico6(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico7(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico8(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico9(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamico10(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                waam.setArcoDinamicoTotal(frmWam.txtarcoDinamico1.getText()== null ? "" : frmWam.txtarcoDinamico1.getText());
                
                waam.setArcoPulsado1(frmWam.txtarcoPulsado1.getText()== null ? "" : frmWam.txtarcoPulsado1.getText());
                waam.setArcoPulsado2(frmWam.txtarcoPulsado2.getText()== null ? "" : frmWam.txtarcoPulsado2.getText());
                waam.setArcoPulsado3(frmWam.txtarcoPulsado3.getText()== null ? "" : frmWam.txtarcoPulsado3.getText());
                waam.setArcoPulsado4(frmWam.txtarcoPulsado4.getText()== null ? "" : frmWam.txtarcoPulsado4.getText());
                waam.setArcoPulsado5(frmWam.txtarcoPulsado5.getText()== null ? "" : frmWam.txtarcoPulsado5.getText());
                waam.setArcoPulsado6(frmWam.txtarcoPulsado6.getText()== null ? "" : frmWam.txtarcoPulsado6.getText());
                waam.setArcoPulsado7(frmWam.txtarcoPulsado7.getText()== null ? "" : frmWam.txtarcoPulsado7.getText());
                waam.setArcoPulsado8(frmWam.txtarcoPulsado8.getText()== null ? "" : frmWam.txtarcoPulsado8.getText());
                waam.setArcoPulsado9(frmWam.txtarcoPulsado9.getText()== null ? "" : frmWam.txtarcoPulsado9.getText());
                waam.setArcoPulsado10(frmWam.txtarcoPulsado10.getText()== null ? "" : frmWam.txtarcoPulsado10.getText());
                waam.setArcoPulsadoTotal(frmWam.txtarcoPulsadoTotal.getText()== null ? "" : frmWam.txtarcoPulsadoTotal.getText());
                
                waam.setBoquillaPza1(frmWam.txtboquillaPza1.getText()== null ? "" : frmWam.txtboquillaPza1.getText());
                waam.setBoquillaPza2(frmWam.txtboquillaPza2.getText()== null ? "" : frmWam.txtboquillaPza2.getText());
                waam.setBoquillaPza3(frmWam.txtboquillaPza3.getText()== null ? "" : frmWam.txtboquillaPza3.getText());
                waam.setBoquillaPza4(frmWam.txtboquillaPza4.getText()== null ? "" : frmWam.txtboquillaPza4.getText());
                waam.setBoquillaPza5(frmWam.txtboquillaPza5.getText()== null ? "" : frmWam.txtboquillaPza5.getText());
                waam.setBoquillaPza6(frmWam.txtboquillaPza6.getText()== null ? "" : frmWam.txtboquillaPza6.getText());
                waam.setBoquillaPza7(frmWam.txtboquillaPza7.getText()== null ? "" : frmWam.txtboquillaPza7.getText());
                waam.setBoquillaPza8(frmWam.txtboquillaPza8.getText()== null ? "" : frmWam.txtboquillaPza8.getText());
                waam.setBoquillaPza9(frmWam.txtboquillaPza9.getText()== null ? "" : frmWam.txtboquillaPza9.getText());
                waam.setBoquillaPza10(frmWam.txtboquillaPza10.getText()== null ? "" : frmWam.txtboquillaPza10.getText());
                waam.setBoquillaPzaTotal(frmWam.txtboquillaPzaTotal.getText()== null ? "" : frmWam.txtboquillaPzaTotal.getText());
                
                waam.setComentarios(frmWam.txtcomentariosParametros.getText()== null ? "" : frmWam.txtcomentariosParametros.getText());
                
                waam.setLeySinergica1(frmWam.txtleySinergica1.getText()== null ? "" : frmWam.txtleySinergica1.getText());
                waam.setLeySinergica2(frmWam.txtleySinergica2.getText()== null ? "" : frmWam.txtleySinergica2.getText());
                waam.setLeySinergica3(frmWam.txtleySinergica3.getText()== null ? "" : frmWam.txtleySinergica3.getText());
                waam.setLeySinergica4(frmWam.txtleySinergica4.getText()== null ? "" : frmWam.txtleySinergica4.getText());
                waam.setLeySinergica5(frmWam.txtleySinergica5.getText()== null ? "" : frmWam.txtleySinergica5.getText());
                waam.setLeySinergica6(frmWam.txtleySinergica6.getText()== null ? "" : frmWam.txtleySinergica6.getText());
                waam.setLeySinergica7(frmWam.txtleySinergica7.getText()== null ? "" : frmWam.txtleySinergica7.getText());
                waam.setLeySinergica8(frmWam.txtleySinergica8.getText()== null ? "" : frmWam.txtleySinergica8.getText());
                waam.setLeySinergica9(frmWam.txtleySinergica9.getText()== null ? "" : frmWam.txtleySinergica9.getText());
                waam.setLeySinergica10(frmWam.txtleySinergica10.getText()== null ? "" : frmWam.txtleySinergica10.getText());
                waam.setLeySinergicaTotal(frmWam.txtleySinergicaTotal.getText()== null ? "" : frmWam.txtleySinergicaTotal.getText());
                
                waam.setVelRobto1(frmWam.txtlvelRobto1.getText()== null ? "" : frmWam.txtlvelRobto1.getText());
                waam.setVelRobto2(frmWam.txtlvelRobto2.getText()== null ? "" : frmWam.txtlvelRobto2.getText());
                waam.setVelRobto3(frmWam.txtlvelRobto3.getText()== null ? "" : frmWam.txtlvelRobto3.getText());
                waam.setVelRobto4(frmWam.txtlvelRobto4.getText()== null ? "" : frmWam.txtlvelRobto4.getText());
                waam.setVelRobto5(frmWam.txtlvelRobto5.getText()== null ? "" : frmWam.txtlvelRobto5.getText());
                waam.setVelRobto6(frmWam.txtlvelRobto6.getText()== null ? "" : frmWam.txtlvelRobto6.getText());
                waam.setVelRobto7(frmWam.txtlvelRobto7.getText()== null ? "" : frmWam.txtlvelRobto7.getText());
                waam.setVelRobto8(frmWam.txtlvelRobto8.getText()== null ? "" : frmWam.txtlvelRobto8.getText());
                waam.setVelRobto9(frmWam.txtlvelRobto9.getText()== null ? "" : frmWam.txtlvelRobto9.getText());
                waam.setVelRobto10(frmWam.txtlvelRobto10.getText()== null ? "" : frmWam.txtlvelRobto10.getText());
                waam.setVelRobtoTotal(frmWam.txtlvelRobtoTotal.getText()== null ? "" : frmWam.txtlvelRobtoTotal.getText());
                
                waam.setPostGas(frmWam.txtposgas.getText()== null ? "" : frmWam.txtposgas.getText());
                waam.setPreGas(frmWam.txtpregas.getText()== null ? "" : frmWam.txtpregas.getText());
                waam.setQuemado(frmWam.txtquemado.getText()== null ? "" : frmWam.txtquemado.getText());
                
                waam.setReferencias1(frmWam.txtreferencias1.getText()== null ? "" : frmWam.txtreferencias1.getText());
                waam.setReferencias2(frmWam.txtreferencias2.getText()== null ? "" : frmWam.txtreferencias2.getText());
                waam.setReferencias3(frmWam.txtreferencias3.getText()== null ? "" : frmWam.txtreferencias3.getText());
                waam.setReferencias4(frmWam.txtreferencias4.getText()== null ? "" : frmWam.txtreferencias4.getText());
                waam.setReferencias5(frmWam.txtreferencias5.getText()== null ? "" : frmWam.txtreferencias5.getText());
                waam.setReferencias6(frmWam.txtreferencias6.getText()== null ? "" : frmWam.txtreferencias6.getText());
                waam.setReferencias7(frmWam.txtreferencias7.getText()== null ? "" : frmWam.txtreferencias7.getText());
                waam.setReferencias8(frmWam.txtreferencias8.getText()== null ? "" : frmWam.txtreferencias8.getText());
                waam.setReferencias9(frmWam.txtreferencias9.getText()== null ? "" : frmWam.txtreferencias9.getText());
                waam.setReferencias10(frmWam.txtreferencias10.getText()== null ? "" : frmWam.txtreferencias10.getText());
                waam.setReferenciasTotal(frmWam.txtreferenciasTotal.getText()== null ? "" : frmWam.txtreferenciasTotal.getText());
                
                waam.setTemperatura1(frmWam.txttemperatura1.getText()== null ? "" : frmWam.txttemperatura1.getText());
                waam.setTemperatura2(frmWam.txttemperatura2.getText()== null ? "" : frmWam.txttemperatura2.getText());
                waam.setTemperatura3(frmWam.txttemperatura3.getText()== null ? "" : frmWam.txttemperatura3.getText());
                waam.setTemperatura4(frmWam.txttemperatura4.getText()== null ? "" : frmWam.txttemperatura4.getText());
                waam.setTemperatura5(frmWam.txttemperatura5.getText()== null ? "" : frmWam.txttemperatura5.getText());
                waam.setTemperatura6(frmWam.txttemperatura6.getText()== null ? "" : frmWam.txttemperatura6.getText());
                waam.setTemperatura7(frmWam.txttemperatura7.getText()== null ? "" : frmWam.txttemperatura7.getText());
                waam.setTemperatura8(frmWam.txttemperatura8.getText()== null ? "" : frmWam.txttemperatura8.getText());
                waam.setTemperatura9(frmWam.txttemperatura9.getText()== null ? "" : frmWam.txttemperatura9.getText());
                waam.setTemperatura10(frmWam.txttemperatura10.getText()== null ? "" : frmWam.txttemperatura10.getText());
                waam.setTemperaturaTotal(frmWam.txttemperaturaTotal.getText()== null ? "" : frmWam.txttemperaturaTotal.getText());               
                
                waam.setTemporizador1(frmWam.txttemporizador1.getText()== null ? "" : frmWam.txttemporizador1.getText());
                waam.setTemporizador2(frmWam.txttemporizador2.getText()== null ? "" : frmWam.txttemporizador2.getText());
                waam.setTemporizador3(frmWam.txttemporizador3.getText()== null ? "" : frmWam.txttemporizador3.getText());
                waam.setTemporizador4(frmWam.txttemporizador4.getText()== null ? "" : frmWam.txttemporizador4.getText());
                waam.setTemporizador5(frmWam.txttemporizador5.getText()== null ? "" : frmWam.txttemporizador5.getText());
                waam.setTemporizador6(frmWam.txttemporizador6.getText()== null ? "" : frmWam.txttemporizador6.getText());
                waam.setTemporizador7(frmWam.txttemporizador7.getText()== null ? "" : frmWam.txttemporizador7.getText());
                waam.setTemporizador8(frmWam.txttemporizador8.getText()== null ? "" : frmWam.txttemporizador8.getText());
                waam.setTemporizador9(frmWam.txttemporizador9.getText()== null ? "" : frmWam.txttemporizador9.getText());
                waam.setTemporizador10(frmWam.txttemporizador10.getText()== null ? "" : frmWam.txttemporizador10.getText());
                waam.setTemporizadorTotal(frmWam.txttemporizadorTotal.getText()== null ? "" : frmWam.txttemporizadorTotal.getText());
                
                waam.setVelocidadCable1(frmWam.txtvelocidadCable1.getText()== null ? "" : frmWam.txtvelocidadCable1.getText());
                waam.setVelocidadCable2(frmWam.txtvelocidadCable2.getText()== null ? "" : frmWam.txtvelocidadCable2.getText());
                waam.setVelocidadCable3(frmWam.txtvelocidadCable3.getText()== null ? "" : frmWam.txtvelocidadCable3.getText());
                waam.setVelocidadCable4(frmWam.txtvelocidadCable4.getText()== null ? "" : frmWam.txtvelocidadCable4.getText());
                waam.setVelocidadCable5(frmWam.txtvelocidadCable5.getText()== null ? "" : frmWam.txtvelocidadCable5.getText());
                waam.setVelocidadCable6(frmWam.txtvelocidadCable6.getText()== null ? "" : frmWam.txtvelocidadCable6.getText());
                waam.setVelocidadCable7(frmWam.txtvelocidadCable7.getText()== null ? "" : frmWam.txtvelocidadCable7.getText());
                waam.setVelocidadCable8(frmWam.txtvelocidadCable8.getText()== null ? "" : frmWam.txtvelocidadCable8.getText());
                waam.setVelocidadCable9(frmWam.txtvelocidadCable9.getText()== null ? "" : frmWam.txtvelocidadCable9.getText());
                waam.setVelocidadCable10(frmWam.txtvelocidadCable10.getText()== null ? "" : frmWam.txtvelocidadCable10.getText());
                waam.setVelocidadCableTotal(frmWam.txtvelocidadCableTotal.getText()== null ? "" : frmWam.txtvelocidadCableTotal.getText());
                
                waam.setY1(frmWam.txty1.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY2(frmWam.txty2.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY3(frmWam.txty3.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY4(frmWam.txty4.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY5(frmWam.txty5.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY6(frmWam.txty6.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY7(frmWam.txty7.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY8(frmWam.txty8.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY9(frmWam.txty9.getText()== null ? "" : frmWam.txty1.getText());
                waam.setY10(frmWam.txty10.getText()== null ? "" : frmWam.txty1.getText());
                waam.setyTotal(frmWam.txty1.getText()== null ? "" : frmWam.txty1.getText());
                
                waam.setZ1(frmWam.txtz1.getText()== null ? "" : frmWam.txtz1.getText());
                waam.setZ2(frmWam.txtz2.getText()== null ? "" : frmWam.txtz2.getText());
                waam.setZ3(frmWam.txtz3.getText()== null ? "" : frmWam.txtz3.getText());
                waam.setZ4(frmWam.txtz4.getText()== null ? "" : frmWam.txtz4.getText());
                waam.setZ5(frmWam.txtz5.getText()== null ? "" : frmWam.txtz5.getText());
                waam.setZ6(frmWam.txtz6.getText()== null ? "" : frmWam.txtz6.getText());
                waam.setZ7(frmWam.txtz7.getText()== null ? "" : frmWam.txtz7.getText());
                waam.setZ8(frmWam.txtz8.getText()== null ? "" : frmWam.txtz8.getText());
                waam.setZ9(frmWam.txtz9.getText()== null ? "" : frmWam.txtz9.getText());
                waam.setZ10(frmWam.txtz10.getText()== null ? "" : frmWam.txtz10.getText());
                waam.setzTotal(frmWam.txtzTotal.getText()== null ? "" : frmWam.txtzTotal.getText());
                
                int index = frmWam.cmbWaamParametros.getSelectedIndex();
                String selecWaamParametros = frmWam.cmbWaamParametros.getItemAt(index);
                waam.setNumeroFiche(selecWaamParametros);
                
                queryWaamParametros.updateWaam(waam);
                this.limpiar();

            }

        } catch (Exception a) {
            a.printStackTrace();
        }
    }
}
