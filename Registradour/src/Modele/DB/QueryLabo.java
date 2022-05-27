/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.DB.Connexion;
import Modele.Labo;
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
 * @author Altair
 */
public class QueryLabo extends Connexion {

    public boolean saveLabo(Labo labos) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        boolean existNameLabo = false;

        try {
            existNameLabo = this.validateNumFiche(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());

            if (existNameLabo != true) {
                String sql = "INSERT INTO appaddimadour.labo (nameLabo, dateLabo, heureLabo, operateur, numeroFiche, ficheEssaiAssociee, materiau,"
                        + " numeroPlaque, referenceMatiere, numerodAffaire, objectifs, resultats) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                ps = con.prepareStatement(sql);

                ps.setString(1, labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                ps.setString(2, labos.getDateLabo() == null ? "" : labos.getDateLabo());
                ps.setString(3, labos.getHeureLabo());
                ps.setString(4, labos.getOperateur());
                ps.setString(5, labos.getNumeroFiche());
                ps.setString(6, labos.getFicheEssaiAssociee());
                ps.setString(7, labos.getMateriau());
                ps.setString(8, labos.getNumeroPlaque());
                ps.setString(9, labos.getReferenceMatiere());
                ps.setString(10, labos.getNumerodAffaire());
                ps.setString(11, labos.getObjectifs());
                ps.setString(12, labos.getResultats());

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
                return rs=false;
               
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

    public boolean validateNumFiche(String nameLabo) {

        boolean validate = false;
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select nameLabo FROM appaddimadour.labo where nameLabo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nameLabo);

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

    public Labo getLabo(String idLabo) {
        Labo labo = new Labo();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select nameLabo, dateLabo, heureLabo, operateur, numeroFiche, ficheEssaiAssociee, materiau,"
                + "numeroPlaque, referenceMatiere, numerodAffaire, objectifs, resultats from appaddimadour.labo where nameLabo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idLabo);

            rs = ps.executeQuery();

            if (rs.next()) {
                labo.setDateLabo(rs.getString("dateLabo"));
                labo.setNomLLabo(rs.getString("nameLabo"));
                labo.setHeureLabo(rs.getString("heureLabo"));
                labo.setOperateur(rs.getString("operateur"));
                labo.setNumeroFiche(rs.getString("numeroFiche"));
                labo.setFicheEssaiAssociee(rs.getString("ficheEssaiAssociee"));
                labo.setMateriau(rs.getString("materiau"));
                labo.setNumeroPlaque(rs.getString("numeroPlaque"));
                labo.setReferenceMatiere(rs.getString("referenceMatiere"));

                labo.setNumerodAffaire(rs.getString("numerodAffaire"));
                labo.setObjectifs(rs.getString("objectifs"));
                labo.setResultats(rs.getString("resultats"));

            }

        } catch (Exception e) {
            labo=null;
            e.printStackTrace();
        }
        return labo;
    }

    public int getLaboId(String nameLabo) {

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select idLabo from appaddimadour.labo where nameLabo=?";
        int id = 0;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nameLabo);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("idLabo");
            }

        } catch (Exception e) {

            return 0;
        }

        return id;

    }

    public List<String> getAllLabo() {

        List<String> labs = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select nameLabo from appaddimadour.labo";

        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() != 0) {

                    labs.add(rs.getString("nameLabo"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return labs;
    }

    public boolean updateLabo(Labo labos) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLabo = 0;
        try {

            if (this.validateNumFiche(labos.getNomLLabo() == null ? "" : labos.getNomLLabo()) != true) {
                idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE appaddimadour.labo SET dateLabo=?, heureLabo=?, operateur=?, numeroFiche=?, ficheEssaiAssociee=?, "
                        + "materiau=?, numeroPlaque=?, referenceMatiere=?, numerodAffaire=?, objectifs=?, resultats=? WHERE idLabo=?";

                ps = con.prepareStatement(sql);

                ps.setString(1, labos.getDateLabo());
                ps.setString(2, labos.getHeureLabo());
                ps.setString(3, labos.getOperateur());
                ps.setString(4, labos.getNumeroFiche());
                ps.setString(5, labos.getFicheEssaiAssociee());
                ps.setString(6, labos.getMateriau());
                ps.setString(7, labos.getNumeroPlaque());
                ps.setString(8, labos.getReferenceMatiere());
                ps.setString(9, labos.getNumerodAffaire());
                ps.setString(10, labos.getObjectifs());
                 ps.setString(11, labos.getResultats());
                ps.setInt(12, idLabo);

                int iInsCnt = ps.executeUpdate();
                if (iInsCnt > 0) {
                    System.out.println("Update Success");
                    return true;
                } else {
                    System.out.println("Update Fail");
                    return false;
                }
            }else{
                 System.out.println("ya existe un registro con ese num fiche");
                    return false;
               
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
        return false;
    }
    
     public boolean deleteLabo(String nameLabo) {

        Connection con = getConexion();
        boolean delete=false;
        int rs = 0;
        int idLabo=0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.labo where idLabo=?";
        int id = 0;
        try {
            idLabo=this.getLaboId(nameLabo);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idLabo);
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
