/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.*;

/**
 *
 * @author USER
 */
public class Spesialis_tht extends dokter implements Authentikasi {

    //Data Diri
    private int id;
    private String nama_dokter;
    private String spesialis;
    private String noTelp;
    private String email;

    //Data Authentikasi
    final private String username;
    private String password;
    
    //Konfirmasi Petemuan
    public static boolean hadir;

    public Spesialis_tht(int id, String nama_dokter, String spesialis, String noTelp, String email, String username, String password) {
        this.id = id;
        this.nama_dokter = nama_dokter;
        this.spesialis = spesialis;
        this.noTelp = noTelp;
        this.email = email;
        this.username = username;
        this.password = password;
    }



   public void hadiriPetermuan() {
        int jawab = JOptionPane.showOptionDialog(null,
                "Apakah Ingin Menghadiri Pertemuan? ",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            hadir = true;
        }
    }

    @Override
    public void tolakPertemuan() {
        int jawab = JOptionPane.showOptionDialog(null,
                "Apakah Ingin Menolak Pertemuan? ",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            hadir = false;
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getnoTelp() {
        return getNoTelp();
    }

    public void setnoTelp(String alamat) {
        this.setNoTelp(alamat);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public void login() {
        JOptionPane.showMessageDialog(null, "Selamat Datang " + getNama_dokter(), "Berhasil",1);

    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the noTelp
     */
    public String getNoTelp() {
        return noTelp;
    }

    /**
     * @param noTelp the noTelp to set
     */
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
