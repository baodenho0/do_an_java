
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Controllers.MenuQuanTriVienController;

public class FormMenuQuantrivien extends javax.swing.JFrame {
    
    private MenuQuanTriVienController menuQuanTriVienController;
    
    public FormMenuQuantrivien(MenuQuanTriVienController menuQuanTriVienController) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        TableFormat();
        
        this.menuQuanTriVienController = menuQuanTriVienController;
    }
    
    public void TableFormat()
    {
        jTableKH.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 20));
        jTableKH.getTableHeader().setOpaque(false);
        jTableKH.getTableHeader().setForeground(new Color(0,0,255));
        jTableKH.setRowHeight(25);


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPanelMain = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelSymbolMenu = new javax.swing.JLabel();
        jLabelSelectedKhachhang = new javax.swing.JLabel();
        jLabelKhachhang = new javax.swing.JLabel();
        jLabelSymbolKhachhang = new javax.swing.JLabel();
        jLabelLine1 = new javax.swing.JLabel();
        jLabelSelectedTaikhoan = new javax.swing.JLabel();
        jLabelTaikhoan = new javax.swing.JLabel();
        jLabelSymbolTaikhoan = new javax.swing.JLabel();
        jLabelLine2 = new javax.swing.JLabel();
        jLabelSelectedPhim = new javax.swing.JLabel();
        jLabelPhim = new javax.swing.JLabel();
        jLabelSymbolPhim = new javax.swing.JLabel();
        jLabelLine3 = new javax.swing.JLabel();
        jLabelSelectedLichchieu = new javax.swing.JLabel();
        jLabelLichchieu = new javax.swing.JLabel();
        jLabelSymbolLichchieu = new javax.swing.JLabel();
        jLabelLine4 = new javax.swing.JLabel();
        jLabelSelectedKhuyenmai = new javax.swing.JLabel();
        jLabelKhuyenmai = new javax.swing.JLabel();
        jLabelSymbolKhuyenmai = new javax.swing.JLabel();
        jLabelLine5 = new javax.swing.JLabel();
        jLabelSelectedTracuuve = new javax.swing.JLabel();
        jLabelTracuuve = new javax.swing.JLabel();
        jLabelSymbolTracuuve = new javax.swing.JLabel();
        jLabelLine6 = new javax.swing.JLabel();
        jLabelSelectedThongke = new javax.swing.JLabel();
        jLabelThongke = new javax.swing.JLabel();
        jLabelSymbolThongke = new javax.swing.JLabel();
        jLabelLine7 = new javax.swing.JLabel();
        jLabelSymbolUser = new javax.swing.JLabel();
        jLabelSymbolOut = new javax.swing.JLabel();
        jPanelKhachhang = new javax.swing.JPanel();
        jScrollPaneKhachhang = new javax.swing.JScrollPane();
        jTableKH = new javax.swing.JTable();
        jLabelDanhsachkhachhang = new javax.swing.JLabel();
        jLabelLineDSKH = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabelSymbolSearch = new javax.swing.JLabel();
        jLabelNamePanelKH = new javax.swing.JLabel();
        jLabelMaKH = new javax.swing.JLabel();
        jTextFieldMaKH = new javax.swing.JTextField();
        jLabelTenKH = new javax.swing.JLabel();
        jTextFieldTenKH = new javax.swing.JTextField();
        jLabelNgaysinh = new javax.swing.JLabel();
        jTextFieldNgaysinh = new javax.swing.JTextField();
        jLabelCMND = new javax.swing.JLabel();
        jTextFieldCMND = new javax.swing.JTextField();
        jLabelGioitinh = new javax.swing.JLabel();
        jTextFieldGioitinh = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSodienthoai = new javax.swing.JLabel();
        jTextFieldSodienthoai = new javax.swing.JTextField();
        jLabelDiem = new javax.swing.JLabel();
        jTextFieldDiem = new javax.swing.JTextField();
        jLabelLoaithe = new javax.swing.JLabel();
        jTextFieldLoaithe = new javax.swing.JTextField();
        jButtonThemKH = new javax.swing.JButton();
        jButtonSuaKH = new javax.swing.JButton();
        jButtonXoaKH = new javax.swing.JButton();
        jButtonPreRow = new javax.swing.JButton();
        jButtonNextRow = new javax.swing.JButton();
        jPanelTaikhoan = new javax.swing.JPanel();
        jPanelHeaderTaikhoan = new javax.swing.JPanel();
        jLabelNamePanelTK = new javax.swing.JLabel();
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

        jPanel.setPreferredSize(new java.awt.Dimension(1900, 1000));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setOpaque(false);
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMenu.setPreferredSize(new java.awt.Dimension(280, 960));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSymbolMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_menu.png"))); // NOI18N
        jLabelSymbolMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSymbolMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSymbolMenuMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelSymbolMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 90, 80));

        jLabelSelectedKhachhang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSelectedKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSelectedKhachhangMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelSelectedKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 80));

        jLabelKhachhang.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelKhachhang.setForeground(new java.awt.Color(102, 255, 255));
        jLabelKhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKhachhang.setText("Khách hàng");
        jPanelMenu.add(jLabelKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 80));

        jLabelSymbolKhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_khachhang.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 80));

        jLabelLine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 270, 1));

        jLabelSelectedTaikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSelectedTaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSelectedTaikhoanMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelSelectedTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 80));

        jLabelTaikhoan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTaikhoan.setForeground(new java.awt.Color(102, 255, 255));
        jLabelTaikhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTaikhoan.setText("Tài khoản");
        jPanelMenu.add(jLabelTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 80));

        jLabelSymbolTaikhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolTaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_taikhoan.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 90, 80));

        jLabelLine2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 270, 1));

        jLabelSelectedPhim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSelectedPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 80));

        jLabelPhim.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelPhim.setForeground(new java.awt.Color(102, 255, 255));
        jLabelPhim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPhim.setText("Phim");
        jPanelMenu.add(jLabelPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 80));

        jLabelSymbolPhim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolPhim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_phim.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 90, 80));

        jLabelLine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 270, 1));

        jLabelSelectedLichchieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSelectedLichchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 80));

        jLabelLichchieu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelLichchieu.setForeground(new java.awt.Color(102, 255, 255));
        jLabelLichchieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLichchieu.setText("Lịch chiếu");
        jPanelMenu.add(jLabelLichchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 80));

        jLabelSymbolLichchieu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolLichchieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_lichchieu.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolLichchieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, 80));

        jLabelLine4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 270, 1));

        jLabelSelectedKhuyenmai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSelectedKhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 300, 80));

        jLabelKhuyenmai.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelKhuyenmai.setForeground(new java.awt.Color(102, 255, 255));
        jLabelKhuyenmai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKhuyenmai.setText("Khuyến mãi");
        jPanelMenu.add(jLabelKhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 190, 80));

        jLabelSymbolKhuyenmai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolKhuyenmai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_khuyenmai.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolKhuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 90, 80));

        jLabelLine5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 270, 1));

        jLabelSelectedTracuuve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSelectedTracuuve, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, 80));

        jLabelTracuuve.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTracuuve.setForeground(new java.awt.Color(102, 255, 255));
        jLabelTracuuve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTracuuve.setText("Tra cứu vé");
        jPanelMenu.add(jLabelTracuuve, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 190, 80));

        jLabelSymbolTracuuve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolTracuuve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_tracuuve.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolTracuuve, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 90, 80));

        jLabelLine6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 270, 1));

        jLabelSelectedThongke.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSelectedThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 300, 80));

        jLabelThongke.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelThongke.setForeground(new java.awt.Color(102, 255, 255));
        jLabelThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThongke.setText("Thống kê, báo cáo");
        jPanelMenu.add(jLabelThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 190, 80));

        jLabelSymbolThongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolThongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_thongke.png"))); // NOI18N
        jPanelMenu.add(jLabelSymbolThongke, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 90, 80));

        jLabelLine7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLine7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelMenu.add(jLabelLine7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 270, 1));

        jLabelSymbolUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_logout.png"))); // NOI18N
        jLabelSymbolUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSymbolUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 860, 90, 80));

        jLabelSymbolOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_infor.png"))); // NOI18N
        jLabelSymbolOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelMenu.add(jLabelSymbolOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 760, 90, 80));

        jPanelMain.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 300, 960));

        jPanelKhachhang.setBackground(new java.awt.Color(255, 255, 255));
        jPanelKhachhang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanelKhachhang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableKH.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jTableKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã khách hàng", "Họ và tên", "Ngày sinh", "CMND", "Giới tính", "Email", "Số điện thoại", "Điểm tích lũy", "Loại thẻ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneKhachhang.setViewportView(jTableKH);

        jPanelKhachhang.add(jScrollPaneKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1200, 670));

        jLabelDanhsachkhachhang.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabelDanhsachkhachhang.setForeground(new java.awt.Color(0, 0, 255));
        jLabelDanhsachkhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDanhsachkhachhang.setText("Danh sách khách hàng");
        jPanelKhachhang.add(jLabelDanhsachkhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 340, -1));

        jLabelLineDSKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLineDSKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background_line.jpg"))); // NOI18N
        jPanelKhachhang.add(jLabelLineDSKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 300, 2));

        jTextFieldSearch.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldSearch.setText("Tìm kiếm");
        jTextFieldSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldSearchFocusLost(evt);
            }
        });
        jPanelKhachhang.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 153, 350, 40));

        jLabelSymbolSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSymbolSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_search.png"))); // NOI18N
        jPanelKhachhang.add(jLabelSymbolSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 153, 50, 40));

        jLabelNamePanelKH.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelNamePanelKH.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNamePanelKH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNamePanelKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_khachhang.png"))); // NOI18N
        jLabelNamePanelKH.setText(" QUẢN LÝ KHÁCH HÀNG");
        jLabelNamePanelKH.setPreferredSize(new java.awt.Dimension(510, 64));
        jPanelKhachhang.add(jLabelNamePanelKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 30, 670, 64));

        jLabelMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelMaKH.setForeground(new java.awt.Color(0, 0, 204));
        jLabelMaKH.setText("Mã khách hàng:");
        jPanelKhachhang.add(jLabelMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 250, 140, 40));

        jTextFieldMaKH.setEditable(false);
        jTextFieldMaKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldMaKH.setBorder(null);
        jPanelKhachhang.add(jTextFieldMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 250, 90, 40));

        jLabelTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelTenKH.setForeground(new java.awt.Color(0, 0, 204));
        jLabelTenKH.setText("Họ và tên:");
        jPanelKhachhang.add(jLabelTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 300, 140, 40));

        jTextFieldTenKH.setEditable(false);
        jTextFieldTenKH.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldTenKH.setBorder(null);
        jPanelKhachhang.add(jTextFieldTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 300, 270, 40));

        jLabelNgaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelNgaysinh.setForeground(new java.awt.Color(0, 0, 204));
        jLabelNgaysinh.setText("Ngày sinh:");
        jPanelKhachhang.add(jLabelNgaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 350, 140, 40));

        jTextFieldNgaysinh.setEditable(false);
        jTextFieldNgaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldNgaysinh.setBorder(null);
        jPanelKhachhang.add(jTextFieldNgaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 350, 180, 40));

        jLabelCMND.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelCMND.setForeground(new java.awt.Color(0, 0, 204));
        jLabelCMND.setText("Số CMND:");
        jPanelKhachhang.add(jLabelCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 400, 140, 40));

        jTextFieldCMND.setEditable(false);
        jTextFieldCMND.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldCMND.setBorder(null);
        jPanelKhachhang.add(jTextFieldCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 400, 180, 40));

        jLabelGioitinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelGioitinh.setForeground(new java.awt.Color(0, 0, 204));
        jLabelGioitinh.setText("Giới tính:");
        jPanelKhachhang.add(jLabelGioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 450, 140, 40));

        jTextFieldGioitinh.setEditable(false);
        jTextFieldGioitinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldGioitinh.setBorder(null);
        jPanelKhachhang.add(jTextFieldGioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 450, 80, 40));

        jLabelEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 204));
        jLabelEmail.setText("Email:");
        jPanelKhachhang.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 500, 140, 40));

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldEmail.setBorder(null);
        jPanelKhachhang.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 500, 240, 40));

        jLabelSodienthoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelSodienthoai.setForeground(new java.awt.Color(0, 0, 204));
        jLabelSodienthoai.setText("Số điện thoại:");
        jPanelKhachhang.add(jLabelSodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 550, 140, 40));

        jTextFieldSodienthoai.setEditable(false);
        jTextFieldSodienthoai.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldSodienthoai.setBorder(null);
        jPanelKhachhang.add(jTextFieldSodienthoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 550, 210, 40));

        jLabelDiem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelDiem.setForeground(new java.awt.Color(0, 0, 204));
        jLabelDiem.setText("Điểm tích lũy:");
        jPanelKhachhang.add(jLabelDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 600, 140, 40));

        jTextFieldDiem.setEditable(false);
        jTextFieldDiem.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldDiem.setBorder(null);
        jPanelKhachhang.add(jTextFieldDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 600, 100, 40));

        jLabelLoaithe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jLabelLoaithe.setForeground(new java.awt.Color(0, 0, 204));
        jLabelLoaithe.setText("Loại thẻ:");
        jPanelKhachhang.add(jLabelLoaithe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 650, 140, 40));

        jTextFieldLoaithe.setEditable(false);
        jTextFieldLoaithe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        jTextFieldLoaithe.setBorder(null);
        jPanelKhachhang.add(jTextFieldLoaithe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 650, 100, 40));

        jButtonThemKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonThemKH.setForeground(new java.awt.Color(0, 0, 204));
        jButtonThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_add.png"))); // NOI18N
        jButtonThemKH.setText("Thêm");
        jButtonThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonThemKHMouseClicked(evt);
            }
        });
        jPanelKhachhang.add(jButtonThemKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 895, 130, 50));

        jButtonSuaKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonSuaKH.setForeground(new java.awt.Color(0, 0, 204));
        jButtonSuaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_edit.png"))); // NOI18N
        jButtonSuaKH.setText("Sửa");
        jPanelKhachhang.add(jButtonSuaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 895, 130, 50));

        jButtonXoaKH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonXoaKH.setForeground(new java.awt.Color(0, 0, 204));
        jButtonXoaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_delete.png"))); // NOI18N
        jButtonXoaKH.setText("Xóa");
        jPanelKhachhang.add(jButtonXoaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1630, 895, 130, 50));

        jButtonPreRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconback.png"))); // NOI18N
        jButtonPreRow.setToolTipText("");
        jButtonPreRow.setOpaque(false);
        jPanelKhachhang.add(jButtonPreRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 900, 60, -1));

        jButtonNextRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconnext.png"))); // NOI18N
        jButtonNextRow.setToolTipText("");
        jButtonNextRow.setOpaque(false);
        jPanelKhachhang.add(jButtonNextRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 900, 60, -1));

        jPanelMain.add(jPanelKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1810, 960));

        jPanelTaikhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeaderTaikhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNamePanelTK.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelNamePanelTK.setForeground(new java.awt.Color(255, 0, 0));
        jLabelNamePanelTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNamePanelTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_taikhoan.png"))); // NOI18N
        jLabelNamePanelTK.setText("QUẢN LÝ TÀI KHOẢN");
        jLabelNamePanelTK.setPreferredSize(new java.awt.Dimension(510, 64));
        jPanelHeaderTaikhoan.add(jLabelNamePanelTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 510, 64));

        jPanelTaikhoan.add(jPanelHeaderTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1810, 100));

        jPanelMain.add(jPanelTaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1810, 960));

        jPanel.add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1900, 960));

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(1900, 40));
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
        this.setState(GUI.FormMenuQuantrivien.ICONIFIED);
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

    private void jLabelSymbolMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSymbolMenuMouseClicked

        if(jPanelMenu.getX() == -210)
        {
            jPanelMenu.setLocation(0, 0);
        }
        else
        {
            jPanelMenu.setLocation(-210, 0);
        }
    }//GEN-LAST:event_jLabelSymbolMenuMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabelLine1.setVisible(true);
        jLabelLine2.setVisible(false);
        jLabelLine3.setVisible(false);
        jLabelLine4.setVisible(false);
        jLabelLine5.setVisible(false);
        jLabelLine6.setVisible(false);
        jLabelLine7.setVisible(false);
        
        jPanelKhachhang.setVisible(true);
        jPanelTaikhoan.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jLabelSelectedKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectedKhachhangMouseClicked
        jLabelLine1.setVisible(true);
        jLabelLine2.setVisible(false);
        jLabelLine3.setVisible(false);
        jLabelLine4.setVisible(false);
        jLabelLine5.setVisible(false);
        jLabelLine6.setVisible(false);
        jLabelLine7.setVisible(false);
        
        jPanelKhachhang.setVisible(true);
        jPanelTaikhoan.setVisible(false);
    }//GEN-LAST:event_jLabelSelectedKhachhangMouseClicked

    private void jLabelSelectedTaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSelectedTaikhoanMouseClicked
        jLabelLine1.setVisible(false);
        jLabelLine2.setVisible(true);
        jLabelLine3.setVisible(false);
        jLabelLine4.setVisible(false);
        jLabelLine5.setVisible(false);
        jLabelLine6.setVisible(false);
        jLabelLine7.setVisible(false);
        
        jPanelKhachhang.setVisible(false);
        jPanelTaikhoan.setVisible(true);
    }//GEN-LAST:event_jLabelSelectedTaikhoanMouseClicked

    private void jTextFieldSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusGained
        if(jTextFieldSearch.getText().trim().equals("Tìm kiếm"))
        {
            jTextFieldSearch.setText("");
            jTextFieldSearch.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            jTextFieldSearch.setForeground(Color.blue);
        }

        jTextFieldSearch.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));
    }//GEN-LAST:event_jTextFieldSearchFocusGained

    private void jTextFieldSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldSearchFocusLost
        if(jTextFieldSearch.getText().trim().equals("") || jTextFieldSearch.getText().trim().equals("Tìm kiếm"))
        {
            jTextFieldSearch.setText("Tìm kiếm");
            jTextFieldSearch.setFont(new Font("Times New Roman", Font.BOLD, 20));
            jTextFieldSearch.setForeground(new Color(102,102,102));
        }

        jTextFieldSearch.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(153,153,153)));
    }//GEN-LAST:event_jTextFieldSearchFocusLost

    private void jButtonThemKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonThemKHMouseClicked
        
        FormThemKhachhang call = new FormThemKhachhang();
        call.setVisible(true);
    }//GEN-LAST:event_jButtonThemKHMouseClicked

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
            java.util.logging.Logger.getLogger(FormMenuQuantrivien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenuQuantrivien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenuQuantrivien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuQuantrivien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

         this.setVisible(true);
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormMenuQuantrivien().setVisible(true);
//            }
//        });
    }
    
    public void closeForm(){
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNextRow;
    private javax.swing.JButton jButtonPreRow;
    private javax.swing.JButton jButtonSuaKH;
    private javax.swing.JButton jButtonThemKH;
    private javax.swing.JButton jButtonXoaKH;
    private javax.swing.JLabel jLabelBackgroundHeader;
    private javax.swing.JLabel jLabelCMND;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDanhsachkhachhang;
    private javax.swing.JLabel jLabelDiem;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGioitinh;
    private javax.swing.JLabel jLabelKhachhang;
    private javax.swing.JLabel jLabelKhuyenmai;
    private javax.swing.JLabel jLabelLichchieu;
    private javax.swing.JLabel jLabelLine1;
    private javax.swing.JLabel jLabelLine2;
    private javax.swing.JLabel jLabelLine3;
    private javax.swing.JLabel jLabelLine4;
    private javax.swing.JLabel jLabelLine5;
    private javax.swing.JLabel jLabelLine6;
    private javax.swing.JLabel jLabelLine7;
    private javax.swing.JLabel jLabelLineDSKH;
    private javax.swing.JLabel jLabelLoaithe;
    private javax.swing.JLabel jLabelMaKH;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelNamePanelKH;
    private javax.swing.JLabel jLabelNamePanelTK;
    private javax.swing.JLabel jLabelNgaysinh;
    private javax.swing.JLabel jLabelPhim;
    private javax.swing.JLabel jLabelSelectedKhachhang;
    private javax.swing.JLabel jLabelSelectedKhuyenmai;
    private javax.swing.JLabel jLabelSelectedLichchieu;
    private javax.swing.JLabel jLabelSelectedPhim;
    private javax.swing.JLabel jLabelSelectedTaikhoan;
    private javax.swing.JLabel jLabelSelectedThongke;
    private javax.swing.JLabel jLabelSelectedTracuuve;
    private javax.swing.JLabel jLabelSodienthoai;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JLabel jLabelSymbolKhachhang;
    private javax.swing.JLabel jLabelSymbolKhuyenmai;
    private javax.swing.JLabel jLabelSymbolLichchieu;
    private javax.swing.JLabel jLabelSymbolMenu;
    private javax.swing.JLabel jLabelSymbolOut;
    private javax.swing.JLabel jLabelSymbolPhim;
    private javax.swing.JLabel jLabelSymbolSearch;
    private javax.swing.JLabel jLabelSymbolTaikhoan;
    private javax.swing.JLabel jLabelSymbolThongke;
    private javax.swing.JLabel jLabelSymbolTracuuve;
    private javax.swing.JLabel jLabelSymbolUser;
    private javax.swing.JLabel jLabelTaikhoan;
    private javax.swing.JLabel jLabelTenKH;
    private javax.swing.JLabel jLabelThongke;
    private javax.swing.JLabel jLabelTracuuve;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelHeaderTaikhoan;
    private javax.swing.JPanel jPanelKhachhang;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTaikhoan;
    private javax.swing.JScrollPane jScrollPaneKhachhang;
    private javax.swing.JTable jTableKH;
    private javax.swing.JTextField jTextFieldCMND;
    private javax.swing.JTextField jTextFieldDiem;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGioitinh;
    private javax.swing.JTextField jTextFieldLoaithe;
    private javax.swing.JTextField jTextFieldMaKH;
    private javax.swing.JTextField jTextFieldNgaysinh;
    private javax.swing.JTextField jTextFieldSearch;
    private javax.swing.JTextField jTextFieldSodienthoai;
    private javax.swing.JTextField jTextFieldTenKH;
    // End of variables declaration//GEN-END:variables
}
