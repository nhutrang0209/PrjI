package view;

import view.traSachDao;
import database.ConnectDB;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import view.TraSachModel;

public class TraSachView extends javax.swing.JFrame {

    ConnectDB cn = new ConnectDB();
    private String email;

    public TraSachView(String email) {
        initComponents();
        this.email = email;
    }

    public void resetForm() {
        txtMadg.setText("");
        txtTendg.setText("");
        txtTensach.setText("");
        txtSlmuon.setText("");
        txtNgaymuon.setText("");
        txtSltra.setText("");
    }

    public boolean checkmuontra() {
        int muon = Integer.parseInt(txtSlmuon.getText());
        int tra = Integer.parseInt(txtSltra.getText());
        if (muon >= tra) {
            return true;
        } else {
            return false;
        }

    }

    @SuppressWarnings("unchecked")
    public void updateMuon() {
        try {
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            int returnB = Integer.parseInt(txtSltra.getText());
            String updateMuon = "UPDATE muon SET SOLUONG = SOLUONG - '" + returnB + "' WHERE TENSACH = '" + txtTensach.getText() + "'";
            stmt.executeUpdate(updateMuon);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadTobangtra() {
        try {
            TraSachModel tr = new TraSachModel();
            tr.setMadg(Integer.parseInt(txtMadg.getText()));
            tr.setTendg(txtTendg.getText());
            tr.setTensach(txtTensach.getText());
            tr.setSlmuon(Integer.parseInt(txtSlmuon.getText()));
            tr.setNgaymuon(txtNgaymuon.getText());
            tr.setSltra(Integer.parseInt(txtSltra.getText()));
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
            String date = sdf.format(jDatetra.getDate());
            tr.setNgaytra(sdf.parse(date));
            traSachDao dao = new traSachDao();
            dao.tra(tr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void showTb() {
        try {
            Connection conn = cn.getConnection();
            String sql = "SELECT * FROM muon WHERE MADOCGIA = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txtID.getText());
            ResultSet rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) dgvTra.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xoaMuon() {
        try {
            Connection conn = cn.getConnection();
            Statement stmt = conn.createStatement();
            int returnB = Integer.parseInt(txtSltra.getText());
            String deleteMuon = "DELETE FROM muon WHERE SOLUONG=0";
            stmt.executeUpdate(deleteMuon);
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dgvTra = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMadg = new javax.swing.JTextField();
        txtTendg = new javax.swing.JTextField();
        txtTensach = new javax.swing.JTextField();
        txtSlmuon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNgaymuon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSltra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDatetra = new com.toedter.calendar.JDateChooser();
        btnTra = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dgvTra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã độc giả", "Tên độc giả", "Tên sách", "Số lượng mượn", "Ngày mượn"
            }
        ));
        dgvTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvTraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgvTra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 550, 160));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin mượn sách", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Tên sách");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 82, -1));

        jLabel2.setText("Tên độc giả");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 82, -1));

        jLabel1.setText("Mã độc giả");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));
        jPanel1.add(txtMadg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 122, -1));
        jPanel1.add(txtTendg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 139, -1));
        jPanel1.add(txtTensach, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 139, -1));
        jPanel1.add(txtSlmuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 128, -1));

        jLabel5.setText("Ngày mượn");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 82, -1));

        jLabel4.setText("Số lượng mượn");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel1.add(txtNgaymuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 300, 240));

        jLabel6.setText("Số lượng trả");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 100, 20));
        getContentPane().add(txtSltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 140, -1));

        jLabel7.setText("Ngày trả");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 80, 20));
        getContentPane().add(jDatetra, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        btnTra.setText("Trả sách");
        btnTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraActionPerformed(evt);
            }
        });
        getContentPane().add(btnTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        jLabel8.setText("Nhập mã độc giả của bạn");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 100, -1));

        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgvTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvTraMouseClicked
        int x = dgvTra.getSelectedRow();
        if (x >= 0) {
            txtMadg.setText(dgvTra.getValueAt(x, 0) + "");
            txtTendg.setText(dgvTra.getValueAt(x, 1) + "");
            txtTensach.setText(dgvTra.getValueAt(x, 2) + "");
            txtSlmuon.setText(dgvTra.getValueAt(x, 3) + "");
            txtNgaymuon.setText(dgvTra.getValueAt(x, 4) + "");
        }
    }//GEN-LAST:event_dgvTraMouseClicked

    private void btnTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraActionPerformed
        try {
            if (txtSltra.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập số lượng trả");
            } else if (checkmuontra()) {
                JOptionPane.showMessageDialog(this, "Trả sách thành công");
                try {
                    Connection conn = cn.getConnection();
                    Statement stmt = conn.createStatement();
                    int returnB = Integer.parseInt(txtSltra.getText());
                    String updateQuery = "UPDATE sach SET SOLUONGCONLAI = SOLUONGCONLAI + '" + returnB + "' WHERE TENSACH = '" + txtTensach.getText() + "'";
                    stmt.executeUpdate(updateQuery);
                    conn.close();
                    loadTobangtra();
                    updateMuon();
                    xoaMuon();
                    showTb();
                    resetForm();
                } catch (HeadlessException headlessException) {
                }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTraActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        DocGiaView dg = new DocGiaView(email);
        dg.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        showTb();
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(TraSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraSachView("trang2002cool@gmail.").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTra;
    private javax.swing.JTable dgvTra;
    private com.toedter.calendar.JDateChooser jDatetra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMadg;
    private javax.swing.JTextField txtNgaymuon;
    private javax.swing.JTextField txtSlmuon;
    private javax.swing.JTextField txtSltra;
    private javax.swing.JTextField txtTendg;
    private javax.swing.JTextField txtTensach;
    // End of variables declaration//GEN-END:variables
}
