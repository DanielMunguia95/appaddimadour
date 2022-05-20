/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.LaboEnrobage;
import Modele.LaboTon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class QueryLaboEnrobage extends QueryLabo {

    public boolean saveLaboTon(LaboEnrobage laboEnrobage) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;

        int idLabo = 0;
        try {

            idLabo = getLaboId(laboEnrobage.getNameLabo() == null ? "" : laboEnrobage.getNameLabo());
            laboEnrobage.setIdLabo(idLabo);
            String sql = "INSERT INTO appaddimadour.enrobage (idLabo, numDenrobage1, schema1,"
                    + " observacion1, numDenrobage2, schema2, observacion2, numDenrobage3, schema3,"
                    + " observacion3, numDenrobage4, schema4, observacion4, numDenrobage5, schema5, "
                    + "observacion5, numDenrobage6, schema6, observacion6, reference1, reference2, "
                    + "reference3, reference4, reference5, reference6) VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            ps = con.prepareStatement(sql);

            ps.setInt(1, laboEnrobage.getIdLabo() == 0 ? 0 : laboEnrobage.getIdLabo());

            ps.setString(2, laboEnrobage.getNumDEnrobage1() == null ? "" : laboEnrobage.getNumDEnrobage1());
            ps.setString(3, laboEnrobage.getShema1() == null ? "" : laboEnrobage.getShema1());
            ps.setString(4, laboEnrobage.getObservation1() == null ? "" : laboEnrobage.getObservation1());

            ps.setString(5, laboEnrobage.getNumDEnrobage2() == null ? "" : laboEnrobage.getNumDEnrobage2());
            ps.setString(6, laboEnrobage.getShema2() == null ? "" : laboEnrobage.getShema2());
            ps.setString(7, laboEnrobage.getObservation2() == null ? "" : laboEnrobage.getObservation2());

            ps.setString(8, laboEnrobage.getNumDEnrobage3() == null ? "" : laboEnrobage.getNumDEnrobage3());
            ps.setString(9, laboEnrobage.getShema3() == null ? "" : laboEnrobage.getShema3());
            ps.setString(10, laboEnrobage.getObservation3() == null ? "" : laboEnrobage.getObservation1());

            ps.setString(11, laboEnrobage.getNumDEnrobage4() == null ? "" : laboEnrobage.getNumDEnrobage4());
            ps.setString(12, laboEnrobage.getShema4() == null ? "" : laboEnrobage.getShema4());
            ps.setString(13, laboEnrobage.getObservation4() == null ? "" : laboEnrobage.getObservation4());

            ps.setString(14, laboEnrobage.getNumDEnrobage5() == null ? "" : laboEnrobage.getNumDEnrobage5());
            ps.setString(15, laboEnrobage.getShema5() == null ? "" : laboEnrobage.getShema5());
            ps.setString(16, laboEnrobage.getObservation5() == null ? "" : laboEnrobage.getObservation5());

            ps.setString(17, laboEnrobage.getNumDEnrobage6() == null ? "" : laboEnrobage.getNumDEnrobage6());
            ps.setString(18, laboEnrobage.getShema6() == null ? "" : laboEnrobage.getShema6());
            ps.setString(19, laboEnrobage.getObservation6() == null ? "" : laboEnrobage.getObservation6());

            ps.setString(20, laboEnrobage.getReference1() == null ? "" : laboEnrobage.getReference1());
            ps.setString(21, laboEnrobage.getReference2() == null ? "" : laboEnrobage.getReference2());
            ps.setString(22, laboEnrobage.getReference3() == null ? "" : laboEnrobage.getReference3());
            ps.setString(23, laboEnrobage.getReference4() == null ? "" : laboEnrobage.getReference4());
            ps.setString(24, laboEnrobage.getReference5() == null ? "" : laboEnrobage.getReference5());
            ps.setString(25, laboEnrobage.getReference6() == null ? "" : laboEnrobage.getReference6());

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Insert Success laboEnrobage");
                return rs = true;
            } else {
                System.out.println("Insert Fail laboEnrobage");
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

    public LaboEnrobage getLaboEnrobage(String nameLabo) {
        LaboEnrobage laboEnrobage = new LaboEnrobage();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select * from appaddimadour.enrobage where idLabo=?";
        int idFiche = 0;
        try {

            idFiche = getLaboId(nameLabo);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idFiche);

            rs = ps.executeQuery();

            if (rs.next()) {

                laboEnrobage.setNumDEnrobage1(rs.getString("numDenrobage1"));
                laboEnrobage.setNumDEnrobage2(rs.getString("numDenrobage2"));
                laboEnrobage.setNumDEnrobage3(rs.getString("numDenrobage3"));
                laboEnrobage.setNumDEnrobage4(rs.getString("numDenrobage4"));
                laboEnrobage.setNumDEnrobage5(rs.getString("numDenrobage5"));
                laboEnrobage.setNumDEnrobage6(rs.getString("numDenrobage6"));

                laboEnrobage.setObservation1(rs.getString("observacion1"));
                laboEnrobage.setObservation2(rs.getString("observacion2"));
                laboEnrobage.setObservation3(rs.getString("observacion3"));
                laboEnrobage.setObservation4(rs.getString("observacion4"));
                laboEnrobage.setObservation5(rs.getString("observacion5"));
                laboEnrobage.setObservation6(rs.getString("observacion6"));

                laboEnrobage.setShema1(rs.getString("schema1"));
                laboEnrobage.setShema2(rs.getString("schema2"));
                laboEnrobage.setShema3(rs.getString("schema3"));
                laboEnrobage.setShema4(rs.getString("schema4"));
                laboEnrobage.setShema5(rs.getString("schema5"));
                laboEnrobage.setShema6(rs.getString("schema6"));

                laboEnrobage.setReference1(rs.getString("reference1"));
                laboEnrobage.setReference2(rs.getString("reference2"));
                laboEnrobage.setReference3(rs.getString("reference3"));
                laboEnrobage.setReference4(rs.getString("reference4"));
                laboEnrobage.setReference5(rs.getString("reference5"));
                laboEnrobage.setReference6(rs.getString("reference6"));
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
        return laboEnrobage;
    }

    public boolean updateLaboEnrobage(LaboEnrobage laboEnrobage) {
        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLabo = 0;

        try {
            idLabo = getLaboId(laboEnrobage.getNameLabo() == null ? "" : laboEnrobage.getNameLabo());
            laboEnrobage.setIdLabo(idLabo);

            String sql = "UPDATE appaddimadour.enrobage SET"
                    + " numDenrobage1 = ?, schema1 = ?, observacion1 = ?,"
                    + " numDenrobage2 = ?, schema2 = ?, observacion2 = ?,"
                    + " numDenrobage3 = ?, schema3 = ?, observacion3 = ?,"
                    + " numDenrobage4 = ?, schema4 = ?, observacion4 = ?,"
                    + " numDenrobage5 = ?, schema5 = ?, observacion5 = ?,"
                    + " numDenrobage6 = ?, schema6 = ?,observacion6 = ?, "
                    + "reference1 = ?, reference2 = ?, reference3 = ?,"
                    + " reference4 = ?, reference5 = ?, reference6 = ? WHERE (idLabo = ?);";

            ps = con.prepareStatement(sql);

            ps.setString(1, laboEnrobage.getNumDEnrobage1() == null ? "" : laboEnrobage.getNumDEnrobage1());
            ps.setString(2, laboEnrobage.getShema1() == null ? "" : laboEnrobage.getShema1());
            ps.setString(3, laboEnrobage.getObservation1() == null ? "" : laboEnrobage.getObservation1());

            ps.setString(4, laboEnrobage.getNumDEnrobage2() == null ? "" : laboEnrobage.getNumDEnrobage2());
            ps.setString(5, laboEnrobage.getShema2() == null ? "" : laboEnrobage.getShema2());
            ps.setString(6, laboEnrobage.getObservation2() == null ? "" : laboEnrobage.getObservation2());

            ps.setString(7, laboEnrobage.getNumDEnrobage3() == null ? "" : laboEnrobage.getNumDEnrobage3());
            ps.setString(8, laboEnrobage.getShema3() == null ? "" : laboEnrobage.getShema3());
            ps.setString(9, laboEnrobage.getObservation3() == null ? "" : laboEnrobage.getObservation1());

            ps.setString(10, laboEnrobage.getNumDEnrobage4() == null ? "" : laboEnrobage.getNumDEnrobage4());
            ps.setString(11, laboEnrobage.getShema4() == null ? "" : laboEnrobage.getShema4());
            ps.setString(12, laboEnrobage.getObservation4() == null ? "" : laboEnrobage.getObservation4());

            ps.setString(13, laboEnrobage.getNumDEnrobage5() == null ? "" : laboEnrobage.getNumDEnrobage5());
            ps.setString(14, laboEnrobage.getShema5() == null ? "" : laboEnrobage.getShema5());
            ps.setString(15, laboEnrobage.getObservation5() == null ? "" : laboEnrobage.getObservation5());

            ps.setString(16, laboEnrobage.getNumDEnrobage6() == null ? "" : laboEnrobage.getNumDEnrobage6());
            ps.setString(17, laboEnrobage.getShema6() == null ? "" : laboEnrobage.getShema6());
            ps.setString(18, laboEnrobage.getObservation6() == null ? "" : laboEnrobage.getObservation6());

            ps.setString(19, laboEnrobage.getReference1() == null ? "" : laboEnrobage.getReference1());
            ps.setString(20, laboEnrobage.getReference2() == null ? "" : laboEnrobage.getReference2());
            ps.setString(21, laboEnrobage.getReference3() == null ? "" : laboEnrobage.getReference3());
            ps.setString(22, laboEnrobage.getReference4() == null ? "" : laboEnrobage.getReference4());
            ps.setString(23, laboEnrobage.getReference5() == null ? "" : laboEnrobage.getReference5());
            ps.setString(24, laboEnrobage.getReference6() == null ? "" : laboEnrobage.getReference6());

            ps.setInt(25, idLabo);

            int iInsCnt = ps.executeUpdate();
            if (iInsCnt > 0) {
                System.out.println("Insert Success laboEnrobage");
                return rs = true;
            } else {
                System.out.println("Insert Fail laboEnrobage");
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

    public boolean deleteLaboTon(String nameLabo) {

        Connection con = getConexion();
        boolean delete = false;
        int rs = 0;
        int idLabo = 0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.enrobage where idLabo=?";
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
                System.out.println("No se elimino");
            }

        } catch (Exception e) {

            return delete;
        }

        return delete;

    }

}
