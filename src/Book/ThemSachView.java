/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Book;

import dao.SachDao;
import javax.swing.JOptionPane;
import model.SachModel;
import view.AdminView;
import view.Clock;
import view.LoginView;
/**
 *
 * @author 84899
 */
public class ThemSachView extends javax.swing.JFrame {

    /**
     * Creates new form ThemSachView
     */
    public ThemSachView() {
        initComponents();
        setSize(1000,660);
        initClock();
    }
    
    private void initClock() {
        Clock th = new Clock(lblClock);
        th.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnInsertBook = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNXB = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        txtMaViTri = new javax.swing.JTextField();
        lblClock = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thêm sách");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        btnInsertBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertBook.setText("Thêm");
        btnInsertBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 120, 30));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("< Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 100, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên sách");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Thông tin sách cần thêm");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 210, 30));
        jPanel1.add(txtTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tên tác giả");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(txtTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhà xuất bản");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));
        jPanel1.add(txtNXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 180, 40));
        jPanel1.add(txtTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Thể loại");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Số lượng");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Vị trí");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));
        jPanel1.add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 200, 40));
        jPanel1.add(txtMaViTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 710, 310));

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
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, 30));

        jMenu1.setText("Hệ thống");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuLogout.setText("Đăng xuất");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogout);

        menuExit.setText("Thoát");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        LoginView login = new LoginView();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void lblClockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorAdded

    private void lblClockAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorRemoved

    private void btnInsertBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertBookActionPerformed
           if (txtTenSach.getText().trim().isEmpty() || txtTacGia.getText().trim().isEmpty()
                || txtNXB.getText().trim().isEmpty() || txtTheLoai.getText().trim().isEmpty()
                || txtSoluong.getText().trim().isEmpty() || txtMaViTri.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ các trường", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                SachModel sach = new SachModel();
                sach.setTensach(txtTenSach.getText());
                sach.setTentacgia(txtTacGia.getText());
                sach.setNxb(txtNXB.getText());
                sach.setTheloai(txtTheLoai.getText());
                sach.setSoluong(txtSoluong.getText());
                sach.setSoluongconlai(txtSoluong.getText());
                sach.setMavitri(txtMaViTri.getText());
                SachDao dao = new SachDao();
                if (dao.insert(sach)) {
                    JOptionPane.showMessageDialog(this, "Thêm mới sách thành công!");
                    //loadDataToTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnInsertBookActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ThemSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSachView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInsertBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JTextField txtMaViTri;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
