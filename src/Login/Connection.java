/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Login;

// import java.sql.Driver;
import java.sql.DriverManager;


/**
 *
 * @author USER
 */
public class Connection {

    private static java.sql.Connection con;
    private static String url = "jdbc:mysql://localhost:3306/pa_pbo";

    public static java.sql.Connection getConnection() {
        try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            con = DriverManager.getConnection(url, "root", "");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return con;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

