package User;

import Login.*;
import static Login.Main.*;
import static model.User.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Profil extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    String query;
    public static int indexUser;
    public static int indexJanjiTemuUser;

    public Profil(int index) {
        indexUser = index;

        initComponents();
        namaUser.setText(User.get(index).getNamaUser());
        tanggalLahirUser.setText(User.get(index).getTanggalLahir().toString());
        alamatUser.setText(User.get(index).getAlamat());
        emailUser.setText(User.get(index).getEmail());
        indexJanjiTemuUser = User.get(index).getId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        textTambahJanjiTemu = new javax.swing.JLabel();
        TambahJanjiTemu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        JanjiTemu = new javax.swing.JLabel();
        textJanjiTemu = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        UbahNama = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        namaUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tanggalLahirUser = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        alamatUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailUser = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        ResetPassword = new javax.swing.JButton();
        UbahAlamat = new javax.swing.JButton();
        UbahEmail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 172, 182));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Profil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Logout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Logout.setText("Logout");
        Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(130, 219, 216));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        textTambahJanjiTemu.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        textTambahJanjiTemu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTambahJanjiTemu.setText("Tambah Janji Temu");
        textTambahJanjiTemu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTambahJanjiTemuMouseClicked(evt);
            }
        });

        TambahJanjiTemu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TambahJanjiTemu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus-small (1).png"))); // NOI18N
        TambahJanjiTemu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahJanjiTemuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(textTambahJanjiTemu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(TambahJanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(TambahJanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTambahJanjiTemu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(130, 219, 216));

        JanjiTemu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JanjiTemu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/calendar (1).png"))); // NOI18N
        JanjiTemu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JanjiTemuMouseClicked(evt);
            }
        });

        textJanjiTemu.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        textJanjiTemu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textJanjiTemu.setText("Janji Temu");
        textJanjiTemu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textJanjiTemuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textJanjiTemu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textJanjiTemu, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(Logout)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(Logout)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PROFIL");

        UbahNama.setText("Ubah?");
        UbahNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahNamaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nama");

        namaUser.setEditable(false);
        namaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaUserActionPerformed(evt);
            }
        });

        jLabel8.setText("TTL");

        tanggalLahirUser.setEditable(false);
        tanggalLahirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalLahirUserActionPerformed(evt);
            }
        });

        jLabel9.setText("Alamat");

        alamatUser.setEditable(false);

        jLabel10.setText("Email");

        emailUser.setEditable(false);
        emailUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUserActionPerformed(evt);
            }
        });

        Password.setText("Password");

        ResetPassword.setText("Reset Password?");
        ResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetPasswordActionPerformed(evt);
            }
        });

        UbahAlamat.setText("Ubah?");
        UbahAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahAlamatActionPerformed(evt);
            }
        });

        UbahEmail.setText("Ubah?");
        UbahEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(Password))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaUser)
                            .addComponent(tanggalLahirUser)
                            .addComponent(alamatUser)
                            .addComponent(emailUser)
                            .addComponent(ResetPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UbahNama)
                            .addComponent(UbahAlamat)
                            .addComponent(UbahEmail))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(namaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UbahNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalLahirUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(alamatUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UbahAlamat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UbahEmail)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password)
                    .addComponent(ResetPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        log = true;
        User.get(indexUser).logout();

        //Melihat status login User
        if (!log) {
            this.setVisible(false);
            new Login().setVisible(true);
        }


    }//GEN-LAST:event_LogoutActionPerformed

    private void TambahJanjiTemuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahJanjiTemuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new TambahJanjiTemu().setVisible(true);
    }//GEN-LAST:event_TambahJanjiTemuMouseClicked

    private void textTambahJanjiTemuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTambahJanjiTemuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new TambahJanjiTemu().setVisible(true);
    }//GEN-LAST:event_textTambahJanjiTemuMouseClicked

    private void JanjiTemuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JanjiTemuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Janjitemu().setVisible(true);
    }//GEN-LAST:event_JanjiTemuMouseClicked

    private void textJanjiTemuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textJanjiTemuMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Janjitemu().setVisible(true);
    }//GEN-LAST:event_textJanjiTemuMouseClicked

    private void UbahNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahNamaActionPerformed

        String inputan = JOptionPane.showInputDialog("Input Nama Baru");
        query = "UPDATE user SET Nama='" + inputan + "'WHERE  Nama= '" + User.get(indexUser).getNamaUser() + "'";

        try {
            ps = Connection.getConnection().prepareStatement(query);
            ps.execute();
            User.get(indexUser).setNamaUser(inputan);

            JOptionPane.showMessageDialog(this, "Edit Account Succes...", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            System.err.println(ex);
        }

        this.setVisible(false);
        new Profil(indexUser).setVisible(true);
    }//GEN-LAST:event_UbahNamaActionPerformed

    private void ResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetPasswordActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ResetPassword().setVisible(true);
    }//GEN-LAST:event_ResetPasswordActionPerformed

    private void UbahEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahEmailActionPerformed
        String inputan = JOptionPane.showInputDialog("Input Email Baru");
        query = "UPDATE user SET Email='" + inputan + "'WHERE  Nama= '" + User.get(indexUser).getNamaUser() + "'";

        try {
            ps = Connection.getConnection().prepareStatement(query);
            ps.execute();
            User.get(indexUser).setEmail(inputan);

            JOptionPane.showMessageDialog(this, "Edit Account Succes...", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            System.err.println(ex);
        }

        this.setVisible(false);
        new Profil(indexUser).setVisible(true);
    }//GEN-LAST:event_UbahEmailActionPerformed

    private void UbahAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahAlamatActionPerformed
        String inputan = JOptionPane.showInputDialog("Input Alamat Baru");
        query = "UPDATE user SET Alamat='" + inputan + "'WHERE  Nama= '" + User.get(indexUser).getNamaUser() + "'";

        try {
            ps = Connection.getConnection().prepareStatement(query);
            ps.execute();
            User.get(indexUser).setAlamat(inputan);

            JOptionPane.showMessageDialog(this, "Edit Account Succes...", "Informasi", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            System.err.println(ex);
        }

        this.setVisible(false);
        new Profil(indexUser).setVisible(true);
    }//GEN-LAST:event_UbahAlamatActionPerformed

    private void namaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaUserActionPerformed

    private void emailUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailUserActionPerformed

    private void tanggalLahirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalLahirUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalLahirUserActionPerformed

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
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profil(indexUser).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JanjiTemu;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel Password;
    private javax.swing.JButton ResetPassword;
    private javax.swing.JLabel TambahJanjiTemu;
    private javax.swing.JButton UbahAlamat;
    private javax.swing.JButton UbahEmail;
    private javax.swing.JButton UbahNama;
    private javax.swing.JTextField alamatUser;
    private javax.swing.JTextField emailUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField namaUser;
    private javax.swing.JTextField tanggalLahirUser;
    private javax.swing.JLabel textJanjiTemu;
    private javax.swing.JLabel textTambahJanjiTemu;
    // End of variables declaration//GEN-END:variables
}
