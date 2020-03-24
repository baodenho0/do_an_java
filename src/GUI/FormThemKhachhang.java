
package GUI;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.Font;

public class FormThemKhachhang extends javax.swing.JFrame {

    public FormThemKhachhang() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelSymbol = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jLabelThemkhachhang = new javax.swing.JLabel();
        jLabelMaKH = new javax.swing.JLabel();
        jTextFieldMaKH = new javax.swing.JTextField();
        jLabelHovaten = new javax.swing.JLabel();
        jTextFieldHovaten = new javax.swing.JTextField();
        jLabelNgaysinh = new javax.swing.JLabel();
        jDateChooserNgaysinh = new com.toedter.calendar.JDateChooser();
        jLabelCMND = new javax.swing.JLabel();
        jTextFieldCMND = new javax.swing.JTextField();
        jLabelGioitinh = new javax.swing.JLabel();
        jCheckBoxNam = new javax.swing.JCheckBox();
        jCheckBoxNu = new javax.swing.JCheckBox();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSodienthoai = new javax.swing.JLabel();
        jTextFieldSodienthoai = new javax.swing.JTextField();
        jButtonThemKH = new javax.swing.JButton();
        jButtonThemKH1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel.setPreferredSize(new java.awt.Dimension(455, 745));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(455, 30));
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_minimize (24px).png"))); // NOI18N
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });
        jPanelHeader.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 30));

        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_close (24px).png"))); // NOI18N
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseExited(evt);
            }
        });
        jPanelHeader.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 40, 30));

        jLabelSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_imageapp.png"))); // NOI18N
        jPanelHeader.add(jLabelSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 455, 30));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelThemkhachhang.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelThemkhachhang.setForeground(new java.awt.Color(204, 0, 51));
        jLabelThemkhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThemkhachhang.setText("Thêm khách hàng");
        jPanelMain.add(jLabelThemkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 280, 58));

        jLabelMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelMaKH.setForeground(new java.awt.Color(0, 0, 204));
        jLabelMaKH.setText("Mã khách hàng:");
        jPanelMain.add(jLabelMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 40));

        jTextFieldMaKH.setEditable(false);
        jTextFieldMaKH.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldMaKH.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelMain.add(jTextFieldMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, 40));

        jLabelHovaten.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelHovaten.setForeground(new java.awt.Color(0, 0, 204));
        jLabelHovaten.setText("Họ và tên:");
        jPanelMain.add(jLabelHovaten, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 140, 40));

        jTextFieldHovaten.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldHovaten.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jTextFieldHovaten.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldHovatenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldHovatenFocusLost(evt);
            }
        });
        jPanelMain.add(jTextFieldHovaten, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 250, 40));

        jLabelNgaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelNgaysinh.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNgaysinh.setText("Ngày sinh:");
        jPanelMain.add(jLabelNgaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, 40));

        jDateChooserNgaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jPanelMain.add(jDateChooserNgaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, 40));

        jLabelCMND.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelCMND.setForeground(new java.awt.Color(0, 0, 204));
        jLabelCMND.setText("Số CMND:");
        jPanelMain.add(jLabelCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 40));

        jTextFieldCMND.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldCMND.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jTextFieldCMND.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldCMNDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldCMNDFocusLost(evt);
            }
        });
        jPanelMain.add(jTextFieldCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, 40));

        jLabelGioitinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelGioitinh.setForeground(new java.awt.Color(0, 0, 204));
        jLabelGioitinh.setText("Giới tính:");
        jPanelMain.add(jLabelGioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 140, 40));

        jCheckBoxNam.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxNam.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jCheckBoxNam.setText("Nam");
        jPanelMain.add(jCheckBoxNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 60, 40));

        jCheckBoxNu.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxNu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jCheckBoxNu.setText("Nữ");
        jPanelMain.add(jCheckBoxNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 60, 40));

        jLabelEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 204));
        jLabelEmail.setText("Email:");
        jPanelMain.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 140, 40));

        jTextFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusLost(evt);
            }
        });
        jPanelMain.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 210, 40));

        jLabelSodienthoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelSodienthoai.setForeground(new java.awt.Color(0, 0, 204));
        jLabelSodienthoai.setText("Số điện thoại:");
        jPanelMain.add(jLabelSodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, 40));

        jTextFieldSodienthoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldSodienthoai.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jTextFieldSodienthoai.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSodienthoaiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSodienthoaiFocusLost(evt);
            }
        });
        jPanelMain.add(jTextFieldSodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 210, 40));

        jButtonThemKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonThemKH.setForeground(new java.awt.Color(0, 0, 204));
        jButtonThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_delete.png"))); // NOI18N
        jButtonThemKH.setText("Hủy");
        jPanelMain.add(jButtonThemKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 130, 50));

        jButtonThemKH1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonThemKH1.setForeground(new java.awt.Color(0, 0, 204));
        jButtonThemKH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_save.png"))); // NOI18N
        jButtonThemKH1.setText(" Lưu");
        jPanelMain.add(jButtonThemKH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 130, 50));

        jPanel.add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 30, 451, 608));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 455, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(GUI.FormThemKhachhang.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        jLabelMinimize.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GREEN));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        jLabelMinimize.setBorder(null);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        
        dispose();
 
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setBorder(null);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jTextFieldHovatenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHovatenFocusGained
       
        jTextFieldHovaten.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldHovaten.setForeground(Color.black);
        jTextFieldHovaten.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
    }//GEN-LAST:event_jTextFieldHovatenFocusGained

    private void jTextFieldHovatenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHovatenFocusLost

        jTextFieldHovaten.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jTextFieldHovatenFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldCMNDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCMNDFocusGained

        jTextFieldCMND.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldCMND.setForeground(Color.black);
        jTextFieldCMND.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
    }//GEN-LAST:event_jTextFieldCMNDFocusGained

    private void jTextFieldCMNDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldCMNDFocusLost

        jTextFieldCMND.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jTextFieldCMNDFocusLost

    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailFocusLost

    private void jTextFieldSodienthoaiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSodienthoaiFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSodienthoaiFocusGained

    private void jTextFieldSodienthoaiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSodienthoaiFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSodienthoaiFocusLost

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
            java.util.logging.Logger.getLogger(FormThemKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThemKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThemKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThemKhachhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThemKhachhang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonThemKH;
    private javax.swing.JButton jButtonThemKH1;
    private javax.swing.JCheckBox jCheckBoxNam;
    private javax.swing.JCheckBox jCheckBoxNu;
    private com.toedter.calendar.JDateChooser jDateChooserNgaysinh;
    private javax.swing.JLabel jLabelCMND;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGioitinh;
    private javax.swing.JLabel jLabelHovaten;
    private javax.swing.JLabel jLabelMaKH;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelNgaysinh;
    private javax.swing.JLabel jLabelSodienthoai;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JLabel jLabelThemkhachhang;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldCMND;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldHovaten;
    private javax.swing.JTextField jTextFieldMaKH;
    private javax.swing.JTextField jTextFieldSodienthoai;
    // End of variables declaration//GEN-END:variables


}
