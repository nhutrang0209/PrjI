/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DocGiaDao;
import model.DocGiaModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author 84899
 */
public class SuaDocGiaView extends javax.swing.JFrame {
    private DefaultTableModel tblModel;
    Connection conn;
    private ResultSet rs;
//    private DocGiaDao dao;
//    private DocGiaModel docGiaModel;
    private String selectedMadg;
    public SuaDocGiaView() {
        initComponents();
        initTable();
        loadDataToTable();
        setSize(1000,660);
        initClock();
    }
    
    private void initClock() {
        Clock th = new Clock(lblClock);
        th.start();
    }

    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID", "Tên độc giả", "Số điện thoại", "Email", "Ngày sinh", "CCCD", "Số sách đang mượn", "Tiền phạt"});
        tbldg.setModel(tblModel);
        tbldg.setRowSelectionAllowed(true);
        tbldg.setAutoCreateRowSorter(true);
        tbldg.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbldg.getColumnModel().getColumn(0).setPreferredWidth(40);
        tbldg.getColumnModel().getColumn(1).setPreferredWidth(180);
        tbldg.getColumnModel().getColumn(2).setPreferredWidth(80);
        tbldg.getColumnModel().getColumn(3).setPreferredWidth(180);
        tbldg.getColumnModel().getColumn(4).setPreferredWidth(80);
        tbldg.getColumnModel().getColumn(5).setPreferredWidth(100);
    ListSelectionModel rowSelectionModel = tbldg.getSelectionModel();
    rowSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    rowSelectionModel.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        String selectedData = null;

        int[] selectedRow = tbldg.getSelectedRows();
        if(selectedRow.length>0){
        selectedMadg=(String)tbldg.getValueAt(selectedRow[0], 0);
        
        txtMadg.setText(selectedMadg);
        //Change value Tendocgia
        txtTendg.setText((String)tbldg.getValueAt(selectedRow[0],1));
                //Change value Tendocgia
        txtSodt.setText((String)tbldg.getValueAt(selectedRow[0],2));
                        //Change value Tendocgia
        txtEmail.setText((String)tbldg.getValueAt(selectedRow[0],3));
                //Change value birthday
        Date birthday=(Date) tbldg.getValueAt(selectedRow[0],4);
        dateField.setDate(birthday);
          //Change value CCCD
          String CCCD=(String)tbldg.getValueAt(selectedRow[0],5);
          System.out.println("CCCD: "+CCCD);
          txtCC.setText(CCCD);
        }
      }
    });
    }

    private void loadDataToTable() {
        try {
            DocGiaDao dao = new DocGiaDao();
            List<DocGiaModel> list = dao.findAll();
            tblModel.setRowCount(0);
            for (DocGiaModel r : list) {
                tblModel.addRow(new Object[]{
                    r.getMadg(), r.getTendg(), r.getSodt(), r.getEmail(), r.getNgaysinh(), r.getCancuoccd(), r.getDangmuon(), r.getTienphat()
                });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {                                       
        txtTendg.setText("");
        txtSodt.setText("");
        txtEmail.setText("");
        txtCC.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChange = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldg = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblClock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTendg = new javax.swing.JLabel();
        txtTendg = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        lblBirth = new javax.swing.JLabel();
        lblSodt = new javax.swing.JLabel();
        txtSodt = new javax.swing.JTextField();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtMadg = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnChange.setText("Sửa độc giả");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        tbldg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbldg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 910, 210));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 100, 60));

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
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Chỉnh sửa thông tin độc giả");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btnBack.setText("< Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTendg.setText("Tên độc giả");
        jPanel2.add(lblTendg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtTendg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtTendg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, 30));

        lblEmail.setText("Email");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, 30));

        jLabel1.setText("Căn cước");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));
        jPanel2.add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, 30));

        lblBirth.setText("Ngày sinh");
        jPanel2.add(lblBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lblSodt.setText("Số điện thoại");
        jPanel2.add(lblSodt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel2.add(txtSodt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 30));
        jPanel2.add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, 30));

        jLabel3.setText("Mã độc giả");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtMadg.setEditable(false);
        jPanel2.add(txtMadg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 210, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 360, 280));

        btnDelete.setText("Xóa độc giả");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, -1, -1));

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

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginView login = new LoginView();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (txtTendg.getText().trim().isEmpty()
                || txtSodt.getText().trim().isEmpty()
                || txtEmail.getText().trim().isEmpty()
                || txtCC.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ các trường", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn cập nhật thông tin độc giả không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            DocGiaModel dg = new DocGiaModel();
            dg.setMadg(selectedMadg);
            dg.setTendg(txtTendg.getText());
            dg.setSodt(txtSodt.getText());
            dg.setEmail(txtEmail.getText());
            dg.setNgaysinh(dateField.getDate());
            dg.setCancuoccd(txtCC.getText());

            DocGiaDao dao = new DocGiaDao();
            if (dao.update(dg)) {
                JOptionPane.showMessageDialog(this, "Cập nhật độc giả thành công!");
                loadDataToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void tbldgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldgMouseClicked
        try {
            int row = tbldg.getSelectedRow();

            if (row >= 0) {
                String id = (String) tbldg.getValueAt(row, 0);
                DocGiaDao dao = new DocGiaDao();
                DocGiaModel dg = dao.findById(id);
                if (dg != null) {
                    txtMadg.setText(dg.getMadg());
                    txtTendg.setText(dg.getTendg());
                    txtSodt.setText(dg.getSodt());
                    txtEmail.setText(dg.getEmail());
                    dateField.setDate(dg.getNgaysinh());
                    txtCC.setText(dg.getCancuoccd());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbldgMouseClicked

    private void lblClockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorAdded

    private void lblClockAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorRemoved

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
//        AdminView admin = new AdminView(0);
//        dispose();
//        admin.setVisible(true);
System.exit(0);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa thông tin độc giả không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            DocGiaModel dg = new DocGiaModel();
            dg.setMadg(selectedMadg);
            dg.setTendg(txtTendg.getText());
            dg.setSodt(txtSodt.getText());
            dg.setEmail(txtEmail.getText());
            dg.setNgaysinh(dateField.getDate());
            dg.setCancuoccd(txtCC.getText());
            
            DocGiaDao dao = new DocGiaDao();
            if (dao.delete(dg)){
                JOptionPane.showMessageDialog(this, "Xóa độc giả thành công!");
                btnNewActionPerformed(evt);
                loadDataToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

      
    
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
            java.util.logging.Logger.getLogger(SuaDocGiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaDocGiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaDocGiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaDocGiaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaDocGiaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenuItem btnLogout;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBirth;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblSodt;
    private javax.swing.JLabel lblTendg;
    private javax.swing.JTable tbldg;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMadg;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtTendg;
    // End of variables declaration//GEN-END:variables
}
