/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import database.ConnectDB;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 84899
 */
public class LoginView extends javax.swing.JFrame {
    ConnectDB cn = new ConnectDB();
    Connection conn;
    private ResultSet rs;
    /**
     * Creates new form LoginVie
     */
    public LoginView() {
        initComponents();
        setSize(700,600);
        initClock();
    }

    private void initClock() {
        Clock th = new Clock(lblClock);
        th.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        adminLoginButton = new javax.swing.JButton();
        userLoginButton = new javax.swing.JButton();
        btnQuenmk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();
        btnHelp = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hust.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 90, 130));

        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        getContentPane().add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 290, 40));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 290, 40));

        adminLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adminLoginButton.setText("Đăng nhập là quản trị viên");
        adminLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, 30));

        userLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userLoginButton.setText("Đăng nhập là độc giả");
        userLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 210, 30));

        btnQuenmk.setText("Quên mật khẩu");
        btnQuenmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenmkActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuenmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 120, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Email");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Mật khẩu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        lblClock.setBackground(new java.awt.Color(204, 255, 204));
        lblClock.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblClock.setText("AM - PM");
        lblClock.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblClockAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                lblClockAncestorRemoved(evt);
            }
        });
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Đại học Bách Khoa Hà Nội");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        jLabel6.setText("Thư viện Tạ Quang Bửu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nen-background-trang-dep-va-don-gian_110344503.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));
        background.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jMenu1.add(btnExit);

        btnHelp.setText("Trợ giúp");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        jMenu1.add(btnHelp);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                        
    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add yourhandling  code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void adminLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginButtonActionPerformed
        conn = cn.getConnection();
        try {
            String sql = "SELECT*FROM dangnhap WHERE EMAIL=? AND MATKHAU=? AND PHANLOAI='QTV'";
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ps.setString(1, txtMail.getText());
            ps.setString(2, txtPass.getText());
            rs = ps.executeQuery();
            if (txtMail.getText().equals("") || txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Email và mật khẩu không được để trống");
            } else if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                dispose();
                AdminView am = new AdminView();
                am.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Email hoặc mật khẩu không đúng");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_adminLoginButtonActionPerformed

    private void userLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginButtonActionPerformed
        conn = cn.getConnection();
        try {
            String sql = "SELECT*FROM dangnhap WHERE EMAIL=? AND MATKHAU=? AND PHANLOAI='Độc giả'";
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ps.setString(1, txtMail.getText());
            ps.setString(2, txtPass.getText());
            rs = ps.executeQuery();
            if (txtMail.getText().equals("") || txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Email và mật khẩu không được để trống");
            } else if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                dispose();
                DocGiaView dg = new DocGiaView(txtMail.getText());
                dg.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Email hoặc mật khẩu không đúng");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_userLoginButtonActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        String message = "1. Tài khoản và mật khẩu đăng nhập được cấp trực tiếp tại thư viện \n"+
                "2. Giờ mở cửa thư viện: \n"
                + "Thứ 2 đến thứ 6: 8h - 20h \n"
                + "Thứ 7, chủ nhật: 8h - 18h";
        JOptionPane.showMessageDialog(new JFrame(), message,"Trợ giúp", 0x1);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnQuenmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenmkActionPerformed
        String email;
        email  = JOptionPane.showInputDialog("Nhập email của bạn");
        conn = cn.getConnection();
        try {
            String sql = "SELECT email FROM dangnhap WHERE EMAIL=?";
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (email.equals("")) {
                JOptionPane.showMessageDialog(this, "Email không được để trống");
            } else if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Mật khẩu mới được gửi về " + email );
                //dispose();            
            } else {
                JOptionPane.showMessageDialog(this, "Email không đúng");
            }
        } catch (Exception e) {
        }
        
	//JOptionPane.showMessageDialog(rootPane,"Mật khẩu mới đã được gửi về mail của bạn");
    }//GEN-LAST:event_btnQuenmkActionPerformed

    private void lblClockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorAdded

    private void lblClockAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorRemoved

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginButton;
    private javax.swing.JLabel background;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnHelp;
    private javax.swing.JButton btnQuenmk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JButton userLoginButton;
    // End of variables declaration//GEN-END:variables
}
