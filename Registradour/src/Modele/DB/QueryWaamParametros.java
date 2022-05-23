/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele.DB;

import Modele.DB.Connexion;
import Modele.WaamCabecer;
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
public class QueryWaamParametros extends Connexion {
    //SI
    public boolean validateNumFiche(String numeroFiche) {

        boolean validate = false;
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select numeroFiche FROM appaddimadour.waam where numeroFiche=?";
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
    
    //SI
    public List<String> getAllWaam() {

        List<String> Waam = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select numeroFiche from appaddimadour.waam";

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
    
    //SI
    public int getWaamId(String numeroFiche) {

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select idWaam from appaddimadour.waam where numeroFiche=?";
        int id = 0;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroFiche);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("idWaam");
            }

        } catch (Exception e) {

            return 0;
        }

        return id;

    }

    //WaamCabecer TIENE GET & SET
    //SELECT PARAMETROS
    public WaamCabecer getWaam(String idWaam) {
        WaamCabecer labo = new WaamCabecer();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT leySinergica1, leySinergica2, leySinergica3, leySinergica4, leySinergica5, leySinergica6, leySinergica7, leySinergica8, leySinergica9, leySinergica10, leySinergicaTotal, velRobto1, velRobto2, velRobto3, velRobto4, velRobto5, velRobto6, velRobto7, velRobto8, velRobto9, velRobto10, velRobtoTotal, boquillaPza1, boquillaPza2, boquillaPza3, boquillaPza4, boquillaPza5, boquillaPza6, boquillaPza7, boquillaPza8, boquillaPza9, boquillaPza10, boquillaPzaTotal, temperatura1, temperatura2, temperatura3, temperatura4, temperatura5, temperatura6, temperatura7, temperatura8, temperatura9, temperatura10, temperaturaTotal, temporizador1, temporizador2, temporizador3, temporizador4, temporizador5, temporizador6, temporizador7, temporizador8, temporizador9, temporizador10, temporizadorTotal, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, yTotal, z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, zTotal, alturaArco1, alturaArco2, alturaArco3, alturaArco4, alturaArco5, alturaArco6, alturaArco7, alturaArco8, alturaArco9, alturaArco10, alturaArcoTotal, arcoDinamico1, arcoDinamico2, arcoDinamico3, arcoDinamico4, arcoDinamico5, arcoDinamico6, arcoDinamico7, arcoDinamico8, arcoDinamico9, arcoDinamico10, arcoDinamicoTotal, arcoPulsado1, arcoPulsado2, arcoPulsado3, arcoPulsado4, arcoPulsado5, arcoPulsado6, arcoPulsado7, arcoPulsado8, arcoPulsado9, arcoPulsado10, arcoPulsadoTotal, preGas, postGas, quemado, velocidadCable1, velocidadCable2, velocidadCable3, velocidadCable4, velocidadCable5, velocidadCable6, velocidadCable7, velocidadCable8, velocidadCable9, velocidadCable10, velocidadCableTotal, comentarios, referencias1, referencias2, referencias3, referencias4, referencias5, referencias6, referencias7, referencias8, referencias9, referencias10, referenciasTotal"
                + " FROM waam WHERE numeroFiche=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idWaam);

            rs = ps.executeQuery();

            if (rs.next()) {
                labo.setLeySinergica1(rs.getString("leySinergica1"));
                labo.setLeySinergica2(rs.getString("leySinergica2"));
                labo.setLeySinergica3(rs.getString("leySinergica3"));
                labo.setLeySinergica4(rs.getString("leySinergica4"));
                labo.setLeySinergica5(rs.getString("leySinergica5"));
                labo.setLeySinergica6(rs.getString("leySinergica6"));
                labo.setLeySinergica7(rs.getString("leySinergica7"));
                labo.setLeySinergica8(rs.getString("leySinergica8"));
                labo.setLeySinergica9(rs.getString("leySinergica9"));
                labo.setLeySinergica10(rs.getString("leySinergica10"));
                labo.setLeySinergicaTotal(rs.getString("leySinergicaTotal"));
                
                labo.setVelRobto1(rs.getString("velRobto1"));
                labo.setVelRobto2(rs.getString("velRobto2"));
                labo.setVelRobto3(rs.getString("velRobto3"));
                labo.setVelRobto4(rs.getString("velRobto4"));
                labo.setVelRobto5(rs.getString("velRobto5"));
                labo.setVelRobto6(rs.getString("velRobto6"));
                labo.setVelRobto7(rs.getString("velRobto7"));
                labo.setVelRobto8(rs.getString("velRobto8"));
                labo.setVelRobto9(rs.getString("velRobto9"));
                labo.setVelRobto10(rs.getString("velRobto10"));
                labo.setVelRobtoTotal(rs.getString("velRobtoTotal"));
                
                labo.setBoquillaPza1(rs.getString("boquillaPza1"));
                labo.setBoquillaPza2(rs.getString("boquillaPza2"));
                labo.setBoquillaPza3(rs.getString("boquillaPza3"));
                labo.setBoquillaPza4(rs.getString("boquillaPza4"));
                labo.setBoquillaPza5(rs.getString("boquillaPza5"));
                labo.setBoquillaPza6(rs.getString("boquillaPza6"));
                labo.setBoquillaPza7(rs.getString("boquillaPza7"));
                labo.setBoquillaPza8(rs.getString("boquillaPza8"));
                labo.setBoquillaPza9(rs.getString("boquillaPza9"));
                labo.setBoquillaPza10(rs.getString("boquillaPza10"));
                labo.setBoquillaPzaTotal(rs.getString("boquillaPzaTotal"));
                
                labo.setTemperatura1(rs.getString("temperatura1"));
                labo.setTemperatura2(rs.getString("temperatura2"));
                labo.setTemperatura3(rs.getString("temperatura3"));
                labo.setTemperatura4(rs.getString("temperatura4"));
                labo.setTemperatura5(rs.getString("temperatura5"));
                labo.setTemperatura6(rs.getString("temperatura6"));
                labo.setTemperatura7(rs.getString("temperatura7"));
                labo.setTemperatura8(rs.getString("temperatura8"));
                labo.setTemperatura9(rs.getString("temperatura9"));
                labo.setTemperatura10(rs.getString("temperatura10"));
                labo.setTemperaturaTotal(rs.getString("temperaturaTotal"));
                
                labo.setTemporizador1(rs.getString("temporizador1"));
                labo.setTemporizador2(rs.getString("temporizador2"));
                labo.setTemporizador3(rs.getString("temporizador3"));
                labo.setTemporizador4(rs.getString("temporizador4"));
                labo.setTemporizador5(rs.getString("temporizador5"));
                labo.setTemporizador6(rs.getString("temporizador6"));
                labo.setTemporizador7(rs.getString("temporizador7"));
                labo.setTemporizador8(rs.getString("temporizador8"));
                labo.setTemporizador9(rs.getString("temporizador9"));
                labo.setTemporizador10(rs.getString("temporizador10"));
                labo.setTemporizadorTotal(rs.getString("temporizadorTotal"));
                
                labo.setY1(rs.getString("y1"));
                labo.setY2(rs.getString("y2"));
                labo.setY3(rs.getString("y3"));
                labo.setY4(rs.getString("y4"));
                labo.setY5(rs.getString("y5"));
                labo.setY6(rs.getString("y6"));
                labo.setY7(rs.getString("y7"));
                labo.setY8(rs.getString("y8"));
                labo.setY9(rs.getString("y9"));
                labo.setY10(rs.getString("y10"));
                labo.setyTotal(rs.getString("yTotal"));
                
                labo.setZ1(rs.getString("z1"));
                labo.setZ2(rs.getString("z2"));
                labo.setZ3(rs.getString("z3"));
                labo.setZ4(rs.getString("z4"));
                labo.setZ5(rs.getString("z5"));
                labo.setZ6(rs.getString("z6"));
                labo.setZ7(rs.getString("z7"));
                labo.setZ8(rs.getString("z8"));
                labo.setZ9(rs.getString("z9"));
                labo.setZ10(rs.getString("z10"));
                labo.setzTotal(rs.getString("zTotal"));
                
                labo.setAlturaArco1(rs.getString("alturaArco1"));
                labo.setAlturaArco2(rs.getString("alturaArco2"));
                labo.setAlturaArco3(rs.getString("alturaArco3"));
                labo.setAlturaArco4(rs.getString("alturaArco4"));
                labo.setAlturaArco5(rs.getString("alturaArco5"));
                labo.setAlturaArco6(rs.getString("alturaArco6"));
                labo.setAlturaArco7(rs.getString("alturaArco7"));
                labo.setAlturaArco8(rs.getString("alturaArco8"));
                labo.setAlturaArco9(rs.getString("alturaArco9"));
                labo.setAlturaArco10(rs.getString("alturaArco10"));
                labo.setAlturaArcoTotal(rs.getString("alturaArcoTotal"));
                
                labo.setArcoDinamico1(rs.getString("arcoDinamico1"));
                labo.setArcoDinamico2(rs.getString("arcoDinamico2"));
                labo.setArcoDinamico3(rs.getString("arcoDinamico3"));
                labo.setArcoDinamico4(rs.getString("arcoDinamico4"));
                labo.setArcoDinamico5(rs.getString("arcoDinamico5"));
                labo.setArcoDinamico6(rs.getString("arcoDinamico6"));
                labo.setArcoDinamico7(rs.getString("arcoDinamico7"));
                labo.setArcoDinamico8(rs.getString("arcoDinamico8"));
                labo.setArcoDinamico9(rs.getString("arcoDinamico9"));
                labo.setArcoDinamico10(rs.getString("arcoDinamico10"));
                labo.setArcoDinamicoTotal(rs.getString("arcoDinamicoTotal"));
                
                labo.setArcoPulsado1(rs.getString("arcoPulsado1"));
                labo.setArcoPulsado2(rs.getString("arcoPulsado2"));
                labo.setArcoPulsado3(rs.getString("arcoPulsado3"));
                labo.setArcoPulsado4(rs.getString("arcoPulsado4"));
                labo.setArcoPulsado5(rs.getString("arcoPulsado5"));
                labo.setArcoPulsado6(rs.getString("arcoPulsado6"));
                labo.setArcoPulsado7(rs.getString("arcoPulsado7"));
                labo.setArcoPulsado8(rs.getString("arcoPulsado8"));
                labo.setArcoPulsado9(rs.getString("arcoPulsado9"));
                labo.setArcoPulsado10(rs.getString("arcoPulsado10"));
                labo.setArcoPulsadoTotal(rs.getString("arcoPulsadoTotal"));
                
                labo.setPreGas(rs.getString("preGas"));
                labo.setPostGas(rs.getString("postGas"));
                labo.setQuemado(rs.getString("quemado"));
                
                labo.setVelocidadCable1(rs.getString("velocidadCable1"));
                labo.setVelocidadCable2(rs.getString("velocidadCable2"));
                labo.setVelocidadCable3(rs.getString("velocidadCable3"));
                labo.setVelocidadCable4(rs.getString("velocidadCable4"));
                labo.setVelocidadCable5(rs.getString("velocidadCable5"));
                labo.setVelocidadCable6(rs.getString("velocidadCable6"));
                labo.setVelocidadCable7(rs.getString("velocidadCable7"));
                labo.setVelocidadCable8(rs.getString("velocidadCable8"));
                labo.setVelocidadCable9(rs.getString("velocidadCable9"));
                labo.setVelocidadCable10(rs.getString("velocidadCable10"));
                labo.setVelocidadCableTotal(rs.getString("velocidadCableTotal"));
                
                labo.setComentarios(rs.getString("comentarios"));
                
                labo.setReferencias1(rs.getString("referencias1"));
                labo.setReferencias2(rs.getString("referencias2"));
                labo.setReferencias3(rs.getString("referencias3"));
                labo.setReferencias4(rs.getString("referencias4"));
                labo.setReferencias5(rs.getString("referencias5"));
                labo.setReferencias6(rs.getString("referencias6"));
                labo.setReferencias7(rs.getString("referencias7"));
                labo.setReferencias8(rs.getString("referencias8"));
                labo.setReferencias9(rs.getString("referencias9"));
                labo.setReferencias10(rs.getString("referencias10"));
                labo.setReferenciasTotal(rs.getString("referenciasTotal"));
            }

        } catch (Exception e) {
            labo=null;
            e.printStackTrace();
        }
        return labo;
    }
    
    public boolean updateWaam(WaamCabecer Waam) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idWaam = 0;
        try {
            //if (this.validateNumFiche(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche()) != true) {
                idWaam = this.getWaamId(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche());
                //idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE waam SET leySinergica1 = ?, leySinergica2 = ?, leySinergica3 = ?, leySinergica4 = ?, leySinergica5 = ?, leySinergica6 = ?, leySinergica7 = ?, leySinergica8 = ?, leySinergica9 = ?, leySinergica10 = ?, leySinergicaTotal = ?, velRobto1 = ?, velRobto2 = ?, velRobto3 = ?, velRobto4 = ?, velRobto5 = ?, velRobto6 = ?, velRobto7 = ?, velRobto8 = ?, velRobto9 = ?, velRobto10 = ?, velRobtoTotal = ?, boquillaPza1 = ?, boquillaPza2 = ?, boquillaPza3 = ?, boquillaPza4 = ?, boquillaPza5 = ?, boquillaPza6 = ?, boquillaPza7 = ?, boquillaPza8 = ?, boquillaPza9 = ?, boquillaPza10 = ?, boquillaPzaTotal = ?, temperatura1 = ?,"
                        + " temperatura2 = ?, temperatura3 = ?, temperatura4 = ?, temperatura5 = ?, temperatura6 = ?, temperatura7 = ?, temperatura8 = ?, temperatura9 = ?, temperatura10 = ?, temperaturaTotal = ?, temporizador1 = ?, temporizador2 = ?, temporizador3 = ?, temporizador4 = ?, temporizador5 = ?, temporizador6 = ?, temporizador7 = ?, temporizador8 = ?, temporizador9 = ?, temporizador10 = ?, temporizadorTotal = ?, y1 = ?, y2 = ?, y3 = ?, y4 = ?, y5 = ?, y6 = ?, y7 = ?, y8 = ?, y9 = ?, y10 = ?, yTotal = ?, z1 = ?, z2 = ?, z3 = ?, z4 = ?, z5 = ?, z6 = ?, z7 = ?, z8 = ?, z9 = ?, z10 = ?, zTotal = ?, alturaArco1 = ?, alturaArco2 = ?, alturaArco3 = ?, alturaArco4 = ?, alturaArco5 = ?, alturaArco6 = ?, alturaArco7 = ?, alturaArco8 = ?, alturaArco9 = ?, alturaArco10 = ?, alturaArcoTotal = ?, arcoDinamico1 = ?, arcoDinamico2 = ?, arcoDinamico3 = ?, arcoDinamico4 = ?, arcoDinamico5 = ?, arcoDinamico6 = ?, arcoDinamico7 = ?, arcoDinamico8 = ?, arcoDinamico9 = ?, arcoDinamico10 = ?, arcoDinamicoTotal = ?, arcoPulsado1 = ?, arcoPulsado2 = ?, arcoPulsado3 = ?, arcoPulsado4 = ?, arcoPulsado5 = ?, arcoPulsado6 = ?, arcoPulsado7 = ?, arcoPulsado8 = ?, arcoPulsado9 = ?, arcoPulsado10 = ?, arcoPulsadoTotal = ?, preGas = ?, postGas = ?, quemado = ?, velocidadCable1 = ?, velocidadCable2 = ?, velocidadCable3 = ?, velocidadCable4 = ?, velocidadCable5 = ?, velocidadCable6 = ?, velocidadCable7 = ?, velocidadCable8 = ?, velocidadCable9 = ?, velocidadCable10 = ?, velocidadCableTotal = ?, comentarios = ?, referencias1 = ?, referencias2 = ?, referencias3 = ?, referencias4 = ?, referencias5 = ?, referencias6 = ?, referencias7 = ?, referencias8 = ?, referencias9 = ?, referencias10 = ?, referenciasTotal = ? WHERE waam.idWaam=?";

                ps = con.prepareStatement(sql);

                ps.setString(1, Waam.getLeySinergica1()== null ? "" : Waam.getLeySinergica1());
                ps.setString(2, Waam.getLeySinergica2()== null ? "" : Waam.getLeySinergica2());
                ps.setString(3, Waam.getLeySinergica3()== null ? "" : Waam.getLeySinergica3());
                ps.setString(4, Waam.getLeySinergica4()== null ? "" : Waam.getLeySinergica4());
                ps.setString(5, Waam.getLeySinergica5()== null ? "" : Waam.getLeySinergica5());
                ps.setString(6, Waam.getLeySinergica6()== null ? "" : Waam.getLeySinergica6());
                ps.setString(7, Waam.getLeySinergica7()== null ? "" : Waam.getLeySinergica7());
                ps.setString(8, Waam.getLeySinergica8()== null ? "" : Waam.getLeySinergica8());
                ps.setString(9, Waam.getLeySinergica9()== null ? "" : Waam.getLeySinergica9());
                ps.setString(10, Waam.getLeySinergica10()== null ? "" : Waam.getLeySinergica10());
                ps.setString(11, Waam.getLeySinergicaTotal()== null ? "" : Waam.getLeySinergicaTotal());
                ps.setString(12, Waam.getVelRobto1()== null ? "" : Waam.getVelRobto1());
                ps.setString(13, Waam.getVelRobto2()== null ? "" : Waam.getVelRobto2());
                ps.setString(14, Waam.getVelRobto3()== null ? "" : Waam.getVelRobto3());
                ps.setString(15, Waam.getVelRobto4()== null ? "" : Waam.getVelRobto4());
                ps.setString(16, Waam.getVelRobto5()== null ? "" : Waam.getVelRobto5());
                ps.setString(17, Waam.getVelRobto6()== null ? "" : Waam.getVelRobto6());
                ps.setString(18, Waam.getVelRobto7()== null ? "" : Waam.getVelRobto7());
                ps.setString(19, Waam.getVelRobto8()== null ? "" : Waam.getVelRobto8());
                ps.setString(20, Waam.getVelRobto9()== null ? "" : Waam.getVelRobto9());
                ps.setString(21, Waam.getVelRobto10()== null ? "" : Waam.getVelRobto10());
                ps.setString(22, Waam.getVelRobtoTotal()== null ? "" : Waam.getVelRobtoTotal());
                ps.setString(23, Waam.getBoquillaPza1()== null ? "" : Waam.getBoquillaPza1());
                ps.setString(24, Waam.getBoquillaPza2()== null ? "" : Waam.getBoquillaPza2());
                ps.setString(25, Waam.getBoquillaPza3()== null ? "" : Waam.getBoquillaPza3());
                ps.setString(26, Waam.getBoquillaPza4()== null ? "" : Waam.getBoquillaPza4());
                ps.setString(27, Waam.getBoquillaPza5()== null ? "" : Waam.getBoquillaPza5());
                ps.setString(28, Waam.getBoquillaPza6()== null ? "" : Waam.getBoquillaPza6());
                ps.setString(29, Waam.getBoquillaPza7()== null ? "" : Waam.getBoquillaPza7());
                ps.setString(30, Waam.getBoquillaPza8()== null ? "" : Waam.getBoquillaPza8());
                ps.setString(31, Waam.getBoquillaPza9()== null ? "" : Waam.getBoquillaPza9());
                ps.setString(32, Waam.getBoquillaPza10()== null ? "" : Waam.getBoquillaPza10());
                ps.setString(33, Waam.getBoquillaPzaTotal()== null ? "" : Waam.getBoquillaPzaTotal());
                ps.setString(34, Waam.getTemperatura1()== null ? "" : Waam.getTemperatura1());
                ps.setString(35, Waam.getTemperatura2()== null ? "" : Waam.getTemperatura2());
                ps.setString(36, Waam.getTemperatura3()== null ? "" : Waam.getTemperatura3());
                ps.setString(37, Waam.getTemperatura4()== null ? "" : Waam.getTemperatura4());
                ps.setString(38, Waam.getTemperatura5()== null ? "" : Waam.getTemperatura5());
                ps.setString(39, Waam.getTemperatura6()== null ? "" : Waam.getTemperatura6());
                ps.setString(40, Waam.getTemperatura7()== null ? "" : Waam.getTemperatura7());
                ps.setString(41, Waam.getTemperatura8()== null ? "" : Waam.getTemperatura8());
                ps.setString(42, Waam.getTemperatura9()== null ? "" : Waam.getTemperatura9());
                ps.setString(43, Waam.getTemperatura10()== null ? "" : Waam.getTemperatura10());
                ps.setString(44, Waam.getTemperaturaTotal()== null ? "" : Waam.getTemperaturaTotal());
                ps.setString(45, Waam.getTemporizador1()== null ? "" : Waam.getTemporizador1());
                ps.setString(46, Waam.getTemporizador2()== null ? "" : Waam.getTemporizador2());
                ps.setString(47, Waam.getTemporizador3()== null ? "" : Waam.getTemporizador3());
                ps.setString(48, Waam.getTemporizador4()== null ? "" : Waam.getTemporizador4());
                ps.setString(49, Waam.getTemporizador5()== null ? "" : Waam.getTemporizador5());
                ps.setString(50, Waam.getTemporizador6()== null ? "" : Waam.getTemporizador6());
                ps.setString(51, Waam.getTemporizador7()== null ? "" : Waam.getTemporizador7());
                ps.setString(52, Waam.getTemporizador8()== null ? "" : Waam.getTemporizador8());
                ps.setString(53, Waam.getTemporizador9()== null ? "" : Waam.getTemporizador9());
                ps.setString(54, Waam.getTemporizador9()== null ? "" : Waam.getTemporizador9());
                ps.setString(55, Waam.getTemporizadorTotal()== null ? "" : Waam.getTemporizadorTotal());
                ps.setString(56, Waam.getY1()== null ? "" : Waam.getY1());
                ps.setString(57, Waam.getY2()== null ? "" : Waam.getY2());
                ps.setString(58, Waam.getY3()== null ? "" : Waam.getY3());
                ps.setString(59, Waam.getY4()== null ? "" : Waam.getY4());
                ps.setString(60, Waam.getY5()== null ? "" : Waam.getY5());
                ps.setString(61, Waam.getY6()== null ? "" : Waam.getY6());
                ps.setString(62, Waam.getY7()== null ? "" : Waam.getY7());
                ps.setString(63, Waam.getY8()== null ? "" : Waam.getY8());
                ps.setString(64, Waam.getY9()== null ? "" : Waam.getY9());
                ps.setString(65, Waam.getY10()== null ? "" : Waam.getY10());
                ps.setString(66, Waam.getyTotal()== null ? "" : Waam.getyTotal());
                ps.setString(67, Waam.getZ1()== null ? "" : Waam.getZ1());
                ps.setString(68, Waam.getZ2()== null ? "" : Waam.getZ2());
                ps.setString(69, Waam.getZ3()== null ? "" : Waam.getZ3());
                ps.setString(70, Waam.getZ4()== null ? "" : Waam.getZ4());
                ps.setString(71, Waam.getZ5()== null ? "" : Waam.getZ5());
                ps.setString(72, Waam.getZ6()== null ? "" : Waam.getZ6());
                ps.setString(73, Waam.getZ7()== null ? "" : Waam.getZ7());
                ps.setString(74, Waam.getZ8()== null ? "" : Waam.getZ8());
                ps.setString(75, Waam.getZ9()== null ? "" : Waam.getZ9());
                ps.setString(76, Waam.getZ10()== null ? "" : Waam.getZ10());
                ps.setString(77, Waam.getzTotal()== null ? "" : Waam.getzTotal());
                ps.setString(78, Waam.getAlturaArco1()== null ? "" : Waam.getAlturaArco1());
                ps.setString(79, Waam.getAlturaArco2()== null ? "" : Waam.getAlturaArco2());
                ps.setString(80, Waam.getAlturaArco3()== null ? "" : Waam.getAlturaArco3());
                ps.setString(81, Waam.getAlturaArco4()== null ? "" : Waam.getAlturaArco4());
                ps.setString(82, Waam.getAlturaArco5()== null ? "" : Waam.getAlturaArco5());
                ps.setString(83, Waam.getAlturaArco6()== null ? "" : Waam.getAlturaArco6());
                ps.setString(84, Waam.getAlturaArco7()== null ? "" : Waam.getAlturaArco7());
                ps.setString(85, Waam.getAlturaArco8()== null ? "" : Waam.getAlturaArco8());
                ps.setString(86, Waam.getAlturaArco9()== null ? "" : Waam.getAlturaArco9());
                ps.setString(87, Waam.getAlturaArco10()== null ? "" : Waam.getAlturaArco10());
                ps.setString(88, Waam.getAlturaArcoTotal()== null ? "" : Waam.getAlturaArcoTotal());
                ps.setString(89, Waam.getArcoDinamico1()== null ? "" : Waam.getArcoDinamico1());
                ps.setString(90, Waam.getArcoDinamico2()== null ? "" : Waam.getArcoDinamico2());
                ps.setString(91, Waam.getArcoDinamico3()== null ? "" : Waam.getArcoDinamico3());
                ps.setString(92, Waam.getArcoDinamico4()== null ? "" : Waam.getArcoDinamico4());
                ps.setString(93, Waam.getArcoDinamico5()== null ? "" : Waam.getArcoDinamico5());
                ps.setString(94, Waam.getArcoDinamico6()== null ? "" : Waam.getArcoDinamico6());
                ps.setString(95, Waam.getArcoDinamico7()== null ? "" : Waam.getArcoDinamico7());
                ps.setString(96, Waam.getArcoDinamico8()== null ? "" : Waam.getArcoDinamico8());
                ps.setString(97, Waam.getArcoDinamico9()== null ? "" : Waam.getArcoDinamico9());
                ps.setString(98, Waam.getArcoDinamico10()== null ? "" : Waam.getArcoDinamico10());
                ps.setString(99, Waam.getArcoDinamicoTotal()== null ? "" : Waam.getArcoDinamicoTotal());
                ps.setString(100, Waam.getArcoPulsado1()== null ? "" : Waam.getArcoPulsado1());
                ps.setString(101, Waam.getArcoPulsado2()== null ? "" : Waam.getArcoPulsado2());
                ps.setString(102, Waam.getArcoPulsado3()== null ? "" : Waam.getArcoPulsado3());
                ps.setString(103, Waam.getArcoPulsado4()== null ? "" : Waam.getArcoPulsado4());
                ps.setString(104, Waam.getArcoPulsado5()== null ? "" : Waam.getArcoPulsado5());
                ps.setString(105, Waam.getArcoPulsado6()== null ? "" : Waam.getArcoPulsado6());
                ps.setString(106, Waam.getArcoPulsado7()== null ? "" : Waam.getArcoPulsado7());
                ps.setString(107, Waam.getArcoPulsado8()== null ? "" : Waam.getArcoPulsado8());
                ps.setString(108, Waam.getArcoPulsado9()== null ? "" : Waam.getArcoPulsado9());
                ps.setString(109, Waam.getArcoPulsado10()== null ? "" : Waam.getArcoPulsado10());
                ps.setString(110, Waam.getArcoPulsadoTotal()== null ? "" : Waam.getArcoPulsadoTotal());
                ps.setString(111, Waam.getPreGas()== null ? "" : Waam.getPreGas());
                ps.setString(112, Waam.getPostGas()== null ? "" : Waam.getPostGas());
                ps.setString(113, Waam.getQuemado()== null ? "" : Waam.getQuemado());
                ps.setString(114, Waam.getVelocidadCable1()== null ? "" : Waam.getVelocidadCable1());
                ps.setString(115, Waam.getVelocidadCable2()== null ? "" : Waam.getVelocidadCable2());
                ps.setString(116, Waam.getVelocidadCable3()== null ? "" : Waam.getVelocidadCable3());
                ps.setString(117, Waam.getVelocidadCable4()== null ? "" : Waam.getVelocidadCable4());
                ps.setString(118, Waam.getVelocidadCable5()== null ? "" : Waam.getVelocidadCable5());
                ps.setString(119, Waam.getVelocidadCable6()== null ? "" : Waam.getVelocidadCable6());
                ps.setString(120, Waam.getVelocidadCable7()== null ? "" : Waam.getVelocidadCable7());
                ps.setString(121, Waam.getVelocidadCable8()== null ? "" : Waam.getVelocidadCable8());
                ps.setString(122, Waam.getVelocidadCable9()== null ? "" : Waam.getVelocidadCable9());
                ps.setString(123, Waam.getVelocidadCable10()== null ? "" : Waam.getVelocidadCable10());
                ps.setString(124, Waam.getVelocidadCableTotal()== null ? "" : Waam.getVelocidadCableTotal());
                ps.setString(125, Waam.getComentarios()== null ? "" : Waam.getComentarios());
                ps.setString(126, Waam.getReferencias1()== null ? "" : Waam.getReferencias1());
                ps.setString(127, Waam.getReferencias2()== null ? "" : Waam.getReferencias2());
                ps.setString(128, Waam.getReferencias3()== null ? "" : Waam.getReferencias3());
                ps.setString(129, Waam.getReferencias4()== null ? "" : Waam.getReferencias4());
                ps.setString(130, Waam.getReferencias5()== null ? "" : Waam.getReferencias5());
                ps.setString(131, Waam.getReferencias6()== null ? "" : Waam.getReferencias6());
                ps.setString(132, Waam.getReferencias7()== null ? "" : Waam.getReferencias7());
                ps.setString(133, Waam.getReferencias8()== null ? "" : Waam.getReferencias8());
                ps.setString(134, Waam.getReferencias9()== null ? "" : Waam.getReferencias9());
                ps.setString(135, Waam.getReferencias10()== null ? "" : Waam.getReferencias10());
                ps.setString(136, Waam.getReferenciasTotal()== null ? "" : Waam.getReferenciasTotal());
                ps.setInt(137, idWaam);

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
    
    /*
    Eliminar
    public boolean deleteWaam(String nameWaam) {

        Connection con = getConexion();
        boolean delete=false;
        int rs = 0;
        int idWaam=0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.waam where idWaam=?";
        int id = 0;
        try {
            idWaam=this.getWaamId(nameWaam);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idWaam);
            rs = ps.executeUpdate();

            if (rs>0) {
                delete=true;
            }else{
                delete=false;
                System.out.println("No se elimino");
            }

        } catch (Exception e) {

            return delete;
        }

        return delete;
    }
    */
}
