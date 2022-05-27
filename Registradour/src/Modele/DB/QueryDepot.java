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
public class QueryDepot extends Connexion{
    //BIEN
    public boolean saveDepot(depotCabecer depot) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        boolean existNameDepot = false;

        try {
            existNameDepot = this.validateNumFiche(depot.getNumeroFiche()== null ? "" : depot.getNumeroFiche());

            if (existNameDepot != true) {
                
                String sql = "INSERT INTO depot(date, heure, machine, numeroFiche, numeroCaso, numeroPlaca, refMateriales, preProceso, metas, opeVerificacion, llenGas, operador, materiales, tamClave, tamSustrato, tamHabutacion, croquis, leySinergica1, leySinergica2, leySinergica3, leySinergica4, leySinergica5, leySinergica6, leySinergica7, leySinergica8, leySinergica9, leySinergica10, leySinergicaTotal, velRobto1, velRobto2, velRobto3, velRobto4, velRobto5, velRobto6, velRobto7, velRobto8, velRobto9, velRobto10, velRobtoTotal, boquillaPza1, boquillaPza2, boquillaPza3, boquillaPza4, boquillaPza5, boquillaPza6, boquillaPza7, boquillaPza8, boquillaPza9, boquillaPza10, boquillaPzaTotal, temperatura1, temperatura2, temperatura3, temperatura4, temperatura5, temperatura6, temperatura7, temperatura8, temperatura9, temperatura10, temperaturaTotal, temporizador1, temporizador2, temporizador3, temporizador4, temporizador5, temporizador6, temporizador7, temporizador8, temporizador9, temporizador10, temporizadorTotal, potenciaLaser1, potenciaLaser2, potenciaLaser3, potenciaLaser4, potenciaLaser5, potenciaLaser6, potenciaLaser7, potenciaLaser8, potenciaLaser9, potenciaLaser10, potenciaLaserTotal, velocidadCable1, velocidadCable2, velocidadCable3, velocidadCable4, velocidadCable5, velocidadCable6, velocidadCable7, velocidadCable8, velocidadCable9, velocidadCable10, velocidadCableTotal, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, yTotal, z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, zTotal, patronEscaneo1, patronEscaneo2, patronEscaneo3, patronEscaneo4, patronEscaneo5, patronEscaneo6, patronEscaneo7, patronEscaneo8, patronEscaneo9, patronEscaneo10, patronEscaneoTotal, largo1, largo2, largo3, largo4, largo5, largo6, largo7, largo8, largo9, largo10, largoTotal, altura1, altura2, altura3, altura4, altura5, altura6, altura7, altura8, altura9, altura0, alturaTotal, comentarios, referencias1, referencias2, referencias3, referencias4, referencias5, referencias6, referencias7, referencias8, referencias9, referencias10, referenciasTotal, tratamientoTermico, mecanizado, resultados)"
                        + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                ps = con.prepareStatement(sql);

                ps.setString(1, depot.getDate()== null ? "" : depot.getDate());
                ps.setString(2, depot.getHeure()== null ? "" : depot.getHeure());
                ps.setString(3, depot.getMachine()== null ? "" : depot.getMachine());
                ps.setString(4, depot.getNumeroFiche()== null ? "" : depot.getNumeroFiche());
                ps.setString(5, depot.getNumeroCaso()== null ? "" : depot.getNumeroCaso());
                ps.setString(6, depot.getNumeroPlaca()== null ? "" : depot.getNumeroPlaca());
                ps.setString(7, depot.getRefMateriales()== null ? "" : depot.getRefMateriales());
                ps.setString(8, depot.getPreProceso()== null ? "" : depot.getPreProceso());
                ps.setString(9, depot.getMetas()== null ? "" : depot.getMetas());
                ps.setString(10, depot.getOpeVerificacion()== null ? "" : depot.getOpeVerificacion());
                ps.setString(11, depot.getLlenGas()== null ? "" : depot.getLlenGas());
                ps.setString(12, depot.getOperador()== null ? "" : depot.getOperador());
                ps.setString(13, depot.getMaterial()== null ? "" : depot.getMaterial());
                ps.setString(14, depot.getTamClave()== null ? "" : depot.getTamClave());
                ps.setString(15, depot.getTamSustrato()== null ? "" : depot.getTamSustrato());
                ps.setString(16, depot.getTamHabitacion()== null ? "" : depot.getTamHabitacion());
                ps.setString(17, depot.getCroquis()== null ? "" : depot.getCroquis());
                //PARAMETROS
                ps.setString(18, depot.getLeySinergica1()== null ? "" : depot.getLeySinergica1());
                ps.setString(19, depot.getLeySinergica2()== null ? "" : depot.getLeySinergica2());
                ps.setString(20, depot.getLeySinergica3()== null ? "" : depot.getLeySinergica3());
                ps.setString(21, depot.getLeySinergica4()== null ? "" : depot.getLeySinergica4());
                ps.setString(22, depot.getLeySinergica5()== null ? "" : depot.getLeySinergica5());
                ps.setString(23, depot.getLeySinergica6()== null ? "" : depot.getLeySinergica6());
                ps.setString(24, depot.getLeySinergica7()== null ? "" : depot.getLeySinergica7());
                ps.setString(25, depot.getLeySinergica8()== null ? "" : depot.getLeySinergica8());
                ps.setString(26, depot.getLeySinergica9()== null ? "" : depot.getLeySinergica9());
                ps.setString(27, depot.getLeySinergica10()== null ? "" : depot.getLeySinergica10());
                ps.setString(28, depot.getLeySinergicaTotal()== null ? "" : depot.getLeySinergicaTotal());
                ps.setString(29, depot.getVelRobto1()== null ? "" : depot.getVelRobto1());
                ps.setString(30, depot.getVelRobto2()== null ? "" : depot.getVelRobto2());
                ps.setString(31, depot.getVelRobto3()== null ? "" : depot.getVelRobto3());
                ps.setString(32, depot.getVelRobto4()== null ? "" : depot.getVelRobto4());
                ps.setString(33, depot.getVelRobto5()== null ? "" : depot.getVelRobto5());
                ps.setString(34, depot.getVelRobto6()== null ? "" : depot.getVelRobto6());
                ps.setString(35, depot.getVelRobto7()== null ? "" : depot.getVelRobto7());
                ps.setString(36, depot.getVelRobto8()== null ? "" : depot.getVelRobto8());
                ps.setString(37, depot.getVelRobto9()== null ? "" : depot.getVelRobto9());
                ps.setString(38, depot.getVelRobto10()== null ? "" : depot.getVelRobto10());
                ps.setString(39, depot.getVelRobtoTotal()== null ? "" : depot.getVelRobtoTotal());
                ps.setString(40, depot.getBoquillaPza1()== null ? "" : depot.getBoquillaPza1());
                ps.setString(41, depot.getBoquillaPza2()== null ? "" : depot.getBoquillaPza2());
                ps.setString(42, depot.getBoquillaPza3()== null ? "" : depot.getBoquillaPza3());
                ps.setString(43, depot.getBoquillaPza4()== null ? "" : depot.getBoquillaPza4());
                ps.setString(44, depot.getBoquillaPza5()== null ? "" : depot.getBoquillaPza5());
                ps.setString(45, depot.getBoquillaPza6()== null ? "" : depot.getBoquillaPza6());
                ps.setString(46, depot.getBoquillaPza7()== null ? "" : depot.getBoquillaPza7());
                ps.setString(47, depot.getBoquillaPza8()== null ? "" : depot.getBoquillaPza8());
                ps.setString(48, depot.getBoquillaPza9()== null ? "" : depot.getBoquillaPza9());
                ps.setString(49, depot.getBoquillaPza10()== null ? "" : depot.getBoquillaPza10());
                ps.setString(50, depot.getBoquillaPzaTotal()== null ? "" : depot.getBoquillaPzaTotal());
                ps.setString(51, depot.getTemperatura1()== null ? "" : depot.getTemperatura1());
                ps.setString(52, depot.getTemperatura2()== null ? "" : depot.getTemperatura2());
                ps.setString(53, depot.getTemperatura3()== null ? "" : depot.getTemperatura3());
                ps.setString(54, depot.getTemperatura4()== null ? "" : depot.getTemperatura4());
                ps.setString(55, depot.getTemperatura5()== null ? "" : depot.getTemperatura5());
                ps.setString(56, depot.getTemperatura6()== null ? "" : depot.getTemperatura6());
                ps.setString(57, depot.getTemperatura7()== null ? "" : depot.getTemperatura7());
                ps.setString(58, depot.getTemperatura8()== null ? "" : depot.getTemperatura8());
                ps.setString(59, depot.getTemperatura9()== null ? "" : depot.getTemperatura9());
                ps.setString(60, depot.getTemperatura10()== null ? "" : depot.getTemperatura10());
                ps.setString(61, depot.getTemperaturaTotal()== null ? "" : depot.getTemperaturaTotal());
                ps.setString(62, depot.getTemporizador1()== null ? "" : depot.getTemporizador1());
                ps.setString(63, depot.getTemporizador2()== null ? "" : depot.getTemporizador2());
                ps.setString(64, depot.getTemporizador3()== null ? "" : depot.getTemporizador3());
                ps.setString(65, depot.getTemporizador4()== null ? "" : depot.getTemporizador4());
                ps.setString(66, depot.getTemporizador5()== null ? "" : depot.getTemporizador5());
                ps.setString(67, depot.getTemporizador6()== null ? "" : depot.getTemporizador6());
                ps.setString(68, depot.getTemporizador7()== null ? "" : depot.getTemporizador7());
                ps.setString(69, depot.getTemporizador8()== null ? "" : depot.getTemporizador8());
                ps.setString(70, depot.getTemporizador9()== null ? "" : depot.getTemporizador9());
                ps.setString(71, depot.getTemporizador10()== null ? "" : depot.getTemporizador10());
                ps.setString(72, depot.getTemporizadorTotal()== null ? "" : depot.getTemporizadorTotal());
                ps.setString(73, depot.getPotenciaLaser1()== null ? "" : depot.getPotenciaLaser1());
                ps.setString(74, depot.getPotenciaLaser2()== null ? "" : depot.getPotenciaLaser2());
                ps.setString(75, depot.getPotenciaLaser3()== null ? "" : depot.getPotenciaLaser3());
                ps.setString(76, depot.getPotenciaLaser4()== null ? "" : depot.getPotenciaLaser4());
                ps.setString(77, depot.getPotenciaLaser5()== null ? "" : depot.getPotenciaLaser5());
                ps.setString(78, depot.getPotenciaLaser6()== null ? "" : depot.getPotenciaLaser6());
                ps.setString(79, depot.getPotenciaLaser7()== null ? "" : depot.getPotenciaLaser7());
                ps.setString(80, depot.getPotenciaLaser8()== null ? "" : depot.getPotenciaLaser8());
                ps.setString(81, depot.getPotenciaLaser9()== null ? "" : depot.getPotenciaLaser9());
                ps.setString(82, depot.getPotenciaLaser10()== null ? "" : depot.getPotenciaLaser10());
                ps.setString(83, depot.getPotenciaLaserTotal()== null ? "" : depot.getPotenciaLaserTotal());
                ps.setString(84, depot.getVelocidadCable1()== null ? "" : depot.getVelocidadCable1());
                ps.setString(85, depot.getVelocidadCable2()== null ? "" : depot.getVelocidadCable2());
                ps.setString(86, depot.getVelocidadCable3()== null ? "" : depot.getVelocidadCable3());
                ps.setString(87, depot.getVelocidadCable4()== null ? "" : depot.getVelocidadCable4());
                ps.setString(88, depot.getVelocidadCable5()== null ? "" : depot.getVelocidadCable5());
                ps.setString(89, depot.getVelocidadCable6()== null ? "" : depot.getVelocidadCable6());
                ps.setString(90, depot.getVelocidadCable7()== null ? "" : depot.getVelocidadCable7());
                ps.setString(91, depot.getVelocidadCable8()== null ? "" : depot.getVelocidadCable8());
                ps.setString(92, depot.getVelocidadCable9()== null ? "" : depot.getVelocidadCable9());
                ps.setString(93, depot.getVelocidadCable0()== null ? "" : depot.getVelocidadCable0());
                ps.setString(94, depot.getVelocidadCableTotal()== null ? "" : depot.getVelocidadCableTotal());
                ps.setString(95, depot.getY1()== null ? "" : depot.getY1());
                ps.setString(96, depot.getY2()== null ? "" : depot.getY2());
                ps.setString(97, depot.getY3()== null ? "" : depot.getY3());
                ps.setString(98, depot.getY4()== null ? "" : depot.getY4());
                ps.setString(99, depot.getY5()== null ? "" : depot.getY5());
                ps.setString(100, depot.getY6()== null ? "" : depot.getY6());
                ps.setString(101, depot.getY7()== null ? "" : depot.getY7());
                ps.setString(102, depot.getY8()== null ? "" : depot.getY8());
                ps.setString(103, depot.getY9()== null ? "" : depot.getY9());
                ps.setString(104, depot.getY10()== null ? "" : depot.getY10());
                ps.setString(105, depot.getyTotal()== null ? "" : depot.getyTotal());
                ps.setString(106, depot.getZ1()== null ? "" : depot.getZ1());
                ps.setString(107, depot.getZ2()== null ? "" : depot.getZ2());
                ps.setString(108, depot.getZ3()== null ? "" : depot.getZ3());
                ps.setString(109, depot.getZ4()== null ? "" : depot.getZ4());
                ps.setString(110, depot.getZ5()== null ? "" : depot.getZ5());
                ps.setString(111, depot.getZ6()== null ? "" : depot.getZ6());
                ps.setString(112, depot.getZ7()== null ? "" : depot.getZ7());
                ps.setString(113, depot.getZ8()== null ? "" : depot.getZ8());
                ps.setString(114, depot.getZ9()== null ? "" : depot.getZ9());
                ps.setString(115, depot.getZ10()== null ? "" : depot.getZ10());
                ps.setString(116, depot.getzTotal()== null ? "" : depot.getzTotal());
                ps.setString(117, depot.getPatronEscaneo1()== null ? "" : depot.getPatronEscaneo1());
                ps.setString(118, depot.getPatronEscaneo2()== null ? "" : depot.getPatronEscaneo2());
                ps.setString(119, depot.getPatronEscaneo3()== null ? "" : depot.getPatronEscaneo3());
                ps.setString(120, depot.getPatronEscaneo4()== null ? "" : depot.getPatronEscaneo4());
                ps.setString(121, depot.getPatronEscaneo5()== null ? "" : depot.getPatronEscaneo5());
                ps.setString(122, depot.getPatronEscaneo6()== null ? "" : depot.getPatronEscaneo6());
                ps.setString(123, depot.getPatronEscaneo7()== null ? "" : depot.getPatronEscaneo7());
                ps.setString(124, depot.getPatronEscaneo8()== null ? "" : depot.getPatronEscaneo8());
                ps.setString(125, depot.getPatronEscaneo9()== null ? "" : depot.getPatronEscaneo9());
                ps.setString(126, depot.getPatronEscaneo10()== null ? "" : depot.getPatronEscaneo10());
                ps.setString(127, depot.getPatronEscaneoTotal()== null ? "" : depot.getPatronEscaneoTotal());
                ps.setString(128, depot.getLargo1()== null ? "" : depot.getLargo1());
                ps.setString(129, depot.getLargo2()== null ? "" : depot.getLargo2());
                ps.setString(130, depot.getLargo3()== null ? "" : depot.getLargo3());
                ps.setString(131, depot.getLargo4()== null ? "" : depot.getLargo4());
                ps.setString(132, depot.getLargo5()== null ? "" : depot.getLargo5());
                ps.setString(133, depot.getLargo6()== null ? "" : depot.getLargo6());
                ps.setString(134, depot.getLargo7()== null ? "" : depot.getLargo7());
                ps.setString(135, depot.getLargo8()== null ? "" : depot.getLargo8());
                ps.setString(136, depot.getLargo9()== null ? "" : depot.getLargo9());
                ps.setString(137, depot.getLargo10()== null ? "" : depot.getLargo10());
                ps.setString(138, depot.getLargoTotal()== null ? "" : depot.getLargoTotal());
                ps.setString(139, depot.getAltura1()== null ? "" : depot.getAltura1());
                ps.setString(140, depot.getAltura2()== null ? "" : depot.getAltura2());
                ps.setString(141, depot.getAltura3()== null ? "" : depot.getAltura3());
                ps.setString(142, depot.getAltura4()== null ? "" : depot.getAltura4());
                ps.setString(143, depot.getAltura5()== null ? "" : depot.getAltura5());
                ps.setString(144, depot.getAltura6()== null ? "" : depot.getAltura6());
                ps.setString(145, depot.getAltura7()== null ? "" : depot.getAltura7());
                ps.setString(146, depot.getAltura8()== null ? "" : depot.getAltura8());
                ps.setString(147, depot.getAltura9()== null ? "" : depot.getAltura9());
                ps.setString(148, depot.getAltura10()== null ? "" : depot.getAltura10());
                ps.setString(149, depot.getAlturaTotal()== null ? "" : depot.getAlturaTotal());
                ps.setString(150, depot.getComentarios()== null ? "" : depot.getComentarios());
                ps.setString(151, depot.getReferencias1()== null ? "" : depot.getReferencias1());
                ps.setString(152, depot.getReferencias2()== null ? "" : depot.getReferencias2());
                ps.setString(153, depot.getReferencias3()== null ? "" : depot.getReferencias3());
                ps.setString(154, depot.getReferencias4()== null ? "" : depot.getReferencias4());
                ps.setString(155, depot.getReferencias5()== null ? "" : depot.getReferencias5());
                ps.setString(156, depot.getReferencias6()== null ? "" : depot.getReferencias6());
                ps.setString(157, depot.getReferencias7()== null ? "" : depot.getReferencias7());
                ps.setString(158, depot.getReferencias8()== null ? "" : depot.getReferencias8());
                ps.setString(159, depot.getReferencias9()== null ? "" : depot.getReferencias9());
                ps.setString(160, depot.getReferencias10()== null ? "" : depot.getReferencias10());
                ps.setString(161, depot.getReferenciasTotal()== null ? "" : depot.getReferenciasTotal());
                
                //PIE
                ps.setString(162, depot.getTratamientoTermico()== null ? "" : depot.getTratamientoTermico());
                ps.setString(163, depot.getMecanizado()== null ? "" : depot.getMecanizado());
                ps.setString(164, depot.getResultados()== null ? "" : depot.getResultados());
                
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
    
    public List<String> getAllWaam() {

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
        String sql = "Select date, heure, machine, numeroFiche, numeroCaso, numeroPlaca, refMateriales, preProceso,"
                + "metas, opeVerificacion, llenGas, operador, materiales, tamClave, tamSustrato, tamHabutacion, croquis from appaddimadour.depot where numeroFiche=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idDepot);

            rs = ps.executeQuery();

            if (rs.next()) {
                depot.setDate(rs.getString("date"));
                depot.setHeure(rs.getString("heure"));
                depot.setMachine(rs.getString("machine"));
                depot.setNumeroFiche(rs.getString("numeroFiche"));
                depot.setNumeroCaso(rs.getString("numeroCaso"));
                depot.setNumeroPlaca(rs.getString("numeroPlaca"));
                depot.setRefMateriales(rs.getString("refMateriales"));
                depot.setPreProceso(rs.getString("preProceso"));
                depot.setMetas(rs.getString("metas"));
                depot.setOpeVerificacion(rs.getString("opeVerificacion"));
                depot.setLlenGas(rs.getString("llenGas"));
                depot.setOperador(rs.getString("operador"));
                depot.setMaterial(rs.getString("materiales"));
                depot.setTamClave(rs.getString("tamClave"));
                depot.setTamSustrato(rs.getString("tamSustrato"));
                depot.setTamHabitacion(rs.getString("tamHabutacion"));
                depot.setCroquis(rs.getString("croquis"));

            }

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
                String sql = "UPDATE appaddimadour.depot SET date=?, heure=?, machine=?, numeroFiche=?, numeroCaso=?, numeroPlaca=?, refMateriales=?, preProceso=?, metas=?, opeVerificacion=?,"
                        + "llenGas=?, operador=?, materiales=?, tamClave=?, tamSustrato=?, tamHabutacion=?, croquis=? WHERE idDepot=?";

                ps = con.prepareStatement(sql);

                ps.setString(1, Depot.getDate());
                ps.setString(2, Depot.getHeure());
                ps.setString(3, Depot.getMachine());
                ps.setString(4, Depot.getNumeroFiche());
                ps.setString(5, Depot.getNumeroCaso());
                ps.setString(6, Depot.getNumeroPlaca());
                ps.setString(7, Depot.getRefMateriales());
                ps.setString(8, Depot.getPreProceso());
                ps.setString(9, Depot.getMetas());
                ps.setString(10, Depot.getOpeVerificacion());
                ps.setString(11, Depot.getLlenGas());
                ps.setString(12, Depot.getOperador());
                ps.setString(13, Depot.getMaterial());
                ps.setString(14, Depot.getTamClave());
                ps.setString(15, Depot.getTamSustrato());
                ps.setString(16, Depot.getTamHabitacion());
                ps.setString(17, Depot.getCroquis());
                ps.setInt(18, idDepot);

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
    
    public boolean deleteDepot(String nameDepot) {

        Connection con = getConexion();
        boolean delete=false;
        int rs = 0;
        int idDepot=0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.depot where idDepot=?";
        int id = 0;
        try {
            idDepot=this.getDepotId(nameDepot);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDepot);
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
