package view;

public class AdminView extends javax.swing.JFrame {
    private int MAQTV;
    public AdminView(int MAQTV) {
        initComponents();
       // setLocationRelativeTo(null);
       this.MAQTV=MAQTV;
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
        btnThemsach = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        lblQLDG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSuasach = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnMuonsach = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
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
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, 40));

        btnThemsach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemsach.setText("Thêm sách");
        btnThemsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemsachActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 170, 40));

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
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 170, 40));

        lblQLDG.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQLDG.setText("Quản lý độc giả");
        getContentPane().add(lblQLDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý sách");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        btnSuasach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuasach.setText("Chỉnh sửa sách");
        btnSuasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuasachActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuasach, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 170, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý mượn trả");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Danh sách mượn trả");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 170, 40));

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("Thống kê tiền phạt");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 170, 30));

        btnMuonsach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMuonsach.setText("Thêm sách mượn");
        btnMuonsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuonsachActionPerformed(evt);
            }
        });
        getContentPane().add(btnMuonsach, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 170, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Trả sách");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 170, 30));

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

    private void btnThemsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemsachActionPerformed
        Book.ThemSachView themsach = new Book.ThemSachView();
        dispose();
        themsach.setVisible(true);
    }//GEN-LAST:event_btnThemsachActionPerformed

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

    private void btnSuasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuasachActionPerformed
        Book.SuaSachView suasach = new Book.SuaSachView();
        dispose();
        suasach.setVisible(true);
    }//GEN-LAST:event_btnSuasachActionPerformed

    private void btnMuonsachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuonsachActionPerformed
        MuonsachView muonsach = new MuonsachView();
        dispose();
        muonsach.setVisible(true);
    }//GEN-LAST:event_btnMuonsachActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new AdminView(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JMenuItem btnLogout;
    private javax.swing.JButton btnMuonsach;
    private javax.swing.JButton btnSuasach;
    private javax.swing.JMenu btnSystem;
    private javax.swing.JButton btnThemsach;
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
