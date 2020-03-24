
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

public class FormTaoVe extends javax.swing.JFrame {

    public FormTaoVe() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelSymbol = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelBackgroundHeader = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jLabelTenphim = new javax.swing.JLabel();
        jTextFieldTenphim = new javax.swing.JTextField();
        jLabelSuatchieu = new javax.swing.JLabel();
        jTextFieldGio_Suatchieu = new javax.swing.JTextField();
        jTextFieldNgay_Suatchieu = new javax.swing.JTextField();
        jLabelPhongchieu = new javax.swing.JLabel();
        jTextFieldPhongchieu = new javax.swing.JTextField();
        jLabelSoluong = new javax.swing.JLabel();
        jTextFieldSoluong = new javax.swing.JTextField();
        jTextFieldCacgheduocchon = new javax.swing.JTextField();
        jLabelCacgheduocchon = new javax.swing.JLabel();
        jLabelTongtien = new javax.swing.JLabel();
        jTextFieldTongtien = new javax.swing.JTextField();
        jLabelMaKH = new javax.swing.JLabel();
        jTextFieldMaKH = new javax.swing.JTextField();
        jButtonTaohoadon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_imageapp.png"))); // NOI18N
        jPanelHeader.add(jLabelSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

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
        jPanelHeader.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 30));

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
        jPanelHeader.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        jLabelBackgroundHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_header.jpg"))); // NOI18N
        jPanelHeader.add(jLabelBackgroundHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jPanel.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 30));

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTenphim.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelTenphim.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTenphim.setText("Phim:");
        jPanelMain.add(jLabelTenphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 40));

        jTextFieldTenphim.setEditable(false);
        jTextFieldTenphim.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldTenphim.setBorder(null);
        jPanelMain.add(jTextFieldTenphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 390, 40));

        jLabelSuatchieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelSuatchieu.setForeground(new java.awt.Color(0, 0, 204));
        jLabelSuatchieu.setText("Suất chiếu:");
        jPanelMain.add(jLabelSuatchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 40));

        jTextFieldGio_Suatchieu.setEditable(false);
        jTextFieldGio_Suatchieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGio_Suatchieu.setBorder(null);
        jPanelMain.add(jTextFieldGio_Suatchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 100, 40));

        jTextFieldNgay_Suatchieu.setEditable(false);
        jTextFieldNgay_Suatchieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldNgay_Suatchieu.setBorder(null);
        jPanelMain.add(jTextFieldNgay_Suatchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 210, 40));

        jLabelPhongchieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelPhongchieu.setForeground(new java.awt.Color(0, 0, 204));
        jLabelPhongchieu.setText("Phòng chiếu:");
        jPanelMain.add(jLabelPhongchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 40));

        jTextFieldPhongchieu.setEditable(false);
        jTextFieldPhongchieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldPhongchieu.setBorder(null);
        jPanelMain.add(jTextFieldPhongchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 130, 40));

        jLabelSoluong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelSoluong.setForeground(new java.awt.Color(0, 0, 204));
        jLabelSoluong.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelSoluong.setText("Số lượng:");
        jPanelMain.add(jLabelSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 40));

        jTextFieldSoluong.setEditable(false);
        jTextFieldSoluong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldSoluong.setBorder(null);
        jPanelMain.add(jTextFieldSoluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 80, 40));

        jTextFieldCacgheduocchon.setEditable(false);
        jTextFieldCacgheduocchon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldCacgheduocchon.setBorder(null);
        jPanelMain.add(jTextFieldCacgheduocchon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 340, 40));

        jLabelCacgheduocchon.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelCacgheduocchon.setForeground(new java.awt.Color(0, 0, 204));
        jLabelCacgheduocchon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCacgheduocchon.setText("Ghế:");
        jPanelMain.add(jLabelCacgheduocchon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, 40));

        jLabelTongtien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelTongtien.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTongtien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTongtien.setText("Tổng tiền:");
        jPanelMain.add(jLabelTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, 40));

        jTextFieldTongtien.setEditable(false);
        jTextFieldTongtien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldTongtien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTongtien.setBorder(null);
        jPanelMain.add(jTextFieldTongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 150, 40));

        jLabelMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelMaKH.setForeground(new java.awt.Color(0, 0, 204));
        jLabelMaKH.setText("Nhập mã khách hàng:");
        jPanelMain.add(jLabelMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 200, 40));

        jTextFieldMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldMaKH.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jTextFieldMaKH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMaKHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldMaKHFocusLost(evt);
            }
        });
        jPanelMain.add(jTextFieldMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 250, 40));

        jButtonTaohoadon.setBackground(new java.awt.Color(204, 255, 255));
        jButtonTaohoadon.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonTaohoadon.setForeground(new java.awt.Color(255, 0, 51));
        jButtonTaohoadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_bill.png"))); // NOI18N
        jButtonTaohoadon.setText("Tạo hóa đơn");
        jButtonTaohoadon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTaohoadon.setOpaque(false);
        jPanelMain.add(jButtonTaohoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 860, 220, 50));

        jPanel.add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 950));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(GUI.FormTaoVe.ICONIFIED);
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

    private void jTextFieldMaKHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMaKHFocusGained

        jTextFieldMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldMaKH.setForeground(Color.black);
        jTextFieldMaKH.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
    }//GEN-LAST:event_jTextFieldMaKHFocusGained

    private void jTextFieldMaKHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMaKHFocusLost

        jTextFieldMaKH.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jTextFieldMaKHFocusLost

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
            java.util.logging.Logger.getLogger(FormTaoVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTaoVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTaoVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTaoVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTaoVe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTaohoadon;
    private javax.swing.JLabel jLabelBackgroundHeader;
    private javax.swing.JLabel jLabelCacgheduocchon;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMaKH;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelPhongchieu;
    private javax.swing.JLabel jLabelSoluong;
    private javax.swing.JLabel jLabelSuatchieu;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JLabel jLabelTenphim;
    private javax.swing.JLabel jLabelTongtien;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldCacgheduocchon;
    private javax.swing.JTextField jTextFieldGio_Suatchieu;
    private javax.swing.JTextField jTextFieldMaKH;
    private javax.swing.JTextField jTextFieldNgay_Suatchieu;
    private javax.swing.JTextField jTextFieldPhongchieu;
    private javax.swing.JTextField jTextFieldSoluong;
    private javax.swing.JTextField jTextFieldTenphim;
    private javax.swing.JTextField jTextFieldTongtien;
    // End of variables declaration//GEN-END:variables
}
