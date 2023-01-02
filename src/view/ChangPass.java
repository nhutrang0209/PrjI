/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 84899
 */
public class ChangPass extends javax.swing.JFrame {
    String email;
    ConnectDB cn = new ConnectDB();
    Connection conn;
    private ResultSet rs;
    public ChangPass(String email) {
        this.email=email;
        initComponents();
        setSize(600,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChange = new javax.swing.JLabel();
        lblOldPass = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JPasswordField();
        lblNewPass = new javax.swing.JLabel();
        txtConfirmNewPass = new javax.swing.JPasswordField();
        lblConfirmNewPass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnUpdatePass = new javax.swing.JButton();
        txtOldPass = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblChange.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblChange.setText("Đổi mật khẩu");
        getContentPane().add(lblChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        lblOldPass.setText("Mật khẩu cũ");
        getContentPane().add(lblOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        txtNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 180, 30));

        lblNewPass.setText("Mật khẩu mới");
        getContentPane().add(lblNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        txtConfirmNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmNewPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfirmNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 180, 30));

        lblConfirmNewPass.setText("Nhập lại mật khẩu mới");
        getContentPane().add(lblConfirmNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jButton1.setText("< Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        btnUpdatePass.setText("Cập nhật mật khẩu");
        btnUpdatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePassActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdatePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));
        getContentPane().add(txtOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 180, 30));

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(btnLogout);

        btnExit.setText("Thoát");
        jMenu1.add(btnExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePassActionPerformed
       //Thay doi mk tren CSDL
        conn = cn.getConnection();
        try {
            String sql = "SELECT MATKHAU FROM dangnhap WHERE EMAIL=?";
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (txtOldPass.getText().equals("") ) {
                JOptionPane.showMessageDialog(this,"Vui lòng điền đầy đủ");
                //In thong bao ngay duoi o mk cu(Them sau)
            } else if (rs.next()) {
                String pass=rs.getString(1);
                if(txtOldPass.getText().equals(pass)){
                    System.out.println("MK cu chinh xac");
                    String newPass=txtNewPass.getText();
                    String confirmNewPass=txtConfirmNewPass.getText();
                    if(newPass.length()<1){
                        JOptionPane.showMessageDialog(this, "Mat khau moi khong duoc bo trong");
                    }
                    else{
                        if(!newPass.equals(confirmNewPass)){
                            JOptionPane.showMessageDialog(this,"Mật khẩu mới không khớp");
                        }
                        else{
                            String sqlChangePass = "UPDATE dangnhap SET MATKHAU=? WHERE EMAIL=?";
                            ps = (PreparedStatement) conn.prepareCall(sqlChangePass);
                            ps.setString(1, newPass);
                            System.out.println("MK se doi la:"+newPass);
                            ps.setString(   2, email);
                            ps.execute();
                            JOptionPane.showMessageDialog(this,"Cập nhật mật khẩu thành công");
                        }
                    }
                }
                else JOptionPane.showMessageDialog(this,"Mật khẩu sai");                
                //In thong bao ngay duoi o mk cu(Them sau)
            } else {
                JOptionPane.showMessageDialog(this,"Email k hop le");
                //In thong bao ngay duoi o mk cu(Them sau)
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnUpdatePassActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        // Nhap mk moi( co the them kiem tra tinh dung dan cua mk moi)
    }//GEN-LAST:event_newPasswordActionPerformed

    private void confirmNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmNewPasswordActionPerformed
        // Kiem tra khop voi mk moi
    }//GEN-LAST:event_confirmNewPasswordActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        DocGiaView docgiaview = new DocGiaView(email);
        dispose();
        docgiaview.setVisible(true);
    }//GEN-LAST:event_quitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginView login = new LoginView();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ChangPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangPass("trang2002cool@gmail.").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnLogout;
    private javax.swing.JButton btnUpdatePass;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblConfirmNewPass;
    private javax.swing.JLabel lblNewPass;
    private javax.swing.JLabel lblOldPass;
    private javax.swing.JPasswordField txtConfirmNewPass;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPass;
    // End of variables declaration//GEN-END:variables
}