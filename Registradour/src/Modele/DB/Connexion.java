/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele.DB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Altair
 */
public class Connexion {

    private final String base = "appaddimadour";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private Connection conn = null;

    public Connection getConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn =(Connection) DriverManager.getConnection(this.url, this.user, this.password);

        } catch (SQLException | ClassNotFoundException e) {

            System.out.println(e);
            

        }

        return conn;
    }

}
