package view;

public class AdminView extends javax.swing.JFrame {

    public AdminView() {
        initComponents();
       // setLocationRelativeTo(null);
        setSize(700,600);
        initClock();        
    }
    
    private void initClock() {
        Clock th = new Clock(lblClock);
        th.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        btnQLDG1 = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblQLDG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSystem = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsert.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInsert.setText("Thêm độc giả");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 170, 40));

        btnQLDG1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLDG1.setText("Thêm sách");
        btnQLDG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDG1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLDG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 170, 40));

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
        getContentPane().add(lblClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, 30));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setText("Chỉnh sửa độc giả");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 170, 40));

        lblQLDG.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQLDG.setText("Quản lý độc giả");
        getContentPane().add(lblQLDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý sách");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Chỉnh sửa sách");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 170, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý mượn trả");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Danh sách mượn trả");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 283, 170, 40));

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("Thống kê tiền phạt");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 170, 40));

        btnSystem.setText("Hệ thống");
        btnSystem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        btnSystem.add(btnLogout);

        jMenuItem1.setText("Thoát");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnSystem.add(jMenuItem1);

        jMenuBar1.add(btnSystem);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
      ThemDocGiaView insert = new ThemDocGiaView();
      dispose();
      insert.setVisible(true);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnQLDG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDG1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQLDG1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginView login = new LoginView();
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void lblClockAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorAdded

    private void lblClockAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblClockAncestorRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClockAncestorRemoved

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        SuaDocGiaView sua = new SuaDocGiaView();
        dispose();
        sua.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JMenuItem btnLogout;
    private javax.swing.JButton btnQLDG1;
    private javax.swing.JMenu btnSystem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblQLDG;
    // End of variables declaration//GEN-END:variables
}
