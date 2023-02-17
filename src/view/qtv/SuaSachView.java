/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.qtv;

import dao.SachDao;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.SachModel;
import database.Clock;
import view.LoginView;

/**
 *
 * @author 84899
 */
public class SuaSachView extends javax.swing.JFrame {
    
    private DefaultTableModel tblModel;
    private String selectedMaSach;
    
    public SuaSachView() {
        initComponents();
        initTable();
        setSize(1000,660);
        loadDataToTable();
        initClock();
    }

    private void initClock() {
        Clock th = new Clock(lblClock);
        th.start();
    }
    
    private void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"ID", "Tên sách", "Tên tác giả", "NXB", "Thể loại", "Số lượng",
            "Số còn lại", "Mã vị trí","Giá bìa"});
        tblSach.setModel(tblModel);
        tblSach.setRowSelectionAllowed(true);
        tblSach.setAutoCreateRowSorter(true);
        tblSach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblSach.getColumnModel().getColumn(0).setPreferredWidth(40);
        tblSach.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblSach.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblSach.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblSach.getColumnModel().getColumn(4).setPreferredWidth(80);
        tblSach.getColumnModel().getColumn(5).setPreferredWidth(80);
        tblSach.getColumnModel().getColumn(6).setPreferredWidth(80);
        tblSach.getColumnModel().getColumn(7).setPreferredWidth(80);
        tblSach.getColumnModel().getColumn(8).setPreferredWidth(75);
        
    ListSelectionModel rowSelectionModel = tblSach.getSelectionModel();
    rowSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    rowSelectionModel.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        String selectedData = null;

        int[] selectedRow = tblSach.getSelectedRows();
        if(selectedRow.length>0){
        selectedMaSach=(String)tblSach.getValueAt(selectedRow[0], 0);
        
        txtMaSach.setText(selectedMaSach);
        txtTenSach.setText((String)tblSach.getValueAt(selectedRow[0],1));
        txtNXB.setText((String)tblSach.getValueAt(selectedRow[0],3));
        txtTheLoai.setText((String)tblSach.getValueAt(selectedRow[0],4));
        txtTacGia.setText((String)tblSach.getValueAt(selectedRow[0],2));
        txtSoluong.setValue((int)tblSach.getValueAt(selectedRow[0],5));
        txtSoluongconlai.setValue((int)tblSach.getValueAt(selectedRow[0],6));
        txtMaViTri.setText((String)tblSach.getValueAt(selectedRow[0],7));
        txtGiabia.setText(Integer.toString((int) tblSach.getValueAt(selectedRow[0],8)));
        }
      }
    });
    }
    
    private void reset(){
        txtMaSach.setText(null);
                    txtTenSach.setText(null);
                    txtTacGia.setText(null);
                    txtNXB.setText(null);
                    txtTheLoai.setText(null);
                    txtSoluong.setValue(0);
                    txtSoluongconlai.setValue(0);
                    txtMaViTri.setText(null);
                    txtGiabia.setText(null);
    }
    
    private void loadDataToTable() {
        try {
            SachDao dao = new SachDao();
            List<SachModel> list = dao.findAll();
            tblModel.setRowCount(0);
            for (SachModel r : list) {
                tblModel.addRow(new Object[]{ r.getMasach(), r.getTensach(), r.getTentacgia(),
                    r.getNxb(), r.getTheloai(), r.getSoluong(), r.getSoluongconlai(), r.getMavitri(), r.getGiabia()
                });
            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtTenSach = new javax.swing.JTextField();
        txtTacGia = new javax.swing.JTextField();
        txtNXB = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        txtMaViTri = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtGiabia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JSpinner();
        txtSoluongconlai = new javax.swing.JSpinner();
        btnChange = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sửa thông tin sách");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 250, 50));

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
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, 30));

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblSach);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 910, 220));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtTenSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 30));
        jPanel1.add(txtTacGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 170, 30));
        jPanel1.add(txtNXB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 220, 30));
        jPanel1.add(txtTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, 30));
        jPanel1.add(txtMaViTri, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 170, 30));

        jLabel2.setText("Thể loại (*)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setText("Tên sách (*)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("Tên tác giả (*)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel5.setText("Nhà xuất bản (*)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        jLabel6.setText("Số lượng (*)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jLabel7.setText("Số lượng còn lại (*)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel8.setText("Mã vị trí (*)");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        txtMaSach.setEditable(false);
        jPanel1.add(txtMaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, 30));

        jLabel9.setText("Mã sách (*)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("(*) là các trường bắt buộc");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("(*) là các trường bắt buộc");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("(*) là các trường bắt buộc");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("(*) là các trường bắt buộc");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 255));
        jLabel15.setText("(*) là các trường bắt buộc");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel17.setText("VNĐ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));
        jPanel1.add(txtGiabia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 140, 30));

        jLabel16.setText("Giá bìa (*)");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(txtSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 170, 30));
        jPanel1.add(txtSoluongconlai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 690, 230));

        btnChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editbook.png"))); // NOI18N
        btnChange.setText("Sửa thông tin sách");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        getContentPane().add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 170, 50));

        btnBack.setText("< Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 90, 30));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delebook.png"))); // NOI18N
        btnDelete.setText("Xóa sách");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 170, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

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
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        LoginView view = new LoginView();
        dispose();
        view.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

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
    
    private boolean checkSoluong(){
        int sl = (int) txtSoluong.getValue();
        int slcl = (int) txtSoluongconlai.getValue();
        if (sl<slcl) return false;
        return true;
    }
    
    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (txtTenSach.getText().trim().isEmpty()||txtTacGia.getText().trim().isEmpty()
                ||txtNXB.getText().trim().isEmpty()||txtTheLoai.getText().trim().isEmpty()
                ||txtSoluong.getValue()==null||txtSoluongconlai.getValue()==null)
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ các trường", "Warning", JOptionPane.WARNING_MESSAGE);
        else if (!checkGia()) JOptionPane.showMessageDialog(rootPane, "Giá bìa phải có giá trị là 1 số", "Warning", JOptionPane.WARNING_MESSAGE);
        else if (!checkSoluong()) JOptionPane.showMessageDialog(rootPane, "Số lượng còn lại không được lớn hơn số lượng", "Warning", JOptionPane.WARNING_MESSAGE);
        else {
            if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn "
                    + "cập nhật thông tin sách không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                SachModel sach = new SachModel();
                sach.setMasach(selectedMaSach);
                sach.setTensach(txtTenSach.getText());
                sach.setTentacgia(txtTacGia.getText());
                sach.setNxb(txtNXB.getText());
                sach.setTheloai(txtTheLoai.getText());
                sach.setSoluong((int)txtSoluong.getValue());
                sach.setSoluongconlai((int)txtSoluongconlai.getValue());
                sach.setMavitri(txtMaViTri.getText());
                sach.setGiabia(Integer.parseInt(txtGiabia.getText()));
                SachDao dao = new SachDao();
            if (dao.update(sach)) {
                JOptionPane.showMessageDialog(this, "Cập nhật thông tin sách thành công!");
                loadDataToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!");
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
            reset();
            }else return;
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtTenSach.getText().trim().isEmpty()||txtTacGia.getText().trim().isEmpty()
                ||txtNXB.getText().trim().isEmpty()||txtTheLoai.getText().trim().isEmpty()
                ||txtSoluong.getValue()==null||txtSoluongconlai.getValue()==null)
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sách cần xóa", "Warning", JOptionPane.WARNING_MESSAGE);
        else{
            if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sách này không?", "Thông báo", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                return;
            }
            try {
                SachModel sach = new SachModel();    
                sach.setMasach(selectedMaSach);
                sach.setTensach(txtTenSach.getText());
                sach.setTentacgia(txtTacGia.getText());
                sach.setNxb(txtNXB.getText());
                sach.setTheloai(txtTheLoai.getText());
                sach.setSoluong((int)txtSoluong.getValue());
                sach.setSoluongconlai((int)txtSoluong.getValue());
                sach.setMavitri(txtMaViTri.getText());

                SachDao dao = new SachDao();
                if (dao.delete(sach)){
                    JOptionPane.showMessageDialog(this, "Xóa sách thành công!");
                  //  btnNewActionPerformed(evt);
                    loadDataToTable();
                    reset();
         
                } else {
                    JOptionPane.showMessageDialog(this, "Đã có lỗi xảy ra!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminView admin = new AdminView(0);
        dispose();
        admin.setVisible(true);
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
            java.util.logging.Logger.getLogger(SuaSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaSachView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaSachView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtGiabia;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtMaViTri;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JSpinner txtSoluong;
    private javax.swing.JSpinner txtSoluongconlai;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTheLoai;
    // End of variables declaration//GEN-END:variables
}
