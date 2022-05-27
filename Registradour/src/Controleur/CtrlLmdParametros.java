/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controleur;
import Modele.DB.QueryLmd;
import Modele.DB.QueryLmdParametros;
import Modele.LmdCabecer;
import Vue.frmLMD;
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
public class CtrlLmdParametros implements ActionListener {
    private LmdCabecer lmd;
    private QueryLmdParametros queryLmdParametros;
    private frmLMD frmLMD;
    private String user;
    
    public CtrlLmdParametros(LmdCabecer lmd, QueryLmdParametros queryLmdParametros, frmLMD frmLMD, String user) {
        this.lmd = lmd;
        this.queryLmdParametros = queryLmdParametros;
        this.frmLMD = frmLMD;
        this.user = user;
        //BOTONES
        this.frmLMD.btnPanel2_Consulter.addActionListener(this);
        this.frmLMD.btnPanel2_btnMettreAJour.addActionListener(this);
    }
    
    public void getAllLabs() {
        List<String> labs = new ArrayList<>();
        try {
            labs = queryLmdParametros.getAllLmd();
            frmLMD.cmblmdParametros.removeAllItems();
            if (labs != null) {
                labs.forEach(z -> frmLMD.cmblmdParametros.addItem(z));

            } else {
                frmLMD.cmblmdParametros.addItem("Acune valeur");
            }

        } catch (Exception e) {
        }

    }
    
    public void iniciar() {
        //SE AGREGAN LAS PROPIEDADES DE LOS COMPONENTES
        frmLMD.setTitle("Depot");
        frmLMD.setLocationRelativeTo(null);
    }
    
