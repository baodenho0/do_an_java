
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import Controllers.MenuNhanVienQuayVeController;

public class FormMenuNhanvienquayve extends javax.swing.JFrame {
    
    private MenuNhanVienQuayVeController menuNhanVienQuayVeController;
    
    public FormMenuNhanvienquayve(MenuNhanVienQuayVeController menuNhanVienQuayVeController) {
        initComponents();
       
        this.setLocationRelativeTo(null);
        this.menuNhanVienQuayVeController = menuNhanVienQuayVeController;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelMain = new javax.swing.JPanel();
        jTabbedPaneDanhsachphim = new javax.swing.JTabbedPane();
        jPanelPhimdangchieu = new javax.swing.JPanel();
        jLabelPoster1 = new javax.swing.JLabel();
        jTextFieldTenphim1 = new javax.swing.JTextField();
        jLabelPoster2 = new javax.swing.JLabel();
        jTextFieldTenphim2 = new javax.swing.JTextField();
        jLabelPoster3 = new javax.swing.JLabel();
        jTextFieldTenphim3 = new javax.swing.JTextField();
        jLabelPoster4 = new javax.swing.JLabel();
        jTextFieldTenphim4 = new javax.swing.JTextField();
        jLabelPoster5 = new javax.swing.JLabel();
        jTextFieldTenphim5 = new javax.swing.JTextField();
        jLabelPoster6 = new javax.swing.JLabel();
        jTextFieldTenphim6 = new javax.swing.JTextField();
        jLabelPoster7 = new javax.swing.JLabel();
        jTextFieldTenphim7 = new javax.swing.JTextField();
        jLabelPoster8 = new javax.swing.JLabel();
        jTextFieldTenphim8 = new javax.swing.JTextField();
        jPanelPhimsapchieu = new javax.swing.JPanel();
        jLabelPoster9 = new javax.swing.JLabel();
        jTextFieldTenphim9 = new javax.swing.JTextField();
        jLabelPoster10 = new javax.swing.JLabel();
        jTextFieldTenphim10 = new javax.swing.JTextField();
        jLabelPoster11 = new javax.swing.JLabel();
        jTextFieldTenphim11 = new javax.swing.JTextField();
        jLabelPoster12 = new javax.swing.JLabel();
        jTextFieldTenphim12 = new javax.swing.JTextField();
        jLabelPoster13 = new javax.swing.JLabel();
        jTextFieldTenphim13 = new javax.swing.JTextField();
        jLabelPoster14 = new javax.swing.JLabel();
        jTextFieldTenphim14 = new javax.swing.JTextField();
        jLabelPoster15 = new javax.swing.JLabel();
        jTextFieldTenphim15 = new javax.swing.JTextField();
        jLabelPoster16 = new javax.swing.JLabel();
        jTextFieldTenphim16 = new javax.swing.JTextField();
        jPanelBanve = new javax.swing.JPanel();
        jLabelSymbolTimkiem = new javax.swing.JLabel();
        jTextFieldTimkiem = new javax.swing.JTextField();
        jLabelPoster = new javax.swing.JLabel();
        jTextFieldTenphim = new javax.swing.JTextField();
        jLabelNhasanxuat = new javax.swing.JLabel();
        jTextFieldNhasanxuat = new javax.swing.JTextField();
        jLabelTheloai = new javax.swing.JLabel();
        jTextFieldTheloai = new javax.swing.JTextField();
        jLabelThoiluong = new javax.swing.JLabel();
        jTextFieldThoiluong = new javax.swing.JTextField();
        jLabelDaodien = new javax.swing.JLabel();
        jTextFieldDaodien = new javax.swing.JTextField();
        jLabelQuocgia = new javax.swing.JLabel();
        jTextFieldQuocgia = new javax.swing.JTextField();
        jLabelNgonngu = new javax.swing.JLabel();
        jTextFieldNgonngu = new javax.swing.JTextField();
        jLabelKhoichieu = new javax.swing.JLabel();
        jTextFieldKhoichieu = new javax.swing.JTextField();
        jLabelDienvien = new javax.swing.JLabel();
        jTextFieldDienvien = new javax.swing.JTextField();
        jLabelDotuoi = new javax.swing.JLabel();
        jTextFieldDotuoi = new javax.swing.JTextField();
        jLabelNoidung = new javax.swing.JLabel();
        jLabelLine_Noidung = new javax.swing.JLabel();
        jScrollPaneNoidung = new javax.swing.JScrollPane();
        jEditorPaneNoidung = new javax.swing.JEditorPane();
        jLabelLichchieu = new javax.swing.JLabel();
        jLabelLine_Lichchieu = new javax.swing.JLabel();
        jDateChooserLichchieu = new com.toedter.calendar.JDateChooser();
        jTextFieldCongnghechieuphim = new javax.swing.JTextField();
        jTextFieldGiochieu1 = new javax.swing.JTextField();
        jTextFieldGiochieu2 = new javax.swing.JTextField();
        jTextFieldGiochieu3 = new javax.swing.JTextField();
        jTextFieldGiochieu4 = new javax.swing.JTextField();
        jTextFieldGiochieu5 = new javax.swing.JTextField();
        jTextFieldGiochieu6 = new javax.swing.JTextField();
        jTextFieldGiochieu7 = new javax.swing.JTextField();
        jTextFieldGiochieu8 = new javax.swing.JTextField();
        jTextFieldGiochieu9 = new javax.swing.JTextField();
        jTextFieldGiochieu10 = new javax.swing.JTextField();
        jPanelMenu = new javax.swing.JPanel();
        jLabelSelectedDSPhim = new javax.swing.JLabel();
        jLabelSymbolDSPhim = new javax.swing.JLabel();
        jLabelDSPhim = new javax.swing.JLabel();
        jLabelLine1 = new javax.swing.JLabel();
        jLabelSelectedBanve = new javax.swing.JLabel();
        jLabelSymbolBanve = new javax.swing.JLabel();
        jLabelBanve = new javax.swing.JLabel();
        jLabelLine2 = new javax.swing.JLabel();
        jLabelSelectedThemKH = new javax.swing.JLabel();
        jLabelSymbolThemKH = new javax.swing.JLabel();
        jLabelThemKH = new javax.swing.JLabel();
        jLabelLine3 = new javax.swing.JLabel();
        jLabelSymbolUser = new javax.swing.JLabel();
        jLabelSymbolOut = new javax.swing.JLabel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelSymbol = new javax.swing.JLabel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelBackgroundHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setOpaque(false);
        jPanelMain.setPreferredSize(new java.awt.Dimension(1900, 960));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPaneDanhsachphim.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPaneDanhsachphim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPaneDanhsachphim.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTabbedPaneDanhsachphim.setName(""); // NOI18N
        jTabbedPaneDanhsachphim.setOpaque(true);
        jTabbedPaneDanhsachphim.setPreferredSize(new java.awt.Dimension(1600, 960));

        jPanelPhimdangchieu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPhimdangchieu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPoster1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 260, 310));

        jTextFieldTenphim1.setEditable(false);
        jTextFieldTenphim1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim1.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 260, 40));

        jLabelPoster2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 260, 310));

        jTextFieldTenphim2.setEditable(false);
        jTextFieldTenphim2.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim2.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 40));

        jLabelPoster3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 260, 310));

        jTextFieldTenphim3.setEditable(false);
        jTextFieldTenphim3.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim3.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 260, 40));

        jLabelPoster4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, 260, 310));

        jTextFieldTenphim4.setEditable(false);
        jTextFieldTenphim4.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim4.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 380, 260, 40));

        jLabelPoster5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 260, 310));

        jTextFieldTenphim5.setEditable(false);
        jTextFieldTenphim5.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim5.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 820, 260, 40));

        jLabelPoster6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 260, 310));

        jTextFieldTenphim6.setEditable(false);
        jTextFieldTenphim6.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim6.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 820, 260, 40));

        jLabelPoster7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 260, 310));

        jTextFieldTenphim7.setEditable(false);
        jTextFieldTenphim7.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim7.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 820, 260, 40));

        jLabelPoster8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimdangchieu.add(jLabelPoster8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 490, 260, 310));

        jTextFieldTenphim8.setEditable(false);
        jTextFieldTenphim8.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim8.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimdangchieu.add(jTextFieldTenphim8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 820, 260, 40));

        jTabbedPaneDanhsachphim.addTab("Phim đang chiếu", jPanelPhimdangchieu);

        jPanelPhimsapchieu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPhimsapchieu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPoster9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 260, 310));

        jTextFieldTenphim9.setEditable(false);
        jTextFieldTenphim9.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim9.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 260, 40));

        jLabelPoster10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 260, 310));

        jTextFieldTenphim10.setEditable(false);
        jTextFieldTenphim10.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim10.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 260, 40));

        jLabelPoster11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 260, 310));

        jTextFieldTenphim11.setEditable(false);
        jTextFieldTenphim11.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim11.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, 260, 40));

        jLabelPoster12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, 260, 310));

        jTextFieldTenphim12.setEditable(false);
        jTextFieldTenphim12.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim12.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 380, 260, 40));

        jLabelPoster13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 260, 310));

        jTextFieldTenphim13.setEditable(false);
        jTextFieldTenphim13.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim13.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 820, 260, 40));

        jLabelPoster14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 260, 310));

        jTextFieldTenphim14.setEditable(false);
        jTextFieldTenphim14.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim14.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 820, 260, 40));

        jLabelPoster15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, 260, 310));

        jTextFieldTenphim15.setEditable(false);
        jTextFieldTenphim15.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim15.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim15, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 820, 260, 40));

        jLabelPoster16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelPhimsapchieu.add(jLabelPoster16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 490, 260, 310));

        jTextFieldTenphim16.setEditable(false);
        jTextFieldTenphim16.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTenphim16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextFieldTenphim16.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTenphim16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelPhimsapchieu.add(jTextFieldTenphim16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 820, 260, 40));

        jTabbedPaneDanhsachphim.addTab("Phim sắp chiếu", jPanelPhimsapchieu);

        jPanelMain.add(jTabbedPaneDanhsachphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1600, 960));

        jPanelBanve.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBanve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelBanve.setPreferredSize(new java.awt.Dimension(1810, 960));
        jPanelBanve.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSymbolTimkiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_search.png"))); // NOI18N
        jPanelBanve.add(jLabelSymbolTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 40));

        jTextFieldTimkiem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldTimkiem.setText("Tìm kiếm");
        jTextFieldTimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldTimkiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTimkiemFocusLost(evt);
            }
        });
        jPanelBanve.add(jTextFieldTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 350, 40));

        jLabelPoster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPoster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelBanve.add(jLabelPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 330));

        jTextFieldTenphim.setEditable(false);
        jTextFieldTenphim.setFont(new Font("Times New Roman", Font.BOLD, 48));
        jTextFieldTenphim.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldTenphim.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldTenphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 610, 70));

        jLabelNhasanxuat.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelNhasanxuat.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNhasanxuat.setText("Nhà sản xuất:");
        jPanelBanve.add(jLabelNhasanxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 120, 40));

        jTextFieldNhasanxuat.setEditable(false);
        jTextFieldNhasanxuat.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldNhasanxuat.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldNhasanxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 260, 40));

        jLabelTheloai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelTheloai.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTheloai.setText("Thể loại");
        jPanelBanve.add(jLabelTheloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 40));

        jTextFieldTheloai.setEditable(false);
        jTextFieldTheloai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldTheloai.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldTheloai, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 260, 40));

        jLabelThoiluong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelThoiluong.setForeground(new java.awt.Color(0, 0, 204));
        jLabelThoiluong.setText("Thời lượng:");
        jPanelBanve.add(jLabelThoiluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 120, 40));

        jTextFieldThoiluong.setEditable(false);
        jTextFieldThoiluong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldThoiluong.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldThoiluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 260, 40));

        jLabelDaodien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelDaodien.setForeground(new java.awt.Color(0, 0, 204));
        jLabelDaodien.setText("Đạo diễn:");
        jPanelBanve.add(jLabelDaodien, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 120, 40));

        jTextFieldDaodien.setEditable(false);
        jTextFieldDaodien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldDaodien.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldDaodien, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 260, 40));

        jLabelQuocgia.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelQuocgia.setForeground(new java.awt.Color(0, 0, 204));
        jLabelQuocgia.setText("Quốc gia:");
        jPanelBanve.add(jLabelQuocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 120, 40));

        jTextFieldQuocgia.setEditable(false);
        jTextFieldQuocgia.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldQuocgia.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldQuocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 260, 40));

        jLabelNgonngu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelNgonngu.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNgonngu.setText("Ngôn ngữ:");
        jPanelBanve.add(jLabelNgonngu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 120, 40));

        jTextFieldNgonngu.setEditable(false);
        jTextFieldNgonngu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldNgonngu.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldNgonngu, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 260, 40));

        jLabelKhoichieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelKhoichieu.setForeground(new java.awt.Color(0, 0, 204));
        jLabelKhoichieu.setText("Khởi chiếu:");
        jPanelBanve.add(jLabelKhoichieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 120, 40));

        jTextFieldKhoichieu.setEditable(false);
        jTextFieldKhoichieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldKhoichieu.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldKhoichieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 260, 40));

        jLabelDienvien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelDienvien.setForeground(new java.awt.Color(0, 0, 204));
        jLabelDienvien.setText("Diễn viên:");
        jPanelBanve.add(jLabelDienvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 120, 40));

        jTextFieldDienvien.setEditable(false);
        jTextFieldDienvien.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldDienvien.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldDienvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 260, 40));

        jLabelDotuoi.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelDotuoi.setForeground(new java.awt.Color(0, 0, 204));
        jLabelDotuoi.setText("Độ tuổi:");
        jPanelBanve.add(jLabelDotuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 220, 120, 40));

        jTextFieldDotuoi.setEditable(false);
        jTextFieldDotuoi.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldDotuoi.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
        jPanelBanve.add(jTextFieldDotuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 220, 260, 40));

        jLabelNoidung.setFont(new Font("Times New Roman", Font.BOLD, 30
        ));
        jLabelNoidung.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNoidung.setText("Nội dung");
        jPanelBanve.add(jLabelNoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 270, 40));

        jLabelLine_Noidung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine_Noidung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelBanve.add(jLabelLine_Noidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 200, 2));

        jScrollPaneNoidung.setBorder(null);

        jEditorPaneNoidung.setEditable(false);
        jEditorPaneNoidung.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jEditorPaneNoidung.setText("Cuộc sống của một bà mẹ đơn thân cùng đứa con gái nhỏ thêm phần thú vị khi có sự xuất hiện của một người đàn ông lịch lãm, kế hoạch \"tìm chồng, tìm cha\" từ đây bắt đầu. Phim mới Nắng 3: Lời Hứa Của Cha, ra mắt tại các rạp chiếu phim từ ngày 06.03.2020. Xem thêm tại: https://www.galaxycine.vn/dat-ve/nang-3-loi-hua-cua-cha  Xem thêm tại: https://www.galaxycine.vn/dat-ve/nang-3-loi-hua-cua-cha");
        jScrollPaneNoidung.setViewportView(jEditorPaneNoidung);

        jPanelBanve.add(jScrollPaneNoidung, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 1530, 110));

        jLabelLichchieu.setFont(new Font("Times New Roman", Font.BOLD, 30
        ));
        jLabelLichchieu.setForeground(new java.awt.Color(0, 0, 204));
        jLabelLichchieu.setText("Lịch chiếu");
        jPanelBanve.add(jLabelLichchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 270, 40));

        jLabelLine_Lichchieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine_Lichchieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelBanve.add(jLabelLine_Lichchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 200, 2));

        jDateChooserLichchieu.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooserLichchieu.setDateFormatString("dd/MM/yyyy");
        jDateChooserLichchieu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jPanelBanve.add(jDateChooserLichchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 630, 260, 40));

        jTextFieldCongnghechieuphim.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldCongnghechieuphim.setText("2D Phụ đề");
        jTextFieldCongnghechieuphim.setBorder(null);
        jPanelBanve.add(jTextFieldCongnghechieuphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 200, 40));

        jTextFieldGiochieu1.setEditable(false);
        jTextFieldGiochieu1.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelBanve.add(jTextFieldGiochieu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 710, 100, 40));

        jTextFieldGiochieu2.setEditable(false);
        jTextFieldGiochieu2.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelBanve.add(jTextFieldGiochieu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 710, 100, 40));

        jTextFieldGiochieu3.setEditable(false);
        jTextFieldGiochieu3.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu3.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 100, 40));

        jTextFieldGiochieu4.setEditable(false);
        jTextFieldGiochieu4.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu4.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 710, 100, 40));

        jTextFieldGiochieu5.setEditable(false);
        jTextFieldGiochieu5.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu5.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 710, 100, 40));

        jTextFieldGiochieu6.setEditable(false);
        jTextFieldGiochieu6.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu6.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, 100, 40));

        jTextFieldGiochieu7.setEditable(false);
        jTextFieldGiochieu7.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu7.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 710, 100, 40));

        jTextFieldGiochieu8.setEditable(false);
        jTextFieldGiochieu8.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu8.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 710, 100, 40));

        jTextFieldGiochieu9.setEditable(false);
        jTextFieldGiochieu9.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu9.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 710, 100, 40));

        jTextFieldGiochieu10.setEditable(false);
        jTextFieldGiochieu10.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldGiochieu10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGiochieu10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldGiochieu10.setAutoscrolls(false);
        jPanelBanve.add(jTextFieldGiochieu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 710, 100, 40));

        jPanelMain.add(jPanelBanve, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1600, 960));

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(300, 960));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSelectedDSPhim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSelectedDSPhim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSelectedDSPhimMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelSelectedDSPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 80));

        jLabelSymbolDSPhim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolDSPhim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_phim.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolDSPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 80));

        jLabelDSPhim.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelDSPhim.setForeground(new java.awt.Color(102, 255, 255));
        jLabelDSPhim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDSPhim.setText("Danh sách Phim");
        jPanelMenu.add(jLabelDSPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 80));

        jLabelLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 270, 1));

        jLabelSelectedBanve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSelectedBanve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSelectedBanveMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelSelectedBanve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 80));

        jLabelSymbolBanve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolBanve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_tracuuve.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolBanve, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 90, 80));

        jLabelBanve.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelBanve.setForeground(new java.awt.Color(102, 255, 255));
        jLabelBanve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBanve.setText("Bán vé");
        jPanelMenu.add(jLabelBanve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 80));

        jLabelLine2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 270, 1));

        jLabelSelectedThemKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSelectedThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSelectedThemKHMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelSelectedThemKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 80));

        jLabelSymbolThemKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_khachhang.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolThemKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 90, 80));

        jLabelThemKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelThemKH.setForeground(new java.awt.Color(102, 255, 255));
        jLabelThemKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThemKH.setText("Thêm khách hàng");
        jPanelMenu.add(jLabelThemKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 80));

        jLabelLine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 270, 1));

        jLabelSymbolUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_logout.png"))); // NOI18N
        jLabelSymbolUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSymbolUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 860, 90, 80));

        jLabelSymbolOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_infor.png"))); // NOI18N
        jLabelSymbolOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSymbolOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 760, 90, 80));

        jPanelMain.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 960));

        jPanel.add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1900, 960));

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSymbol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_imageapp.png"))); // NOI18N
        jPanelHeader.add(jLabelSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

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
        jPanelHeader.add(jLabelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 0, 40, 40));

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
        jPanelHeader.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 0, 40, 40));

        jLabelBackgroundHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_header.jpg"))); // NOI18N
        jPanelHeader.add(jLabelBackgroundHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        jPanel.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 40));

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        this.setState(GUI.FormMenuNhanvienquayve.ICONIFIED);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelLine1.setVisible(true);
        jLabelLine2.setVisible(false);
        jLabelLine3.setVisible(false);
        
        jTabbedPaneDanhsachphim.setVisible(true);
        jPanelBanve.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jLabelSelectedDSPhimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectedDSPhimMouseClicked
        jLabelLine1.setVisible(true);
        jLabelLine2.setVisible(false);
        jLabelLine3.setVisible(false);
        
        jTabbedPaneDanhsachphim.setVisible(true);
        jPanelBanve.setVisible(false);
        
    }//GEN-LAST:event_jLabelSelectedDSPhimMouseClicked

    private void jLabelSelectedBanveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectedBanveMouseClicked
        jLabelLine1.setVisible(false);
        jLabelLine2.setVisible(true);
        jLabelLine3.setVisible(false);
        
        jPanelBanve.setVisible(true);
        jTabbedPaneDanhsachphim.setVisible(false);
    }//GEN-LAST:event_jLabelSelectedBanveMouseClicked

    private void jLabelSelectedThemKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectedThemKHMouseClicked
        jLabelLine1.setVisible(false);
        jLabelLine2.setVisible(false);
        jLabelLine3.setVisible(true);
        
        FormThemKhachhang call = new FormThemKhachhang();
        call.setVisible(true);
    }//GEN-LAST:event_jLabelSelectedThemKHMouseClicked

    private void jTextFieldTimkiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTimkiemFocusLost
        if(jTextFieldTimkiem.getText().trim().equals("") || jTextFieldTimkiem.getText().trim().equals("Tìm kiếm"))
        {
            jTextFieldTimkiem.setText("Tìm kiếm");
            jTextFieldTimkiem.setFont(new Font("Times New Roman", Font.BOLD, 20));
            jTextFieldTimkiem.setForeground(new Color(102,102,102));
        }

        jTextFieldTimkiem.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jTextFieldTimkiemFocusLost

    private void jTextFieldTimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTimkiemFocusGained
        if(jTextFieldTimkiem.getText().trim().equals("Tìm kiếm"))
        {
            jTextFieldTimkiem.setText("");
            jTextFieldTimkiem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            jTextFieldTimkiem.setForeground(Color.blue);
        }

        jTextFieldTimkiem.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
    }//GEN-LAST:event_jTextFieldTimkiemFocusGained

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuNhanvienquayve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        this.setVisible(true);
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormMenuNhanvienquayve().setVisible(true);
//            }
//        });
    }
    
    public void closeForm(){
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooserLichchieu;
    private javax.swing.JEditorPane jEditorPaneNoidung;
    private javax.swing.JLabel jLabelBackgroundHeader;
    private javax.swing.JLabel jLabelBanve;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDSPhim;
    private javax.swing.JLabel jLabelDaodien;
    private javax.swing.JLabel jLabelDienvien;
    private javax.swing.JLabel jLabelDotuoi;
    private javax.swing.JLabel jLabelKhoichieu;
    private javax.swing.JLabel jLabelLichchieu;
    private javax.swing.JLabel jLabelLine1;
    private javax.swing.JLabel jLabelLine2;
    private javax.swing.JLabel jLabelLine3;
    private javax.swing.JLabel jLabelLine_Lichchieu;
    private javax.swing.JLabel jLabelLine_Noidung;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelNgonngu;
    private javax.swing.JLabel jLabelNhasanxuat;
    private javax.swing.JLabel jLabelNoidung;
    private javax.swing.JLabel jLabelPoster;
    private javax.swing.JLabel jLabelPoster1;
    private javax.swing.JLabel jLabelPoster10;
    private javax.swing.JLabel jLabelPoster11;
    private javax.swing.JLabel jLabelPoster12;
    private javax.swing.JLabel jLabelPoster13;
    private javax.swing.JLabel jLabelPoster14;
    private javax.swing.JLabel jLabelPoster15;
    private javax.swing.JLabel jLabelPoster16;
    private javax.swing.JLabel jLabelPoster2;
    private javax.swing.JLabel jLabelPoster3;
    private javax.swing.JLabel jLabelPoster4;
    private javax.swing.JLabel jLabelPoster5;
    private javax.swing.JLabel jLabelPoster6;
    private javax.swing.JLabel jLabelPoster7;
    private javax.swing.JLabel jLabelPoster8;
    private javax.swing.JLabel jLabelPoster9;
    private javax.swing.JLabel jLabelQuocgia;
    private javax.swing.JLabel jLabelSelectedBanve;
    private javax.swing.JLabel jLabelSelectedDSPhim;
    private javax.swing.JLabel jLabelSelectedThemKH;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JLabel jLabelSymbolBanve;
    private javax.swing.JLabel jLabelSymbolDSPhim;
    private javax.swing.JLabel jLabelSymbolOut;
    private javax.swing.JLabel jLabelSymbolThemKH;
    private javax.swing.JLabel jLabelSymbolTimkiem;
    private javax.swing.JLabel jLabelSymbolUser;
    private javax.swing.JLabel jLabelTheloai;
    private javax.swing.JLabel jLabelThemKH;
    private javax.swing.JLabel jLabelThoiluong;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelBanve;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPhimdangchieu;
    private javax.swing.JPanel jPanelPhimsapchieu;
    private javax.swing.JScrollPane jScrollPaneNoidung;
    private javax.swing.JTabbedPane jTabbedPaneDanhsachphim;
    private javax.swing.JTextField jTextFieldCongnghechieuphim;
    private javax.swing.JTextField jTextFieldDaodien;
    private javax.swing.JTextField jTextFieldDienvien;
    private javax.swing.JTextField jTextFieldDotuoi;
    private javax.swing.JTextField jTextFieldGiochieu1;
    private javax.swing.JTextField jTextFieldGiochieu10;
    private javax.swing.JTextField jTextFieldGiochieu2;
    private javax.swing.JTextField jTextFieldGiochieu3;
    private javax.swing.JTextField jTextFieldGiochieu4;
    private javax.swing.JTextField jTextFieldGiochieu5;
    private javax.swing.JTextField jTextFieldGiochieu6;
    private javax.swing.JTextField jTextFieldGiochieu7;
    private javax.swing.JTextField jTextFieldGiochieu8;
    private javax.swing.JTextField jTextFieldGiochieu9;
    private javax.swing.JTextField jTextFieldKhoichieu;
    private javax.swing.JTextField jTextFieldNgonngu;
    private javax.swing.JTextField jTextFieldNhasanxuat;
    private javax.swing.JTextField jTextFieldQuocgia;
    private javax.swing.JTextField jTextFieldTenphim;
    private javax.swing.JTextField jTextFieldTenphim1;
    private javax.swing.JTextField jTextFieldTenphim10;
    private javax.swing.JTextField jTextFieldTenphim11;
    private javax.swing.JTextField jTextFieldTenphim12;
    private javax.swing.JTextField jTextFieldTenphim13;
    private javax.swing.JTextField jTextFieldTenphim14;
    private javax.swing.JTextField jTextFieldTenphim15;
    private javax.swing.JTextField jTextFieldTenphim16;
    private javax.swing.JTextField jTextFieldTenphim2;
    private javax.swing.JTextField jTextFieldTenphim3;
    private javax.swing.JTextField jTextFieldTenphim4;
    private javax.swing.JTextField jTextFieldTenphim5;
    private javax.swing.JTextField jTextFieldTenphim6;
    private javax.swing.JTextField jTextFieldTenphim7;
    private javax.swing.JTextField jTextFieldTenphim8;
    private javax.swing.JTextField jTextFieldTenphim9;
    private javax.swing.JTextField jTextFieldTheloai;
    private javax.swing.JTextField jTextFieldThoiluong;
    private javax.swing.JTextField jTextFieldTimkiem;
    // End of variables declaration//GEN-END:variables
}
