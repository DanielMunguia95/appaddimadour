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
public class QueryWaam extends Connexion{
    
    //BIEN
    public boolean saveWaam(WaamCabecer waam) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        boolean existNameWaam = false;

        try {
            existNameWaam = this.validateNumFiche(waam.getNumeroFiche()== null ? "" : waam.getNumeroFiche());

            if (existNameWaam != true) {
                
                String sql = "INSERT INTO waam(date, heure, machine, numeroFiche, numeroCaso, numeroPlaca, refMateriales, preProceso, metas, opeVerificacion, llenGas, operador, materiales, tamClave, tamSustrato, tamHabutacion, croquis, leySinergica1, leySinergica2, leySinergica3, leySinergica4, leySinergica5, leySinergica6, leySinergica7, leySinergica8, leySinergica9, leySinergica10, leySinergicaTotal, velRobto1, velRobto2, velRobto3, velRobto4, velRobto5, velRobto6, velRobto7, velRobto8, velRobto9, velRobto10, velRobtoTotal, boquillaPza1, boquillaPza2, boquillaPza3, boquillaPza4, boquillaPza5, boquillaPza6, boquillaPza7, boquillaPza8, boquillaPza9, boquillaPza10, boquillaPzaTotal, temperatura1, temperatura2, temperatura3, temperatura4, temperatura5, temperatura6, temperatura7, temperatura8, temperatura9, temperatura10, temperaturaTotal, temporizador1, temporizador2, temporizador3, temporizador4, temporizador5, temporizador6, temporizador7, temporizador8, temporizador9, temporizador10, temporizadorTotal, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, yTotal, z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, zTotal, alturaArco1, alturaArco2, alturaArco3, alturaArco4, alturaArco5, alturaArco6, alturaArco7, alturaArco8, alturaArco9, alturaArco10, alturaArcoTotal, arcoDinamico1, arcoDinamico2, arcoDinamico3, arcoDinamico4, arcoDinamico5, arcoDinamico6, arcoDinamico7, arcoDinamico8, arcoDinamico9, arcoDinamico10, arcoDinamicoTotal, arcoPulsado1, arcoPulsado2, arcoPulsado3, arcoPulsado4, arcoPulsado5, arcoPulsado6, arcoPulsado7, arcoPulsado8, arcoPulsado9, arcoPulsado10, arcoPulsadoTotal, preGas, postGas, quemado, velocidadCable1, velocidadCable2, velocidadCable3, velocidadCable4, velocidadCable5, velocidadCable6, velocidadCable7, velocidadCable8, velocidadCable9, velocidadCable10, velocidadCableTotal, comentarios, referencias1, referencias2, referencias3, referencias4, referencias5, referencias6, referencias7, referencias8, referencias9, referencias10, referenciasTotal, tratamientoTermico, mecanizado, resultados)"
                        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                ps = con.prepareStatement(sql);

                ps.setString(1, waam.getDate()== null ? "" : waam.getDate());
                ps.setString(2, waam.getHeure()== null ? "" : waam.getHeure());
                ps.setString(3, waam.getMachine()== null ? "" : waam.getMachine());
                ps.setString(4, waam.getNumeroFiche()== null ? "" : waam.getNumeroFiche());
                ps.setString(5, waam.getNumeroCaso()== null ? "" : waam.getNumeroCaso());
                ps.setString(6, waam.getNumeroPlaca()== null ? "" : waam.getNumeroPlaca());
                ps.setString(7, waam.getRefMateriales()== null ? "" : waam.getRefMateriales());
                ps.setString(8, waam.getPreProceso()== null ? "" : waam.getPreProceso());
                ps.setString(9, waam.getMetas()== null ? "" : waam.getMetas());
                ps.setString(10, waam.getOpeVerificacion()== null ? "" : waam.getOpeVerificacion());
                ps.setString(11, waam.getLlenGas()== null ? "" : waam.getLlenGas());
                ps.setString(12, waam.getOperador()== null ? "" : waam.getOperador());
                ps.setString(13, waam.getMaterial()== null ? "" : waam.getMaterial());
                ps.setString(14, waam.getTamClave()== null ? "" : waam.getTamClave());
                ps.setString(15, waam.getTamSustrato()== null ? "" : waam.getTamSustrato());
                ps.setString(16, waam.getTamHabitacion()== null ? "" : waam.getTamHabitacion());
                ps.setString(17, waam.getCroquis()== null ? "" : waam.getCroquis());
                //PARAMETROS
                ps.setString(18, waam.getLeySinergica1()== null ? "" : waam.getLeySinergica1());
                ps.setString(19, waam.getLeySinergica2()== null ? "" : waam.getLeySinergica2());
                ps.setString(20, waam.getLeySinergica3()== null ? "" : waam.getLeySinergica3());
                ps.setString(21, waam.getLeySinergica4()== null ? "" : waam.getLeySinergica4());
                ps.setString(22, waam.getLeySinergica5()== null ? "" : waam.getLeySinergica5());
                ps.setString(23, waam.getLeySinergica6()== null ? "" : waam.getLeySinergica6());
                ps.setString(24, waam.getLeySinergica7()== null ? "" : waam.getLeySinergica7());
                ps.setString(25, waam.getLeySinergica8()== null ? "" : waam.getLeySinergica8());
                ps.setString(26, waam.getLeySinergica9()== null ? "" : waam.getLeySinergica9());
                ps.setString(27, waam.getLeySinergica10()== null ? "" : waam.getLeySinergica10());
                ps.setString(28, waam.getLeySinergicaTotal()== null ? "" : waam.getLeySinergicaTotal());
                ps.setString(29, waam.getVelRobto1()== null ? "" : waam.getVelRobto1());
                ps.setString(30, waam.getVelRobto2()== null ? "" : waam.getVelRobto2());
                ps.setString(31, waam.getVelRobto3()== null ? "" : waam.getVelRobto3());
                ps.setString(32, waam.getVelRobto4()== null ? "" : waam.getVelRobto4());
                ps.setString(33, waam.getVelRobto5()== null ? "" : waam.getVelRobto5());
                ps.setString(34, waam.getVelRobto6()== null ? "" : waam.getVelRobto6());
                ps.setString(35, waam.getVelRobto7()== null ? "" : waam.getVelRobto7());
                ps.setString(36, waam.getVelRobto8()== null ? "" : waam.getVelRobto8());
                ps.setString(37, waam.getVelRobto9()== null ? "" : waam.getVelRobto9());
                ps.setString(38, waam.getVelRobto10()== null ? "" : waam.getVelRobto10());
                ps.setString(39, waam.getVelRobtoTotal()== null ? "" : waam.getVelRobtoTotal());
                ps.setString(40, waam.getBoquillaPza1()== null ? "" : waam.getBoquillaPza1());
                ps.setString(41, waam.getBoquillaPza2()== null ? "" : waam.getBoquillaPza2());
                ps.setString(42, waam.getBoquillaPza3()== null ? "" : waam.getBoquillaPza3());
                ps.setString(43, waam.getBoquillaPza4()== null ? "" : waam.getBoquillaPza4());
                ps.setString(44, waam.getBoquillaPza5()== null ? "" : waam.getBoquillaPza5());
                ps.setString(45, waam.getBoquillaPza6()== null ? "" : waam.getBoquillaPza6());
                ps.setString(46, waam.getBoquillaPza7()== null ? "" : waam.getBoquillaPza7());
                ps.setString(47, waam.getBoquillaPza8()== null ? "" : waam.getBoquillaPza8());
                ps.setString(48, waam.getBoquillaPza9()== null ? "" : waam.getBoquillaPza9());
                ps.setString(49, waam.getBoquillaPza10()== null ? "" : waam.getBoquillaPza10());
                ps.setString(50, waam.getBoquillaPzaTotal()== null ? "" : waam.getBoquillaPzaTotal());
                ps.setString(51, waam.getTemperatura1()== null ? "" : waam.getTemperatura1());
                ps.setString(52, waam.getTemperatura2()== null ? "" : waam.getTemperatura2());
                ps.setString(53, waam.getTemperatura3()== null ? "" : waam.getTemperatura3());
                ps.setString(54, waam.getTemperatura4()== null ? "" : waam.getTemperatura4());
                ps.setString(55, waam.getTemperatura5()== null ? "" : waam.getTemperatura5());
                ps.setString(56, waam.getTemperatura6()== null ? "" : waam.getTemperatura6());
                ps.setString(57, waam.getTemperatura7()== null ? "" : waam.getTemperatura7());
                ps.setString(58, waam.getTemperatura8()== null ? "" : waam.getTemperatura8());
                ps.setString(59, waam.getTemperatura9()== null ? "" : waam.getTemperatura9());
                ps.setString(60, waam.getTemperatura10()== null ? "" : waam.getTemperatura10());
                ps.setString(61, waam.getTemperaturaTotal()== null ? "" : waam.getTemperaturaTotal());
                ps.setString(62, waam.getTemporizador1()== null ? "" : waam.getTemporizador1());
                ps.setString(63, waam.getTemporizador2()== null ? "" : waam.getTemporizador2());
                ps.setString(64, waam.getTemporizador3()== null ? "" : waam.getTemporizador3());
                ps.setString(65, waam.getTemporizador4()== null ? "" : waam.getTemporizador4());
                ps.setString(66, waam.getTemporizador5()== null ? "" : waam.getTemporizador5());
                ps.setString(67, waam.getTemporizador6()== null ? "" : waam.getTemporizador6());
                ps.setString(68, waam.getTemporizador7()== null ? "" : waam.getTemporizador7());
                ps.setString(69, waam.getTemporizador8()== null ? "" : waam.getTemporizador8());
                ps.setString(70, waam.getTemporizador9()== null ? "" : waam.getTemporizador9());
                ps.setString(71, waam.getTemporizador9()== null ? "" : waam.getTemporizador9());
                ps.setString(72, waam.getTemporizadorTotal()== null ? "" : waam.getTemporizadorTotal());
                ps.setString(73, waam.getY1()== null ? "" : waam.getY1());
                ps.setString(74, waam.getY2()== null ? "" : waam.getY2());
                ps.setString(75, waam.getY3()== null ? "" : waam.getY3());
                ps.setString(76, waam.getY4()== null ? "" : waam.getY4());
                ps.setString(77, waam.getY5()== null ? "" : waam.getY5());
                ps.setString(78, waam.getY6()== null ? "" : waam.getY6());
                ps.setString(79, waam.getY7()== null ? "" : waam.getY7());
                ps.setString(80, waam.getY8()== null ? "" : waam.getY8());
                ps.setString(81, waam.getY9()== null ? "" : waam.getY9());
                ps.setString(82, waam.getY10()== null ? "" : waam.getY10());
                ps.setString(83, waam.getyTotal()== null ? "" : waam.getyTotal());
                ps.setString(84, waam.getZ1()== null ? "" : waam.getZ1());
                ps.setString(85, waam.getZ2()== null ? "" : waam.getZ2());
                ps.setString(86, waam.getZ3()== null ? "" : waam.getZ3());
                ps.setString(87, waam.getZ4()== null ? "" : waam.getZ4());
                ps.setString(88, waam.getZ5()== null ? "" : waam.getZ5());
                ps.setString(89, waam.getZ6()== null ? "" : waam.getZ6());
                ps.setString(90, waam.getZ7()== null ? "" : waam.getZ7());
                ps.setString(91, waam.getZ8()== null ? "" : waam.getZ8());
                ps.setString(92, waam.getZ9()== null ? "" : waam.getZ9());
                ps.setString(93, waam.getZ10()== null ? "" : waam.getZ10());
                ps.setString(94, waam.getzTotal()== null ? "" : waam.getzTotal());
                ps.setString(95, waam.getAlturaArco1()== null ? "" : waam.getAlturaArco1());
                ps.setString(96, waam.getAlturaArco2()== null ? "" : waam.getAlturaArco2());
                ps.setString(97, waam.getAlturaArco3()== null ? "" : waam.getAlturaArco3());
                ps.setString(98, waam.getAlturaArco4()== null ? "" : waam.getAlturaArco4());
                ps.setString(99, waam.getAlturaArco5()== null ? "" : waam.getAlturaArco5());
                ps.setString(100, waam.getAlturaArco6()== null ? "" : waam.getAlturaArco6());
                ps.setString(101, waam.getAlturaArco7()== null ? "" : waam.getAlturaArco7());
                ps.setString(102, waam.getAlturaArco8()== null ? "" : waam.getAlturaArco8());
                ps.setString(103, waam.getAlturaArco9()== null ? "" : waam.getAlturaArco9());
                ps.setString(104, waam.getAlturaArco10()== null ? "" : waam.getAlturaArco10());
                ps.setString(105, waam.getAlturaArcoTotal()== null ? "" : waam.getAlturaArcoTotal());
                ps.setString(106, waam.getArcoDinamico1()== null ? "" : waam.getArcoDinamico1());
                ps.setString(107, waam.getArcoDinamico2()== null ? "" : waam.getArcoDinamico2());
                ps.setString(108, waam.getArcoDinamico3()== null ? "" : waam.getArcoDinamico3());
                ps.setString(109, waam.getArcoDinamico4()== null ? "" : waam.getArcoDinamico4());
                ps.setString(110, waam.getArcoDinamico5()== null ? "" : waam.getArcoDinamico5());
                ps.setString(111, waam.getArcoDinamico6()== null ? "" : waam.getArcoDinamico6());
                ps.setString(112, waam.getArcoDinamico7()== null ? "" : waam.getArcoDinamico7());
                ps.setString(113, waam.getArcoDinamico8()== null ? "" : waam.getArcoDinamico8());
                ps.setString(114, waam.getArcoDinamico9()== null ? "" : waam.getArcoDinamico9());
                ps.setString(115, waam.getArcoDinamico10()== null ? "" : waam.getArcoDinamico10());
                ps.setString(116, waam.getArcoDinamicoTotal()== null ? "" : waam.getArcoDinamicoTotal());
                ps.setString(117, waam.getArcoPulsado1()== null ? "" : waam.getArcoPulsado1());
                ps.setString(118, waam.getArcoPulsado2()== null ? "" : waam.getArcoPulsado2());
                ps.setString(119, waam.getArcoPulsado3()== null ? "" : waam.getArcoPulsado3());
                ps.setString(120, waam.getArcoPulsado4()== null ? "" : waam.getArcoPulsado4());
                ps.setString(121, waam.getArcoPulsado5()== null ? "" : waam.getArcoPulsado5());
                ps.setString(122, waam.getArcoPulsado6()== null ? "" : waam.getArcoPulsado6());
                ps.setString(123, waam.getArcoPulsado7()== null ? "" : waam.getArcoPulsado7());
                ps.setString(124, waam.getArcoPulsado8()== null ? "" : waam.getArcoPulsado8());
                ps.setString(125, waam.getArcoPulsado9()== null ? "" : waam.getArcoPulsado9());
                ps.setString(126, waam.getArcoPulsado10()== null ? "" : waam.getArcoPulsado10());
                ps.setString(127, waam.getArcoPulsadoTotal()== null ? "" : waam.getArcoPulsadoTotal());
                ps.setString(128, waam.getPreGas()== null ? "" : waam.getPreGas());
                ps.setString(129, waam.getPostGas()== null ? "" : waam.getPostGas());
                ps.setString(130, waam.getQuemado()== null ? "" : waam.getQuemado());
                ps.setString(131, waam.getVelocidadCable1()== null ? "" : waam.getVelocidadCable1());
                ps.setString(132, waam.getVelocidadCable2()== null ? "" : waam.getVelocidadCable2());
                ps.setString(133, waam.getVelocidadCable3()== null ? "" : waam.getVelocidadCable3());
                ps.setString(134, waam.getVelocidadCable4()== null ? "" : waam.getVelocidadCable4());
                ps.setString(135, waam.getVelocidadCable5()== null ? "" : waam.getVelocidadCable5());
                ps.setString(136, waam.getVelocidadCable6()== null ? "" : waam.getVelocidadCable6());
                ps.setString(137, waam.getVelocidadCable7()== null ? "" : waam.getVelocidadCable7());
                ps.setString(138, waam.getVelocidadCable8()== null ? "" : waam.getVelocidadCable8());
                ps.setString(139, waam.getVelocidadCable9()== null ? "" : waam.getVelocidadCable9());
                ps.setString(140, waam.getVelocidadCable10()== null ? "" : waam.getVelocidadCable10());
                ps.setString(141, waam.getVelocidadCableTotal()== null ? "" : waam.getVelocidadCableTotal());
                ps.setString(142, waam.getComentarios()== null ? "" : waam.getComentarios());
                ps.setString(143, waam.getReferencias1()== null ? "" : waam.getReferencias1());
                ps.setString(144, waam.getReferencias2()== null ? "" : waam.getReferencias2());
                ps.setString(145, waam.getReferencias3()== null ? "" : waam.getReferencias3());
                ps.setString(146, waam.getReferencias4()== null ? "" : waam.getReferencias4());
                ps.setString(147, waam.getReferencias5()== null ? "" : waam.getReferencias5());
                ps.setString(148, waam.getReferencias6()== null ? "" : waam.getReferencias6());
                ps.setString(149, waam.getReferencias7()== null ? "" : waam.getReferencias7());
                ps.setString(150, waam.getReferencias8()== null ? "" : waam.getReferencias8());
                ps.setString(151, waam.getReferencias9()== null ? "" : waam.getReferencias9());
                ps.setString(152, waam.getReferencias10()== null ? "" : waam.getReferencias10());
                ps.setString(153, waam.getReferenciasTotal()== null ? "" : waam.getReferenciasTotal());
                
                //PIE
                ps.setString(154, waam.getTratamientoTermico()== null ? "" : waam.getTratamientoTermico());
                ps.setString(155, waam.getMecanizado()== null ? "" : waam.getMecanizado());
                ps.setString(156, waam.getResultados()== null ? "" : waam.getResultados());

                int iInsCnt = ps.executeUpdate();
                if (iInsCnt > 0) {
                    System.out.println("Insert Success");
                    return rs=true;
                } else {
                    System.out.println("Insert Fail");
                    return rs=false;
                }
            } else {
                System.out.println("ya existe un registro con ese num fiche");
            }

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
        return rs;
    }
    
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

