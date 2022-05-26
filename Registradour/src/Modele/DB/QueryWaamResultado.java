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
public class QueryWaamResultado extends Connexion {
    
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
        String sql = "SELECT tratamientoTermico, mecanizado, resultados FROM waam WHERE numeroFiche=?";
                
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idWaam);

            rs = ps.executeQuery();

            if (rs.next()) {
                labo.setTratamientoTermico(rs.getString("tratamientoTermico"));
                labo.setMecanizado(rs.getString("mecanizado"));
                labo.setResultados(rs.getString("resultados"));
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
                String sql = "UPDATE waam SET tratamientoTermico = ?, mecanizado = ?, resultados = ? WHERE waam.idWaam = ?";
                        

                ps = con.prepareStatement(sql);

                ps.setString(1, Waam.getTratamientoTermico()== null ? "" : Waam.getTratamientoTermico());
                ps.setString(2, Waam.getMecanizado()== null ? "" : Waam.getMecanizado());
                ps.setString(3, Waam.getResultados()== null ? "" : Waam.getResultados());
                ps.setInt(4, idWaam);

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
