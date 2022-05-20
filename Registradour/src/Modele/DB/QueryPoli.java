/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.LaboPoli;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Altair
 */
public class QueryPoli extends QueryLabo {

    public boolean saveLaboTon(LaboPoli laboPoli) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;

        int idLabo = 0;
        try {

            idLabo = getLaboId(laboPoli.getNameLabo() == null ? "" : laboPoli.getNameLabo());
            laboPoli.setIdLaboPoli(idLabo);

            String sql = "INSERT INTO appaddimadour.polissage"
                    + " (idLabo, fait1, gamme1, fait2, gamme2, fait3,"
                    + " gamme3, fait4, gamme4, fait5, gamme5, fait6, gamme6,"
                    + " observation1, observation2, observation3, observation4, observation5)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            ps = con.prepareStatement(sql);

            ps.setInt(1, laboPoli.getIdLaboPoli() == 0 ? 0 : laboPoli.getIdLaboPoli());

            ps.setString(2, laboPoli.getFait1() == null ? "" : laboPoli.getFait1());
            ps.setString(3, laboPoli.getGamme1() == null ? "" : laboPoli.getGamme1());
            ps.setString(4, laboPoli.getFait2() == null ? "" : laboPoli.getFait2());
            ps.setString(5, laboPoli.getGamme2() == null ? "" : laboPoli.getGamme2());
            ps.setString(6, laboPoli.getFait3() == null ? "" : laboPoli.getFait3());
            ps.setString(7, laboPoli.getGamme3() == null ? "" : laboPoli.getGamme3());
            ps.setString(8, laboPoli.getFait4() == null ? "" : laboPoli.getFait4());
            ps.setString(9, laboPoli.getGamme4() == null ? "" : laboPoli.getGamme4());
            ps.setString(10, laboPoli.getFait5() == null ? "" : laboPoli.getFait5());
            ps.setString(11, laboPoli.getGamme5() == null ? "" : laboPoli.getGamme5());
            ps.setString(12, laboPoli.getFait6() == null ? "" : laboPoli.getFait6());
            ps.setString(13, laboPoli.getGamme6() == null ? "" : laboPoli.getGamme6());

            ps.setString(14, laboPoli.getObservation1() == null ? "" : laboPoli.getObservation1());
            ps.setString(15, laboPoli.getObservation2() == null ? "" : laboPoli.getObservation2());
            ps.setString(16, laboPoli.getObservation3() == null ? "" : laboPoli.getObservation3());
            ps.setString(17, laboPoli.getObservation4() == null ? "" : laboPoli.getObservation4());
            ps.setString(18, laboPoli.getObservation5() == null ? "" : laboPoli.getObservation5());
            ps.setString(19, laboPoli.getObservation6() == null ? "" : laboPoli.getObservation6());

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

    public LaboPoli getLabPoli(String nameFiche) {

        LaboPoli labo = new LaboPoli();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select * from appaddimadour.polissage where idLabo=?";
        int idFiche = 0;
        try {

            idFiche = getLaboId(nameFiche);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFiche);

            rs = ps.executeQuery();

            if (rs.next()) {

                labo.setFait1(rs.getString("fait1"));
                labo.setFait2(rs.getString("fait2"));
                labo.setFait3(rs.getString("fait3"));
                labo.setFait4(rs.getString("fait4"));
                labo.setFait5(rs.getString("fait5"));
                labo.setFait6(rs.getString("fait6"));
                labo.setGamme1(rs.getString("gamme1"));
                labo.setGamme2(rs.getString("gamme2"));
                labo.setGamme3(rs.getString("gamme3"));
                labo.setGamme4(rs.getString("gamme4"));
                labo.setGamme5(rs.getString("gamme5"));
                labo.setGamme6(rs.getString("gamme6"));
                labo.setObservation1(rs.getString("observation1"));
                labo.setObservation2(rs.getString("observation2"));
                labo.setObservation3(rs.getString("observation3"));
                labo.setObservation4(rs.getString("observation4"));
                labo.setObservation5(rs.getString("observation5"));
                labo.setObservation6(rs.getString("observation6"));

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

    public boolean updateLaboTon(LaboPoli laboPoli) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLabo = 0;
        try {

            idLabo = this.getLaboId(laboPoli.getNameLabo() == null ? "" : laboPoli.getNameLabo());

            laboPoli.setIdLaboPoli(idLabo);
            String sql = "UPDATE appaddimadour.polissage SET fait1 = ?, gamme1 = ?, fait2 = ?, gamme2 = ?,"
                    + " fait3 = ?, gamme3 = ?, fait4 = ?, gamme4 = ?, fait5 = ?, gamme5 = ?, fait6 = ?, gamme6 = ?, observation1 = ?,"
                    + " observation2 = ?, observation3 = ?, observation4 = ?, observation5 = ?, observation6 = ? WHERE (idLabo = ?);";

            ps = con.prepareStatement(sql);

            ps.setString(1, laboPoli.getFait1() == null ? "" : laboPoli.getFait1());
            ps.setString(2, laboPoli.getGamme1() == null ? "" : laboPoli.getGamme1());
            ps.setString(3, laboPoli.getFait2() == null ? "" : laboPoli.getFait2());
            ps.setString(4, laboPoli.getGamme2() == null ? "" : laboPoli.getGamme2());
            ps.setString(5, laboPoli.getFait3() == null ? "" : laboPoli.getFait3());
            ps.setString(6, laboPoli.getGamme3() == null ? "" : laboPoli.getGamme3());
            ps.setString(7, laboPoli.getFait4() == null ? "" : laboPoli.getFait4());
            ps.setString(8, laboPoli.getGamme4() == null ? "" : laboPoli.getGamme4());
            ps.setString(9, laboPoli.getFait5() == null ? "" : laboPoli.getFait5());
            ps.setString(10, laboPoli.getGamme5() == null ? "" : laboPoli.getGamme5());
            ps.setString(11, laboPoli.getFait6() == null ? "" : laboPoli.getFait6());
            ps.setString(12, laboPoli.getGamme6() == null ? "" : laboPoli.getGamme6());

            ps.setString(13, laboPoli.getObservation1() == null ? "" : laboPoli.getObservation1());
            ps.setString(14, laboPoli.getObservation2() == null ? "" : laboPoli.getObservation2());
            ps.setString(15, laboPoli.getObservation3() == null ? "" : laboPoli.getObservation3());
            ps.setString(16, laboPoli.getObservation4() == null ? "" : laboPoli.getObservation4());
            ps.setString(17, laboPoli.getObservation5() == null ? "" : laboPoli.getObservation5());
            ps.setString(18, laboPoli.getObservation6() == null ? "" : laboPoli.getObservation6());

            ps.setInt(19, idLabo);

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Update SuccessPOLI");
                return true;
            } else {
                System.out.println("Update Fail POLI");
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

    public boolean deleteLaboTon(String nameLabo) {

        Connection con = getConexion();
        boolean delete = false;
        int rs = 0;
        int idLabo = 0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.polissage where idLabo=?";
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
                System.out.println("No se elimino Poli");
            }

        } catch (Exception e) {

            return delete;
        }

        return delete;

    }

}