    public WaamCabecer getWaam(String idWaam) {
        WaamCabecer labo = new WaamCabecer();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select date, heure, machine, numeroFiche, numeroCaso, numeroPlaca, refMateriales, preProceso,"
                + "metas, opeVerificacion, llenGas, operador, materiales, tamClave, tamSustrato, tamHabutacion, croquis from appaddimadour.waam where numeroFiche=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idWaam);

            rs = ps.executeQuery();

            if (rs.next()) {
                labo.setDate(rs.getString("date"));
                labo.setHeure(rs.getString("heure"));
                labo.setMachine(rs.getString("machine"));
                labo.setNumeroFiche(rs.getString("numeroFiche"));
                labo.setNumeroCaso(rs.getString("numeroCaso"));
                labo.setNumeroPlaca(rs.getString("numeroPlaca"));
                labo.setRefMateriales(rs.getString("refMateriales"));
                labo.setPreProceso(rs.getString("preProceso"));
                labo.setMetas(rs.getString("metas"));
                labo.setOpeVerificacion(rs.getString("opeVerificacion"));
                labo.setLlenGas(rs.getString("llenGas"));
                labo.setOperador(rs.getString("operador"));
                labo.setMaterial(rs.getString("materiales"));
                labo.setTamClave(rs.getString("tamClave"));
                labo.setTamSustrato(rs.getString("tamSustrato"));
                labo.setTamHabitacion(rs.getString("tamHabutacion"));
                labo.setCroquis(rs.getString("croquis"));

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
                String sql = "UPDATE appaddimadour.waam SET date=?, heure=?, machine=?, numeroFiche=?, numeroCaso=?, numeroPlaca=?, refMateriales=?, preProceso=?, metas=?, opeVerificacion=?,"
                        + "llenGas=?, operador=?, materiales=?, tamClave=?, tamSustrato=?, tamHabutacion=?, croquis=? WHERE idWaam=?";

                ps = con.prepareStatement(sql);

                ps.setString(1, Waam.getDate());
                ps.setString(2, Waam.getHeure());
                ps.setString(3, Waam.getMachine());
                ps.setString(4, Waam.getNumeroFiche());
                ps.setString(5, Waam.getNumeroCaso());
                ps.setString(6, Waam.getNumeroPlaca());
                ps.setString(7, Waam.getRefMateriales());
                ps.setString(8, Waam.getPreProceso());
                ps.setString(9, Waam.getMetas());
                ps.setString(10, Waam.getOpeVerificacion());
                ps.setString(11, Waam.getLlenGas());
                ps.setString(12, Waam.getOperador());
                ps.setString(13, Waam.getMaterial());
                ps.setString(14, Waam.getTamClave());
                ps.setString(15, Waam.getTamSustrato());
                ps.setString(16, Waam.getTamHabitacion());
                ps.setString(17, Waam.getCroquis());
                ps.setInt(18, idWaam);

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
}
