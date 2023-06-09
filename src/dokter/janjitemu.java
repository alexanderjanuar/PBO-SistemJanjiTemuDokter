/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dokter;

import Login.Login;

import Login.*;
import static dokter.ProfileDokter.*;
import java.awt.HeadlessException;
import static Login.Main.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.Spesialis_umum.hadir;
import java.sql.PreparedStatement;

/**
 *
 * @author USER
 */
public class janjitemu extends javax.swing.JFrame {

    int id;
    String status;

    /**
     * Creates new form password
     */
    public janjitemu() {
        initComponents();
        LihatTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        profil = new javax.swing.JLabel();
        textprofil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Password = new javax.swing.JLabel();
        tambahjanjitemu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelJanjiTemu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Hadir = new javax.swing.JButton();
        Tolak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 172, 182));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DOKTER");

        profile.setBackground(new java.awt.Color(130, 219, 216));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/doctor (1).png"))); // NOI18N
        profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilMouseClicked(evt);
            }
        });

        textprofil.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textprofil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textprofil.setText("Profil");
        textprofil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textprofilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textprofil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(130, 219, 216));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        Password.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Password.setText("Password");
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });

        tambahjanjitemu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambahjanjitemu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password .png"))); // NOI18N
        tambahjanjitemu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahjanjitemuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password)
                    .addComponent(tambahjanjitemu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tambahjanjitemu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar (1).png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Janji Temu");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(profile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(451, Short.MAX_VALUE)))
        );

        TabelJanjiTemu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nomor", "Tanggal", "Nama Pasien", "Status", "Jenis pemeriksaan"
            }
        ));
        TabelJanjiTemu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelJanjiTemuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelJanjiTemu);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JANJI TEMU");

        Hadir.setBackground(new java.awt.Color(51, 255, 255));
        Hadir.setText("Hadir");
        Hadir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Hadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HadirActionPerformed(evt);
            }
        });

        Tolak.setBackground(new java.awt.Color(51, 255, 255));
        Tolak.setText("Tolak");
        Tolak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Tolak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TolakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Hadir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(Tolak, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hadir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tolak, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ProfileDokter(spesialisDokter, indexDok).setVisible(true);
    }//GEN-LAST:event_profilMouseClicked

    private void textprofilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textprofilMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ProfileDokter(spesialisDokter, indexDok).setVisible(true);

    }//GEN-LAST:event_textprofilMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new password().setVisible(true);
    }//GEN-LAST:event_PasswordMouseClicked

    private void tambahjanjitemuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahjanjitemuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new janjitemu().setVisible(true);
    }//GEN-LAST:event_tambahjanjitemuMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6MouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ProfileDokter(spesialisDokter, indexDok).setVisible(true);
    }//GEN-LAST:event_profileMouseClicked

    private void TabelJanjiTemuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelJanjiTemuMouseClicked
        int baris = TabelJanjiTemu.rowAtPoint(evt.getPoint());
        id = Integer.parseInt(TabelJanjiTemu.getValueAt(baris, 0).toString());
        status = TabelJanjiTemu.getValueAt(baris, 3).toString();
    }//GEN-LAST:event_TabelJanjiTemuMouseClicked

    private void HadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HadirActionPerformed
        String acc = "Accept";
        PreparedStatement ps;
        String query;
        if (status.equals("Pending")) {
            if (spesialisDokter.equals("Umum")) {
                Spesialis_umum.get(indexDok).hadiriPetermuan();
                if (hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";

                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("Penyakit Dalam")) {
                Spesialis_penyakitDalam.get(indexDok).hadiriPetermuan();
                if (hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("Kandungan")) {
                Spesialis_kandungan.get(indexDok).hadiriPetermuan();
                if (hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("THT")) {
                Spesialis_tht.get(indexDok).hadiriPetermuan();
                if (hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("Mata")) {
                Spesialis_mata.get(indexDok).hadiriPetermuan();
                if (hadir) {
                    query = "UPDATE `janji temu` SET password='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Janji temu telah disetujui atau ditolak", "Gagal", 1);

        }
        LihatTabel();
    }//GEN-LAST:event_HadirActionPerformed

    private void TolakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TolakActionPerformed
        String acc = "Declined";
        PreparedStatement ps;
        String query;
        if (status.equals("Pending")) {
            if (spesialisDokter.equals("Umum")) {
                Spesialis_umum.get(indexDok).tolakPertemuan();
                if (!hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";

                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("Penyakit Dalam")) {
                Spesialis_penyakitDalam.get(indexDok).tolakPertemuan();
                if (!hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("Kandungan")) {
                Spesialis_kandungan.get(indexDok).tolakPertemuan();
                if (!hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("THT")) {
                Spesialis_tht.get(indexDok).tolakPertemuan();
                if (!hadir) {
                    query = "UPDATE `janji temu` SET status='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            } else if (spesialisDokter.equals("Mata")) {
                Spesialis_mata.get(indexDok).tolakPertemuan();
                if (!hadir) {
                    query = "UPDATE `janji temu` SET password='" + acc + "' WHERE  id_janjiTemu= '" + id + "'";
                    try {
                        ps = Connection.getConnection().prepareStatement(query);
                        ps.execute();
                        JOptionPane.showMessageDialog(this, "Janji temu telah disetujui", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Janji temu telah disetujui atau ditolak", "Gagal", 1);

        }
        LihatTabel();
    }//GEN-LAST:event_TolakActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(janjitemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(janjitemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(janjitemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(janjitemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new janjitemu().setVisible(true);
            }
        });
    }

    private void LihatTabel() {
        DefaultTableModel tableJanji = new DefaultTableModel();
        tableJanji.addColumn("ID");
        tableJanji.addColumn("Tanggal Janji");
        tableJanji.addColumn("Nama Pasien");
        tableJanji.addColumn("Status");
        tableJanji.addColumn("Jenis pemeriksaan");

        try {

            String kueri = "SELECT `janji temu`.id_janjiTemu,`janji temu`.tanggal,user.`Nama`, `janji temu`.status,`janji temu`.jenisPemeriksaan FROM `janji temu` INNER JOIN dokter ON `janji temu`.id_dokter = dokter.id_dokter INNER JOIN user ON `janji temu`.id_pasien = user.id WHERE `janji temu`.id_dokter='" + idDokter + "'";
            java.sql.Connection conn = (java.sql.Connection) Connection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(kueri);

            while (res.next()) {
                tableJanji.addRow(new Object[]{res.getInt(1), res.getDate(2), res.getString(3), res.getString(4), res.getString(5)});
            }
            TabelJanjiTemu.setModel(tableJanji);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hadir;
    private javax.swing.JLabel Password;
    private javax.swing.JTable TabelJanjiTemu;
    private javax.swing.JButton Tolak;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel profil;
    private javax.swing.JPanel profile;
    private javax.swing.JLabel tambahjanjitemu;
    private javax.swing.JLabel textprofil;
    // End of variables declaration//GEN-END:variables
}