    public void limpiar() {
        frmLMD.txtboquillaPza1.setText(null);
    frmLMD.txtboquillaPza10.setText(null);
    frmLMD.txtboquillaPza2.setText(null);
    frmLMD.txtboquillaPza3.setText(null);
    frmLMD.txtboquillaPza4.setText(null);
    frmLMD.txtboquillaPza5.setText(null);
    frmLMD.txtboquillaPza6.setText(null);
    frmLMD.txtboquillaPza7.setText(null);
    frmLMD.txtboquillaPza8.setText(null);
    frmLMD.txtboquillaPza9.setText(null);
    frmLMD.txtboquillaPzaTotal.setText(null);
    
    frmLMD.txtlvelMaquina1.setText(null);
    frmLMD.txtlvelMaquina10.setText(null);
    frmLMD.txtlvelMaquina2.setText(null);
    frmLMD.txtlvelMaquina3.setText(null);
    frmLMD.txtlvelMaquina4.setText(null);
    frmLMD.txtlvelMaquina5.setText(null);
    frmLMD.txtlvelMaquina6.setText(null);
    frmLMD.txtlvelMaquina7.setText(null);
    frmLMD.txtlvelMaquina8.setText(null);
    frmLMD.txtlvelMaquina9.setText(null);
    frmLMD.txtlvelMaquinaTotal.setText(null);
    
    frmLMD.txthigometria1.setText(null);
    frmLMD.txthigometria10.setText(null);
    frmLMD.txthigometria2.setText(null);
    frmLMD.txthigometria3.setText(null);
    frmLMD.txthigometria4.setText(null);
    frmLMD.txthigometria5.setText(null);
    frmLMD.txthigometria6.setText(null);
    frmLMD.txthigometria7.setText(null);
    frmLMD.txthigometria8.setText(null);
    frmLMD.txthigometria9.setText(null);
    frmLMD.txthigometriaTotal.setText(null);
    
    frmLMD.txttemperatura1.setText(null);
    frmLMD.txttemperatura10.setText(null);
    frmLMD.txttemperatura2.setText(null);
    frmLMD.txttemperatura3.setText(null);
    frmLMD.txttemperatura4.setText(null);
    frmLMD.txttemperatura5.setText(null);
    frmLMD.txttemperatura6.setText(null);
    frmLMD.txttemperatura7.setText(null);
    frmLMD.txttemperatura8.setText(null);
    frmLMD.txttemperatura9.setText(null);
    frmLMD.txttemperaturaTotal.setText(null);
    
    frmLMD.txttemporizador1.setText(null);
    frmLMD.txttemporizador10.setText(null);
    frmLMD.txttemporizador2.setText(null);
    frmLMD.txttemporizador3.setText(null);
    frmLMD.txttemporizador4.setText(null);
    frmLMD.txttemporizador5.setText(null);
    frmLMD.txttemporizador6.setText(null);
    frmLMD.txttemporizador7.setText(null);
    frmLMD.txttemporizador8.setText(null);
    frmLMD.txttemporizador9.setText(null);
    frmLMD.txttemporizadorTotal.setText(null);
    
    frmLMD.txtseacaboTiempo1.setText(null);
    frmLMD.txtseacaboTiempo10.setText(null);
    frmLMD.txtseacaboTiempo2.setText(null);
    frmLMD.txtseacaboTiempo3.setText(null);
    frmLMD.txtseacaboTiempo4.setText(null);
    frmLMD.txtseacaboTiempo5.setText(null);
    frmLMD.txtseacaboTiempo6.setText(null);
    frmLMD.txtseacaboTiempo7.setText(null);
    frmLMD.txtseacaboTiempo8.setText(null);
    frmLMD.txtseacaboTiempo9.setText(null);
    frmLMD.txtseacaboTiempoTotal.setText(null);
    
    frmLMD.txtd1.setText(null);
    frmLMD.txtd10.setText(null);
    frmLMD.txtd2.setText(null);
    frmLMD.txtd3.setText(null);
    frmLMD.txtd4.setText(null);
    frmLMD.txtd5.setText(null);
    frmLMD.txtd6.setText(null);
    frmLMD.txtd7.setText(null);
    frmLMD.txtd8.setText(null);
    frmLMD.txtd9.setText(null);
    frmLMD.txtdTotal.setText(null);
    
    frmLMD.txtgranulometria1.setText(null);
    frmLMD.txtgranulometria10.setText(null);
    frmLMD.txtgranulometria2.setText(null);
    frmLMD.txtgranulometria3.setText(null);
    frmLMD.txtgranulometria4.setText(null);
    frmLMD.txtgranulometria5.setText(null);
    frmLMD.txtgranulometria6.setText(null);
    frmLMD.txtgranulometria7.setText(null);
    frmLMD.txtgranulometria8.setText(null);
    frmLMD.txtgranulometria9.setText(null);
    frmLMD.txtgranulometriaTotal.setText(null);
    
    frmLMD.txtpotenciaLaser1.setText(null);
    frmLMD.txtpotenciaLaser10.setText(null);
    frmLMD.txtpotenciaLaser2.setText(null);
    frmLMD.txtpotenciaLaser3.setText(null);
    frmLMD.txtpotenciaLaser4.setText(null);
    frmLMD.txtpotenciaLaser5.setText(null);
    frmLMD.txtpotenciaLaser6.setText(null);
    frmLMD.txtpotenciaLaser7.setText(null);
    frmLMD.txtpotenciaLaser8.setText(null);
    frmLMD.txtpotenciaLaser9.setText(null);
    frmLMD.txtpotenciaLaserTotal.setText(null);
    
    frmLMD.txtmodoLaser1.setText(null);
    frmLMD.txtmodoLaser10.setText(null);
    frmLMD.txtmodoLaser2.setText(null);
    frmLMD.txtmodoLaser3.setText(null);
    frmLMD.txtmodoLaser4.setText(null);
    frmLMD.txtmodoLaser5.setText(null);
    frmLMD.txtmodoLaser6.setText(null);
    frmLMD.txtmodoLaser7.setText(null);
    frmLMD.txtmodoLaser8.setText(null);
    frmLMD.txtmodoLaser9.setText(null);
    frmLMD.txtmodoLaserTotal.setText(null);
    
    frmLMD.txty1.setText(null);
    frmLMD.txty10.setText(null);
    frmLMD.txty2.setText(null);
    frmLMD.txty3.setText(null);
    frmLMD.txty4.setText(null);
    frmLMD.txty5.setText(null);
    frmLMD.txty6.setText(null);
    frmLMD.txty7.setText(null);
    frmLMD.txty8.setText(null);
    frmLMD.txty9.setText(null);
    frmLMD.txtyTotal.setText(null);
    frmLMD.txtz1.setText(null);
    frmLMD.txtz10.setText(null);
    frmLMD.txtz2.setText(null);
    frmLMD.txtz3.setText(null);
    frmLMD.txtz4.setText(null);
    frmLMD.txtz5.setText(null);
    frmLMD.txtz6.setText(null);
    frmLMD.txtz7.setText(null);
    frmLMD.txtz8.setText(null);
    frmLMD.txtz9.setText(null);
    frmLMD.txtzTotal.setText(null);
    
    frmLMD.txthpor1.setText(null);
    frmLMD.txthpor10.setText(null);
    frmLMD.txthpor2.setText(null);
    frmLMD.txthpor3.setText(null);
    frmLMD.txthpor4.setText(null);
    frmLMD.txthpor5.setText(null);
    frmLMD.txthpor6.setText(null);
    frmLMD.txthpor7.setText(null);
    frmLMD.txthpor8.setText(null);
    frmLMD.txthpor9.setText(null);
    frmLMD.txthporTotal.setText(null);
    
    frmLMD.txth61Dal1.setText(null);
    frmLMD.txth61Dal10.setText(null);
    frmLMD.txth61Dal2.setText(null);
    frmLMD.txth61Dal3.setText(null);
    frmLMD.txth61Dal4.setText(null);
    frmLMD.txth61Dal5.setText(null);
    frmLMD.txth61Dal6.setText(null);
    frmLMD.txth61Dal7.setText(null);
    frmLMD.txth61Dal8.setText(null);
    frmLMD.txth61Dal9.setText(null);
    frmLMD.txth61DalTotal.setText(null);
    
    frmLMD.txth62min1.setText(null);
    frmLMD.txth62min10.setText(null);
    frmLMD.txth62min2.setText(null);
    frmLMD.txth62min3.setText(null);
    frmLMD.txth62min4.setText(null);
    frmLMD.txth62min5.setText(null);
    frmLMD.txth62min6.setText(null);
    frmLMD.txth62min7.setText(null);
    frmLMD.txth62min8.setText(null);
    frmLMD.txth62min9.setText(null);
    frmLMD.txth62minTotal.setText(null);
    
    frmLMD.txtvelMezclador1.setText(null);
    frmLMD.txtvelMezclador10.setText(null);
    frmLMD.txtvelMezclador2.setText(null);
    frmLMD.txtvelMezclador3.setText(null);
    frmLMD.txtvelMezclador4.setText(null);
    frmLMD.txtvelMezclador5.setText(null);
    frmLMD.txtvelMezclador6.setText(null);
    frmLMD.txtvelMezclador7.setText(null);
    frmLMD.txtvelMezclador8.setText(null);
    frmLMD.txtvelMezclador9.setText(null);
    frmLMD.txtvelMezcladorTotal.setText(null);
    
    frmLMD.txtVIT_TIR1.setText(null);
    frmLMD.txtVIT_TIR10.setText(null);
    frmLMD.txtVIT_TIR2.setText(null);
    frmLMD.txtVIT_TIR3.setText(null);
    frmLMD.txtVIT_TIR4.setText(null);
    frmLMD.txtVIT_TIR5.setText(null);
    frmLMD.txtVIT_TIR6.setText(null);
    frmLMD.txtVIT_TIR7.setText(null);
    frmLMD.txtVIT_TIR8.setText(null);
    frmLMD.txtVIT_TIR9.setText(null);
    frmLMD.txtVIT_TIRTotal.setText(null);
    
    frmLMD.txtreferencias1.setText(null);
    frmLMD.txtreferencias10.setText(null);
    frmLMD.txtreferencias2.setText(null);
    frmLMD.txtreferencias3.setText(null);
    frmLMD.txtreferencias4.setText(null);
    frmLMD.txtreferencias5.setText(null);
    frmLMD.txtreferencias6.setText(null);
    frmLMD.txtreferencias7.setText(null);
    frmLMD.txtreferencias8.setText(null);
    frmLMD.txtreferencias9.setText(null);
    frmLMD.txtreferenciasTotal.setText(null);
    
    
    frmLMD.txtcomentariosParametros1.setText(null);
    frmLMD.txtO2.setText(null);
    frmLMD.txtH20.setText(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
    if (e.getSource() == frmLMD.btnPanel2_Consulter) {

        int index = frmLMD.cmblmdParametros.getSelectedIndex();
        String selecdepotParametros = frmLMD.cmblmdParametros.getItemAt(index);

        if (index != -1) {

            lmd = queryLmdParametros.getLmd(selecdepotParametros);
                      
           frmLMD.txtboquillaPza1.setText(lmd.getBoquillaPza1());
           frmLMD.txtboquillaPza10.setText(lmd.getBoquillaPza10());
           frmLMD.txtboquillaPza2.setText(lmd.getBoquillaPza2());
           frmLMD.txtboquillaPza3.setText(lmd.getBoquillaPza3());
           frmLMD.txtboquillaPza4.setText(lmd.getBoquillaPza4());
           frmLMD.txtboquillaPza5.setText(lmd.getBoquillaPza5());
           frmLMD.txtboquillaPza6.setText(lmd.getBoquillaPza6());
           frmLMD.txtboquillaPza7.setText(lmd.getBoquillaPza7());
           frmLMD.txtboquillaPza8.setText(lmd.getBoquillaPza8());
           frmLMD.txtboquillaPza9.setText(lmd.getBoquillaPza9());
           frmLMD.txtboquillaPzaTotal.setText(lmd.getBoquillaPzaTotal());
           
           frmLMD.txtlvelMaquina1.setText(lmd.getVelocidadMaquina1());
           frmLMD.txtlvelMaquina10.setText(lmd.getVelocidadMaquina10());
           frmLMD.txtlvelMaquina2.setText(lmd.getVelocidadMaquina2());
           frmLMD.txtlvelMaquina3.setText(lmd.getVelocidadMaquina3());
           frmLMD.txtlvelMaquina4.setText(lmd.getVelocidadMaquina4());
           frmLMD.txtlvelMaquina5.setText(lmd.getVelocidadMaquina5());
           frmLMD.txtlvelMaquina6.setText(lmd.getVelocidadMaquina6());
           frmLMD.txtlvelMaquina7.setText(lmd.getVelocidadMaquina7());
           frmLMD.txtlvelMaquina8.setText(lmd.getVelocidadMaquina8());
           frmLMD.txtlvelMaquina9.setText(lmd.getVelocidadMaquina9());
           frmLMD.txtlvelMaquinaTotal.setText(lmd.getVelocidadMaquinaTotal());
           
           frmLMD.txthigometria1.setText(lmd.getHigometria1());
           frmLMD.txthigometria10.setText(lmd.getHigometria10());
           frmLMD.txthigometria2.setText(lmd.getHigometria2());
           frmLMD.txthigometria3.setText(lmd.getHigometria3());
           frmLMD.txthigometria4.setText(lmd.getHigometria4());
           frmLMD.txthigometria5.setText(lmd.getHigometria5());
           frmLMD.txthigometria6.setText(lmd.getHigometria6());
           frmLMD.txthigometria7.setText(lmd.getHigometria7());
           frmLMD.txthigometria8.setText(lmd.getHigometria8());
           frmLMD.txthigometria9.setText(lmd.getHigometria9());
           frmLMD.txthigometriaTotal.setText(lmd.getHigometriaTotal());
           
           frmLMD.txttemperatura1.setText(lmd.getTemperatura1());
           frmLMD.txttemperatura10.setText(lmd.getTemperatura10());
           frmLMD.txttemperatura2.setText(lmd.getTemperatura2());
           frmLMD.txttemperatura3.setText(lmd.getTemperatura3());
           frmLMD.txttemperatura4.setText(lmd.getTemperatura4());
           frmLMD.txttemperatura5.setText(lmd.getTemperatura5());
           frmLMD.txttemperatura6.setText(lmd.getTemperatura6());
           frmLMD.txttemperatura7.setText(lmd.getTemperatura7());
           frmLMD.txttemperatura8.setText(lmd.getTemperatura8());
           frmLMD.txttemperatura9.setText(lmd.getTemperatura9());
           frmLMD.txttemperaturaTotal.setText(lmd.getTemperaturaTotal());
           
           frmLMD.txttemporizador1.setText(lmd.getTemporizador1());
           frmLMD.txttemporizador10.setText(lmd.getTemporizador10());
           frmLMD.txttemporizador2.setText(lmd.getTemporizador2());
           frmLMD.txttemporizador3.setText(lmd.getTemporizador3());
           frmLMD.txttemporizador4.setText(lmd.getTemporizador4());
           frmLMD.txttemporizador5.setText(lmd.getTemporizador5());
           frmLMD.txttemporizador6.setText(lmd.getTemporizador6());
           frmLMD.txttemporizador7.setText(lmd.getTemporizador7());
           frmLMD.txttemporizador8.setText(lmd.getTemporizador8());
           frmLMD.txttemporizador9.setText(lmd.getTemporizador9());
           frmLMD.txttemporizadorTotal.setText(lmd.getTemporizadorTotal());
           
           frmLMD.txtseacaboTiempo1.setText(lmd.getSalidaPolvo1());
           frmLMD.txtseacaboTiempo10.setText(lmd.getSalidaPolvo10());
           frmLMD.txtseacaboTiempo2.setText(lmd.getSalidaPolvo2());
           frmLMD.txtseacaboTiempo3.setText(lmd.getSalidaPolvo3());
           frmLMD.txtseacaboTiempo4.setText(lmd.getSalidaPolvo4());
           frmLMD.txtseacaboTiempo5.setText(lmd.getSalidaPolvo5());
           frmLMD.txtseacaboTiempo6.setText(lmd.getSalidaPolvo6());
           frmLMD.txtseacaboTiempo7.setText(lmd.getSalidaPolvo7());
           frmLMD.txtseacaboTiempo8.setText(lmd.getSalidaPolvo8());
           frmLMD.txtseacaboTiempo9.setText(lmd.getSalidaPolvo9());
           frmLMD.txtseacaboTiempoTotal.setText(lmd.getSalidaPolvoTotal());
           
           frmLMD.txtd1.setText(lmd.getD1());
           frmLMD.txtd10.setText(lmd.getD10());
           frmLMD.txtd2.setText(lmd.getD2());
           frmLMD.txtd3.setText(lmd.getD3());
           frmLMD.txtd4.setText(lmd.getD4());
           frmLMD.txtd5.setText(lmd.getD5());
           frmLMD.txtd6.setText(lmd.getD6());
           frmLMD.txtd7.setText(lmd.getD7());
           frmLMD.txtd8.setText(lmd.getD8());
           frmLMD.txtd9.setText(lmd.getD9());
           frmLMD.txtdTotal.setText(lmd.getdTotal());
           
           frmLMD.txtgranulometria1.setText(lmd.getGanulometria1());
           frmLMD.txtgranulometria10.setText(lmd.getGanulometria10());
           frmLMD.txtgranulometria2.setText(lmd.getGanulometria2());
           frmLMD.txtgranulometria3.setText(lmd.getGanulometria3());
           frmLMD.txtgranulometria4.setText(lmd.getGanulometria4());
           frmLMD.txtgranulometria5.setText(lmd.getGanulometria5());
           frmLMD.txtgranulometria6.setText(lmd.getGanulometria6());
           frmLMD.txtgranulometria7.setText(lmd.getGanulometria7());
           frmLMD.txtgranulometria8.setText(lmd.getGanulometria8());
           frmLMD.txtgranulometria9.setText(lmd.getGanulometria9());
           frmLMD.txtgranulometriaTotal.setText(lmd.getGanulometriaTotal());
           
           frmLMD.txtpotenciaLaser1.setText(lmd.getPotenciaLaser1());
           frmLMD.txtpotenciaLaser10.setText(lmd.getPotenciaLaser10());
           frmLMD.txtpotenciaLaser2.setText(lmd.getPotenciaLaser2());
           frmLMD.txtpotenciaLaser3.setText(lmd.getPotenciaLaser3());
           frmLMD.txtpotenciaLaser4.setText(lmd.getPotenciaLaser4());
           frmLMD.txtpotenciaLaser5.setText(lmd.getPotenciaLaser5());
           frmLMD.txtpotenciaLaser6.setText(lmd.getPotenciaLaser6());
           frmLMD.txtpotenciaLaser7.setText(lmd.getPotenciaLaser7());
           frmLMD.txtpotenciaLaser8.setText(lmd.getPotenciaLaser8());
           frmLMD.txtpotenciaLaser9.setText(lmd.getPotenciaLaser9());
           frmLMD.txtpotenciaLaserTotal.setText(lmd.getPotenciaLaserTotal());
           
           frmLMD.txtmodoLaser1.setText(lmd.getModoLaser1());
           frmLMD.txtmodoLaser10.setText(lmd.getModoLaser10());
           frmLMD.txtmodoLaser2.setText(lmd.getModoLaser2());
           frmLMD.txtmodoLaser3.setText(lmd.getModoLaser3());
           frmLMD.txtmodoLaser4.setText(lmd.getModoLaser4());
           frmLMD.txtmodoLaser5.setText(lmd.getModoLaser5());
           frmLMD.txtmodoLaser6.setText(lmd.getModoLaser6());
           frmLMD.txtmodoLaser7.setText(lmd.getModoLaser7());
           frmLMD.txtmodoLaser8.setText(lmd.getModoLaser8());
           frmLMD.txtmodoLaser9.setText(lmd.getModoLaser9());
           frmLMD.txtmodoLaserTotal.setText(lmd.getModoLaserTotal());
           
           frmLMD.txty1.setText(lmd.getY1());
           frmLMD.txty10.setText(lmd.getY10());
           frmLMD.txty2.setText(lmd.getY2());
           frmLMD.txty3.setText(lmd.getY3());
           frmLMD.txty4.setText(lmd.getY4());
           frmLMD.txty5.setText(lmd.getY5());
           frmLMD.txty6.setText(lmd.getY6());
           frmLMD.txty7.setText(lmd.getY7());
           frmLMD.txty8.setText(lmd.getY8());
           frmLMD.txty9.setText(lmd.getY9());
           frmLMD.txtyTotal.setText(lmd.getyTotal());
           frmLMD.txtz1.setText(lmd.getZ1());
           frmLMD.txtz10.setText(lmd.getZ10());
           frmLMD.txtz2.setText(lmd.getZ2());
           frmLMD.txtz3.setText(lmd.getZ3());
           frmLMD.txtz4.setText(lmd.getZ4());
           frmLMD.txtz5.setText(lmd.getZ5());
           frmLMD.txtz6.setText(lmd.getZ6());
           frmLMD.txtz7.setText(lmd.getZ7());
           frmLMD.txtz8.setText(lmd.getZ8());
           frmLMD.txtz9.setText(lmd.getZ9());
           frmLMD.txtzTotal.setText(lmd.getzTotal());
           
           frmLMD.txthpor1.setText(lmd.getH311());
           frmLMD.txthpor10.setText(lmd.getH3110());
           frmLMD.txthpor2.setText(lmd.getH312());
           frmLMD.txthpor3.setText(lmd.getH313());
           frmLMD.txthpor4.setText(lmd.getH314());
           frmLMD.txthpor5.setText(lmd.getH315());
           frmLMD.txthpor6.setText(lmd.getH316());
           frmLMD.txthpor7.setText(lmd.getH317());
           frmLMD.txthpor8.setText(lmd.getH318());
           frmLMD.txthpor9.setText(lmd.getH319());
           frmLMD.txthporTotal.setText(lmd.getH31Total());
           
           frmLMD.txth61Dal1.setText(lmd.getH611());
           frmLMD.txth61Dal10.setText(lmd.getH6110());
           frmLMD.txth61Dal2.setText(lmd.getH612());
           frmLMD.txth61Dal3.setText(lmd.getH613());
           frmLMD.txth61Dal4.setText(lmd.getH614());
           frmLMD.txth61Dal5.setText(lmd.getH615());
           frmLMD.txth61Dal6.setText(lmd.getH616());
           frmLMD.txth61Dal7.setText(lmd.getH617());
           frmLMD.txth61Dal8.setText(lmd.getH618());
           frmLMD.txth61Dal9.setText(lmd.getH619());
           frmLMD.txth61DalTotal.setText(lmd.getH61Total());
           
           frmLMD.txtvelMezclador1.setText(lmd.getVelocidadMezclador1());
           frmLMD.txtvelMezclador10.setText(lmd.getVelocidadMezclador10());
           frmLMD.txtvelMezclador2.setText(lmd.getVelocidadMezclador2());
           frmLMD.txtvelMezclador3.setText(lmd.getVelocidadMezclador3());
           frmLMD.txtvelMezclador4.setText(lmd.getVelocidadMezclador4());
           frmLMD.txtvelMezclador5.setText(lmd.getVelocidadMezclador5());
           frmLMD.txtvelMezclador6.setText(lmd.getVelocidadMezclador6());
           frmLMD.txtvelMezclador7.setText(lmd.getVelocidadMezclador7());
           frmLMD.txtvelMezclador8.setText(lmd.getVelocidadMezclador8());
           frmLMD.txtvelMezclador9.setText(lmd.getVelocidadMezclador9());
           frmLMD.txtvelMezcladorTotal.setText(lmd.getVelocidadMezcladorTotal());
           
           frmLMD.txtVIT_TIR1.setText(lmd.getVitTir1());
           frmLMD.txtVIT_TIR10.setText(lmd.getVitTir10());
           frmLMD.txtVIT_TIR2.setText(lmd.getVitTir2());
           frmLMD.txtVIT_TIR3.setText(lmd.getVitTir3());
           frmLMD.txtVIT_TIR4.setText(lmd.getVitTir4());
           frmLMD.txtVIT_TIR5.setText(lmd.getVitTir5());
           frmLMD.txtVIT_TIR6.setText(lmd.getVitTir6());
           frmLMD.txtVIT_TIR7.setText(lmd.getVitTir7());
           frmLMD.txtVIT_TIR8.setText(lmd.getVitTir8());
           frmLMD.txtVIT_TIR9.setText(lmd.getVitTir9());
           frmLMD.txtVIT_TIRTotal.setText(lmd.getVitTirTotal());
           
           frmLMD.txtreferencias1.setText(lmd.getReferencias1());
           frmLMD.txtreferencias10.setText(lmd.getReferencias10());
           frmLMD.txtreferencias2.setText(lmd.getReferencias2());
           frmLMD.txtreferencias3.setText(lmd.getReferencias3());
           frmLMD.txtreferencias4.setText(lmd.getReferencias4());
           frmLMD.txtreferencias5.setText(lmd.getReferencias5());
           frmLMD.txtreferencias6.setText(lmd.getReferencias6());
           frmLMD.txtreferencias7.setText(lmd.getReferencias7());
           frmLMD.txtreferencias8.setText(lmd.getReferencias8());
           frmLMD.txtreferencias9.setText(lmd.getReferencias9());
           frmLMD.txtreferenciasTotal.setText(lmd.getReferenciasTotal());
           
           
           frmLMD.txtcomentariosParametros1.setText(lmd.getComentarios());
           frmLMD.txtO2.setText(lmd.getO2());
           frmLMD.txtH20.setText(lmd.getH20());
            System.out.println("bien");
        } else {
                JOptionPane.showMessageDialog(frmLMD, "Choisis une option");
        }
    }
    
    if (e.getSource() == frmLMD.btnPanel2_btnMettreAJour) {
        lmd.setBoquillaPza1(frmLMD.txtboquillaPza1.getText()== null ? "" : frmLMD.txtboquillaPza1.getText());
        lmd.setBoquillaPza2(frmLMD.txtboquillaPza2.getText()== null ? "" : frmLMD.txtboquillaPza2.getText());
        lmd.setBoquillaPza3(frmLMD.txtboquillaPza3.getText()== null ? "" : frmLMD.txtboquillaPza3.getText());
        lmd.setBoquillaPza4(frmLMD.txtboquillaPza4.getText()== null ? "" : frmLMD.txtboquillaPza4.getText());
        lmd.setBoquillaPza5(frmLMD.txtboquillaPza5.getText()== null ? "" : frmLMD.txtboquillaPza5.getText());
        lmd.setBoquillaPza6(frmLMD.txtboquillaPza6.getText()== null ? "" : frmLMD.txtboquillaPza6.getText());
        lmd.setBoquillaPza7(frmLMD.txtboquillaPza7.getText()== null ? "" : frmLMD.txtboquillaPza7.getText());
        lmd.setBoquillaPza8(frmLMD.txtboquillaPza8.getText()== null ? "" : frmLMD.txtboquillaPza8.getText());
        lmd.setBoquillaPza9(frmLMD.txtboquillaPza9.getText()== null ? "" : frmLMD.txtboquillaPza9.getText());
        lmd.setBoquillaPza10(frmLMD.txtboquillaPza10.getText()== null ? "" : frmLMD.txtboquillaPza10.getText());
        lmd.setBoquillaPzaTotal(frmLMD.txtboquillaPzaTotal.getText()== null ? "" : frmLMD.txtboquillaPzaTotal.getText());

        lmd.setVelocidadMaquina1(frmLMD.txtlvelMaquina1.getText()== null ? "" : frmLMD.txtlvelMaquina1.getText());
        lmd.setVelocidadMaquina2(frmLMD.txtlvelMaquina2.getText()== null ? "" : frmLMD.txtlvelMaquina2.getText());
        lmd.setVelocidadMaquina3(frmLMD.txtlvelMaquina3.getText()== null ? "" : frmLMD.txtlvelMaquina3.getText());
        lmd.setVelocidadMaquina4(frmLMD.txtlvelMaquina4.getText()== null ? "" : frmLMD.txtlvelMaquina4.getText());
        lmd.setVelocidadMaquina5(frmLMD.txtlvelMaquina5.getText()== null ? "" : frmLMD.txtlvelMaquina5.getText());
        lmd.setVelocidadMaquina6(frmLMD.txtlvelMaquina6.getText()== null ? "" : frmLMD.txtlvelMaquina6.getText());
        lmd.setVelocidadMaquina7(frmLMD.txtlvelMaquina7.getText()== null ? "" : frmLMD.txtlvelMaquina7.getText());
        lmd.setVelocidadMaquina8(frmLMD.txtlvelMaquina8.getText()== null ? "" : frmLMD.txtlvelMaquina8.getText());
        lmd.setVelocidadMaquina9(frmLMD.txtlvelMaquina9.getText()== null ? "" : frmLMD.txtlvelMaquina9.getText());
        lmd.setVelocidadMaquina10(frmLMD.txtlvelMaquina10.getText()== null ? "" : frmLMD.txtlvelMaquina10.getText());
        lmd.setVelocidadMaquinaTotal(frmLMD.txtlvelMaquinaTotal.getText()== null ? "" : frmLMD.txtlvelMaquinaTotal.getText());
        
        lmd.setHigometria1(frmLMD.txthigometria1.getText()== null ? "" : frmLMD.txthigometria1.getText());
        lmd.setHigometria2(frmLMD.txthigometria2.getText()== null ? "" : frmLMD.txthigometria2.getText());
        lmd.setHigometria3(frmLMD.txthigometria3.getText()== null ? "" : frmLMD.txthigometria3.getText());
        lmd.setHigometria4(frmLMD.txthigometria4.getText()== null ? "" : frmLMD.txthigometria4.getText());
        lmd.setHigometria5(frmLMD.txthigometria5.getText()== null ? "" : frmLMD.txthigometria5.getText());
        lmd.setHigometria6(frmLMD.txthigometria6.getText()== null ? "" : frmLMD.txthigometria6.getText());
        lmd.setHigometria7(frmLMD.txthigometria7.getText()== null ? "" : frmLMD.txthigometria7.getText());
        lmd.setHigometria8(frmLMD.txthigometria8.getText()== null ? "" : frmLMD.txthigometria8.getText());
        lmd.setHigometria9(frmLMD.txthigometria9.getText()== null ? "" : frmLMD.txthigometria9.getText());
        lmd.setHigometria10(frmLMD.txthigometria10.getText()== null ? "" : frmLMD.txthigometria10.getText());
        lmd.setHigometriaTotal(frmLMD.txthigometriaTotal.getText()== null ? "" : frmLMD.txthigometriaTotal.getText());
        
        lmd.setTemperatura1(frmLMD.txttemperatura1.getText()== null ? "" : frmLMD.txttemperatura1.getText());
        lmd.setTemperatura2(frmLMD.txttemperatura2.getText()== null ? "" : frmLMD.txttemperatura2.getText());
        lmd.setTemperatura3(frmLMD.txttemperatura3.getText()== null ? "" : frmLMD.txttemperatura3.getText());
        lmd.setTemperatura4(frmLMD.txttemperatura4.getText()== null ? "" : frmLMD.txttemperatura4.getText());
        lmd.setTemperatura5(frmLMD.txttemperatura5.getText()== null ? "" : frmLMD.txttemperatura5.getText());
        lmd.setTemperatura6(frmLMD.txttemperatura6.getText()== null ? "" : frmLMD.txttemperatura6.getText());
        lmd.setTemperatura7(frmLMD.txttemperatura7.getText()== null ? "" : frmLMD.txttemperatura7.getText());
        lmd.setTemperatura8(frmLMD.txttemperatura8.getText()== null ? "" : frmLMD.txttemperatura8.getText());
        lmd.setTemperatura9(frmLMD.txttemperatura9.getText()== null ? "" : frmLMD.txttemperatura9.getText());
        lmd.setTemperatura10(frmLMD.txttemperatura10.getText()== null ? "" : frmLMD.txttemperatura10.getText());
        lmd.setTemperaturaTotal(frmLMD.txttemperaturaTotal.getText()== null ? "" : frmLMD.txttemperaturaTotal.getText());
        
        lmd.setTemporizador1(frmLMD.txttemporizador1.getText()== null ? "" : frmLMD.txttemporizador1.getText());
        lmd.setTemporizador2(frmLMD.txttemporizador2.getText()== null ? "" : frmLMD.txttemporizador2.getText());
        lmd.setTemporizador3(frmLMD.txttemporizador3.getText()== null ? "" : frmLMD.txttemporizador3.getText());
        lmd.setTemporizador4(frmLMD.txttemporizador4.getText()== null ? "" : frmLMD.txttemporizador4.getText());
        lmd.setTemporizador5(frmLMD.txttemporizador5.getText()== null ? "" : frmLMD.txttemporizador5.getText());
        lmd.setTemporizador6(frmLMD.txttemporizador6.getText()== null ? "" : frmLMD.txttemporizador6.getText());
        lmd.setTemporizador7(frmLMD.txttemporizador7.getText()== null ? "" : frmLMD.txttemporizador7.getText());
        lmd.setTemporizador8(frmLMD.txttemporizador8.getText()== null ? "" : frmLMD.txttemporizador8.getText());
        lmd.setTemporizador9(frmLMD.txttemporizador9.getText()== null ? "" : frmLMD.txttemporizador9.getText());
        lmd.setTemporizador10(frmLMD.txttemporizador10.getText()== null ? "" : frmLMD.txttemporizador10.getText());
        lmd.setTemporizadorTotal(frmLMD.txttemporizadorTotal.getText()== null ? "" : frmLMD.txttemporizadorTotal.getText());
        
        lmd.setTemporizador1(frmLMD.txtseacaboTiempo1.getText()== null ? "" : frmLMD.txtseacaboTiempo1.getText());
        lmd.setTemporizador2(frmLMD.txtseacaboTiempo2.getText()== null ? "" : frmLMD.txtseacaboTiempo2.getText());
        lmd.setTemporizador3(frmLMD.txtseacaboTiempo3.getText()== null ? "" : frmLMD.txtseacaboTiempo3.getText());
        lmd.setTemporizador4(frmLMD.txtseacaboTiempo4.getText()== null ? "" : frmLMD.txtseacaboTiempo4.getText());
        lmd.setTemporizador5(frmLMD.txtseacaboTiempo5.getText()== null ? "" : frmLMD.txtseacaboTiempo5.getText());
        lmd.setTemporizador6(frmLMD.txtseacaboTiempo6.getText()== null ? "" : frmLMD.txtseacaboTiempo6.getText());
        lmd.setTemporizador7(frmLMD.txtseacaboTiempo7.getText()== null ? "" : frmLMD.txtseacaboTiempo7.getText());
        lmd.setTemporizador8(frmLMD.txtseacaboTiempo8.getText()== null ? "" : frmLMD.txtseacaboTiempo8.getText());
        lmd.setTemporizador9(frmLMD.txtseacaboTiempo9.getText()== null ? "" : frmLMD.txtseacaboTiempo9.getText());
        lmd.setTemporizador10(frmLMD.txtseacaboTiempo10.getText()== null ? "" : frmLMD.txtseacaboTiempo10.getText());
        lmd.setTemporizadorTotal(frmLMD.txtseacaboTiempoTotal.getText()== null ? "" : frmLMD.txtseacaboTiempoTotal.getText());
        
        lmd.setD1(frmLMD.txtd1.getText()== null ? "" : frmLMD.txtd1.getText());
        lmd.setD2(frmLMD.txtd2.getText()== null ? "" : frmLMD.txtd2.getText());
        lmd.setD3(frmLMD.txtd3.getText()== null ? "" : frmLMD.txtd3.getText());
        lmd.setD4(frmLMD.txtd4.getText()== null ? "" : frmLMD.txtd4.getText());
        lmd.setD5(frmLMD.txtd5.getText()== null ? "" : frmLMD.txtd5.getText());
        lmd.setD6(frmLMD.txtd6.getText()== null ? "" : frmLMD.txtd6.getText());
        lmd.setD7(frmLMD.txtd7.getText()== null ? "" : frmLMD.txtd7.getText());
        lmd.setD8(frmLMD.txtd8.getText()== null ? "" : frmLMD.txtd8.getText());
        lmd.setD9(frmLMD.txtd9.getText()== null ? "" : frmLMD.txtd9.getText());
        lmd.setD10(frmLMD.txtd10.getText()== null ? "" : frmLMD.txtd10.getText());
        lmd.setdTotal(frmLMD.txtdTotal.getText()== null ? "" : frmLMD.txtdTotal.getText());
        
        lmd.setGanulometria1(frmLMD.txtgranulometria1.getText()== null ? "" : frmLMD.txtgranulometria1.getText());
        lmd.setGanulometria2(frmLMD.txtgranulometria2.getText()== null ? "" : frmLMD.txtgranulometria2.getText());
        lmd.setGanulometria3(frmLMD.txtgranulometria3.getText()== null ? "" : frmLMD.txtgranulometria3.getText());
        lmd.setGanulometria4(frmLMD.txtgranulometria4.getText()== null ? "" : frmLMD.txtgranulometria4.getText());
        lmd.setGanulometria5(frmLMD.txtgranulometria5.getText()== null ? "" : frmLMD.txtgranulometria5.getText());
        lmd.setGanulometria6(frmLMD.txtgranulometria6.getText()== null ? "" : frmLMD.txtgranulometria6.getText());
        lmd.setGanulometria7(frmLMD.txtgranulometria7.getText()== null ? "" : frmLMD.txtgranulometria7.getText());
        lmd.setGanulometria8(frmLMD.txtgranulometria8.getText()== null ? "" : frmLMD.txtgranulometria8.getText());
        lmd.setGanulometria9(frmLMD.txtgranulometria9.getText()== null ? "" : frmLMD.txtgranulometria9.getText());
        lmd.setGanulometria10(frmLMD.txtgranulometria10.getText()== null ? "" : frmLMD.txtgranulometria10.getText());
        lmd.setGanulometriaTotal(frmLMD.txtgranulometriaTotal.getText()== null ? "" : frmLMD.txtgranulometriaTotal.getText());
        
        lmd.setPotenciaLaser1(frmLMD.txtpotenciaLaser1.getText()== null ? "" : frmLMD.txtpotenciaLaser1.getText());
        lmd.setPotenciaLaser2(frmLMD.txtpotenciaLaser2.getText()== null ? "" : frmLMD.txtpotenciaLaser2.getText());
        lmd.setPotenciaLaser3(frmLMD.txtpotenciaLaser3.getText()== null ? "" : frmLMD.txtpotenciaLaser3.getText());
        lmd.setPotenciaLaser4(frmLMD.txtpotenciaLaser4.getText()== null ? "" : frmLMD.txtpotenciaLaser4.getText());
        lmd.setPotenciaLaser5(frmLMD.txtpotenciaLaser5.getText()== null ? "" : frmLMD.txtpotenciaLaser5.getText());
        lmd.setPotenciaLaser6(frmLMD.txtpotenciaLaser6.getText()== null ? "" : frmLMD.txtpotenciaLaser6.getText());
        lmd.setPotenciaLaser7(frmLMD.txtpotenciaLaser7.getText()== null ? "" : frmLMD.txtpotenciaLaser7.getText());
        lmd.setPotenciaLaser8(frmLMD.txtpotenciaLaser8.getText()== null ? "" : frmLMD.txtpotenciaLaser8.getText());
        lmd.setPotenciaLaser9(frmLMD.txtpotenciaLaser9.getText()== null ? "" : frmLMD.txtpotenciaLaser9.getText());
        lmd.setPotenciaLaser10(frmLMD.txtpotenciaLaser10.getText()== null ? "" : frmLMD.txtpotenciaLaser10.getText());
        lmd.setPotenciaLaserTotal(frmLMD.txtpotenciaLaserTotal.getText()== null ? "" : frmLMD.txtpotenciaLaserTotal.getText());
        
        lmd.setModoLaser1(frmLMD.txtmodoLaser1.getText()== null ? "" : frmLMD.txtmodoLaser1.getText());
        lmd.setModoLaser2(frmLMD.txtmodoLaser2.getText()== null ? "" : frmLMD.txtmodoLaser2.getText());
        lmd.setModoLaser3(frmLMD.txtmodoLaser3.getText()== null ? "" : frmLMD.txtmodoLaser3.getText());
        lmd.setModoLaser4(frmLMD.txtmodoLaser4.getText()== null ? "" : frmLMD.txtmodoLaser4.getText());
        lmd.setModoLaser5(frmLMD.txtmodoLaser5.getText()== null ? "" : frmLMD.txtmodoLaser5.getText());
        lmd.setModoLaser6(frmLMD.txtmodoLaser6.getText()== null ? "" : frmLMD.txtmodoLaser6.getText());
        lmd.setModoLaser7(frmLMD.txtmodoLaser7.getText()== null ? "" : frmLMD.txtmodoLaser7.getText());
        lmd.setModoLaser8(frmLMD.txtmodoLaser8.getText()== null ? "" : frmLMD.txtmodoLaser8.getText());
        lmd.setModoLaser9(frmLMD.txtmodoLaser9.getText()== null ? "" : frmLMD.txtmodoLaser9.getText());
        lmd.setModoLaser10(frmLMD.txtmodoLaser10.getText()== null ? "" : frmLMD.txtmodoLaser10.getText());
        lmd.setModoLaserTotal(frmLMD.txtmodoLaserTotal.getText()== null ? "" : frmLMD.txtmodoLaserTotal.getText());
        
        lmd.setY1(frmLMD.txty1.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY2(frmLMD.txty2.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY3(frmLMD.txty3.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY4(frmLMD.txty4.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY5(frmLMD.txty5.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY6(frmLMD.txty6.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY7(frmLMD.txty7.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY8(frmLMD.txty8.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY9(frmLMD.txty9.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setY10(frmLMD.txty10.getText()== null ? "" : frmLMD.txty1.getText());
        lmd.setyTotal(frmLMD.txty1.getText()== null ? "" : frmLMD.txty1.getText());
        
        lmd.setZ1(frmLMD.txtz1.getText()== null ? "" : frmLMD.txtz1.getText());
        lmd.setZ2(frmLMD.txtz2.getText()== null ? "" : frmLMD.txtz2.getText());
        lmd.setZ3(frmLMD.txtz3.getText()== null ? "" : frmLMD.txtz3.getText());
        lmd.setZ4(frmLMD.txtz4.getText()== null ? "" : frmLMD.txtz4.getText());
        lmd.setZ5(frmLMD.txtz5.getText()== null ? "" : frmLMD.txtz5.getText());
        lmd.setZ6(frmLMD.txtz6.getText()== null ? "" : frmLMD.txtz6.getText());
        lmd.setZ7(frmLMD.txtz7.getText()== null ? "" : frmLMD.txtz7.getText());
        lmd.setZ8(frmLMD.txtz8.getText()== null ? "" : frmLMD.txtz8.getText());
        lmd.setZ9(frmLMD.txtz9.getText()== null ? "" : frmLMD.txtz9.getText());
        lmd.setZ10(frmLMD.txtz10.getText()== null ? "" : frmLMD.txtz10.getText());
        lmd.setzTotal(frmLMD.txtzTotal.getText()== null ? "" : frmLMD.txtzTotal.getText());
        
        lmd.setH311(frmLMD.txthpor1.getText()== null ? "" : frmLMD.txthpor1.getText());
        lmd.setH312(frmLMD.txthpor2.getText()== null ? "" : frmLMD.txthpor2.getText());
        lmd.setH313(frmLMD.txthpor3.getText()== null ? "" : frmLMD.txthpor3.getText());
        lmd.setH314(frmLMD.txthpor4.getText()== null ? "" : frmLMD.txthpor4.getText());
        lmd.setH315(frmLMD.txthpor5.getText()== null ? "" : frmLMD.txthpor5.getText());
        lmd.setH316(frmLMD.txthpor6.getText()== null ? "" : frmLMD.txthpor6.getText());
        lmd.setH317(frmLMD.txthpor7.getText()== null ? "" : frmLMD.txthpor7.getText());
        lmd.setH318(frmLMD.txthpor8.getText()== null ? "" : frmLMD.txthpor8.getText());
        lmd.setH319(frmLMD.txthpor9.getText()== null ? "" : frmLMD.txthpor9.getText());
        lmd.setH3110(frmLMD.txthpor10.getText()== null ? "" : frmLMD.txthpor10.getText());
        lmd.setH31Total(frmLMD.txthporTotal.getText()== null ? "" : frmLMD.txthporTotal.getText());
        
        lmd.setH611(frmLMD.txth61Dal1.getText()== null ? "" : frmLMD.txth61Dal1.getText());
        lmd.setH612(frmLMD.txth61Dal2.getText()== null ? "" : frmLMD.txth61Dal2.getText());
        lmd.setH613(frmLMD.txth61Dal3.getText()== null ? "" : frmLMD.txth61Dal3.getText());
        lmd.setH614(frmLMD.txth61Dal4.getText()== null ? "" : frmLMD.txth61Dal4.getText());
        lmd.setH615(frmLMD.txth61Dal5.getText()== null ? "" : frmLMD.txth61Dal5.getText());
        lmd.setH616(frmLMD.txth61Dal6.getText()== null ? "" : frmLMD.txth61Dal6.getText());
        lmd.setH617(frmLMD.txth61Dal7.getText()== null ? "" : frmLMD.txth61Dal7.getText());
        lmd.setH618(frmLMD.txth61Dal8.getText()== null ? "" : frmLMD.txth61Dal8.getText());
        lmd.setH619(frmLMD.txth61Dal9.getText()== null ? "" : frmLMD.txth61Dal9.getText());
        lmd.setH6110(frmLMD.txth61Dal10.getText()== null ? "" : frmLMD.txth61Dal10.getText());
        lmd.setH61Total(frmLMD.txth61DalTotal.getText()== null ? "" : frmLMD.txth61DalTotal.getText());
        
        lmd.setVelocidadMezclador1(frmLMD.txtvelMezclador1.getText()== null ? "" : frmLMD.txtvelMezclador1.getText());
        lmd.setVelocidadMezclador2(frmLMD.txtvelMezclador2.getText()== null ? "" : frmLMD.txtvelMezclador2.getText());
        lmd.setVelocidadMezclador3(frmLMD.txtvelMezclador3.getText()== null ? "" : frmLMD.txtvelMezclador3.getText());
        lmd.setVelocidadMezclador4(frmLMD.txtvelMezclador4.getText()== null ? "" : frmLMD.txtvelMezclador4.getText());
        lmd.setVelocidadMezclador5(frmLMD.txtvelMezclador5.getText()== null ? "" : frmLMD.txtvelMezclador5.getText());
        lmd.setVelocidadMezclador6(frmLMD.txtvelMezclador6.getText()== null ? "" : frmLMD.txtvelMezclador6.getText());
        lmd.setVelocidadMezclador7(frmLMD.txtvelMezclador7.getText()== null ? "" : frmLMD.txtvelMezclador7.getText());
        lmd.setVelocidadMezclador8(frmLMD.txtvelMezclador8.getText()== null ? "" : frmLMD.txtvelMezclador8.getText());
        lmd.setVelocidadMezclador9(frmLMD.txtvelMezclador9.getText()== null ? "" : frmLMD.txtvelMezclador9.getText());
        lmd.setVelocidadMezclador10(frmLMD.txtvelMezclador10.getText()== null ? "" : frmLMD.txtvelMezclador10.getText());
        lmd.setVelocidadMezcladorTotal(frmLMD.txtvelMezcladorTotal.getText()== null ? "" : frmLMD.txtvelMezcladorTotal.getText());
        
        lmd.setVitTir1(frmLMD.txtVIT_TIR1.getText()== null ? "" : frmLMD.txtVIT_TIR1.getText());
        lmd.setVitTir2(frmLMD.txtVIT_TIR2.getText()== null ? "" : frmLMD.txtVIT_TIR2.getText());
        lmd.setVitTir3(frmLMD.txtVIT_TIR3.getText()== null ? "" : frmLMD.txtVIT_TIR3.getText());
        lmd.setVitTir1(frmLMD.txtVIT_TIR4.getText()== null ? "" : frmLMD.txtVIT_TIR4.getText());
        lmd.setVitTir5(frmLMD.txtVIT_TIR5.getText()== null ? "" : frmLMD.txtVIT_TIR5.getText());
        lmd.setVitTir6(frmLMD.txtVIT_TIR6.getText()== null ? "" : frmLMD.txtVIT_TIR6.getText());
        lmd.setVitTir7(frmLMD.txtVIT_TIR7.getText()== null ? "" : frmLMD.txtVIT_TIR7.getText());
        lmd.setVitTir8(frmLMD.txtVIT_TIR8.getText()== null ? "" : frmLMD.txtVIT_TIR8.getText());
        lmd.setVitTir9(frmLMD.txtVIT_TIR9.getText()== null ? "" : frmLMD.txtVIT_TIR9.getText());
        lmd.setVitTir10(frmLMD.txtVIT_TIR10.getText()== null ? "" : frmLMD.txtVIT_TIR10.getText());
        lmd.setVitTirTotal(frmLMD.txtVIT_TIRTotal.getText()== null ? "" : frmLMD.txtVIT_TIRTotal.getText());
        
        lmd.setReferencias1(frmLMD.txtreferencias1.getText()== null ? "" : frmLMD.txtreferencias1.getText());
        lmd.setReferencias2(frmLMD.txtreferencias2.getText()== null ? "" : frmLMD.txtreferencias2.getText());
        lmd.setReferencias3(frmLMD.txtreferencias3.getText()== null ? "" : frmLMD.txtreferencias3.getText());
        lmd.setReferencias4(frmLMD.txtreferencias4.getText()== null ? "" : frmLMD.txtreferencias4.getText());
        lmd.setReferencias5(frmLMD.txtreferencias5.getText()== null ? "" : frmLMD.txtreferencias5.getText());
        lmd.setReferencias6(frmLMD.txtreferencias6.getText()== null ? "" : frmLMD.txtreferencias6.getText());
        lmd.setReferencias7(frmLMD.txtreferencias7.getText()== null ? "" : frmLMD.txtreferencias7.getText());
        lmd.setReferencias8(frmLMD.txtreferencias8.getText()== null ? "" : frmLMD.txtreferencias8.getText());
        lmd.setReferencias9(frmLMD.txtreferencias9.getText()== null ? "" : frmLMD.txtreferencias9.getText());
        lmd.setReferencias10(frmLMD.txtreferencias10.getText()== null ? "" : frmLMD.txtreferencias10.getText());
        lmd.setReferenciasTotal(frmLMD.txtreferenciasTotal.getText()== null ? "" : frmLMD.txtreferenciasTotal.getText());
        
        lmd.setComentarios(frmLMD.txtcomentariosParametros1.getText()== null ? "" : frmLMD.txtcomentariosParametros1.getText());
        lmd.setO2(frmLMD.txtO2.getText()== null ? "" : frmLMD.txtO2.getText());
        lmd.setH20(frmLMD.txtH20.getText()== null ? "" : frmLMD.txtH20.getText());
        
        int index = frmLMD.cmblmdParametros.getSelectedIndex();
        String selecdepotParametros = frmLMD.cmblmdParametros.getItemAt(index);
        lmd.setNumeroFiche(selecdepotParametros);
        
        //queryLmdParametros.updateLmd(lmd);
        if (queryLmdParametros.updateLmd(lmd)) {
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
