/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.LaboTon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Altair
 */
public class QueryLaboTon extends QueryLabo {

    public boolean saveLaboTon(LaboTon laboTon) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;

        int idLabo = 0;
        try {

            idLabo = getLaboId(laboTon.getNameLabo() == null ? "" : laboTon.getNameLabo());
            laboTon.setIdLabo(idLabo);
            String sql = "INSERT INTO appaddimadour.tronçonnage "
                    + "(idLabo, reference1, disqueUtilise1, schema1, observacion1, reference2, disqueUtilise2, schema2, observacion2,"
                    + " reference3, disqueUtilise3, schema3, observacion3, reference4, disqueUtilise4, schema4, observacion4, reference5,"
                    + " disqueUtilise5, schema5, observacion5, reference6, disqueUtilise6, schema6, observacion6)"
                    + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            ps = con.prepareStatement(sql);

            ps.setInt(1, laboTon.getIdLabo() == 0 ? 0 : laboTon.getIdLabo());

            ps.setString(2, laboTon.getRef1() == null ? "" : laboTon.getRef1());
            ps.setString(3, laboTon.getDisque1() == null ? "" : laboTon.getDisque1());
            ps.setString(4, laboTon.getSchema1() == null ? "" : laboTon.getSchema1());
            ps.setString(5, laboTon.getObser1() == null ? "" : laboTon.getObser1());

            ps.setString(6, laboTon.getRef2() == null ? "" : laboTon.getRef2());
            ps.setString(7, laboTon.getDisque2() == null ? "" : laboTon.getDisque2());
            ps.setString(8, laboTon.getSchema2() == null ? "" : laboTon.getSchema2());
            ps.setString(9, laboTon.getObser2() == null ? "" : laboTon.getObser2());

            ps.setString(10, laboTon.getRef3() == null ? "" : laboTon.getRef3());
            ps.setString(11, laboTon.getDisque3() == null ? "" : laboTon.getDisque3());
            ps.setString(12, laboTon.getSchema3() == null ? "" : laboTon.getSchema3());
            ps.setString(13, laboTon.getObser3() == null ? "" : laboTon.getObser3());

            ps.setString(14, laboTon.getRef4() == null ? "" : laboTon.getRef4());
            ps.setString(15, laboTon.getDisque4() == null ? "" : laboTon.getDisque4());
            ps.setString(16, laboTon.getSchema4() == null ? "" : laboTon.getSchema4());
            ps.setString(17, laboTon.getObser4() == null ? "" : laboTon.getObser4());

            ps.setString(18, laboTon.getRef5() == null ? "" : laboTon.getRef5());
            ps.setString(19, laboTon.getDisque5() == null ? "" : laboTon.getDisque5());
            ps.setString(20, laboTon.getSchema5() == null ? "" : laboTon.getSchema5());
            ps.setString(21, laboTon.getObser5() == null ? "" : laboTon.getObser5());

            ps.setString(22, laboTon.getRef6() == null ? "" : laboTon.getRef6());
            ps.setString(23, laboTon.getDisque6() == null ? "" : laboTon.getDisque6());
            ps.setString(24, laboTon.getSchema6() == null ? "" : laboTon.getSchema6());
            ps.setString(25, laboTon.getObser6() == null ? "" : laboTon.getObser6());

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Insert Success LaboTon");
                return rs = true;
            } else {
                System.out.println("Insert Fail LaboTon");
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

    public LaboTon getLabTon(String nameFiche) {

        LaboTon labo = new LaboTon();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select * from appaddimadour.tronçonnage where idLabo=?";
        int idFiche = 0;
        try {

            idFiche = getLaboId(nameFiche);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFiche);

            rs = ps.executeQuery();

            if (rs.next()) {

                labo.setRef1(rs.getString("reference1"));
                labo.setDisque1(rs.getString("disqueUtilise1"));
                labo.setSchema1(rs.getString("schema1"));
                labo.setObser1(rs.getString("observacion1"));

                labo.setRef2(rs.getString("reference2"));
                labo.setDisque2(rs.getString("disqueUtilise2"));
                labo.setSchema2(rs.getString("schema2"));
                labo.setObser2(rs.getString("observacion2"));

                labo.setRef3(rs.getString("reference3"));
                labo.setDisque3(rs.getString("disqueUtilise3"));
                labo.setSchema3(rs.getString("schema3"));
                labo.setObser3(rs.getString("observacion3"));

                labo.setRef4(rs.getString("reference4"));
                labo.setDisque4(rs.getString("disqueUtilise4"));
                labo.setSchema4(rs.getString("schema4"));
                labo.setObser4(rs.getString("observacion4"));

                labo.setRef5(rs.getString("reference5"));
                labo.setDisque5(rs.getString("disqueUtilise5"));
                labo.setSchema5(rs.getString("schema5"));
                labo.setObser5(rs.getString("observacion5"));

                labo.setRef6(rs.getString("reference6"));
                labo.setDisque6(rs.getString("disqueUtilise6"));
                labo.setSchema6(rs.getString("schema6"));
                labo.setObser6(rs.getString("observacion6"));

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

    public boolean updateLaboTon(LaboTon laboTon) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLabo = 0;
        try {

           
                idLabo = this.getLaboId(laboTon.getNameLabo() == null ? "" : laboTon.getNameLabo());
                
                laboTon.setIdLabo(idLabo);
                String sql = "UPDATE appaddimadour.tronçonnage SET "
                        + "reference1 = ?, disqueUtilise1 = ?, schema1 = ?, observacion1 = ?, reference2 = ?, "
                        + "disqueUtilise2 = ?, schema2 = ?, observacion2 = ?, reference3 = ?, disqueUtilise3 = ?,"
                        + " schema3 = ?, observacion3 = ?, reference4 = ?, disqueUtilise4 = ?, schema4 =?, observacion4 = ?,"
                        + " reference5 = ?, disqueUtilise5 = ?, schema5 = ?, observacion5 = ?, reference6 = ?, disqueUtilise6 = ?,"
                        + " schema6 = ?, observacion6 = ? WHERE (idLabo = ?)";

                ps = con.prepareStatement(sql);

            ps.setString(1, laboTon.getRef1() == null ? "" : laboTon.getRef1());
            ps.setString(2, laboTon.getDisque1() == null ? "" : laboTon.getDisque1());
            ps.setString(3, laboTon.getSchema1() == null ? "" : laboTon.getSchema1());
            ps.setString(4, laboTon.getObser1() == null ? "" : laboTon.getObser1());

            ps.setString(5, laboTon.getRef2() == null ? "" : laboTon.getRef2());
            ps.setString(6, laboTon.getDisque2() == null ? "" : laboTon.getDisque2());
            ps.setString(7, laboTon.getSchema2() == null ? "" : laboTon.getSchema2());
            ps.setString(8, laboTon.getObser2() == null ? "" : laboTon.getObser2());

            ps.setString(9, laboTon.getRef3() == null ? "" : laboTon.getRef3());
            ps.setString(10, laboTon.getDisque3() == null ? "" : laboTon.getDisque3());
            ps.setString(11, laboTon.getSchema3() == null ? "" : laboTon.getSchema3());
            ps.setString(12, laboTon.getObser3() == null ? "" : laboTon.getObser3());

            ps.setString(13, laboTon.getRef4() == null ? "" : laboTon.getRef4());
            ps.setString(14, laboTon.getDisque4() == null ? "" : laboTon.getDisque4());
            ps.setString(15, laboTon.getSchema4() == null ? "" : laboTon.getSchema4());
            ps.setString(16, laboTon.getObser4() == null ? "" : laboTon.getObser4());

            ps.setString(17, laboTon.getRef5() == null ? "" : laboTon.getRef5());
            ps.setString(18, laboTon.getDisque5() == null ? "" : laboTon.getDisque5());
            ps.setString(19, laboTon.getSchema5() == null ? "" : laboTon.getSchema5());
            ps.setString(20, laboTon.getObser5() == null ? "" : laboTon.getObser5());

            ps.setString(21, laboTon.getRef6() == null ? "" : laboTon.getRef6());
            ps.setString(22, laboTon.getDisque6() == null ? "" : laboTon.getDisque6());
            ps.setString(23, laboTon.getSchema6() == null ? "" : laboTon.getSchema6());
            ps.setString(24, laboTon.getObser6() == null ? "" : laboTon.getObser6());
             ps.setInt(25, idLabo);

                int iInsCnt = ps.executeUpdate();
                if (iInsCnt > 0) {
                    System.out.println("Update Success");
                    return true;
                } else {
                    System.out.println("Update Fail");
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
        boolean delete=false;
        int rs = 0;
        int idLabo=0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.tronçonnage where idLabo=?";
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
