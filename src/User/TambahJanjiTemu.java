package User;

import Login.*;

import static Login.Main.*;
import static User.Profil.indexUser;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TambahJanjiTemu extends javax.swing.JFrame {

    String spesialis;
    String pemeriksaan;
    int IDdokter;
    int lastIndex;

    public TambahJanjiTemu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timingTargetAdapter1 = new org.jdesktop.animation.timing.TimingTargetAdapter();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Profil = new javax.swing.JLabel();
        textProfil = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Janji_temu = new javax.swing.JLabel();
        textJanji_temu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        IDPasien = new javax.swing.JLabel();
        Tambahkan = new javax.swing.JButton();
        Spesialis = new javax.swing.JComboBox<>();
        Dokter = new javax.swing.JComboBox<>();
        IDDokter1 = new javax.swing.JLabel();
        DatePick = new com.toedter.calendar.JDateChooser();
        IDDokter2 = new javax.swing.JLabel();
        IDDokter3 = new javax.swing.JLabel();
        jenisPemeriksaan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 172, 182));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER");

        jPanel2.setBackground(new java.awt.Color(130, 219, 216));

        Profil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user (1).png"))); // NOI18N
        Profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfilMouseClicked(evt);
            }
        });

        textProfil.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textProfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textProfil.setText("Profil");
        textProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textProfilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Profil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Profil, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tambah Janji Temu");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-small (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(130, 219, 216));

        Janji_temu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Janji_temu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar (1).png"))); // NOI18N
        Janji_temu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Janji_temuMouseClicked(evt);
            }
        });

        textJanji_temu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textJanji_temu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textJanji_temu.setText("Janji Temu");
        textJanji_temu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textJanji_temuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textJanji_temu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Janji_temu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Janji_temu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textJanji_temu, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(40, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buat Janji Temu");
        jLabel3.setToolTipText("");

        Tanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tanggal.setText("Tanggal");

        IDPasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDPasien.setText("Dokter");

        Tambahkan.setText("Buat");
        Tambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahkanActionPerformed(evt);
            }
        });

        Spesialis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Umum", "Mata", "Kandungan", "THT", "Penyakit Dalam", " " }));
        Spesialis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpesialisActionPerformed(evt);
            }
        });

        IDDokter1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDDokter1.setText("Jenis Pemeriksaan");

        IDDokter2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        IDDokter3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDDokter3.setText("Spesialisasi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Tambahkan)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(192, 192, 192))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDDokter1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDDokter2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jenisPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDDokter3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Tanggal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                                .addComponent(DatePick, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDPasien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tanggal)
                            .addComponent(DatePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(Spesialis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IDDokter3))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDPasien)
                    .addComponent(Dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDDokter1)
                    .addComponent(jenisPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDDokter2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tambahkan)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfilMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Profil(indexUser).setVisible(true);
    }//GEN-LAST:event_ProfilMouseClicked

    private void textProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textProfilMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Profil(indexUser).setVisible(true);
    }//GEN-LAST:event_textProfilMouseClicked

    private void Janji_temuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Janji_temuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Janjitemu().setVisible(true);
    }//GEN-LAST:event_Janji_temuMouseClicked

    private void textJanji_temuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textJanji_temuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Janjitemu().setVisible(true);
    }//GEN-LAST:event_textJanji_temuMouseClicked

    private void SpesialisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpesialisActionPerformed
        spesialis = Spesialis.getSelectedItem().toString();
        jenisPemeriksaan.removeAllItems();
        Dokter.removeAllItems();
        System.out.println(spesialis);
        if ("Umum".equals(spesialis)) {
            jenisPemeriksaan.removeAllItems();
            for (int i = 0; i < Spesialis_umum.size(); i++) {
                Dokter.addItem(Spesialis_umum.get(i).getNama_dokter());
            }
            jenisPemeriksaan.addItem("Elektrokardiogram");
            jenisPemeriksaan.addItem("Medical Check-Up");
        } else if ("Penyakit Dalam".equals(spesialis)) {
            jenisPemeriksaan.removeAllItems();
            for (int i = 0; i < Spesialis_penyakitDalam.size(); i++) {
                Dokter.addItem(Spesialis_umum.get(i).getNama_dokter());
            }
            jenisPemeriksaan.addItem("Radiologi");
            jenisPemeriksaan.addItem("Hematologi");
            jenisPemeriksaan.addItem("Kardiovaskular");
        } else if ("THT".equals(spesialis)) {
            jenisPemeriksaan.removeAllItems();
            for (int i = 0; i < Spesialis_tht.size(); i++) {
                Dokter.addItem(Spesialis_tht.get(i).getNama_dokter());
            }
            jenisPemeriksaan.addItem("Audiometri");
            jenisPemeriksaan.addItem("Trakeostomi");
            jenisPemeriksaan.addItem("Esofangoskopi");
        } else if ("Kandungan".equals(spesialis)) {
            jenisPemeriksaan.removeAllItems();
            for (int i = 0; i < Spesialis_kandungan.size(); i++) {
                Dokter.addItem(Spesialis_kandungan.get(i).getNama_dokter());
            }
            jenisPemeriksaan.addItem("USG");
            jenisPemeriksaan.addItem("Perimetri");
            jenisPemeriksaan.addItem("Retinoskopi");
        } else if ("Mata".equals(spesialis)) {
            jenisPemeriksaan.removeAllItems();
            for (int i = 0; i < Spesialis_mata.size(); i++) {
                Dokter.addItem(Spesialis_mata.get(i).getNama_dokter());
            }
            jenisPemeriksaan.addItem("Tonometri");
            jenisPemeriksaan.addItem("Perimetri");
            jenisPemeriksaan.addItem("Retinoskopi");
        }
    }//GEN-LAST:event_SpesialisActionPerformed

    private void TambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahkanActionPerformed
        this.dispose();
        java.util.Date tanggal = DatePick.getCalendar().getTime();
        java.sql.Date sqlDate = new java.sql.Date(tanggal.getTime());
        PreparedStatement ps;
        ResultSet rs;
        String query;
        pemeriksaan = jenisPemeriksaan.getSelectedItem().toString();

        System.out.println(indexUser);
        LastIndex();
        cariDokter();
        
        

        query = "INSERT INTO `janji temu` (`id_janjiTemu`, `tanggal`,`id_dokter`, `id_pasien`, `status`,`jenisPemeriksaan`) VALUES (?,?,?,?,?,?)";
        try {
            ps = Connection.getConnection().prepareStatement(query);

            ps.setInt(1, lastIndex + 1);
            ps.setDate(2, sqlDate);
            ps.setInt(3, IDdokter);
            ps.setInt(4, indexUser+1);
            ps.setString(5, "Pending");
            ps.setString(6, pemeriksaan);
            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Janji Temu Ditambah");
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        //Janjitemu page1 = new Janjitemu();
        //page1.setVisible(true);
    }//GEN-LAST:event_TambahkanActionPerformed
    void LastIndex() {
        PreparedStatement ps;
        ResultSet rs;
        String query;

        //Mencari index terkahir
        query = "SELECT * FROM `janji temu`";
        try {
            ps = Connection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                lastIndex++;
            }
        } catch (SQLException ex) {
            System.err.println("321");
        }
    }

    void cariDokter() {
        PreparedStatement ps;
        ResultSet rs;
        String query;
        String dokter = Dokter.getSelectedItem().toString();
        System.out.println(dokter);
        

        query = "SELECT * FROM `dokter` WHERE `nama dokter` = '"+ dokter +"'";
        try {
            ps = Connection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            if (rs.next()) {
                ps.setInt(1, IDdokter);
            }
        } catch (SQLException ex) {
            System.err.println("123");
        }
    }

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
            java.util.logging.Logger.getLogger(TambahJanjiTemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahJanjiTemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahJanjiTemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahJanjiTemu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahJanjiTemu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DatePick;
    private javax.swing.JComboBox<String> Dokter;
    private javax.swing.JLabel IDDokter1;
    private javax.swing.JLabel IDDokter2;
    private javax.swing.JLabel IDDokter3;
    private javax.swing.JLabel IDPasien;
    private javax.swing.JLabel Janji_temu;
    private javax.swing.JLabel Profil;
    private javax.swing.JComboBox<String> Spesialis;
    private javax.swing.JButton Tambahkan;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> jenisPemeriksaan;
    private javax.swing.JLabel textJanji_temu;
    private javax.swing.JLabel textProfil;
    private org.jdesktop.animation.timing.TimingTargetAdapter timingTargetAdapter1;
    // End of variables declaration//GEN-END:variables
}
