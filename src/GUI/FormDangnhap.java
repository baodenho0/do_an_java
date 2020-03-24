
package GUI;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Controllers.DangNhapController;
import Controllers.MenuNhanVienQuayVeController;
import Controllers.MenuQuanTriVienController;

import Helpers.MessageHelper;

public class FormDangnhap extends javax.swing.JFrame {

    AnimationClass ac = new AnimationClass();
    
    private DangNhapController dangNhapController;
    private MessageHelper message;
    
    public FormDangnhap(DangNhapController dangNhapController) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        SlideShow();
        
        this.dangNhapController = dangNhapController;
        this.message = new MessageHelper();
   }
    
    public void SlideShow()
    {
        new Thread()
        {
            int count = 0;
            
            @Override
            public void run()
        {
            try 
            {
                while(true)
                {
                    switch(count)
                    {
                        case 0:
                            ImageIcon ii1 = new ImageIcon(getClass().getResource("/Images/image1.jpg"));
                            ImageIcon ii2 = new ImageIcon(getClass().getResource("/Images/image2.jpg"));
                            
                            jLabelImage1.setIcon(ii1);
                            jLabelImage3.setIcon(ii2);
                           
                            Thread.sleep(3000);
                            
                            ac.jLabelXLeft(0, -335, 10, 5, jLabelImage1);
                            ac.jLabelXRight(-335, 0, 10, 5, jLabelImage2);
                            ac.jLabelXRight(0, 335, 10, 5, jLabelImage3);
                            ac.jLabelXLeft(335, 0, 10, 5, jLabelImage4);
                            
                            count = 1;
                            
                            break;
                            
                        case 1:
                            ImageIcon ii3 = new ImageIcon(getClass().getResource("/Images/image3.jpg"));
                            ImageIcon ii4 = new ImageIcon(getClass().getResource("/Images/image4.jpg"));
                            
                            jLabelImage2.setIcon(ii3);
                            jLabelImage4.setIcon(ii4);
                            
                            Thread.sleep(3000);
                            
                            ac.jLabelXRight(-335, 0, 10, 5, jLabelImage1);
                            ac.jLabelXLeft(0, -335, 10, 5, jLabelImage2);
                            ac.jLabelXLeft(335, 0, 10, 5, jLabelImage3);
                            ac.jLabelXRight(0, 335, 10, 5, jLabelImage4);
                            
                            count = 2;
                            
                            break;
                        
                        case 2:
                            ImageIcon ii5 = new ImageIcon(getClass().getResource("/Images/image5.jpg"));
                            ImageIcon ii6 = new ImageIcon(getClass().getResource("/Images/image6.jpg"));
                            
                            jLabelImage1.setIcon(ii5);
                            jLabelImage3.setIcon(ii6);
                            
                            Thread.sleep(3000);
                            
                            ac.jLabelXLeft(0, -335, 10, 5, jLabelImage1);
                            ac.jLabelXRight(-335, 0, 10, 5, jLabelImage2);
                            ac.jLabelXRight(0, 335, 10, 5, jLabelImage3);
                            ac.jLabelXLeft(335, 0, 10, 5, jLabelImage4);
                            
                            count = 3;
                            break;
                            
                        case 3:
                            ImageIcon ii7 = new ImageIcon(getClass().getResource("/Images/image7.jpg"));
                            ImageIcon ii8 = new ImageIcon(getClass().getResource("/Images/image8.jpg"));
                            
                            jLabelImage2.setIcon(ii7);
                            jLabelImage4.setIcon(ii8);

                            Thread.sleep(3000);
                            
                            ac.jLabelXRight(-335, 0, 10, 5, jLabelImage1);
                            ac.jLabelXLeft(0, -335, 10, 5, jLabelImage2);
                            ac.jLabelXLeft(335, 0, 10, 5, jLabelImage3);
                            ac.jLabelXRight(0, 335, 10, 5, jLabelImage4);
                            
                            count = 4;
                            
                            break;
                            
                        case 4:
                            ImageIcon ii9 = new ImageIcon(getClass().getResource("/Images/image9.jpg"));
                            ImageIcon ii10 = new ImageIcon(getClass().getResource("/Images/image10.jpg"));
                            
                            jLabelImage1.setIcon(ii9);
                            jLabelImage3.setIcon(ii10);
                            
                            Thread.sleep(3000);
                            
                            ac.jLabelXLeft(0, -335, 10, 5, jLabelImage1);
                            ac.jLabelXRight(-335, 0, 10, 5, jLabelImage2);
                            ac.jLabelXRight(0, 335, 10, 5, jLabelImage3);
                            ac.jLabelXLeft(335, 0, 10, 5, jLabelImage4);
                            
                            count = 5;
                            
                            break;
                            
                        case 5:
                            ImageIcon ii11 = new ImageIcon(getClass().getResource("/Images/image11.jpg"));
                            ImageIcon ii12 = new ImageIcon(getClass().getResource("/Images/image12.jpg"));
                            
                            jLabelImage2.setIcon(ii11);
                            jLabelImage4.setIcon(ii12);
                            
                            Thread.sleep(3000);
                            
                            ac.jLabelXRight(-335, 0, 10, 5, jLabelImage1);
                            ac.jLabelXLeft(0, -335, 10, 5, jLabelImage2);
                            ac.jLabelXLeft(335, 0, 10, 5, jLabelImage3);
                            ac.jLabelXRight(0, 335, 10, 5, jLabelImage4);
                            
                            count = 0;
                            
                            break;
                    }
                }
            } catch (Exception e) {
            }
        }
        }.start();
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
        jPanel1 = new javax.swing.JPanel();
        jLabelImage1 = new javax.swing.JLabel();
        jLabelImage2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelImage_staff = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        jTextFieldUserName = new javax.swing.JTextField();
        jLabelImageUser = new javax.swing.JLabel();
        jLabelImagePass = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPanelButtonLogin = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelImage3 = new javax.swing.JLabel();
        jLabelImage4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setPreferredSize(new java.awt.Dimension(1000, 500));
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImage1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 470));

        jLabelImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-335, 0, 335, 470));

        jPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 335, 470));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setForeground(new java.awt.Color(0, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 448));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImage_staff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage_staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_staff.png"))); // NOI18N
        jPanel2.add(jLabelImage_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 130, 140));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUserName.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jTextFieldUserName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldUserName.setText("Tên tài khoản");
        jTextFieldUserName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
        jTextFieldUserName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextFieldUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUserNameFocusLost(evt);
            }
        });
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanelLogin.add(jTextFieldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 240, 40));

        jLabelImageUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_user.png"))); // NOI18N
        jPanelLogin.add(jLabelImageUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 50, -1));

        jLabelImagePass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_pass.png"))); // NOI18N
        jPanelLogin.add(jLabelImagePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 50, 40));

        jPasswordFieldPass.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPasswordFieldPass.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordFieldPass.setText("Mật khẩu");
        jPasswordFieldPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        jPasswordFieldPass.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jPasswordFieldPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldPassFocusLost(evt);
            }
        });
        jPanelLogin.add(jPasswordFieldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 240, 40));

        jPanelButtonLogin.setBackground(new java.awt.Color(0, 102, 153));
        jPanelButtonLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanelButtonLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogin.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Đăng nhập");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelButtonLogin.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 60));

        jPanelLogin.add(jPanelButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, 80));

        jPanel2.add(jPanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 250));

        jPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 30, 330, 470));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 470));

        jLabelImage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 0, 335, 470));

        jPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 30, 335, 470));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(GUI.FormDangnhap.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        jLabelMinimize.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GREEN));
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        jLabelMinimize.setBorder(null);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        try {
            int dialogbutton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Bạn muốn thoát hệ thống?", "Thoát hệ thống", dialogbutton);
            if(result == 0)
            {
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseEntered
        jLabelClose.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.RED));
    }//GEN-LAST:event_jLabelCloseMouseEntered

    private void jLabelCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseExited
        jLabelClose.setBorder(null);
    }//GEN-LAST:event_jLabelCloseMouseExited

    private void jTextFieldUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserNameFocusGained
        if(jTextFieldUserName.getText().trim().equals("Tên tài khoản"))
        {
            jTextFieldUserName.setText("");
            jTextFieldUserName.setForeground(Color.blue);
        }

        jTextFieldUserName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
    }//GEN-LAST:event_jTextFieldUserNameFocusGained

    private void jTextFieldUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUserNameFocusLost
        if(jTextFieldUserName.getText().trim().equals("") || jTextFieldUserName.getText().trim().equals("Tên tài khoản"))
        {
            jTextFieldUserName.setText("Tên tài khoản");
            jTextFieldUserName.setForeground(new Color(102,102,102));
        }

        jTextFieldUserName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jTextFieldUserNameFocusLost

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jPasswordFieldPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPassFocusGained

        if(String.valueOf(jPasswordFieldPass.getPassword()).trim().equals("Mật khẩu"))
        {
            jPasswordFieldPass.setText("");
            jPasswordFieldPass.setForeground(Color.blue);
        }

        jPasswordFieldPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

    }//GEN-LAST:event_jPasswordFieldPassFocusGained

    private void jPasswordFieldPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldPassFocusLost

        if(String.valueOf(jPasswordFieldPass.getPassword()).trim().equals("") || String.valueOf(jPasswordFieldPass.getPassword()).trim().equals("Mật khẩu"))
        {
            jPasswordFieldPass.setText("Mật khẩu");
            jPasswordFieldPass.setForeground(new Color(102,102,102));
        }

        jPasswordFieldPass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jPasswordFieldPassFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String username = this.jTextFieldUserName.getText();
        char[] password = this.jPasswordFieldPass.getPassword();
        
        int result = this.dangNhapController.Login(username, password);
        
        if(result == 0){
            this.message.Error(this, "Failed to login!");
        } 
        
        if(result == 1){            
            MenuQuanTriVienController menuQuanTriVienController = new MenuQuanTriVienController();
            FormMenuQuantrivien formMenuQuantrivien = new FormMenuQuantrivien(menuQuanTriVienController);
            
            formMenuQuantrivien.getForm();
//            closeForm();
                
        }
        
        if(result == 2){            
            MenuNhanVienQuayVeController menuNhanVienQuayVeController = new MenuNhanVienQuayVeController();
            FormMenuNhanvienquayve formMenuNhanvienquayve = new FormMenuNhanvienquayve(menuNhanVienQuayVeController);
            formMenuNhanvienquayve.getForm();
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed
    
    
    
    public void getForm() {
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
            java.util.logging.Logger.getLogger(FormDangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDangnhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        this.setVisible(true);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormDangnhap().setVisible(true);
//            }
//        });
    }
    
    public void closeForm(){
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelBackgroundHeader;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelImage1;
    private javax.swing.JLabel jLabelImage2;
    private javax.swing.JLabel jLabelImage3;
    private javax.swing.JLabel jLabelImage4;
    private javax.swing.JLabel jLabelImagePass;
    private javax.swing.JLabel jLabelImageUser;
    private javax.swing.JLabel jLabelImage_staff;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelButtonLogin;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
