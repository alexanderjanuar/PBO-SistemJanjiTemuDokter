/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Login.Login;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class User implements Authentikasi {

    //Data Diri
    private int id;
    private String namaUser;
    private String Alamat;
    private String noTelp;
    private String email;
    private Date tanggalLahir;

    //Data Authentikasi
    private String username;
    private String password;

    //Status login
    public static boolean log;

    public User(int id, String namaUser, String Alamat, String noTelp, String email, Date tanggalLahir, String username, String password) {
        this.id = id;
        this.namaUser = namaUser;
        this.Alamat = Alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.tanggalLahir = tanggalLahir;
        this.username = username;
        this.password = password;
    }

    @Override
    public void login() {
        JOptionPane.showMessageDialog(null, "Selamat Datang " + getNamaUser(), "Berhasil", 1);

    }

    @Override
    public void logout() {
        int jawab = JOptionPane.showOptionDialog(null,
                "Ingin Keluar?",
                "Keluar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (jawab == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Selamat Tinggal " + this.namaUser);
            log = false;
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the namaUser
     */
    public String getNamaUser() {
        return namaUser;
    }

    /**
     * @param namaUser the namaUser to set
     */
    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tanggalLahir
     */
    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
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
    public void setUsername(String username) {
        this.username = username;
    }

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
