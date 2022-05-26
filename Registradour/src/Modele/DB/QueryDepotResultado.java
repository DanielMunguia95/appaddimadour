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
public class QueryDepotResultado extends Connexion {
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

        List<String> Depot = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select numeroFiche from appaddimadour.depot";

        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() != 0) {

                    Depot.add(rs.getString("numeroFiche"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Depot;
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
        String sql = "SELECT tratamientoTermico, mecanizado, resultados FROM depot WHERE numeroFiche=?";
                
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idDepot);

            rs = ps.executeQuery();

            if (rs.next()) {
                depot.setTratamientoTermico(rs.getString("tratamientoTermico"));
                depot.setMecanizado(rs.getString("mecanizado"));
                depot.setResultados(rs.getString("resultados"));
            }

        } catch (Exception e) {
            depot=null;
            e.printStackTrace();
        }
        return depot;
    }
    
    public boolean updateDepot(depotCabecer Depot) {

        //depotCabecer depot = new depotCabecer();
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idDepot = 0;
        try {
            //if (this.validateNumFiche(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche()) != true) {
                idDepot = this.getDepotId(Depot.getNumeroFiche()== null ? "" : Depot.getNumeroFiche());
                //idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE depot SET tratamientoTermico = ?, mecanizado = ?, resultados = ? WHERE depot.idDepot = ?";
                        

                ps = con.prepareStatement(sql);

                ps.setString(1, Depot.getTratamientoTermico()== null ? "" : Depot.getTratamientoTermico());
                ps.setString(2, Depot.getMecanizado()== null ? "" : Depot.getMecanizado());
                ps.setString(3, Depot.getResultados()== null ? "" : Depot.getResultados());
                ps.setInt(4, idDepot);

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
