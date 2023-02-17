package view.qtv;

import dao.DocGiaDao;
import dao.PhieuDao;
import dao.SachDao;
import database.Clock;
import database.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.PhieuModel;
import model.SachModel;

/**
 *
 * @author 84899
 */
public class QuanLyMuonTraView extends javax.swing.JFrame {
    PhieuModel phieu;
    private DefaultTableModel tblModel;
    List<PhieuModel> phieuList;
    public QuanLyMuonTraView() {
        initComponents();
        setSize(1000,660);
        initClock();
        tblMuon.setAutoCreateRowSorter(true);
        phieuList=new ArrayList<PhieuModel>();
        List<PhieuModel> list=PhieuDao.findA();
        update(list);
    }
    
    private void initClock() {
        Clock th = new Clock(lblClock);
        th.start();
    }
    
    private void update(List <PhieuModel> list){
        ConnectDB cn=new ConnectDB();
        Connection conn = cn.getConnection();
        try {
            String sql= "SELECT CURDATE()";
            PreparedStatement ps = (PreparedStatement) conn.prepareCall(sql);
            ResultSet rs=ps.executeQuery();
            rs.next();
            Date today=rs.getDate(1);
            phieuList = PhieuDao.findA();
            DefaultTableModel title=new DefaultTableModel(new Object[]
            {"Mã phiếu","Mã độc giả","Mã sách","Giá bìa", "Số lượng","Ngày mượn","Ngày đến hạn","Ngày trả","Số ngày quá hạn"},0);
            for(PhieuModel r:phieuList){
            int madg = r.getMadg();
            int maphieu = r.getMaphieu();
            int masach=r.getMasach();
            int giabia=r.getGiabia();
            int soluong=r.getSoluong();
            Date ngaymuon=r.getNgaymuon();
            Object ngaytra;
            if(r.getNgaytra()!=null) {
            ngaytra=r.getNgaytra();
            }else{
             ngaytra="Chưa trả";
            }
            
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            Date ngaydenhan=r.getNgaydenhan();
            long songayquahan=(today.getTime()/(60*60*24*1000)-ngaydenhan.getTime()/(24*60*60*1000));
            if(songayquahan<=0) songayquahan=0;
            
            title.addRow(new Object[] {maphieu,madg, masach,giabia,soluong,sdf.format(ngaymuon),sdf.format(ngaydenhan),ngaytra,songayquahan});
            }
            
            tblMuon.setModel(title);
            tblMuon.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tblMuon.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblMuon.getColumnModel().getColumn(1).setPreferredWidth(70);
            tblMuon.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblMuon.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblMuon.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblMuon.getColumnModel().getColumn(6).setPreferredWidth(115);
            tblMuon.getColumnModel().getColumn(7).setPreferredWidth(115);
            tblMuon.getColumnModel().getColumn(8).setPreferredWidth(115);
          if(phieuList.size()==0){
                System.out.println("Không có danh sác muon");
                return;
            }
            }
         catch (Exception e) {
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMuon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnMuon = new javax.swing.JButton();
        btnTrasach = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMuon.setAutoCreateRowSorter(true);
        tblMuon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Mã độc giả", "Mã sách", "Ngày mượn", "Số lượng", "Ngày trả"
            }
        ));
        tblMuon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblMuon.setDoubleBuffered(true);
        tblMuon.setEnabled(false);
        tblMuon.setShowGrid(false);
        jScrollPane1.setViewportView(tblMuon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 830, 220));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý mượn trả");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        btnMuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/borrow-book.png"))); // NOI18N
        btnMuon.setText("Mượn sách");
        btnMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuonActionPerformed(evt);
            }
        });
        getContentPane().add(btnMuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 160, 50));

        btnTrasach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/returnbook.png"))); // NOI18N
        btnTrasach.setText("Trả sách");
        btnTrasach.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnTrasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasachActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrasach, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 150, 50));

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Danh sách phiếu mượn của độc giả");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        btnBack.setText("< Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 990, 660));

        jMenu1.setText("Hệ thống");
        jMenu1.setFocusable(false);
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        menuLogout.setText("Đăng xuất");
        jMenu1.add(menuLogout);

        menuExit.setText("Thoát");
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblClockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorAdded

    private void lblClockAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorRemoved

    private void btnTrasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasachActionPerformed
        TraSachView trasach = new TraSachView();
        dispose();
        trasach.setVisible(true);
    }//GEN-LAST:event_btnTrasachActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminView admin = new AdminView(1);
        dispose();
        admin.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuonActionPerformed
        MuonsachView muonsach = new MuonsachView();
        dispose();
        muonsach.setVisible(true);
    }//GEN-LAST:event_btnMuonActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyMuonTraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyMuonTraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyMuonTraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyMuonTraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyMuonTraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMuon;
    private javax.swing.JButton btnTrasach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JTable tblMuon;
    // End of variables declaration//GEN-END:variables
}
