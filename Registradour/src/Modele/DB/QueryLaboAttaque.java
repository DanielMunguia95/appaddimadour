/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.LaboAttaque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class QueryLaboAttaque extends QueryLabo {

    public boolean saveLaboAttaque(LaboAttaque laboAttaque) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;

        int idLabo = 0;
        try {

            idLabo = getLaboId(laboAttaque.getNameLabo() == null ? "" : laboAttaque.getNameLabo());
            laboAttaque.setIdLaboAttaque(idLabo);

            String sql = "INSERT INTO appaddimadour.attaquechimique "
                    + "(idLabo, reactif1, temps1, reactif2, temps2, reactif3, temps3,"
                    + " reactif4, temps4, reactif5, temps5, reactif6, temps6, observation1, observation2, observation3,"
                    + " observation4, observation5, observation6)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            ps = con.prepareStatement(sql);

            ps.setInt(1, laboAttaque.getIdLaboAttaque() == 0 ? 0 : laboAttaque.getIdLaboAttaque());
            ps.setString(2, laboAttaque.getReactif1() == null ? "" : laboAttaque.getReactif1());
            ps.setString(3, laboAttaque.getReactif2() == null ? "" : laboAttaque.getReactif2());
            ps.setString(4, laboAttaque.getReactif3() == null ? "" : laboAttaque.getReactif3());
            ps.setString(5, laboAttaque.getReactif4() == null ? "" : laboAttaque.getReactif4());
            ps.setString(6, laboAttaque.getReactif5() == null ? "" : laboAttaque.getReactif5());
            ps.setString(7, laboAttaque.getReactif6() == null ? "" : laboAttaque.getReactif6());

            ps.setString(8, laboAttaque.getTemps1() == null ? "" : laboAttaque.getTemps1());
            ps.setString(9, laboAttaque.getTemps2() == null ? "" : laboAttaque.getTemps2());
            ps.setString(10, laboAttaque.getTemps3() == null ? "" : laboAttaque.getTemps3());
            ps.setString(11, laboAttaque.getTemps4() == null ? "" : laboAttaque.getTemps4());
            ps.setString(12, laboAttaque.getTemps5() == null ? "" : laboAttaque.getTemps5());
            ps.setString(13, laboAttaque.getTemps6() == null ? "" : laboAttaque.getTemps6());

            ps.setString(14, laboAttaque.getObservation1() == null ? "" : laboAttaque.getObservation1());
            ps.setString(15, laboAttaque.getObservation2() == null ? "" : laboAttaque.getObservation2());
            ps.setString(16, laboAttaque.getObservation3() == null ? "" : laboAttaque.getObservation3());
            ps.setString(17, laboAttaque.getObservation4() == null ? "" : laboAttaque.getObservation4());
            ps.setString(18, laboAttaque.getObservation5() == null ? "" : laboAttaque.getObservation5());
            ps.setString(19, laboAttaque.getObservation6() == null ? "" : laboAttaque.getObservation6());

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Insert Success ATTAQUE");
                return rs = true;
            } else {
                System.out.println("Insert Fail ATTAQUE");
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

    public LaboAttaque getLabAttaque(String nameFiche) {

        LaboAttaque labo = new LaboAttaque();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select * from appaddimadour.attaquechimique where idLabo=?";
        int idFiche = 0;
        try {

            idFiche = getLaboId(nameFiche);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFiche);

            rs = ps.executeQuery();

            if (rs.next()) {
                labo.setIdLaboAttaque(Integer.parseInt(rs.getString("idAttaqueChimique")));
                labo.setReactif1(rs.getString("reactif1"));
                labo.setReactif2(rs.getString("reactif2"));
                labo.setReactif3(rs.getString("reactif3"));
                labo.setReactif4(rs.getString("reactif4"));
                labo.setReactif5(rs.getString("reactif5"));
                labo.setReactif6(rs.getString("reactif6"));
                labo.setTemps1(rs.getString("temps1"));
                labo.setTemps2(rs.getString("temps2"));
                labo.setTemps3(rs.getString("temps3"));
                labo.setTemps4(rs.getString("temps4"));
                labo.setTemps5(rs.getString("temps5"));
                labo.setTemps6(rs.getString("temps6"));

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

    public boolean updateAttaque(LaboAttaque laboAttaque) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLabo = 0;
        try {

            idLabo = this.getLaboId(laboAttaque.getNameLabo() == null ? "" : laboAttaque.getNameLabo());

            laboAttaque.setIdLaboAttaque(idLabo);

            String sql = "UPDATE appaddimadour.attaquechimique SET reactif1 = ?, temps1 = ?, reactif2 = ?, temps2 = ?, reactif3 = ?,"
                    + " temps3 = ?, reactif4 = ?, temps4 = ?, reactif5 = ?, temps5 = ?, reactif6 = ?, temps6 = ?,"
                    + " observation1 = ?, observation2 = ?, observation3 = ?, observation4 = ?, observation5 = ?, observation6 = ?"
                    + " WHERE (idLabo = '?')";

            ps = con.prepareStatement(sql);

            ps.setString(1, laboAttaque.getReactif1() == null ? "" : laboAttaque.getReactif1());
            ps.setString(2, laboAttaque.getReactif2() == null ? "" : laboAttaque.getReactif2());
            ps.setString(3, laboAttaque.getReactif3() == null ? "" : laboAttaque.getReactif3());
            ps.setString(4, laboAttaque.getReactif4() == null ? "" : laboAttaque.getReactif4());
            ps.setString(5, laboAttaque.getReactif5() == null ? "" : laboAttaque.getReactif5());
            ps.setString(6, laboAttaque.getReactif6() == null ? "" : laboAttaque.getReactif6());

            ps.setString(7, laboAttaque.getTemps1() == null ? "" : laboAttaque.getTemps1());
            ps.setString(8, laboAttaque.getTemps2() == null ? "" : laboAttaque.getTemps2());
            ps.setString(9, laboAttaque.getTemps3() == null ? "" : laboAttaque.getTemps3());
            ps.setString(10, laboAttaque.getTemps4() == null ? "" : laboAttaque.getTemps4());
            ps.setString(11, laboAttaque.getTemps5() == null ? "" : laboAttaque.getTemps5());
            ps.setString(12, laboAttaque.getTemps6() == null ? "" : laboAttaque.getTemps6());

            ps.setString(13, laboAttaque.getObservation1() == null ? "" : laboAttaque.getObservation1());
            ps.setString(14, laboAttaque.getObservation2() == null ? "" : laboAttaque.getObservation2());
            ps.setString(15, laboAttaque.getObservation3() == null ? "" : laboAttaque.getObservation3());
            ps.setString(16, laboAttaque.getObservation4() == null ? "" : laboAttaque.getObservation4());
            ps.setString(17, laboAttaque.getObservation5() == null ? "" : laboAttaque.getObservation5());
            ps.setString(18, laboAttaque.getObservation6() == null ? "" : laboAttaque.getObservation6());

            ps.setInt(19, idLabo);

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Update SuccessAttaque");
                return true;
            } else {
                System.out.println("Update Fail Attaque");
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

    public boolean deleteLaboAttaque(String nameLabo) {

        Connection con = getConexion();
        boolean delete = false;
        int rs = 0;
        int idLabo = 0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.attaquechimique where idLabo=?";
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
                System.out.println("No se elimino attaque");
            }

        } catch (Exception e) {

            return delete;
        }

        return delete;

    }

}
