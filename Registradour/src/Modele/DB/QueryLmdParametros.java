/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele.DB;
import Modele.DB.Connexion;
import Modele.LmdCabecer;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 *
 * @author admon
 */
public class QueryLmdParametros extends Connexion {
    public boolean validateNumFiche(String numeroFiche) {

        boolean validate = false;
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select numeroFiche FROM appaddimadour.lmd where numeroFiche=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroFiche);

            rs = ps.executeQuery();

            if (rs.next()) {
                validate = true;
            } else {
                validate = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return validate;
    }
    
    public List<String> getAllLmd() {

        List<String> Lmd = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select numeroFiche from appaddimadour.lmd";

        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() != 0) {

                    Lmd.add(rs.getString("numeroFiche"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lmd;
    }
    
    public int getLmdId(String numeroFiche) {

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select idLmd from appaddimadour.lmd where numeroFiche=?";
        int id = 0;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroFiche);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("idLmd");
            }

        } catch (Exception e) {

            return 0;
        }

        return id;

    }
    
    public LmdCabecer getLmd(String idWaam) {
        LmdCabecer lmd = new LmdCabecer();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT boquillaPza1, boquillaPza2, boquillaPza3, boquillaPza4, boquillaPza5, boquillaPza6, boquillaPza7, boquillaPza8, boquillaPza9, boquillaPza10, boquillaPzaTotal, velocidadMaquina1, velocidadMaquina2, velocidadMaquina3, velocidadMaquina4, velocidadMaquina5, velocidadMaquina6, velocidadMaquina7, velocidadMaquina8, velocidadMaquina9, velocidadMaquina10, velocidadMaquinaTotal, higometria1, higometria2, higometria3, higometria4, higometria5, higometria6, higometria7, higometria8, higometria9, higometria10, higometriaTotal, temperatura1, temperatura2, temperatura3, temperatura4, temperatura5, temperatura6, temperatura7, temperatura8, temperatura9, temperatura10, temperaturaTotal, temporizador1, temporizador2, temporizador3, temporizador4, temporizador5, temporizador6, temporizador7, temporizador8, temporizador9, temporizador10, temporizadorTotal, salidaPolvo1, salidaPolvo2, salidaPolvo3, salidaPolvo4, salidaPolvo5, salidaPolvo6, salidaPolvo7, salidaPolvo8, salidaPolvo9, salidaPolvo10, salidaPolvoTotal, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, dTotal, ganulometria1, ganulometria2, ganulometria3, ganulometria4, ganulometria5, ganulometria6, ganulometria7, ganulometria8, ganulometria9, ganulometria10, ganulometriaTotal, potenciaLaser1, potenciaLaser2, potenciaLaser3, potenciaLaser4, potenciaLaser5, potenciaLaser6, potenciaLaser7, potenciaLaser8, potenciaLaser9, potenciaLaser10, potenciaLaserTotal, modoLaser1, modoLaser2, modoLaser3, modoLaser4, modoLaser5, modoLaser6, modoLaser7, modoLaser8, modoLaser9, modoLaser10, modoLaserTotal, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, yTotal, z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, zTotal, h311, h312, h313, h314, h315, h316, h317, h318, h319, h3110, h31Total, h611, h612, h613, h614, h615, h616, h617, h618, h619, h6110, h61Total, velocidadMezclador1, velocidadMezclador2, velocidadMezclador3, velocidadMezclador4, velocidadMezclador5, velocidadMezclador6, velocidadMezclador7, velocidadMezclador8, velocidadMezclador9, velocidadMezclador10, velocidadMezcladorTotal, vitTir1, vitTir2, vitTir3, vitTir4, vitTir5, vitTir6, vitTir7, vitTir8, vitTir9, vitTir10, vitTirTotal, referencias1, referencias2, referencias3, referencias4, referencias5, referencias6, referencias7, referencias8, referencias9, referencias10, referenciasTotal, comentarios, o2, h20"
                + " FROM lmd WHERE numeroFiche=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idWaam);

            rs = ps.executeQuery();

            if (rs.next()) {
                lmd.setBoquillaPza1(rs.getString("boquillaPza1"));
                lmd.setBoquillaPza2(rs.getString("boquillaPza2"));
                lmd.setBoquillaPza3(rs.getString("boquillaPza3"));
                lmd.setBoquillaPza4(rs.getString("boquillaPza4"));
                lmd.setBoquillaPza5(rs.getString("boquillaPza5"));
                lmd.setBoquillaPza6(rs.getString("boquillaPza6"));
                lmd.setBoquillaPza7(rs.getString("boquillaPza7"));
                lmd.setBoquillaPza8(rs.getString("boquillaPza8"));
                lmd.setBoquillaPza9(rs.getString("boquillaPza9"));
                lmd.setBoquillaPza10(rs.getString("boquillaPza10"));
                lmd.setBoquillaPzaTotal(rs.getString("boquillaPzaTotal"));
                
                lmd.setVelocidadMaquina1(rs.getString("velocidadMaquina1"));
                lmd.setVelocidadMaquina2(rs.getString("velocidadMaquina2"));
                lmd.setVelocidadMaquina3(rs.getString("velocidadMaquina3"));
                lmd.setVelocidadMaquina4(rs.getString("velocidadMaquina4"));
                lmd.setVelocidadMaquina5(rs.getString("velocidadMaquina5"));
                lmd.setVelocidadMaquina6(rs.getString("velocidadMaquina6"));
                lmd.setVelocidadMaquina7(rs.getString("velocidadMaquina7"));
                lmd.setVelocidadMaquina8(rs.getString("velocidadMaquina8"));
                lmd.setVelocidadMaquina9(rs.getString("velocidadMaquina9"));
                lmd.setVelocidadMaquina10(rs.getString("velocidadMaquina10"));
                lmd.setVelocidadMaquinaTotal(rs.getString("velocidadMaquinaTotal"));
                
                lmd.setHigometria1(rs.getString("higometria1"));
                lmd.setHigometria2(rs.getString("higometria2"));
                lmd.setHigometria3(rs.getString("higometria3"));
                lmd.setHigometria4(rs.getString("higometria4"));
                lmd.setHigometria5(rs.getString("higometria5"));
                lmd.setHigometria6(rs.getString("higometria6"));
                lmd.setHigometria7(rs.getString("higometria7"));
                lmd.setHigometria8(rs.getString("higometria8"));
                lmd.setHigometria9(rs.getString("higometria9"));
                lmd.setHigometria10(rs.getString("higometria10"));
                lmd.setHigometriaTotal(rs.getString("higometriaTotal"));
                
                lmd.setTemperatura1(rs.getString("temperatura1"));
                lmd.setTemperatura2(rs.getString("temperatura2"));
                lmd.setTemperatura3(rs.getString("temperatura3"));
                lmd.setTemperatura4(rs.getString("temperatura4"));
                lmd.setTemperatura5(rs.getString("temperatura5"));
                lmd.setTemperatura6(rs.getString("temperatura6"));
                lmd.setTemperatura7(rs.getString("temperatura7"));
                lmd.setTemperatura8(rs.getString("temperatura8"));
                lmd.setTemperatura9(rs.getString("temperatura9"));
                lmd.setTemperatura10(rs.getString("temperatura10"));
                lmd.setTemperaturaTotal(rs.getString("temperaturaTotal"));
                
                lmd.setTemporizador1(rs.getString("temporizador1"));
                lmd.setTemporizador2(rs.getString("temporizador2"));
                lmd.setTemporizador3(rs.getString("temporizador3"));
                lmd.setTemporizador4(rs.getString("temporizador4"));
                lmd.setTemporizador5(rs.getString("temporizador5"));
                lmd.setTemporizador6(rs.getString("temporizador6"));
                lmd.setTemporizador7(rs.getString("temporizador7"));
                lmd.setTemporizador8(rs.getString("temporizador8"));
                lmd.setTemporizador9(rs.getString("temporizador9"));
                lmd.setTemporizador10(rs.getString("temporizador10"));
                lmd.setTemporizadorTotal(rs.getString("temporizadorTotal"));
                
                lmd.setSalidaPolvo1(rs.getString("salidaPolvo1"));
                lmd.setSalidaPolvo2(rs.getString("salidaPolvo2"));
                lmd.setSalidaPolvo3(rs.getString("salidaPolvo3"));
                lmd.setSalidaPolvo4(rs.getString("salidaPolvo4"));
                lmd.setSalidaPolvo5(rs.getString("salidaPolvo5"));
                lmd.setSalidaPolvo6(rs.getString("salidaPolvo6"));
                lmd.setSalidaPolvo7(rs.getString("salidaPolvo7"));
                lmd.setSalidaPolvo8(rs.getString("salidaPolvo8"));
                lmd.setSalidaPolvo9(rs.getString("salidaPolvo9"));
                lmd.setSalidaPolvo10(rs.getString("salidaPolvo10"));
                lmd.setSalidaPolvoTotal(rs.getString("salidaPolvoTotal"));
                
                lmd.setD1(rs.getString("d1"));
                lmd.setD2(rs.getString("d2"));
                lmd.setD3(rs.getString("d3"));
                lmd.setD4(rs.getString("d4"));
                lmd.setD5(rs.getString("d5"));
                lmd.setD6(rs.getString("d6"));
                lmd.setD7(rs.getString("d7"));
                lmd.setD8(rs.getString("d8"));
                lmd.setD9(rs.getString("d9"));
                lmd.setD10(rs.getString("d10"));
                lmd.setdTotal(rs.getString("dTotal"));
                
                lmd.setGanulometria1(rs.getString("ganulometria1"));
                lmd.setGanulometria2(rs.getString("ganulometria2"));
                lmd.setGanulometria3(rs.getString("ganulometria3"));
                lmd.setGanulometria4(rs.getString("ganulometria4"));
                lmd.setGanulometria5(rs.getString("ganulometria5"));
                lmd.setGanulometria6(rs.getString("ganulometria6"));
                lmd.setGanulometria7(rs.getString("ganulometria7"));
                lmd.setGanulometria8(rs.getString("ganulometria8"));
                lmd.setGanulometria9(rs.getString("ganulometria9"));
                lmd.setGanulometria10(rs.getString("ganulometria10"));
                lmd.setGanulometriaTotal(rs.getString("ganulometriaTotal"));
                
                lmd.setPotenciaLaser1(rs.getString("potenciaLaser1"));
                lmd.setPotenciaLaser2(rs.getString("potenciaLaser2"));
                lmd.setPotenciaLaser3(rs.getString("potenciaLaser3"));
                lmd.setPotenciaLaser4(rs.getString("potenciaLaser4"));
                lmd.setPotenciaLaser5(rs.getString("potenciaLaser5"));
                lmd.setPotenciaLaser6(rs.getString("potenciaLaser6"));
                lmd.setPotenciaLaser7(rs.getString("potenciaLaser7"));
                lmd.setPotenciaLaser8(rs.getString("potenciaLaser8"));
                lmd.setPotenciaLaser9(rs.getString("potenciaLaser9"));
                lmd.setPotenciaLaser10(rs.getString("potenciaLaser10"));
                lmd.setPotenciaLaserTotal(rs.getString("potenciaLaserTotal"));
                
                lmd.setModoLaser1(rs.getString("modoLaser1"));
                lmd.setModoLaser2(rs.getString("modoLaser2"));
                lmd.setModoLaser3(rs.getString("modoLaser3"));
                lmd.setModoLaser4(rs.getString("modoLaser4"));
                lmd.setModoLaser5(rs.getString("modoLaser5"));
                lmd.setModoLaser6(rs.getString("modoLaser6"));
                lmd.setModoLaser7(rs.getString("modoLaser7"));
                lmd.setModoLaser8(rs.getString("modoLaser8"));
                lmd.setModoLaser9(rs.getString("modoLaser9"));
                lmd.setModoLaser10(rs.getString("modoLaser10"));
                lmd.setModoLaserTotal(rs.getString("modoLaserTotal"));
                
                lmd.setY1(rs.getString("y1"));
                lmd.setY2(rs.getString("y2"));
                lmd.setY3(rs.getString("y3"));
                lmd.setY4(rs.getString("y4"));
                lmd.setY5(rs.getString("y5"));
                lmd.setY6(rs.getString("y6"));
                lmd.setY7(rs.getString("y7"));
                lmd.setY8(rs.getString("y8"));
                lmd.setY9(rs.getString("y9"));
                lmd.setY10(rs.getString("y10"));
                lmd.setyTotal(rs.getString("yTotal"));
                
                lmd.setZ1(rs.getString("z1"));
                lmd.setZ2(rs.getString("z2"));
                lmd.setZ3(rs.getString("z3"));
                lmd.setZ4(rs.getString("z4"));
                lmd.setZ5(rs.getString("z5"));
                lmd.setZ6(rs.getString("z6"));
                lmd.setZ7(rs.getString("z7"));
                lmd.setZ8(rs.getString("z8"));
                lmd.setZ9(rs.getString("z9"));
                lmd.setZ10(rs.getString("z10"));
                lmd.setzTotal(rs.getString("zTotal"));
                
                lmd.setH311(rs.getString("h311"));
                lmd.setH312(rs.getString("h312"));
                lmd.setH313(rs.getString("h313"));
                lmd.setH314(rs.getString("h314"));
                lmd.setH315(rs.getString("h315"));
                lmd.setH316(rs.getString("h316"));
                lmd.setH317(rs.getString("h317"));
                lmd.setH318(rs.getString("h318"));
                lmd.setH319(rs.getString("h319"));
                lmd.setH3110(rs.getString("h3110"));
                lmd.setH31Total(rs.getString("h31Total"));
                
                lmd.setH611(rs.getString("h611"));
                lmd.setH612(rs.getString("h612"));
                lmd.setH613(rs.getString("h613"));
                lmd.setH614(rs.getString("h614"));
                lmd.setH615(rs.getString("h615"));
                lmd.setH616(rs.getString("h616"));
                lmd.setH617(rs.getString("h617"));
                lmd.setH618(rs.getString("h618"));
                lmd.setH619(rs.getString("h619"));
                lmd.setH6110(rs.getString("h6110"));
                lmd.setH61Total(rs.getString("h61Total"));
                
                lmd.setVelocidadMezclador1(rs.getString("velocidadMezclador1"));
                lmd.setVelocidadMezclador2(rs.getString("velocidadMezclador2"));
                lmd.setVelocidadMezclador3(rs.getString("velocidadMezclador3"));
                lmd.setVelocidadMezclador4(rs.getString("velocidadMezclador4"));
                lmd.setVelocidadMezclador5(rs.getString("velocidadMezclador5"));
                lmd.setVelocidadMezclador6(rs.getString("velocidadMezclador6"));
                lmd.setVelocidadMezclador7(rs.getString("velocidadMezclador7"));
                lmd.setVelocidadMezclador8(rs.getString("velocidadMezclador8"));
                lmd.setVelocidadMezclador9(rs.getString("velocidadMezclador9"));
                lmd.setVelocidadMezclador10(rs.getString("velocidadMezclador10"));
                lmd.setVelocidadMezcladorTotal(rs.getString("velocidadMezcladorTotal"));
                
                lmd.setVitTir1(rs.getString("vitTir1"));
                lmd.setVitTir2(rs.getString("vitTir2"));
                lmd.setVitTir3(rs.getString("vitTir3"));
                lmd.setVitTir4(rs.getString("vitTir4"));
                lmd.setVitTir5(rs.getString("vitTir5"));
                lmd.setVitTir6(rs.getString("vitTir6"));
                lmd.setVitTir7(rs.getString("vitTir7"));
                lmd.setVitTir8(rs.getString("vitTir8"));
                lmd.setVitTir9(rs.getString("vitTir9"));
                lmd.setVitTir10(rs.getString("vitTir10"));
                lmd.setVitTirTotal(rs.getString("vitTirTotal"));
                
                lmd.setReferencias1(rs.getString("referencias1"));
                lmd.setReferencias2(rs.getString("referencias2"));
                lmd.setReferencias3(rs.getString("referencias3"));
                lmd.setReferencias4(rs.getString("referencias4"));
                lmd.setReferencias5(rs.getString("referencias5"));
                lmd.setReferencias6(rs.getString("referencias6"));
                lmd.setReferencias7(rs.getString("referencias7"));
                lmd.setReferencias8(rs.getString("referencias8"));
                lmd.setReferencias9(rs.getString("referencias9"));
                lmd.setReferencias10(rs.getString("referencias10"));
                lmd.setReferenciasTotal(rs.getString("referenciasTotal"));
                
                lmd.setComentarios(rs.getString("comentarios"));
                lmd.setO2(rs.getString("o2"));
                lmd.setH20(rs.getString("h20"));
                                
                lmd.setReferencias1(rs.getString("referencias1"));
                lmd.setReferencias2(rs.getString("referencias2"));
                lmd.setReferencias3(rs.getString("referencias3"));
                lmd.setReferencias4(rs.getString("referencias4"));
                lmd.setReferencias5(rs.getString("referencias5"));
                lmd.setReferencias6(rs.getString("referencias6"));
                lmd.setReferencias7(rs.getString("referencias7"));
                lmd.setReferencias8(rs.getString("referencias8"));
                lmd.setReferencias9(rs.getString("referencias9"));
                lmd.setReferencias10(rs.getString("referencias10"));
                lmd.setReferenciasTotal(rs.getString("referenciasTotal"));
            }

        } catch (Exception e) {
            lmd=null;
            e.printStackTrace();
        }
        return lmd;
    }
    
    public boolean updateLmd(LmdCabecer lmd) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLmd = 0;
        try {
            //if (this.validateNumFiche(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche()) != true) {
                idLmd = this.getLmdId(lmd.getNumeroFiche()== null ? "" : lmd.getNumeroFiche());
                //idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE lmd SET boquillaPza1 = ?, boquillaPza2 = ?, boquillaPza3 = ?, boquillaPza4 = ?, boquillaPza5 = ?, boquillaPza6 = ?, boquillaPza7 = ?, boquillaPza8 = ?, boquillaPza9 = ?, boquillaPza10 = ?, boquillaPzaTotal = ?, velocidadMaquina1 = ?, velocidadMaquina2 = ?, velocidadMaquina3 = ?, velocidadMaquina4 = ?, velocidadMaquina5 = ?, velocidadMaquina6 = ?, velocidadMaquina7 = ?, velocidadMaquina8 = ?, velocidadMaquina9 = ?, velocidadMaquina10 = ?, velocidadMaquinaTotal = ?, higometria1 = ?, higometria2 = ?, higometria3 = ?, higometria4 = ?, higometria5 = ?, higometria6 = ?, higometria7 = ?, higometria8 = ?, higometria9 = ?, higometria10 = ?, higometriaTotal = ?, temperatura1 = ?, temperatura2 = ?, temperatura3 = ?, temperatura4 = ?, temperatura5 = ?, temperatura6 = ?, temperatura7 = ?, temperatura8 = ?, temperatura9 = ?, temperatura10 = ?, temperaturaTotal = ?, temporizador1 = ?, temporizador2 = ?, temporizador3 = ?, temporizador4 = ?, temporizador5 = ?, temporizador6 = ?, temporizador7 = ?, temporizador8 = ?, temporizador9 = ?, temporizador10 = ?, temporizadorTotal = ?, salidaPolvo1 = ?, salidaPolvo2 = ?, salidaPolvo3 = ?, salidaPolvo4 = ?, salidaPolvo5 = ?, salidaPolvo6 = ?, salidaPolvo7 = ?, salidaPolvo8 = ?, salidaPolvo9 = ?, salidaPolvo10 = ?, salidaPolvoTotal = ?, d1 = ?, d2 = ?, d3 = ?, d4 = ?, d5 = ?, d6 = ?, d7 = ?, d8 = ?, d9 = ?, d10 = ?, dTotal = ?, ganulometria1 = ?, ganulometria2 = ?, ganulometria3 = ?, ganulometria4 = ?, ganulometria5 = ?, ganulometria6 = ?, ganulometria7 = ?, ganulometria8 = ?, ganulometria9 = ?, ganulometria10 = ?, ganulometriaTotal = ?, potenciaLaser1 = ?, potenciaLaser2 = ?, potenciaLaser3 = ?, potenciaLaser4 = ?, potenciaLaser5 = ?, potenciaLaser6 = ?, potenciaLaser7 = ?, potenciaLaser8 = ?, potenciaLaser9 = ?, potenciaLaser10 = ?, potenciaLaserTotal = ?, modoLaser1 = ?, modoLaser2 = ?, modoLaser3 = ?, modoLaser4 = ?, modoLaser5 = ?, modoLaser6 = ?, modoLaser7 = ?, modoLaser8 = ?, modoLaser9 = ?, modoLaser10 = ?, modoLaserTotal = ?, y1 = ?, y2 = ?, y3 = ?, y4 = ?, y5 = ?, y6 = ?, y7 = ?, y8 = ?, y9 = ?, y10 = ?, yTotal = ?, z1 = ?, z2 = ?, z3 = ?, z4 = ?, z5 = ?, z6 = ?, z7 = ?, z8 = ?, z9 = ?, z10 = ?, zTotal = ?, h311 = ?, h312 = ?, h313 = ?, h314 = ?, h315 = ?, h316 = ?, h317 = ?, h318 = ?, h319 = ?, h3110 = ?, h31Total = ?, h611 = ?, h612 = ?, h613 = ?, h614 = ?, h615 = ?, h616 = ?, h617 = ?, h618 = ?, h619 = ?, h6110 = ?, h61Total = ?, velocidadMezclador1 = ?, velocidadMezclador2 = ?, velocidadMezclador3 = ?, velocidadMezclador4 = ?, velocidadMezclador5 = ?, velocidadMezclador6 = ?, velocidadMezclador7 = ?, velocidadMezclador8 = ?, velocidadMezclador9 = ?, velocidadMezclador10 = ?, velocidadMezcladorTotal = ?, vitTir1 = ?, vitTir2 = ?, vitTir3 = ?, vitTir4 = ?, vitTir5 = ?, vitTir6 = ?, vitTir7 = ?, vitTir8 = ?, vitTir9 = ?, vitTir10 = ?, vitTirTotal = ?, referencias1 = ?, referencias2 = ?, referencias3 = ?, referencias4 = ?, referencias5 = ?, referencias6 = ?, referencias7 = ?, referencias8 = ?, referencias9 = ?, referencias10 = ?, referenciasTotal = ?, comentarios = ?, o2 = ?, h20 = ? WHERE lmd.idLmd =?";

                ps = con.prepareStatement(sql);

                ps.setString(1, lmd.getBoquillaPza1()== null ? "" : lmd.getBoquillaPza1());
                ps.setString(2, lmd.getBoquillaPza2()== null ? "" : lmd.getBoquillaPza2());
                ps.setString(3, lmd.getBoquillaPza3()== null ? "" : lmd.getBoquillaPza3());
                ps.setString(4, lmd.getBoquillaPza4()== null ? "" : lmd.getBoquillaPza4());
                ps.setString(5, lmd.getBoquillaPza5()== null ? "" : lmd.getBoquillaPza5());
                ps.setString(6, lmd.getBoquillaPza6()== null ? "" : lmd.getBoquillaPza6());
                ps.setString(7, lmd.getBoquillaPza7()== null ? "" : lmd.getBoquillaPza7());
                ps.setString(8, lmd.getBoquillaPza8()== null ? "" : lmd.getBoquillaPza8());
                ps.setString(9, lmd.getBoquillaPza9()== null ? "" : lmd.getBoquillaPza9());
                ps.setString(10, lmd.getBoquillaPza10()== null ? "" : lmd.getBoquillaPza10());
                ps.setString(11, lmd.getBoquillaPzaTotal()== null ? "" : lmd.getBoquillaPzaTotal());
                
                ps.setString(12, lmd.getVelocidadMaquina1()== null ? "" : lmd.getVelocidadMaquina1());
                ps.setString(13, lmd.getVelocidadMaquina2()== null ? "" : lmd.getVelocidadMaquina2());
                ps.setString(14, lmd.getVelocidadMaquina3()== null ? "" : lmd.getVelocidadMaquina3());
                ps.setString(15, lmd.getVelocidadMaquina4()== null ? "" : lmd.getVelocidadMaquina4());
                ps.setString(16, lmd.getVelocidadMaquina5()== null ? "" : lmd.getVelocidadMaquina5());
                ps.setString(17, lmd.getVelocidadMaquina6()== null ? "" : lmd.getVelocidadMaquina6());
                ps.setString(18, lmd.getVelocidadMaquina7()== null ? "" : lmd.getVelocidadMaquina7());
                ps.setString(19, lmd.getVelocidadMaquina8()== null ? "" : lmd.getVelocidadMaquina8());
                ps.setString(20, lmd.getVelocidadMaquina9()== null ? "" : lmd.getVelocidadMaquina9());
                ps.setString(21, lmd.getVelocidadMaquina10()== null ? "" : lmd.getVelocidadMaquina10());
                ps.setString(22, lmd.getVelocidadMaquinaTotal()== null ? "" : lmd.getVelocidadMaquinaTotal());
               
                ps.setString(23, lmd.getHigometria1()== null ? "" : lmd.getHigometria1());
                ps.setString(24, lmd.getHigometria2()== null ? "" : lmd.getHigometria2());
                ps.setString(25, lmd.getHigometria3()== null ? "" : lmd.getHigometria3());
                ps.setString(26, lmd.getHigometria4()== null ? "" : lmd.getHigometria4());
                ps.setString(27, lmd.getHigometria5()== null ? "" : lmd.getHigometria5());
                ps.setString(28, lmd.getHigometria6()== null ? "" : lmd.getHigometria6());
                ps.setString(29, lmd.getHigometria7()== null ? "" : lmd.getHigometria7());
                ps.setString(30, lmd.getHigometria8()== null ? "" : lmd.getHigometria8());
                ps.setString(31, lmd.getHigometria9()== null ? "" : lmd.getHigometria9());
                ps.setString(32, lmd.getHigometria10()== null ? "" : lmd.getHigometria10());
                ps.setString(33, lmd.getHigometriaTotal()== null ? "" : lmd.getHigometriaTotal());
               
                ps.setString(34, lmd.getTemperatura1()== null ? "" : lmd.getTemperatura1());
                ps.setString(35, lmd.getTemperatura2()== null ? "" : lmd.getTemperatura2());
                ps.setString(36, lmd.getTemperatura3()== null ? "" : lmd.getTemperatura3());
                ps.setString(37, lmd.getTemperatura4()== null ? "" : lmd.getTemperatura4());
                ps.setString(38, lmd.getTemperatura5()== null ? "" : lmd.getTemperatura5());
                ps.setString(39, lmd.getTemperatura6()== null ? "" : lmd.getTemperatura6());
                ps.setString(40, lmd.getTemperatura7()== null ? "" : lmd.getTemperatura7());
                ps.setString(41, lmd.getTemperatura8()== null ? "" : lmd.getTemperatura8());
                ps.setString(42, lmd.getTemperatura9()== null ? "" : lmd.getTemperatura9());
                ps.setString(43, lmd.getTemperatura10()== null ? "" : lmd.getTemperatura10());
                ps.setString(44, lmd.getTemperaturaTotal()== null ? "" : lmd.getTemperaturaTotal());
               
                ps.setString(45, lmd.getTemporizador1()== null ? "" : lmd.getTemporizador1());
                ps.setString(46, lmd.getTemporizador2()== null ? "" : lmd.getTemporizador2());
                ps.setString(47, lmd.getTemporizador3()== null ? "" : lmd.getTemporizador3());
                ps.setString(48, lmd.getTemporizador4()== null ? "" : lmd.getTemporizador4());
                ps.setString(49, lmd.getTemporizador5()== null ? "" : lmd.getTemporizador5());
                ps.setString(50, lmd.getTemporizador6()== null ? "" : lmd.getTemporizador6());
                ps.setString(51, lmd.getTemporizador7()== null ? "" : lmd.getTemporizador7());
                ps.setString(52, lmd.getTemporizador8()== null ? "" : lmd.getTemporizador8());
                ps.setString(53, lmd.getTemporizador9()== null ? "" : lmd.getTemporizador9());
                ps.setString(54, lmd.getTemporizador10()== null ? "" : lmd.getTemporizador10());
                ps.setString(55, lmd.getTemporizadorTotal()== null ? "" : lmd.getTemporizadorTotal());
             
                ps.setString(56, lmd.getSalidaPolvo1()== null ? "" : lmd.getSalidaPolvo1());
                ps.setString(57, lmd.getSalidaPolvo2()== null ? "" : lmd.getSalidaPolvo2());
                ps.setString(58, lmd.getSalidaPolvo3()== null ? "" : lmd.getSalidaPolvo3());
                ps.setString(59, lmd.getSalidaPolvo4()== null ? "" : lmd.getSalidaPolvo4());
                ps.setString(60, lmd.getSalidaPolvo5()== null ? "" : lmd.getSalidaPolvo5());
                ps.setString(61, lmd.getSalidaPolvo6()== null ? "" : lmd.getSalidaPolvo6());
                ps.setString(62, lmd.getSalidaPolvo7()== null ? "" : lmd.getSalidaPolvo7());
                ps.setString(63, lmd.getSalidaPolvo8()== null ? "" : lmd.getSalidaPolvo8());
                ps.setString(64, lmd.getSalidaPolvo9()== null ? "" : lmd.getSalidaPolvo9());
                ps.setString(65, lmd.getSalidaPolvo10()== null ? "" : lmd.getSalidaPolvo10());
                ps.setString(66, lmd.getSalidaPolvoTotal()== null ? "" : lmd.getSalidaPolvoTotal());
                
                ps.setString(67, lmd.getSalidaPolvo1()== null ? "" : lmd.getSalidaPolvo1());
                ps.setString(68, lmd.getSalidaPolvo2()== null ? "" : lmd.getSalidaPolvo2());
                ps.setString(69, lmd.getSalidaPolvo3()== null ? "" : lmd.getSalidaPolvo3());
                ps.setString(70, lmd.getSalidaPolvo4()== null ? "" : lmd.getSalidaPolvo4());
                ps.setString(71, lmd.getSalidaPolvo5()== null ? "" : lmd.getSalidaPolvo5());
                ps.setString(72, lmd.getSalidaPolvo6()== null ? "" : lmd.getSalidaPolvo6());
                ps.setString(73, lmd.getSalidaPolvo7()== null ? "" : lmd.getSalidaPolvo7());
                ps.setString(74, lmd.getSalidaPolvo8()== null ? "" : lmd.getSalidaPolvo8());
                ps.setString(75, lmd.getSalidaPolvo9()== null ? "" : lmd.getSalidaPolvo9());
                ps.setString(76, lmd.getSalidaPolvo10()== null ? "" : lmd.getSalidaPolvo10());
                ps.setString(77, lmd.getSalidaPolvoTotal()== null ? "" : lmd.getSalidaPolvoTotal());
               
                ps.setString(78, lmd.getD1()== null ? "" : lmd.getD1());
                ps.setString(79, lmd.getD2()== null ? "" : lmd.getD2());
                ps.setString(80, lmd.getD3()== null ? "" : lmd.getD3());
                ps.setString(81, lmd.getD4()== null ? "" : lmd.getD4());
                ps.setString(82, lmd.getD5()== null ? "" : lmd.getD5());
                ps.setString(83, lmd.getD6()== null ? "" : lmd.getD6());
                ps.setString(84, lmd.getD7()== null ? "" : lmd.getD7());
                ps.setString(85, lmd.getD8()== null ? "" : lmd.getD8());
                ps.setString(86, lmd.getD9()== null ? "" : lmd.getD9());
                ps.setString(87, lmd.getD10()== null ? "" : lmd.getD10());
                ps.setString(88, lmd.getdTotal()== null ? "" : lmd.getdTotal());
                
                ps.setString(89, lmd.getPotenciaLaser1()== null ? "" : lmd.getPotenciaLaser1());
                ps.setString(90, lmd.getPotenciaLaser2()== null ? "" : lmd.getPotenciaLaser2());
                ps.setString(91, lmd.getPotenciaLaser3()== null ? "" : lmd.getPotenciaLaser3());
                ps.setString(92, lmd.getPotenciaLaser4()== null ? "" : lmd.getPotenciaLaser4());
                ps.setString(93, lmd.getPotenciaLaser5()== null ? "" : lmd.getPotenciaLaser5());
                ps.setString(94, lmd.getPotenciaLaser6()== null ? "" : lmd.getPotenciaLaser6());
                ps.setString(95, lmd.getPotenciaLaser7()== null ? "" : lmd.getPotenciaLaser7());
                ps.setString(96, lmd.getPotenciaLaser8()== null ? "" : lmd.getPotenciaLaser8());
                ps.setString(97, lmd.getPotenciaLaser9()== null ? "" : lmd.getPotenciaLaser9());
                ps.setString(98, lmd.getPotenciaLaser10()== null ? "" : lmd.getPotenciaLaser10());
                ps.setString(99, lmd.getPotenciaLaserTotal()== null ? "" : lmd.getPotenciaLaserTotal());
                
                ps.setString(100, lmd.getModoLaser1()== null ? "" : lmd.getPotenciaLaser1());
                ps.setString(101, lmd.getModoLaser2()== null ? "" : lmd.getPotenciaLaser2());
                ps.setString(102, lmd.getModoLaser3()== null ? "" : lmd.getPotenciaLaser3());
                ps.setString(103, lmd.getModoLaser4()== null ? "" : lmd.getPotenciaLaser4());
                ps.setString(104, lmd.getModoLaser5()== null ? "" : lmd.getPotenciaLaser5());
                ps.setString(105, lmd.getModoLaser6()== null ? "" : lmd.getPotenciaLaser6());
                ps.setString(106, lmd.getModoLaser7()== null ? "" : lmd.getPotenciaLaser7());
                ps.setString(107, lmd.getModoLaser8()== null ? "" : lmd.getPotenciaLaser8());
                ps.setString(108, lmd.getModoLaser9()== null ? "" : lmd.getPotenciaLaser9());
                ps.setString(109, lmd.getModoLaser10()== null ? "" : lmd.getPotenciaLaser10());
                ps.setString(110, lmd.getModoLaserTotal()== null ? "" : lmd.getPotenciaLaserTotal());

                ps.setString(111, lmd.getY1()== null ? "" : lmd.getY1());
                ps.setString(112, lmd.getY2()== null ? "" : lmd.getY2());
                ps.setString(113, lmd.getY3()== null ? "" : lmd.getY3());
                ps.setString(114, lmd.getY4()== null ? "" : lmd.getY4());
                ps.setString(115, lmd.getY5()== null ? "" : lmd.getY5());
                ps.setString(116, lmd.getY6()== null ? "" : lmd.getY6());
                ps.setString(117, lmd.getY7()== null ? "" : lmd.getY7());
                ps.setString(118, lmd.getY8()== null ? "" : lmd.getY8());
                ps.setString(119, lmd.getY9()== null ? "" : lmd.getY9());
                ps.setString(120, lmd.getY10()== null ? "" : lmd.getY10());
                ps.setString(121, lmd.getyTotal()== null ? "" : lmd.getyTotal());
              
                ps.setString(122, lmd.getZ1()== null ? "" : lmd.getZ1());
                ps.setString(123, lmd.getZ2()== null ? "" : lmd.getZ2());
                ps.setString(124, lmd.getZ3()== null ? "" : lmd.getZ3());
                ps.setString(125, lmd.getZ4()== null ? "" : lmd.getZ4());
                ps.setString(126, lmd.getZ5()== null ? "" : lmd.getZ5());
                ps.setString(127, lmd.getZ6()== null ? "" : lmd.getZ6());
                ps.setString(128, lmd.getZ7()== null ? "" : lmd.getZ7());
                ps.setString(129, lmd.getZ8()== null ? "" : lmd.getZ8());
                ps.setString(130, lmd.getZ9()== null ? "" : lmd.getZ9());
                ps.setString(131, lmd.getZ10()== null ? "" : lmd.getZ10());
                ps.setString(132, lmd.getzTotal()== null ? "" : lmd.getzTotal());
              
                ps.setString(133, lmd.getH311()== null ? "" : lmd.getH311());
                ps.setString(134, lmd.getH312()== null ? "" : lmd.getH312());
                ps.setString(135, lmd.getH313()== null ? "" : lmd.getH313());
                ps.setString(136, lmd.getH314()== null ? "" : lmd.getH314());
                ps.setString(137, lmd.getH315()== null ? "" : lmd.getH315());
                ps.setString(138, lmd.getH316()== null ? "" : lmd.getH316());
                ps.setString(139, lmd.getH317()== null ? "" : lmd.getH317());
                ps.setString(140, lmd.getH318()== null ? "" : lmd.getH318());
                ps.setString(141, lmd.getH319()== null ? "" : lmd.getH319());
                ps.setString(142, lmd.getH3110()== null ? "" : lmd.getH3110());
                ps.setString(143, lmd.getH31Total()== null ? "" : lmd.getH31Total());
              
                ps.setString(144, lmd.getH611()== null ? "" : lmd.getH611());
                ps.setString(145, lmd.getH612()== null ? "" : lmd.getH612());
                ps.setString(146, lmd.getH613()== null ? "" : lmd.getH613());
                ps.setString(147, lmd.getH614()== null ? "" : lmd.getH614());
                ps.setString(148, lmd.getH615()== null ? "" : lmd.getH615());
                ps.setString(149, lmd.getH616()== null ? "" : lmd.getH616());
                ps.setString(150, lmd.getH617()== null ? "" : lmd.getH617());
                ps.setString(151, lmd.getH618()== null ? "" : lmd.getH618());
                ps.setString(152, lmd.getH619()== null ? "" : lmd.getH619());
                ps.setString(153, lmd.getH6110()== null ? "" : lmd.getH6110());
                ps.setString(154, lmd.getH61Total()== null ? "" : lmd.getH61Total());
               
                ps.setString(155, lmd.getVelocidadMezclador1()== null ? "" : lmd.getVelocidadMezclador1());
                ps.setString(156, lmd.getVelocidadMezclador2()== null ? "" : lmd.getVelocidadMezclador2());
                ps.setString(157, lmd.getVelocidadMezclador3()== null ? "" : lmd.getVelocidadMezclador3());
                ps.setString(158, lmd.getVelocidadMezclador4()== null ? "" : lmd.getVelocidadMezclador4());
                ps.setString(159, lmd.getVelocidadMezclador5()== null ? "" : lmd.getVelocidadMezclador5());
                ps.setString(160, lmd.getVelocidadMezclador6()== null ? "" : lmd.getVelocidadMezclador6());
                ps.setString(161, lmd.getVelocidadMezclador7()== null ? "" : lmd.getVelocidadMezclador7());
                ps.setString(162, lmd.getVelocidadMezclador8()== null ? "" : lmd.getVelocidadMezclador8());
                ps.setString(163, lmd.getVelocidadMezclador9()== null ? "" : lmd.getVelocidadMezclador9());
                ps.setString(164, lmd.getVelocidadMezclador10()== null ? "" : lmd.getVelocidadMezclador10());
                ps.setString(165, lmd.getVelocidadMezcladorTotal()== null ? "" : lmd.getVelocidadMezcladorTotal());
               
                ps.setString(166, lmd.getVitTir1()== null ? "" : lmd.getVitTir1());
                ps.setString(167, lmd.getVitTir2()== null ? "" : lmd.getVitTir2());
                ps.setString(168, lmd.getVitTir3()== null ? "" : lmd.getVitTir3());
                ps.setString(169, lmd.getVitTir4()== null ? "" : lmd.getVitTir4());
                ps.setString(170, lmd.getVitTir5()== null ? "" : lmd.getVitTir5());
                ps.setString(171, lmd.getVitTir6()== null ? "" : lmd.getVitTir6());
                ps.setString(172, lmd.getVitTir7()== null ? "" : lmd.getVitTir7());
                ps.setString(173, lmd.getVitTir8()== null ? "" : lmd.getVitTir8());
                ps.setString(174, lmd.getVitTir9()== null ? "" : lmd.getVitTir9());
                ps.setString(175, lmd.getVitTir10()== null ? "" : lmd.getVitTir10());
                ps.setString(176, lmd.getVitTirTotal()== null ? "" : lmd.getVitTirTotal());
                
                ps.setString(177, lmd.getReferencias1()== null ? "" : lmd.getReferencias1());
                ps.setString(178, lmd.getReferencias2()== null ? "" : lmd.getReferencias2());
                ps.setString(179, lmd.getReferencias3()== null ? "" : lmd.getReferencias3());
                ps.setString(180, lmd.getReferencias4()== null ? "" : lmd.getReferencias4());
                ps.setString(181, lmd.getReferencias5()== null ? "" : lmd.getReferencias5());
                ps.setString(182, lmd.getReferencias6()== null ? "" : lmd.getReferencias6());
                ps.setString(183, lmd.getReferencias7()== null ? "" : lmd.getReferencias7());
                ps.setString(184, lmd.getReferencias8()== null ? "" : lmd.getReferencias8());
                ps.setString(185, lmd.getReferencias9()== null ? "" : lmd.getReferencias9());
                ps.setString(186, lmd.getReferencias10()== null ? "" : lmd.getReferencias10());
                ps.setString(187, lmd.getReferenciasTotal()== null ? "" : lmd.getReferenciasTotal());
                
                ps.setString(188, lmd.getComentarios()== null ? "" : lmd.getComentarios());
                ps.setString(189, lmd.getO2()== null ? "" : lmd.getO2());
                ps.setString(190, lmd.getH20()== null ? "" : lmd.getH20());
                ps.setInt(191, idLmd);

                int iInsCnt = ps.executeUpdate();
                if (iInsCnt > 0) {
                    System.out.println("Update Success");
                    return true;
                } else {
                    System.out.println("Update Fail");
                    return false;
                }
//            }else{
//                System.out.println("ya existe un registro con ese num fiche update");
//            }

        } catch (SQLException e) {
            rs = false;
            System.out.println(e);

        } finally {
            try {

                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return false;
    }
}
