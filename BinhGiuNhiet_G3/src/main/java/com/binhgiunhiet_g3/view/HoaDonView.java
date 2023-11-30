package com.binhgiunhiet_g3.view;

import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import com.binhgiunhiet_g3.entity.GioHang;
import com.binhgiunhiet_g3.entity.GioHangChiTiet;
import com.binhgiunhiet_g3.entity.HoaDon;
import com.binhgiunhiet_g3.entity.HoaDonChiTiet;
import com.binhgiunhiet_g3.entity.KhuyenMai;
import com.binhgiunhiet_g3.service.BinhGiuNhietChiTietService;
import com.binhgiunhiet_g3.service.BinhGiuNhietService;
import com.binhgiunhiet_g3.service.GioHangChiTietService;
import com.binhgiunhiet_g3.service.GioHangService;
import com.binhgiunhiet_g3.service.HoaDonChiTietService;
import com.binhgiunhiet_g3.service.HoaDonService;
import com.binhgiunhiet_g3.service.KhuyenMaiService;
import com.binhgiunhiet_g3.service.impl.BinhGiuNhietChiTietServiceImpl;
import com.binhgiunhiet_g3.service.impl.GioHangChiTietServiceIpml;
import com.binhgiunhiet_g3.service.impl.GioHangServiceImpl;
import com.binhgiunhiet_g3.service.impl.HoaDonChiTietServiceImpl;
import com.binhgiunhiet_g3.service.impl.HoaDonServiceImpl;
import com.binhgiunhiet_g3.service.impl.KhuyenMaiServiceImpl;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HoaDonView extends javax.swing.JFrame {

    BinhGiuNhietChiTietService binhGiuNhietChiTietService = new BinhGiuNhietChiTietServiceImpl();
    GioHangChiTietService gioHangChiTietService = new GioHangChiTietServiceIpml();
    HoaDonChiTietService hoaDonChiTietService = new HoaDonChiTietServiceImpl();
    KhuyenMaiService khuyenMaiService = new KhuyenMaiServiceImpl();
    GioHangService gioHangService = new GioHangServiceImpl();
    HoaDonService hoaDonService = new HoaDonServiceImpl();

    List<BinhGiuNhietChiTiet> binhGiuNhietChiTiets = new ArrayList<>();
    List<KhuyenMai> khuyenMais = this.khuyenMaiService.getAll();
    List<GioHangChiTiet> gioHangChiTiets = new ArrayList<>();
    List<HoaDonChiTiet> hoaDonChiTiets = new ArrayList<>();
//    List<HoaDon> hoaDons = new ArrayList<>();
    List<GioHang> gioHangs = new ArrayList<>();

    DefaultTableModel model = new DefaultTableModel();

    public HoaDonView() {
        initComponents();

        loadTableGioHang();
        loadTableSanPham();
        loadCBB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGioHang = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableGioHangChiTiet = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenKhachHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbbKieuThanhToan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTienCanTRa = new javax.swing.JLabel();
        txtTienThua = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbKhuyenMai = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtHoaDon = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtTienKhachDua = new javax.swing.JTextField();
        txtCheckTien = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách hóa đơn"));

        tableGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Tên", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableGioHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGioHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGioHang);

        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Tạo hóa đợn");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Làm mới giỏ hàng");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(29, 29, 29)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Giỏ hàng"));

        tableGioHangChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Thương hiệu", "Chất liệu", "Dung tích", "Màu", "Số lượng", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableGioHangChiTiet);

        jButton1.setText("Xoa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách sản phẩm"));

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Thương hiệu", "Chất liệu", "Dung tích", "Năm sản xuất", "Màu", " Số lượng", "Giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSanPham);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tạo hóa đơn"));

        jLabel1.setText("Tên khách hàng:");

        jLabel3.setText("Hình thức thanh toán: ");

        cbbKieuThanhToan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tiền mặt", "Chuyển khoản" }));
        cbbKieuThanhToan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbKieuThanhToanItemStateChanged(evt);
            }
        });

        jLabel5.setText("Tổng tiền hàng:");

        jLabel6.setText("Khách cần trả");

        jLabel7.setText("Khuyến mãi");

        jButton2.setText("Thanh toán");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Tiền thừa:");

        txtTienCanTRa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTienCanTRa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTienCanTRa.setText("0");

        txtTienThua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTienThua.setForeground(new java.awt.Color(255, 0, 51));
        txtTienThua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTienThua.setText("0");

        txtTongTien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTongTien.setText("0");

        jLabel11.setText("Tiền khách đưa:");

        cbbKhuyenMai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbKhuyenMaiItemStateChanged(evt);
            }
        });
        cbbKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbKhuyenMaiMouseClicked(evt);
            }
        });

        jLabel2.setText("Mã hóa đơn");

        txtHoaDon.setEditable(false);

        jButton3.setText("Hủy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtTienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyReleased(evt);
            }
        });

        txtCheckTien.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenKhachHang))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbbKieuThanhToan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(43, 43, 43)
                                        .addComponent(cbbKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtHoaDon))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(91, 91, 91)
                                .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(82, 82, 82)
                                .addComponent(txtTienCanTRa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 99, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienKhachDua, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(txtCheckTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbKieuThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTongTien))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTienCanTRa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtCheckTien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jButton4.setText("Tìm kiếm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Integer rowGioHang = tableGioHang.getSelectedRow();

        if (txtHoaDon.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa tạo hóa đơn");
            return;
        }
        this.hoaDonService.update(updateHoaDon());

        for (HoaDonChiTiet hoaDonChiTiet : getListHoaDonCHiTiet()) {
            this.hoaDonChiTietService.add(hoaDonChiTiet);
        }
        GioHang gioHang = this.gioHangs.get(rowGioHang);
        for (GioHangChiTiet gioHangChiTiet : this.gioHangChiTietService.getAll()) {
            if (gioHangChiTiet.getGioHang().getId() == gioHang.getId()) {

                BinhGiuNhietChiTiet binhGiuNhietChiTiet = gioHangChiTiet.getBinhGiuNhietChiTiet();
                int soLuong = binhGiuNhietChiTiet.getSoLuong();
                binhGiuNhietChiTiet.setSoLuong(soLuong - gioHangChiTiet.getSoLuong());
                this.binhGiuNhietChiTietService.update(binhGiuNhietChiTiet);

                this.gioHangChiTietService.delete(gioHangChiTiet);
            }
        }
        this.gioHangService.delete(gioHang);

        loadTableGioHang();
        loadTableSanPham();
        setTableGioHangChiTiet();
        losdtxt();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GioHang gioHang = new GioHang();
        this.gioHangService.add(gioHang);

        loadTableGioHang();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked

        Integer rowSanPham = tableSanPham.getSelectedRow();
        Integer rowGioHang = tableGioHang.getSelectedRow();
        GioHang gioHang = gioHangs.get(rowGioHang);

        int soLuongMua = 0;

        //Lấy số lượng muốn mua
        Boolean check = false;
        do {

            String soLuongNhap = JOptionPane.showInputDialog("Nhập số lượng mua");

            if (soLuongNhap == null) {
                return;
            }

            if (soLuongNhap.isBlank()) {
                JOptionPane.showMessageDialog(this, "Bạn nhập chưa nhập");
                check = true;
            }

            check = false;
            try {
                soLuongMua = Integer.parseInt(soLuongNhap);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Bạn nhập chưa đúng, bạn phải nhập số nguyên");
                check = true;
            }

        } while (check);

        BinhGiuNhietChiTiet binhGiuNhietChiTiet = binhGiuNhietChiTiets.get(rowSanPham);
        for (GioHangChiTiet gioHangChiTiet : gioHangChiTiets) {
            if (gioHangChiTiet.getBinhGiuNhietChiTiet().getId() == binhGiuNhietChiTiet.getId()) {
                int soluong = gioHangChiTiet.getSoLuong();
                gioHangChiTiet.setSoLuong(soluong + soLuongMua);

                this.gioHangChiTietService.update(gioHangChiTiet);

                loadTableGioHangChiTiet(gioHang.getId());
                return;
            }
        }

        GioHangChiTiet gioHangChiTiet = new GioHangChiTiet();

        gioHangChiTiet.setSoLuong(soLuongMua);
        gioHangChiTiet.setBinhGiuNhietChiTiet(binhGiuNhietChiTiet);
        gioHangChiTiet.setGioHang(gioHang);

        this.gioHangChiTietService.add(gioHangChiTiet);

        loadTableGioHangChiTiet(gioHang.getId());

    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void tableGioHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGioHangMouseClicked

        this.hoaDonChiTiets.clear();
        this.gioHangChiTiets.clear();
        System.out.println("hoaDonChiTiets trống " + this.hoaDonChiTiets.isEmpty());
        Integer rowGioHang = tableGioHang.getSelectedRow();

        GioHang gioHang = gioHangs.get(rowGioHang);

        loadTableGioHangChiTiet(gioHang.getId());


    }//GEN-LAST:event_tableGioHangMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        HoaDon hoaDon = new HoaDon();
        int row = tableGioHang.getSelectedRow();
        if (row >= 0) {
            if (txtHoaDon.getText().isBlank()) {
                System.out.println("vkl");

                String ma = "HD";
                Random random = new Random();

                ma = ma + random.nextInt(99999999);
                System.out.println(ma);

                hoaDon.setMaHoaDon(ma);

                this.hoaDonService.add(hoaDon);
                txtHoaDon.setText(ma);
                loadTxtHoaDon();
            } else {
                System.out.println("ahihi");
                JOptionPane.showMessageDialog(this, "Bạn cần thanh toán hoặc xóa hóa đơn cũ");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn giỏ hàng muốn thanh toán");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int result = JOptionPane.showConfirmDialog(
                this,
                "Bạn muốn xóa hết giỏ hàng?",
                "Xác nhận xóa giỏ hàng",
                JOptionPane.YES_NO_OPTION
        );
        if (result == JOptionPane.YES_OPTION) {

            for (GioHangChiTiet gioHangChiTiet : this.gioHangChiTietService.getAll()) {
                this.gioHangChiTietService.delete(gioHangChiTiet);
            }

            for (GioHang gioHang : gioHangs) {
                this.gioHangService.delete(gioHang);
            }
            loadTableGioHang();
            System.out.println("Xóa hết giỏ hàng");
        } else {
            System.out.println("Không xóa giỏ hàng");
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void cbbKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbKhuyenMaiMouseClicked

    }//GEN-LAST:event_cbbKhuyenMaiMouseClicked

    private void cbbKhuyenMaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbKhuyenMaiItemStateChanged
        // TODO add your handling code here:
        //dinh dang tien
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        int rowKhuyenMai = cbbKhuyenMai.getSelectedIndex();

        int tienKhuyenMai = 0;
        if (rowKhuyenMai != 0) {
            KhuyenMai khuyenMai = this.khuyenMais.get(rowKhuyenMai - 1);
            if (khuyenMai.getKieuGiamGia() == 0) {
                tienKhuyenMai = khuyenMai.getGiaTri();
            } else {
                tienKhuyenMai = tinhTien() * khuyenMai.getGiaTri() / 100;
            }
        }
        int tienCanTra = tinhTien() - tienKhuyenMai;
        if (tienCanTra >= 0) {
            txtTienCanTRa.setText(format.format(tienCanTra));
        }
    }//GEN-LAST:event_cbbKhuyenMaiItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        this.hoaDonService.delete(this.hoaDonService.findByMa(txtHoaDon.getText()));

        txtHoaDon.setText("");
        txtTenKhachHang.setText("");
        txtTongTien.setText("0");
        txtTienCanTRa.setText("");
        txtTenKhachHang.setText("");
        txtTienThua.setText("");
        cbbKhuyenMai.setSelectedIndex(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyReleased
        if (cbbKieuThanhToan.getSelectedIndex() == 0) {
            try {

                Locale locale = new Locale("vi", "VN");
                NumberFormat format = NumberFormat.getCurrencyInstance(locale);
                Number tienCanTra = format.parse(txtTienCanTRa.getText().replaceAll("[,.]", ""));
                int tienKhachDua = Integer.parseInt(txtTienKhachDua.getText());

                int tienThua = tienKhachDua - tienCanTra.intValue();
                if (tienThua >= 0) {
                    txtTienThua.setText(format.format(tienThua));
                }
                System.out.println(tienCanTra);
            } catch (Exception e) {
                e.printStackTrace();
                if (txtTienKhachDua.getText().equals("")) {
                    txtCheckTien.setText("");
                    txtTienThua.setText("0");
                } else {
                    txtCheckTien.setText("Bạn phải nhập số tiền");
                }
            }
        }
    }//GEN-LAST:event_txtTienKhachDuaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Integer rowGioHang = tableGioHang.getSelectedRow();
        int rowGioHangChiTiet = tableGioHangChiTiet.getSelectedRow();

        GioHangChiTiet gioHangChiTiet = this.gioHangChiTiets.get(rowGioHangChiTiet);

        this.gioHangChiTietService.delete(gioHangChiTiet);

        GioHang gioHang = gioHangs.get(rowGioHang);

        loadTableGioHangChiTiet(gioHang.getId());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbKieuThanhToanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbKieuThanhToanItemStateChanged
        // TODO add your handling code here:

        int kieuThanhToan = cbbKieuThanhToan.getSelectedIndex();

        if (kieuThanhToan == 1) {
            txtTienKhachDua.setEditable(false);
        } else {
            txtTienKhachDua.setEditable(true);
        }
    }//GEN-LAST:event_cbbKieuThanhToanItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        model = (DefaultTableModel) tableSanPham.getModel();
        model.setRowCount(0);

        int check = 0;

        String tenTimKiem = txtTimKiem.getText();

        for (BinhGiuNhietChiTiet binhGiuNhietChiTiet : binhGiuNhietChiTiets) {
            if (binhGiuNhietChiTiet.getBinhGiuNhiet().getTen().equals(tenTimKiem)) {
                model.addRow(new Object[]{
                    binhGiuNhietChiTiet.getId(),
                    binhGiuNhietChiTiet.getBinhGiuNhiet().getTen(),
                    binhGiuNhietChiTiet.getBinhGiuNhiet().getThuongHieu().getTen(),
                    binhGiuNhietChiTiet.getBinhGiuNhiet().getChatLieu().getTen(),
                    binhGiuNhietChiTiet.getBinhGiuNhiet().getDungTich(),
                    binhGiuNhietChiTiet.getBinhGiuNhiet().getNamSanXuat(),
                    binhGiuNhietChiTiet.getMauSac().getTen(),
                    binhGiuNhietChiTiet.getSoLuong(),
                    binhGiuNhietChiTiet.getGiaBan()
                });
                check = 1;
            }
        }

        if (check == 0) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy sản phẩm");
            loadTableSanPham();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbKhuyenMai;
    private javax.swing.JComboBox<String> cbbKieuThanhToan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableGioHang;
    private javax.swing.JTable tableGioHangChiTiet;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JLabel txtCheckTien;
    private javax.swing.JTextField txtHoaDon;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JLabel txtTienCanTRa;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JLabel txtTienThua;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void loadTableSanPham() {
        model = (DefaultTableModel) tableSanPham.getModel();
        model.setRowCount(0);
        this.binhGiuNhietChiTiets = this.binhGiuNhietChiTietService.getAll();
        for (BinhGiuNhietChiTiet binhGiuNhietChiTiet : binhGiuNhietChiTiets) {
            model.addRow(new Object[]{
                binhGiuNhietChiTiet.getId(),
                binhGiuNhietChiTiet.getBinhGiuNhiet().getTen(),
                binhGiuNhietChiTiet.getBinhGiuNhiet().getThuongHieu().getTen(),
                binhGiuNhietChiTiet.getBinhGiuNhiet().getChatLieu().getTen(),
                binhGiuNhietChiTiet.getBinhGiuNhiet().getDungTich(),
                binhGiuNhietChiTiet.getBinhGiuNhiet().getNamSanXuat(),
                binhGiuNhietChiTiet.getMauSac().getTen(),
                binhGiuNhietChiTiet.getSoLuong(),
                binhGiuNhietChiTiet.getGiaBan()
            });
        }

    }

    private void loadTableGioHang() {
        this.model = (DefaultTableModel) tableGioHang.getModel();
        model.setRowCount(0);
        this.gioHangs = this.gioHangService.getAll();
        for (GioHang gioHang : this.gioHangs) {
            model.addRow(new Object[]{
                gioHang.getId(),
                gioHang.getMaGH(),});
        }
    }

    private void loadTableGioHangChiTiet(int idGioHang) {

        this.model = (DefaultTableModel) tableGioHangChiTiet.getModel();
        model.setRowCount(0);
this.gioHangChiTiets.clear();
        for (GioHangChiTiet gioHangChiTiet : this.gioHangChiTietService.getAll()) {
            if (gioHangChiTiet.getGioHang().getId() == idGioHang) {
                model.addRow(new Object[]{
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getId(),
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getTen(),
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getThuongHieu().getTen(),
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getChatLieu().getTen(),
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getDungTich(),
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getMauSac().getTen(),
                    gioHangChiTiet.getSoLuong(),
                    gioHangChiTiet.getBinhGiuNhietChiTiet().getGiaBan()
                });
                this.gioHangChiTiets.add(gioHangChiTiet);
            }
        }
    }

    private void losdTableGioHangChiTietKhiThemVaoGIo() {
        this.model = (DefaultTableModel) tableGioHangChiTiet.getModel();
        model.setRowCount(0);
        for (GioHangChiTiet gioHang : this.gioHangChiTietService.getAll()) {
            model.addRow(new Object[]{
                gioHang.getBinhGiuNhietChiTiet().getId(),
                gioHang.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getTen(),
                gioHang.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getThuongHieu().getTen(),
                gioHang.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getChatLieu().getTen(),
                gioHang.getBinhGiuNhietChiTiet().getBinhGiuNhiet().getDungTich(),
                gioHang.getBinhGiuNhietChiTiet().getMauSac().getTen(),
                gioHang.getSoLuong(),
                gioHang.getBinhGiuNhietChiTiet().getGiaBan()
            });
        }
    }

    private void loadTxtHoaDon() {

        //dinh dang tien
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        int tongTien = tinhTien();

        txtTongTien.setText(format.format(tongTien));
        txtTienCanTRa.setText(format.format(tongTien));

    }

    private int tinhTien() {
        int tongTien = 0;

        for (GioHangChiTiet gioHangChiTiet : this.gioHangChiTiets) {
            tongTien = (gioHangChiTiet.getBinhGiuNhietChiTiet().getGiaBan().intValue() * gioHangChiTiet.getSoLuong()) + tongTien;

        }
        return tongTien;
    }

    private void loadCBB() {
        cbbKhuyenMai.addItem("");
        for (KhuyenMai khuyenMai : khuyenMais) {
            cbbKhuyenMai.addItem(khuyenMai.getMa());
        }
    }

    private List<HoaDonChiTiet> getListHoaDonCHiTiet() {
        this.hoaDonChiTiets.clear();
        for (GioHangChiTiet gioHangChiTiet : this.gioHangChiTiets) {

            HoaDonChiTiet donChiTiet = new HoaDonChiTiet();

            donChiTiet.setBinhGiuNhietChiTiet(gioHangChiTiet.getBinhGiuNhietChiTiet());
            donChiTiet.setHoaDon(hoaDonService.findByMa(txtHoaDon.getText()));
            donChiTiet.setSoLuong(gioHangChiTiet.getSoLuong());
            donChiTiet.setDonGia(gioHangChiTiet.getBinhGiuNhietChiTiet().getGiaBan());

            this.hoaDonChiTiets.add(donChiTiet);
        }
        return this.hoaDonChiTiets;
    }

    private HoaDon updateHoaDon() {
        Locale locale = new Locale("vi", "VN");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);
        try {
            Number tongTien = format.parse(txtTongTien.getText().replaceAll("[,.]", ""));
            Number sauGiamGia = format.parse(txtTienCanTRa.getText().replaceAll("[,.]", ""));

            HoaDon hoaDon = this.hoaDonService.findByMa(txtHoaDon.getText());

            hoaDon.setPhuongThucThanhToan(cbbKieuThanhToan.getSelectedIndex());
            hoaDon.setThanhTien(tongTien.floatValue());
            hoaDon.setTienSauGiamGia(sauGiamGia.floatValue());

            int rowKhuyenMai = cbbKhuyenMai.getSelectedIndex();
            if (rowKhuyenMai > 0) {
                KhuyenMai khuyenMai = this.khuyenMais.get(rowKhuyenMai - 1);
                hoaDon.setKhuyenMai(khuyenMai);
            }
            return hoaDon;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void losdtxt() {

        txtHoaDon.setText("");
        txtTenKhachHang.setText("");
        txtTongTien.setText("0");
        txtTienCanTRa.setText("0");
        txtTienKhachDua.setText("");
        txtTienThua.setText("0");

    }

    private void setTableGioHangChiTiet() {
        this.model = (DefaultTableModel) tableGioHangChiTiet.getModel();
        model.setRowCount(0);
    }

}
