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
public class QueryLmdResultado extends Connexion {
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

        List<String> Waam = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select numeroFiche from appaddimadour.lmd";

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
    
    public int getLmdId(String numeroFiche) {

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select idLmd from appaddimadour.Lmd where numeroFiche=?";
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
    
    public LmdCabecer getLmd(String idLmd) {
        LmdCabecer lmd = new LmdCabecer();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT tratamientoTermico, mecanizado, resultados FROM lmd WHERE numeroFiche=?";
                
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idLmd);

            rs = ps.executeQuery();

            if (rs.next()) {
                lmd.setTratamientoTermico(rs.getString("tratamientoTermico"));
                lmd.setMecanizado(rs.getString("mecanizado"));
                lmd.setResultados(rs.getString("resultados"));
            }

        } catch (Exception e) {
            lmd=null;
            e.printStackTrace();
        }
        return lmd;
    }
    
    public boolean updateLmd(LmdCabecer Lmd) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLmd = 0;
        try {
            //if (this.validateNumFiche(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche()) != true) {
                idLmd = this.getLmdId(Lmd.getNumeroFiche()== null ? "" : Lmd.getNumeroFiche());
                //idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE lmd SET tratamientoTermico = ?, mecanizado = ?, resultados = ? WHERE lmd.idLmd = ?";
                        

                ps = con.prepareStatement(sql);

                ps.setString(1, Lmd.getTratamientoTermico()== null ? "" : Lmd.getTratamientoTermico());
                ps.setString(2, Lmd.getMecanizado()== null ? "" : Lmd.getMecanizado());
                ps.setString(3, Lmd.getResultados()== null ? "" : Lmd.getResultados());
                ps.setInt(4, idLmd);

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
