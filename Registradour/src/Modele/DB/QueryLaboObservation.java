/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.LaboObservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class QueryLaboObservation extends QueryLabo {

    public boolean saveLaboObservation(LaboObservation laboObser) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;

        int idLabo = 0;
        try {

            idLabo = getLaboId(laboObser.getNameLabo() == null ? "" : laboObser.getNameLabo());
            laboObser.setIdLaboObs(idLabo);

            String sql = "INSERT INTO appaddimadour.observation (idLabo, referenceObs1, macroMicrographie1, nomAsssocieure1,"
                    + " referenceObs2, macroMicrographie2, nomAsssocieure2,"
                    + " referenceObs3, macroMicrographie3, nomAsssocieure3, referenceObs4, macroMicrographie4, nomAsssocieure4,"
                    + " referenceObs5, macroMicrographie5, nomAsssocieure5, referenceObs6, macroMicrographie6, nomAsssocieure6,"
                    + " commentaires, nomDossier) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            ps = con.prepareStatement(sql);

            ps.setInt(1, laboObser.getIdLaboObs() == 0 ? 0 : laboObser.getIdLaboObs());
           
            ps.setString(2, laboObser.getReference1() == null ? "" : laboObser.getReference1());
            ps.setString(3, laboObser.getMacro1() == null ? "" : laboObser.getMacro1());
            ps.setString(4, laboObser.getNomAssocie1() == null ? "" : laboObser.getNomAssocie1());

            ps.setString(5, laboObser.getReference2() == null ? "" : laboObser.getReference2());
            ps.setString(6, laboObser.getMacro2() == null ? "" : laboObser.getMacro2());
            ps.setString(7, laboObser.getNomAssocie2() == null ? "" : laboObser.getNomAssocie2());
            
            ps.setString(8, laboObser.getReference3() == null ? "" : laboObser.getReference3());
            ps.setString(9, laboObser.getMacro3() == null ? "" : laboObser.getMacro3());
            ps.setString(10, laboObser.getNomAssocie3() == null ? "" : laboObser.getNomAssocie3());
            
            ps.setString(11, laboObser.getReference4() == null ? "" : laboObser.getReference4());
            ps.setString(12, laboObser.getMacro4() == null ? "" : laboObser.getMacro4());
            ps.setString(13, laboObser.getNomAssocie4() == null ? "" : laboObser.getNomAssocie4());
            
            ps.setString(14, laboObser.getReference5() == null ? "" : laboObser.getReference5());
            ps.setString(15, laboObser.getMacro5() == null ? "" : laboObser.getMacro5());
            ps.setString(16, laboObser.getNomAssocie5() == null ? "" : laboObser.getNomAssocie5());
            
            ps.setString(17, laboObser.getReference6() == null ? "" : laboObser.getReference6());
            ps.setString(18, laboObser.getMacro6() == null ? "" : laboObser.getMacro6());
            ps.setString(19, laboObser.getNomAssocie6() == null ? "" : laboObser.getNomAssocie6());


            ps.setString(20, laboObser.getCommentaires() == null ? "" : laboObser.getCommentaires());

            ps.setString(21, laboObser.getNomDossier() == null ? "" : laboObser.getNomDossier());

          
            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Insert Success POLI");
                return rs = true;
            } else {
                System.out.println("Insert Fail POLI");
                return rs = false;
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

    public LaboObservation getLabObs(String nameFiche) {

        LaboObservation labo = new LaboObservation();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select * from appaddimadour.observation where idLabo=?";
        int idFiche = 0;
        try {

            idFiche = getLaboId(nameFiche);
             ps = con.prepareStatement(sql);
            ps.setInt(1, idFiche);

            rs = ps.executeQuery();

            if (rs.next()) {

                //labo.setIdLaboObs(rs.getString("idLabo"));
                labo.setReference1(rs.getString("referenceObs1"));
                labo.setMacro1(rs.getString("macroMicrographie1"));
                labo.setNomAssocie1(rs.getString("nomAsssocieure1"));
                labo.setReference2(rs.getString("referenceObs2"));
                labo.setMacro2(rs.getString("macroMicrographie2"));
                labo.setNomAssocie2(rs.getString("nomAsssocieure2"));
                labo.setReference3(rs.getString("referenceObs3"));
                labo.setMacro3(rs.getString("macroMicrographie3"));
                labo.setNomAssocie3(rs.getString("nomAsssocieure3"));
                labo.setReference4(rs.getString("referenceObs4"));
                labo.setMacro4(rs.getString("macroMicrographie4"));
                labo.setNomAssocie4(rs.getString("nomAsssocieure4"));
                labo.setReference5(rs.getString("referenceObs5"));
                labo.setMacro5(rs.getString("macroMicrographie5"));
                labo.setNomAssocie5(rs.getString("nomAsssocieure5"));
                labo.setReference6(rs.getString("referenceObs6"));
                labo.setMacro6(rs.getString("macroMicrographie6"));
                labo.setNomAssocie6(rs.getString("nomAsssocieure6"));
                
                
                labo.setCommentaires(rs.getString("commentaires"));
                labo.setNomDossier(rs.getString("nomDossier"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return labo;
    }

    public boolean updateLaboObs(LaboObservation laboObser) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLabo = 0;
        try {

            idLabo = this.getLaboId(laboObser.getNameLabo() == null ? "" : laboObser.getNameLabo());

            laboObser.setIdLaboObs(idLabo);
            
            String sql = "UPDATE appaddimadour.observation SET referenceObs1 = ?, macroMicrographie1 = ?, nomAsssocieure1 = ?,"
                    + " referenceObs2 = ?, macroMicrographie2 = ?, nomAsssocieure2 = ?,"
                    + "referenceObs3 = ?, macroMicrographie3 = ?, nomAsssocieure3 = ?, referenceObs4 = ?, macroMicrographie4 = ?, nomAsssocieure4 = ?,"
                    + " referenceObs5 = ?, macroMicrographie5 = ?, nomAsssocieure5 = ?, referenceObs6 = ?, macroMicrographie6 = ?, nomAsssocieure6 = ?,"
                    + " commentaires = ?, nomDossier = ? WHERE (idLabo = ?)";

            ps = con.prepareStatement(sql);

            ps.setString(1, laboObser.getReference1() == null ? "" : laboObser.getReference1());
            ps.setString(2, laboObser.getMacro1() == null ? "" : laboObser.getMacro1());
            ps.setString(3, laboObser.getNomAssocie1() == null ? "" : laboObser.getNomAssocie1());

            ps.setString(4, laboObser.getReference2() == null ? "" : laboObser.getReference2());
            ps.setString(5, laboObser.getMacro2() == null ? "" : laboObser.getMacro2());
            ps.setString(6, laboObser.getNomAssocie2() == null ? "" : laboObser.getNomAssocie2());
            
            ps.setString(7, laboObser.getReference3() == null ? "" : laboObser.getReference3());
            ps.setString(8, laboObser.getMacro3() == null ? "" : laboObser.getMacro3());
            ps.setString(9, laboObser.getNomAssocie3() == null ? "" : laboObser.getNomAssocie3());
            
            ps.setString(10, laboObser.getReference4() == null ? "" : laboObser.getReference4());
            ps.setString(11, laboObser.getMacro4() == null ? "" : laboObser.getMacro4());
            ps.setString(12, laboObser.getNomAssocie4() == null ? "" : laboObser.getNomAssocie4());
            
            ps.setString(13, laboObser.getReference5() == null ? "" : laboObser.getReference5());
            ps.setString(14, laboObser.getMacro5() == null ? "" : laboObser.getMacro5());
            ps.setString(15, laboObser.getNomAssocie5() == null ? "" : laboObser.getNomAssocie5());
            
            ps.setString(16, laboObser.getReference6() == null ? "" : laboObser.getReference6());
            ps.setString(17, laboObser.getMacro6() == null ? "" : laboObser.getMacro6());
            ps.setString(18, laboObser.getNomAssocie6() == null ? "" : laboObser.getNomAssocie6());


            ps.setString(19, laboObser.getCommentaires() == null ? "" : laboObser.getCommentaires());

            ps.setString(20, laboObser.getNomDossier() == null ? "" : laboObser.getNomDossier());


            ps.setInt(21, idLabo);

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Update SuccessObservation");
                return true;
            } else {
                System.out.println("Update Fail Observations");
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

    public boolean deleteLaboObs(String nameLabo) {

        Connection con = getConexion();
        boolean delete = false;
        int rs = 0;
        int idLabo = 0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.observation where idLabo=?";
        int id = 0;
        try {
            idLabo = this.getLaboId(nameLabo);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idLabo);
            rs = ps.executeUpdate();

            if (rs > 0) {
                delete = true;
            } else {
                delete = false;
                System.out.println("No se elimino Onse");
            }

        } catch (Exception e) {

            return delete;
        }

        return delete;

    }

}
