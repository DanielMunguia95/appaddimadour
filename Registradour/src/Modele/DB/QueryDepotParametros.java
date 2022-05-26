/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele.DB;
import Modele.DB.Connexion;
import Modele.depotCabecer;
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
public class QueryDepotParametros extends Connexion{
    public boolean validateNumFiche(String numeroFiche) {

        boolean validate = false;
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select numeroFiche FROM appaddimadour.depot where numeroFiche=?";
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
    
    public List<String> getAllDepot() {

        List<String> Waam = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select numeroFiche from appaddimadour.depot";

        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() != 0) {

                    Waam.add(rs.getString("numeroFiche"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Waam;
    }
    
    public int getDepotId(String numeroFiche) {
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select idDepot from appaddimadour.depot where numeroFiche=?";
        int id = 0;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroFiche);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("idDepot");
            }

        } catch (Exception e) {

            return 0;
        }

        return id;

    }
    
    public depotCabecer getDepot(String idDepot) {
        depotCabecer depot = new depotCabecer();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT leySinergica1, leySinergica2, leySinergica3, leySinergica4, leySinergica5, leySinergica6, leySinergica7, leySinergica8, leySinergica9, leySinergica10, leySinergicaTotal, velRobto1, velRobto2, velRobto3, velRobto4, velRobto5, velRobto6, velRobto7, velRobto8, velRobto9, velRobto10, velRobtoTotal, boquillaPza1, boquillaPza2, boquillaPza3, boquillaPza4, boquillaPza5, boquillaPza6, boquillaPza7, boquillaPza8, boquillaPza9, boquillaPza10, boquillaPzaTotal, temperatura1, temperatura2, temperatura3, temperatura4, temperatura5, temperatura6, temperatura7, temperatura8, temperatura9, temperatura10, temperaturaTotal, temporizador1, temporizador2, temporizador3, temporizador4, temporizador5, temporizador6, temporizador7, temporizador8, temporizador9, temporizador10, temporizadorTotal, potenciaLaser1, potenciaLaser2, potenciaLaser3, potenciaLaser4, potenciaLaser5, potenciaLaser6, potenciaLaser7, potenciaLaser8, potenciaLaser9, potenciaLaser10, potenciaLaserTotal, velocidadCable1, velocidadCable2, velocidadCable3, velocidadCable4, velocidadCable5, velocidadCable6, velocidadCable7, velocidadCable8, velocidadCable9, velocidadCable10, velocidadCableTotal, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, yTotal, z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, zTotal, patronEscaneo1, patronEscaneo2, patronEscaneo3, patronEscaneo4, patronEscaneo5, patronEscaneo6, patronEscaneo7, patronEscaneo8, patronEscaneo9, patronEscaneo10, patronEscaneoTotal, largo1, largo2, largo3, largo4, largo5, largo6, largo7, largo8, largo9, largo10, largoTotal, altura1, altura2, altura3, altura4, altura5, altura6, altura7, altura8, altura9, altura0, alturaTotal, comentarios, referencias1, referencias2, referencias3, referencias4, referencias5, referencias6, referencias7, referencias8, referencias9, referencias10, referenciasTotal"
                + " FROM depot WHERE numeroFiche=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idDepot);

            rs = ps.executeQuery();

            if (rs.next()) {
                depot.setLeySinergica1(rs.getString("leySinergica1"));
                depot.setLeySinergica2(rs.getString("leySinergica2"));
                depot.setLeySinergica3(rs.getString("leySinergica3"));
                depot.setLeySinergica4(rs.getString("leySinergica4"));
                depot.setLeySinergica5(rs.getString("leySinergica5"));
                depot.setLeySinergica6(rs.getString("leySinergica6"));
                depot.setLeySinergica7(rs.getString("leySinergica7"));
                depot.setLeySinergica8(rs.getString("leySinergica8"));
                depot.setLeySinergica9(rs.getString("leySinergica9"));
                depot.setLeySinergica10(rs.getString("leySinergica10"));
                depot.setLeySinergicaTotal(rs.getString("leySinergicaTotal"));
                
                depot.setVelRobto1(rs.getString("velRobto1"));
                depot.setVelRobto2(rs.getString("velRobto2"));
                depot.setVelRobto3(rs.getString("velRobto3"));
                depot.setVelRobto4(rs.getString("velRobto4"));
                depot.setVelRobto5(rs.getString("velRobto5"));
                depot.setVelRobto6(rs.getString("velRobto6"));
                depot.setVelRobto7(rs.getString("velRobto7"));
                depot.setVelRobto8(rs.getString("velRobto8"));
                depot.setVelRobto9(rs.getString("velRobto9"));
                depot.setVelRobto10(rs.getString("velRobto10"));
                depot.setVelRobtoTotal(rs.getString("velRobtoTotal"));
                
                depot.setBoquillaPza1(rs.getString("boquillaPza1"));
                depot.setBoquillaPza2(rs.getString("boquillaPza2"));
                depot.setBoquillaPza3(rs.getString("boquillaPza3"));
                depot.setBoquillaPza4(rs.getString("boquillaPza4"));
                depot.setBoquillaPza5(rs.getString("boquillaPza5"));
                depot.setBoquillaPza6(rs.getString("boquillaPza6"));
                depot.setBoquillaPza7(rs.getString("boquillaPza7"));
                depot.setBoquillaPza8(rs.getString("boquillaPza8"));
                depot.setBoquillaPza9(rs.getString("boquillaPza9"));
                depot.setBoquillaPza10(rs.getString("boquillaPza10"));
                depot.setBoquillaPzaTotal(rs.getString("boquillaPzaTotal"));
                
                depot.setTemperatura1(rs.getString("temperatura1"));
                depot.setTemperatura2(rs.getString("temperatura2"));
                depot.setTemperatura3(rs.getString("temperatura3"));
                depot.setTemperatura4(rs.getString("temperatura4"));
                depot.setTemperatura5(rs.getString("temperatura5"));
                depot.setTemperatura6(rs.getString("temperatura6"));
                depot.setTemperatura7(rs.getString("temperatura7"));
                depot.setTemperatura8(rs.getString("temperatura8"));
                depot.setTemperatura9(rs.getString("temperatura9"));
                depot.setTemperatura10(rs.getString("temperatura10"));
                depot.setTemperaturaTotal(rs.getString("temperaturaTotal"));
                
                depot.setTemporizador1(rs.getString("temporizador1"));
                depot.setTemporizador2(rs.getString("temporizador2"));
                depot.setTemporizador3(rs.getString("temporizador3"));
                depot.setTemporizador4(rs.getString("temporizador4"));
                depot.setTemporizador5(rs.getString("temporizador5"));
                depot.setTemporizador6(rs.getString("temporizador6"));
                depot.setTemporizador7(rs.getString("temporizador7"));
                depot.setTemporizador8(rs.getString("temporizador8"));
                depot.setTemporizador9(rs.getString("temporizador9"));
                depot.setTemporizador10(rs.getString("temporizador10"));
                depot.setTemporizadorTotal(rs.getString("temporizadorTotal"));
                
                depot.setPotenciaLaser1(rs.getString("potenciaLaser1"));
                depot.setPotenciaLaser2(rs.getString("potenciaLaser2"));
                depot.setPotenciaLaser3(rs.getString("potenciaLaser3"));
                depot.setPotenciaLaser4(rs.getString("potenciaLaser4"));
                depot.setPotenciaLaser5(rs.getString("potenciaLaser5"));
                depot.setPotenciaLaser6(rs.getString("potenciaLaser6"));
                depot.setPotenciaLaser7(rs.getString("potenciaLaser7"));
                depot.setPotenciaLaser8(rs.getString("potenciaLaser8"));
                depot.setPotenciaLaser9(rs.getString("potenciaLaser9"));
                depot.setPotenciaLaser10(rs.getString("potenciaLaser10"));
                depot.setPotenciaLaserTotal(rs.getString("potenciaLaserTotal"));
                
                depot.setVelocidadCable1(rs.getString("velocidadCable1"));
                depot.setVelocidadCable2(rs.getString("velocidadCable2"));
                depot.setVelocidadCable3(rs.getString("velocidadCable3"));
                depot.setVelocidadCable4(rs.getString("velocidadCable4"));
                depot.setVelocidadCable5(rs.getString("velocidadCable5"));
                depot.setVelocidadCable6(rs.getString("velocidadCable6"));
                depot.setVelocidadCable7(rs.getString("velocidadCable7"));
                depot.setVelocidadCable8(rs.getString("velocidadCable8"));
                depot.setVelocidadCable9(rs.getString("velocidadCable9"));
                depot.setVelocidadCable0(rs.getString("velocidadCable10"));
                depot.setVelocidadCableTotal(rs.getString("velocidadCableTotal"));
                
                depot.setY1(rs.getString("y1"));
                depot.setY2(rs.getString("y2"));
                depot.setY3(rs.getString("y3"));
                depot.setY4(rs.getString("y4"));
                depot.setY5(rs.getString("y5"));
                depot.setY6(rs.getString("y6"));
                depot.setY7(rs.getString("y7"));
                depot.setY8(rs.getString("y8"));
                depot.setY9(rs.getString("y9"));
                depot.setY10(rs.getString("y10"));
                depot.setyTotal(rs.getString("yTotal"));
                
                depot.setZ1(rs.getString("z1"));
                depot.setZ2(rs.getString("z2"));
                depot.setZ3(rs.getString("z3"));
                depot.setZ4(rs.getString("z4"));
                depot.setZ5(rs.getString("z5"));
                depot.setZ6(rs.getString("z6"));
                depot.setZ7(rs.getString("z7"));
                depot.setZ8(rs.getString("z8"));
                depot.setZ9(rs.getString("z9"));
                depot.setZ10(rs.getString("z10"));
                depot.setzTotal(rs.getString("zTotal"));
                
                depot.setPatronEscaneo1(rs.getString("patronEscaneo1"));
                depot.setPatronEscaneo2(rs.getString("patronEscaneo2"));
                depot.setPatronEscaneo3(rs.getString("patronEscaneo3"));
                depot.setPatronEscaneo4(rs.getString("patronEscaneo4"));
                depot.setPatronEscaneo5(rs.getString("patronEscaneo5"));
                depot.setPatronEscaneo6(rs.getString("patronEscaneo6"));
                depot.setPatronEscaneo7(rs.getString("patronEscaneo7"));
                depot.setPatronEscaneo8(rs.getString("patronEscaneo8"));
                depot.setPatronEscaneo9(rs.getString("patronEscaneo9"));
                depot.setPatronEscaneo10(rs.getString("patronEscaneo10"));
                depot.setPatronEscaneoTotal(rs.getString("patronEscaneoTotal"));
                
                depot.setLargo1(rs.getString("largo1"));
                depot.setLargo2(rs.getString("largo2"));
                depot.setLargo3(rs.getString("largo3"));
                depot.setLargo4(rs.getString("largo4"));
                depot.setLargo5(rs.getString("largo5"));
                depot.setLargo6(rs.getString("largo6"));
                depot.setLargo7(rs.getString("largo7"));
                depot.setLargo8(rs.getString("largo8"));
                depot.setLargo9(rs.getString("largo9"));
                depot.setLargo10(rs.getString("largo10"));
                depot.setLargoTotal(rs.getString("largoTotal"));
                
                depot.setAltura1(rs.getString("altura1"));
                depot.setAltura2(rs.getString("altura2"));
                depot.setAltura3(rs.getString("altura3"));
                depot.setAltura4(rs.getString("altura4"));
                depot.setAltura5(rs.getString("altura5"));
                depot.setAltura6(rs.getString("altura6"));
                depot.setAltura7(rs.getString("altura7"));
                depot.setAltura8(rs.getString("altura8"));
                depot.setAltura9(rs.getString("altura9"));
                depot.setAltura10(rs.getString("altura0"));
                depot.setAlturaTotal(rs.getString("alturaTotal"));
                
                depot.setComentarios(rs.getString("comentarios"));
                
                depot.setReferencias1(rs.getString("referencias1"));
                depot.setReferencias2(rs.getString("referencias2"));
                depot.setReferencias3(rs.getString("referencias3"));
                depot.setReferencias4(rs.getString("referencias4"));
                depot.setReferencias5(rs.getString("referencias5"));
                depot.setReferencias6(rs.getString("referencias6"));
                depot.setReferencias7(rs.getString("referencias7"));
                depot.setReferencias8(rs.getString("referencias8"));
                depot.setReferencias9(rs.getString("referencias9"));
                depot.setReferencias10(rs.getString("referencias10"));
                depot.setReferenciasTotal(rs.getString("referenciasTotal"));
            }
            System.out.println(rs);
        } catch (Exception e) {
            depot=null;
            e.printStackTrace();
        }
        return depot;
    }
    
    public boolean updateDepot(depotCabecer Depot) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idDepot = 0;
        try {
            //if (this.validateNumFiche(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche()) != true) {
                idDepot = this.getDepotId(Depot.getNumeroFiche()== null ? "" : Depot.getNumeroFiche());
                //idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE depot SET leySinergica1 = ? , leySinergica2 = ? , leySinergica3 = ? , leySinergica4 = ? , leySinergica5 = ? , leySinergica6 = ? , leySinergica7 = ? ,"
                        + " leySinergica8 = ? , leySinergica9 = ? , leySinergica10 = ? , leySinergicaTotal = ? , velRobto1 = ? , velRobto2 = ? , velRobto3 = ? , velRobto4 = ? , "
                        + "velRobto5 = ? , velRobto6 = ? , velRobto7 = ? , velRobto8 = ? , velRobto9 = ? , velRobto10 = ? , velRobtoTotal = ? , boquillaPza1 = ? , boquillaPza2 = ? , "
                        + "boquillaPza3 = ? , boquillaPza4 = ? , boquillaPza5 = ? , boquillaPza6 = ? , boquillaPza7 = ? , boquillaPza8 = ? , boquillaPza9 = ? , boquillaPza10 = ? , "
                        + "boquillaPzaTotal = ? , temperatura1 = ? , temperatura2 = ? , temperatura3 = ? , temperatura4 = ? , temperatura5 = ? , temperatura6 = ? , temperatura7 = ? , "
                        + "temperatura8 = ? , temperatura9 = ? , temperatura10 = ? , temperaturaTotal = ? , temporizador1 = ? , temporizador2 = ? , temporizador3 = ? , temporizador4 = ? , "
                        + "temporizador5 = ? , temporizador6 = ? , temporizador7 = ? , temporizador8 = ? , temporizador9 = ? , temporizador10 = ? , temporizadorTotal = ? ,"
                        + " potenciaLaser1 = ? , potenciaLaser2 = ? , potenciaLaser3 = ? , potenciaLaser4 = ? , potenciaLaser5 = ? , potenciaLaser6 = ? , potenciaLaser7 = ? ,"
                        + " potenciaLaser8 = ? , potenciaLaser9 = ? , potenciaLaser10 = ? , potenciaLaserTotal = ? , velocidadCable1 = ? , velocidadCable2 = ? , velocidadCable3 = ? ,"
                        + " velocidadCable4 = ? , velocidadCable5 = ? , velocidadCable6 = ? , velocidadCable7 = ? , velocidadCable8 = ? , velocidadCable9 = ? , velocidadCable10 = ? ,"
                        + " velocidadCableTotal = ? , y1 = ? , y2 = ? , y3 = ? , y4 = ? , y5 = ? , y6 = ? , y7 = ? , y8 = ? , y9 = ? , y10 = ? , yTotal = ? , z1 = ? , z2 = ? , z3 = ? , z4 = ? , z5 = ? , z6 = ? , z7 = ? , z8 = ? , z9 = ? , z10 = ? , zTotal = ? , patronEscaneo1 = ? , patronEscaneo2 = ? , patronEscaneo3 = ? , patronEscaneo4 = ? , patronEscaneo5 = ? , patronEscaneo6 = ? , patronEscaneo7 = ? , patronEscaneo8 = ? , patronEscaneo9 = ? , patronEscaneo10 = ? , patronEscaneoTotal = ? , "
                        + "largo1 = ? , largo2 = ? , largo3 = ? , largo4 = ? , largo5 = ? , largo6 = ? , largo7 = ? , largo8 = ? , largo9 = ? , largo10 = ? , largoTotal = ? , altura1 = ? , altura2 = ? , altura3 = ? , altura4 = ? , altura5 = ?, altura6 = ? , altura7 = ? , altura8 = ? , altura9 = ? , altura0 = ? , alturaTotal = ? , referencias1 = ? , referencias2 = ? , referencias3 = ? ,"
                        + " referencias4 = ? , referencias5 = ? , referencias6 = ? , referencias7 = ? , referencias8 = ? , referencias9 = ? , referencias10 = ? , referenciasTotal = ? , comentarios = ?   WHERE depot.idDepot = ? ";

                ps = con.prepareStatement(sql);

                ps.setString(1, Depot.getLeySinergica1()== null ? "" : Depot.getLeySinergica1());
                ps.setString(2, Depot.getLeySinergica2()== null ? "" : Depot.getLeySinergica2());
                ps.setString(3, Depot.getLeySinergica3()== null ? "" : Depot.getLeySinergica3());
                ps.setString(4, Depot.getLeySinergica4()== null ? "" : Depot.getLeySinergica4());
                ps.setString(5, Depot.getLeySinergica5()== null ? "" : Depot.getLeySinergica5());
                ps.setString(6, Depot.getLeySinergica6()== null ? "" : Depot.getLeySinergica6());
                ps.setString(7, Depot.getLeySinergica7()== null ? "" : Depot.getLeySinergica7());
                ps.setString(8, Depot.getLeySinergica8()== null ? "" : Depot.getLeySinergica8());
                ps.setString(9, Depot.getLeySinergica9()== null ? "" : Depot.getLeySinergica9());
                ps.setString(10, Depot.getLeySinergica10()== null ? "" : Depot.getLeySinergica10());
                ps.setString(11, Depot.getLeySinergicaTotal()== null ? "" : Depot.getLeySinergicaTotal());
                
                ps.setString(12, Depot.getVelRobto1()== null ? "" : Depot.getVelRobto1());
                ps.setString(13, Depot.getVelRobto2()== null ? "" : Depot.getVelRobto2());
                ps.setString(14, Depot.getVelRobto3()== null ? "" : Depot.getVelRobto3());
                ps.setString(15, Depot.getVelRobto4()== null ? "" : Depot.getVelRobto4());
                ps.setString(16, Depot.getVelRobto5()== null ? "" : Depot.getVelRobto5());
                ps.setString(17, Depot.getVelRobto6()== null ? "" : Depot.getVelRobto6());
                ps.setString(18, Depot.getVelRobto7()== null ? "" : Depot.getVelRobto7());
                ps.setString(19, Depot.getVelRobto8()== null ? "" : Depot.getVelRobto8());
                ps.setString(20, Depot.getVelRobto9()== null ? "" : Depot.getVelRobto9());
                ps.setString(21, Depot.getVelRobto10()== null ? "" : Depot.getVelRobto10());
                ps.setString(22, Depot.getVelRobtoTotal()== null ? "" : Depot.getVelRobtoTotal());
                
                ps.setString(23, Depot.getBoquillaPza1()== null ? "" : Depot.getBoquillaPza1());
                ps.setString(24, Depot.getBoquillaPza2()== null ? "" : Depot.getBoquillaPza2());
                ps.setString(25, Depot.getBoquillaPza3()== null ? "" : Depot.getBoquillaPza3());
                ps.setString(26, Depot.getBoquillaPza4()== null ? "" : Depot.getBoquillaPza4());
                ps.setString(27, Depot.getBoquillaPza5()== null ? "" : Depot.getBoquillaPza5());
                ps.setString(28, Depot.getBoquillaPza6()== null ? "" : Depot.getBoquillaPza6());
                ps.setString(29, Depot.getBoquillaPza7()== null ? "" : Depot.getBoquillaPza7());
                ps.setString(30, Depot.getBoquillaPza8()== null ? "" : Depot.getBoquillaPza8());
                ps.setString(31, Depot.getBoquillaPza9()== null ? "" : Depot.getBoquillaPza9());
                ps.setString(32, Depot.getBoquillaPza10()== null ? "" : Depot.getBoquillaPza10());
                ps.setString(33, Depot.getBoquillaPzaTotal()== null ? "" : Depot.getBoquillaPzaTotal());
                
                ps.setString(34, Depot.getTemperatura1()== null ? "" : Depot.getTemperatura1());
                ps.setString(35, Depot.getTemperatura2()== null ? "" : Depot.getTemperatura2());
                ps.setString(36, Depot.getTemperatura3()== null ? "" : Depot.getTemperatura3());
                ps.setString(37, Depot.getTemperatura4()== null ? "" : Depot.getTemperatura4());
                ps.setString(38, Depot.getTemperatura5()== null ? "" : Depot.getTemperatura5());
                ps.setString(39, Depot.getTemperatura6()== null ? "" : Depot.getTemperatura6());
                ps.setString(40, Depot.getTemperatura7()== null ? "" : Depot.getTemperatura7());
                ps.setString(41, Depot.getTemperatura8()== null ? "" : Depot.getTemperatura8());
                ps.setString(42, Depot.getTemperatura9()== null ? "" : Depot.getTemperatura9());
                ps.setString(43, Depot.getTemperatura10()== null ? "" : Depot.getTemperatura10());
                ps.setString(44, Depot.getTemperaturaTotal()== null ? "" : Depot.getTemperaturaTotal());
                
                ps.setString(45, Depot.getTemporizador1()== null ? "" : Depot.getTemporizador1());
                ps.setString(46, Depot.getTemporizador2()== null ? "" : Depot.getTemporizador2());
                ps.setString(47, Depot.getTemporizador3()== null ? "" : Depot.getTemporizador3());
                ps.setString(48, Depot.getTemporizador4()== null ? "" : Depot.getTemporizador4());
                ps.setString(49, Depot.getTemporizador5()== null ? "" : Depot.getTemporizador5());
                ps.setString(50, Depot.getTemporizador6()== null ? "" : Depot.getTemporizador6());
                ps.setString(51, Depot.getTemporizador7()== null ? "" : Depot.getTemporizador7());
                ps.setString(52, Depot.getTemporizador8()== null ? "" : Depot.getTemporizador8());
                ps.setString(53, Depot.getTemporizador9()== null ? "" : Depot.getTemporizador9());
                ps.setString(54, Depot.getTemporizador10()== null ? "" : Depot.getTemporizador10());
                ps.setString(55, Depot.getTemporizadorTotal()== null ? "" : Depot.getTemporizadorTotal());
                
                ps.setString(56, Depot.getPotenciaLaser1()== null ? "" : Depot.getPotenciaLaser1());
                ps.setString(57, Depot.getPotenciaLaser2()== null ? "" : Depot.getPotenciaLaser2());
                ps.setString(58, Depot.getPotenciaLaser3()== null ? "" : Depot.getPotenciaLaser3());
                ps.setString(59, Depot.getPotenciaLaser4()== null ? "" : Depot.getPotenciaLaser4());
                ps.setString(60, Depot.getPotenciaLaser5()== null ? "" : Depot.getPotenciaLaser5());
                ps.setString(61, Depot.getPotenciaLaser6()== null ? "" : Depot.getPotenciaLaser6());
                ps.setString(62, Depot.getPotenciaLaser7()== null ? "" : Depot.getPotenciaLaser7());
                ps.setString(63, Depot.getPotenciaLaser8()== null ? "" : Depot.getPotenciaLaser8());
                ps.setString(64, Depot.getPotenciaLaser9()== null ? "" : Depot.getPotenciaLaser9());
                ps.setString(65, Depot.getPotenciaLaser10()== null ? "" : Depot.getPotenciaLaser10());
                ps.setString(66, Depot.getTemperaturaTotal()== null ? "" : Depot.getPotenciaLaserTotal());
                
                ps.setString(67, Depot.getVelocidadCable1()== null ? "" : Depot.getTemporizador1());
                ps.setString(68, Depot.getVelocidadCable2()== null ? "" : Depot.getTemporizador2());
                ps.setString(69, Depot.getVelocidadCable3()== null ? "" : Depot.getTemporizador3());
                ps.setString(70, Depot.getVelocidadCable4()== null ? "" : Depot.getTemporizador4());
                ps.setString(71, Depot.getVelocidadCable5()== null ? "" : Depot.getTemporizador5());
                ps.setString(72, Depot.getVelocidadCable6()== null ? "" : Depot.getTemporizador6());
                ps.setString(73, Depot.getVelocidadCable7()== null ? "" : Depot.getTemporizador7());
                ps.setString(74, Depot.getVelocidadCable8()== null ? "" : Depot.getTemporizador8());
                ps.setString(75, Depot.getVelocidadCable9()== null ? "" : Depot.getTemporizador9());
                ps.setString(76, Depot.getVelocidadCable0()== null ? "" : Depot.getVelocidadCable0());
                ps.setString(77, Depot.getVelocidadCableTotal()== null ? "" : Depot.getVelocidadCableTotal());
                
                ps.setString(78, Depot.getY1()== null ? "" : Depot.getY1());
                ps.setString(79, Depot.getY2()== null ? "" : Depot.getY2());
                ps.setString(80, Depot.getY3()== null ? "" : Depot.getY3());
                ps.setString(81, Depot.getY4()== null ? "" : Depot.getY4());
                ps.setString(82, Depot.getY5()== null ? "" : Depot.getY5());
                ps.setString(83, Depot.getY6()== null ? "" : Depot.getY6());
                ps.setString(84, Depot.getY7()== null ? "" : Depot.getY7());
                ps.setString(85, Depot.getY8()== null ? "" : Depot.getY8());
                ps.setString(86, Depot.getY9()== null ? "" : Depot.getY9());
                ps.setString(87, Depot.getY10()== null ? "" : Depot.getY10());
                ps.setString(88, Depot.getyTotal()== null ? "" : Depot.getyTotal());
                
                ps.setString(89, Depot.getZ1()== null ? "" : Depot.getZ1());
                ps.setString(90, Depot.getZ2()== null ? "" : Depot.getZ2());
                ps.setString(91, Depot.getZ3()== null ? "" : Depot.getZ3());
                ps.setString(92, Depot.getZ4()== null ? "" : Depot.getZ4());
                ps.setString(93, Depot.getZ5()== null ? "" : Depot.getZ5());
                ps.setString(94, Depot.getZ6()== null ? "" : Depot.getZ6());
                ps.setString(95, Depot.getZ7()== null ? "" : Depot.getZ7());
                ps.setString(96, Depot.getZ8()== null ? "" : Depot.getZ8());
                ps.setString(97, Depot.getZ9()== null ? "" : Depot.getZ9());
                ps.setString(98, Depot.getZ10()== null ? "" : Depot.getZ10());
                ps.setString(99, Depot.getzTotal()== null ? "" : Depot.getzTotal());
                
                ps.setString(100, Depot.getPatronEscaneo1()== null ? "" : Depot.getPatronEscaneo1());
                ps.setString(101, Depot.getPatronEscaneo2()== null ? "" : Depot.getPatronEscaneo2());
                ps.setString(102, Depot.getPatronEscaneo3()== null ? "" : Depot.getPatronEscaneo3());
                ps.setString(103, Depot.getPatronEscaneo4()== null ? "" : Depot.getPatronEscaneo4());
                ps.setString(104, Depot.getPatronEscaneo5()== null ? "" : Depot.getPatronEscaneo5());
                ps.setString(105, Depot.getPatronEscaneo6()== null ? "" : Depot.getPatronEscaneo6());
                ps.setString(106, Depot.getPatronEscaneo7()== null ? "" : Depot.getPatronEscaneo7());
                ps.setString(107, Depot.getPatronEscaneo8()== null ? "" : Depot.getPatronEscaneo8());
                ps.setString(108, Depot.getPatronEscaneo9()== null ? "" : Depot.getPatronEscaneo9());
                ps.setString(109, Depot.getPatronEscaneo10()== null ? "" : Depot.getPatronEscaneo10());
                ps.setString(110, Depot.getPatronEscaneoTotal()== null ? "" : Depot.getPatronEscaneoTotal());
                
                ps.setString(111, Depot.getLargo1()== null ? "" : Depot.getLargo1());
                ps.setString(112, Depot.getLargo2()== null ? "" : Depot.getLargo2());
                ps.setString(113, Depot.getLargo3()== null ? "" : Depot.getLargo3());
                ps.setString(114, Depot.getLargo4()== null ? "" : Depot.getLargo4());
                ps.setString(115, Depot.getLargo5()== null ? "" : Depot.getLargo5());
                ps.setString(116, Depot.getLargo6()== null ? "" : Depot.getLargo6());
                ps.setString(117, Depot.getLargo7()== null ? "" : Depot.getLargo7());
                ps.setString(118, Depot.getLargo8()== null ? "" : Depot.getLargo8());
                ps.setString(119, Depot.getLargo9()== null ? "" : Depot.getLargo9());
                ps.setString(120, Depot.getLargo10()== null ? "" : Depot.getLargo10());
                ps.setString(121, Depot.getLargoTotal()== null ? "" : Depot.getLargoTotal());
                
                ps.setString(122, Depot.getAltura1()== null ? "" : Depot.getAltura1());
                ps.setString(123, Depot.getAltura2()== null ? "" : Depot.getAltura2());
                ps.setString(124, Depot.getAltura3()== null ? "" : Depot.getAltura3());
                ps.setString(125, Depot.getAltura4()== null ? "" : Depot.getAltura4());
                ps.setString(126, Depot.getAltura5()== null ? "" : Depot.getAltura5());
                ps.setString(127, Depot.getAltura6()== null ? "" : Depot.getAltura6());
                ps.setString(128, Depot.getAltura7()== null ? "" : Depot.getAltura7());
                ps.setString(129, Depot.getAltura8()== null ? "" : Depot.getAltura8());
                ps.setString(130, Depot.getAltura9()== null ? "" : Depot.getAltura9());
                ps.setString(131, Depot.getAltura10()== null ? "" : Depot.getAltura10());
                ps.setString(132, Depot.getAlturaTotal()== null ? "" : Depot.getAlturaTotal());
                            
                ps.setString(133, Depot.getReferencias1()== null ? "" : Depot.getReferencias1());
                ps.setString(134, Depot.getReferencias2()== null ? "" : Depot.getReferencias2());
                ps.setString(135, Depot.getReferencias3()== null ? "" : Depot.getReferencias3());
                ps.setString(136, Depot.getReferencias4()== null ? "" : Depot.getReferencias4());
                ps.setString(137, Depot.getReferencias5()== null ? "" : Depot.getReferencias5());
                ps.setString(138, Depot.getReferencias6()== null ? "" : Depot.getReferencias6());
                ps.setString(139, Depot.getReferencias7()== null ? "" : Depot.getReferencias7());
                ps.setString(140, Depot.getReferencias8()== null ? "" : Depot.getReferencias8());
                ps.setString(141, Depot.getReferencias9()== null ? "" : Depot.getReferencias9());
                ps.setString(142, Depot.getReferencias10()== null ? "" : Depot.getReferencias10());
                ps.setString(143, Depot.getReferenciasTotal()== null ? "" : Depot.getReferenciasTotal());
                
                ps.setString(144, Depot.getComentarios()== null ? "" : Depot.getComentarios());
                ps.setInt(145, idDepot);

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
