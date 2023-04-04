/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Login;

import java.sql.*;
import model.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author USER
 */
public class Main {

    public static ArrayList<Spesialis_umum> Spesialis_umum = new ArrayList<>();
    public static ArrayList<Spesialis_kandungan> Spesialis_kandungan = new ArrayList<>();
    public static ArrayList<Spesialis_mata> Spesialis_mata = new ArrayList<>();
    public static ArrayList<Spesialis_penyakitDalam> Spesialis_penyakitDalam = new ArrayList<>();
    public static ArrayList<Spesialis_tht> Spesialis_tht = new ArrayList<>();

    public static ArrayList<User> User = new ArrayList<>();

    public static int lastIndexUser = 0;
    public static int lastIndexDokter = 0;

    public static void readDokter() {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `dokter`";

        try {
            ps = Connection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString(3).equals("Penyakit Dalam")) {
                    Spesialis_penyakitDalam newKandungan = new Spesialis_penyakitDalam(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                    Spesialis_penyakitDalam.add(newKandungan);
                    lastIndexDokter++;
                } else if (rs.getString(3).equals("Umum")) {
                    Spesialis_umum newUmum = new Spesialis_umum(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                    Spesialis_umum.add(newUmum);
                    lastIndexDokter++;

                } else if (rs.getString(3).equals("Kandungan")) {
                    Spesialis_kandungan newKandungan = new Spesialis_kandungan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                    Spesialis_kandungan.add(newKandungan);
                    lastIndexDokter++;
                }
                else if (rs.getString(3).equals("Mata")) {
                    Spesialis_mata newMata = new Spesialis_mata(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                    Spesialis_mata.add(newMata);
                    lastIndexDokter++;
                }
                else if (rs.getString(3).equals("THT")) {
                    Spesialis_tht NewTHT = new Spesialis_tht(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                    Spesialis_tht.add(NewTHT);
                    lastIndexDokter++;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan saat mengambil data", "Gagal", 1);
            System.exit(0);

        }
    }

    public static void readUser() {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `user`";

        try {
            ps = Connection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                lastIndexUser++;
                User Newuser = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7), rs.getString(8));
                User.add(Newuser);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terdapat kesalahan saat mengambil data", "Gagal", 1);
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        readDokter();
        Login window = new Login();
        window.setVisible(true);

    }
}
