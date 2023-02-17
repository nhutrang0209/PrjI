package view.qtv;

import dao.SachDao;
import javax.swing.JOptionPane;
import model.SachModel;
import view.qtv.AdminView;
import database.Clock;
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
        txtMaViTri = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnInsertBook = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtGiabia = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JSpinner();
        lblVNĐ = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thêm sách");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        btnBack.setText("< Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 100, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên sách (*)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Thông tin sách cần thêm");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 210, 30));
        jPanel1.add(txtTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên tác giả (*)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPanel1.add(txtTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nhà xuất bản (*)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));
        jPanel1.add(txtNXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, 40));
        jPanel1.add(txtTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Thể loại (*)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng (*)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Vị trí (*)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 50, -1));
        jPanel1.add(txtMaViTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 200, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("(*) là các trường bắt buộc");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        btnInsertBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsertBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/addbook.png"))); // NOI18N
        btnInsertBook.setText("Thêm");
        btnInsertBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 130, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Giá bìa (*)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txtGiabia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGiabiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtGiabia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 140, 40));
        jPanel1.add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 200, 40));

        lblVNĐ.setText("VNĐ");
        jPanel1.add(lblVNĐ, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 750, 360));

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 600));

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

    private boolean checkGia(){
        String st = txtGiabia.getText();
        for (int i = 0; i<st.length();++i){
            if (st.charAt(i)<'0'||st.charAt(i)>'9') return false;
        }
        return true;
    }
    
    private void btnInsertBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertBookActionPerformed
           if (txtTenSach.getText().trim().isEmpty() || txtTacGia.getText().trim().isEmpty()
                || txtNXB.getText().trim().isEmpty() || txtTheLoai.getText().trim().isEmpty()
                || txtSoluong.getValue()==null|| txtMaViTri.getText().trim().isEmpty()
                || txtGiabia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ các trường", "Warning", JOptionPane.WARNING_MESSAGE);
        }else if (!checkGia()) JOptionPane.showMessageDialog(rootPane, "Giá bìa phải có giá trị là 1 số", "Warning", JOptionPane.WARNING_MESSAGE);
            else{
            try {
                SachModel sach = new SachModel();
                sach.setTensach(txtTenSach.getText());
                sach.setTentacgia(txtTacGia.getText());
                sach.setNxb(txtNXB.getText());
                sach.setTheloai(txtTheLoai.getText());
                sach.setSoluong((int) txtSoluong.getValue());
                sach.setSoluongconlai((int) txtSoluong.getValue());
                sach.setMavitri(txtMaViTri.getText());
                sach.setGiabia(Integer.parseInt(txtGiabia.getText()));
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
        AdminView admin = new AdminView(0);
        dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtGiabiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGiabiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGiabiaActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblVNĐ;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JTextField txtGiabia;
    private javax.swing.JTextField txtMaViTri;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JSpinner txtSoluong;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
