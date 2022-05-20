/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;

import Modele.DB.Connexion;
import Modele.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class QueryLogin extends Connexion {

    public boolean getUser(Login login) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "SELECT idUserName, userName FROM appaddimadour.users where userName=? and userPassword=?";

        try {
            ps = con.prepareCall(sql);
            ps.setString(1, login.getUser());
              ps.setString(2, login.getPassword());
            rs = ps.executeQuery();

            if (rs.next()) {
                login.setIdUser(Integer.parseInt(rs.getString("idUserName")));
                login.setUser(rs.getString("idUserName"));
                return true;
            }

            return false;
        } catch (SQLException e) {

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
