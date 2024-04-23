/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dev.skyherobrine.app.views.dashboard.component;

import com.toedter.calendar.JDateChooser;
import dev.skyherobrine.app.controllers.dashboardui.person.NhanVienController;
//import dev.skyherobrine.app.controllers.dashboardui.person.NhanVienController;

import javax.swing.*;

/**
 *
 * @author Virtue Nguyen
 */
public class FrmNhanVien extends JPanel {

    /**
     * Creates new form ThongTinCaNhan
     */
    public FrmNhanVien() {
        initComponents();
        NhanVienController nhanVienController = new NhanVienController(this);
        nhanVienController.loadDsNhanVien();
        nhanVienController.loadComboBoxPhanThongTinNV();
        nhanVienController.loadComboBoxPhanTimKiem();
        tbDanhSachNhanVien.addMouseListener(nhanVienController);
        btnThemNhanVien.addActionListener(nhanVienController);
        btnSuaNhanVien.addActionListener(nhanVienController);
        btnXoaNhanVien.addActionListener(nhanVienController);

        cbTkGioiTinhNv.addActionListener(nhanVienController);
        cbTkCaLamViecNv.addActionListener(nhanVienController);
        cbTkChucVuNv.addActionListener(nhanVienController);
        cbTkTinhTrangNv.addActionListener(nhanVienController);

        txtTuKhoaTimKiem.addKeyListener(nhanVienController);
        btnThemAnhNhanVien.addActionListener(nhanVienController);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBGThongTinCaNhan = new JPanel();
        pnTHongTinNhanVien = new JPanel();
        lbMaNhanVien = new JLabel();
        txtMaNhanVien = new JTextField();
        lbHoTenNhanVien = new JLabel();
        txtHoTenNhanVien = new JTextField();
        lbGIoiTinhNhanVien = new JLabel();
        lbSoDienThoaiNhanVien = new JLabel();
        txtSoDienThoaiNhanVien = new JTextField();
        lbEmail = new JLabel();
        txtEmail = new JTextField();
        lbChucVu = new JLabel();
        lbNgaySinhNhanVien = new JLabel();
        lbDiaChiNhanVien = new JLabel();
        txtDiaChiNhanVien = new JTextField();
        lbTinhTrangNhanVien = new JLabel();
        lbCaLamViecNhanVien = new JLabel();
        txtTaiKhoanNhanVien = new JTextField();
        lbTaiKhoaNhanVien = new JLabel();
        txtMatKhauNhanVien = new JTextField();
        lbTinhTrangQuanLySanPham1 = new JLabel();
        pnImgNhanVien = new JPanel();
        btnSuaNhanVien = new JButton();
        btnThemNhanVien = new JButton();
        btnXoaNhanVien = new JButton();
        btnThemAnhNhanVien = new JButton();
        cbCaLmViec = new JComboBox<>();
        cbTinhTrang = new JComboBox<>();
        cbGioiTinh = new JComboBox<>();
        cbChucVu = new JComboBox<>();
        jDateChooserNgaySinh = new JDateChooser();
        pnDanhSachNhanVien = new JPanel();
        spDanhSachNhanVien = new JScrollPane();
        tbDanhSachNhanVien = new JTable();
        pnTimKiemNhanVien = new JPanel();
        cbTkTinhTrangNv = new JComboBox<>();
        cbTkGioiTinhNv = new JComboBox<>();
        cbTkChucVuNv = new JComboBox<>();
        cbTkCaLamViecNv = new JComboBox<>();
        lbTkTenNhanVien = new JLabel();
        txtTuKhoaTimKiem = new JTextField();

        setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnBGThongTinCaNhan.setBackground(new java.awt.Color(255, 255, 255));
        pnBGThongTinCaNhan.setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnTHongTinNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        pnTHongTinNhanVien.setBorder(BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        pnTHongTinNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lbMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaNhanVien.setHorizontalAlignment(SwingConstants.RIGHT);
        lbMaNhanVien.setText("Mã nhân viên:");

        txtMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaNhanVien.setEnabled(false);
        txtMaNhanVien.setPreferredSize(new java.awt.Dimension(64, 25));

        lbHoTenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbHoTenNhanVien.setHorizontalAlignment(SwingConstants.RIGHT);
        lbHoTenNhanVien.setText("Họ tên:");

        txtHoTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoTenNhanVien.setEnabled(false);
        txtHoTenNhanVien.setPreferredSize(new java.awt.Dimension(64, 25));

        lbGIoiTinhNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbGIoiTinhNhanVien.setText("Giới tính:");

        lbSoDienThoaiNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSoDienThoaiNhanVien.setText("Số điện thoại:");

        txtSoDienThoaiNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoDienThoaiNhanVien.setEnabled(false);
        txtSoDienThoaiNhanVien.setPreferredSize(new java.awt.Dimension(79, 33));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setEnabled(false);

        lbChucVu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbChucVu.setText("Chức vụ:");

        lbNgaySinhNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNgaySinhNhanVien.setText("Ngày Sinh:");

        lbDiaChiNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDiaChiNhanVien.setText("Địa chỉ:");

        txtDiaChiNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChiNhanVien.setEnabled(false);

        lbTinhTrangNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTinhTrangNhanVien.setText("Tình trạng:");

        lbCaLamViecNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCaLamViecNhanVien.setText("Ca làm việc:");

        txtTaiKhoanNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTaiKhoanNhanVien.setEnabled(false);

        lbTaiKhoaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTaiKhoaNhanVien.setText("Tài khoản:");

        txtMatKhauNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMatKhauNhanVien.setEnabled(false);

        lbTinhTrangQuanLySanPham1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTinhTrangQuanLySanPham1.setText("Mật Khẩu:");

        pnImgNhanVien.setBackground(new java.awt.Color(255, 51, 0));
        pnImgNhanVien.setPreferredSize(new java.awt.Dimension(240, 320));

        GroupLayout pnImgNhanVienLayout = new GroupLayout(pnImgNhanVien);
        pnImgNhanVien.setLayout(pnImgNhanVienLayout);
        pnImgNhanVienLayout.setHorizontalGroup(
            pnImgNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        pnImgNhanVienLayout.setVerticalGroup(
            pnImgNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        btnSuaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSuaNhanVien.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/edit.png"))); // NOI18N
        btnSuaNhanVien.setText("Sửa nhân viên");

        btnThemNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThemNhanVien.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/plus.png"))); // NOI18N
        btnThemNhanVien.setText("Thêm nhân viên");

        btnXoaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoaNhanVien.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/remove.png"))); // NOI18N
        btnXoaNhanVien.setText("Xoá nhân viên");

        btnThemAnhNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemAnhNhanVien.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/plus.png"))); // NOI18N
        btnThemAnhNhanVien.setText("Thêm ảnh");

        cbCaLmViec.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbTinhTrang.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbGioiTinh.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbChucVu.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        GroupLayout pnTHongTinNhanVienLayout = new GroupLayout(pnTHongTinNhanVien);
        pnTHongTinNhanVien.setLayout(pnTHongTinNhanVienLayout);
        pnTHongTinNhanVienLayout.setHorizontalGroup(
            pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(lbMaNhanVien)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lbDiaChiNhanVien)
                        .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                            .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                                    .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCaLamViecNhanVien)
                                        .addComponent(lbNgaySinhNhanVien)
                                        .addComponent(lbTinhTrangNhanVien))
                                    .addGap(35, 35, 35))
                                .addGroup(GroupLayout.Alignment.TRAILING, pnTHongTinNhanVienLayout.createSequentialGroup()
                                    .addComponent(lbSoDienThoaiNhanVien)
                                    .addGap(18, 18, 18)))
                            .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSoDienThoaiNhanVien, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(txtDiaChiNhanVien, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(cbCaLmViec, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbTinhTrang, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooserNgaySinh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(lbTinhTrangQuanLySanPham1, GroupLayout.Alignment.TRAILING)
                                .addComponent(lbTaiKhoaNhanVien, GroupLayout.Alignment.TRAILING)
                                .addComponent(lbChucVu))
                            .addComponent(lbEmail)
                            .addComponent(lbGIoiTinhNhanVien))
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbGioiTinh, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtTaiKhoanNhanVien, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtMatKhauNhanVien, GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                            .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbChucVu, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(lbHoTenNhanVien)
                        .addGap(44, 44, 44)
                        .addComponent(txtHoTenNhanVien, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(pnImgNhanVien, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(GroupLayout.Alignment.TRAILING, pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(btnThemAnhNhanVien)
                        .addGap(173, 173, 173))))
            .addGroup(GroupLayout.Alignment.TRAILING, pnTHongTinNhanVienLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(btnThemNhanVien)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSuaNhanVien)
                .addGap(250, 250, 250)
                .addComponent(btnXoaNhanVien)
                .addGap(285, 285, 285))
        );
        pnTHongTinNhanVienLayout.setVerticalGroup(
            pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnTHongTinNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaNhanVien, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTenNhanVien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHoTenNhanVien, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbGIoiTinhNhanVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDienThoaiNhanVien, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSoDienThoaiNhanVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGioiTinh, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNgaySinhNhanVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbEmail))
                            .addComponent(jDateChooserNgaySinh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDiaChiNhanVien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbDiaChiNhanVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lbChucVu, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbChucVu, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCaLamViecNhanVien)
                            .addComponent(txtTaiKhoanNhanVien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCaLmViec, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTaiKhoaNhanVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTinhTrangNhanVien, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhauNhanVien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTinhTrangQuanLySanPham1)
                            .addComponent(cbTinhTrang, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnTHongTinNhanVienLayout.createSequentialGroup()
                        .addComponent(pnImgNhanVien, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThemAnhNhanVien, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(pnTHongTinNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNhanVien, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaNhanVien, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNhanVien, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnDanhSachNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        pnDanhSachNhanVien.setBorder(BorderFactory.createTitledBorder(null, "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tbDanhSachNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Số điện thoại", "Giới tính", "Ngày sinh", "Email", "Địa chỉ", "Chức vụ", "Ca làm việc", "Tài khoản", "Mật khẩu", "Tình trạng"
            }
        ));
        spDanhSachNhanVien.setViewportView(tbDanhSachNhanVien);

        GroupLayout pnDanhSachNhanVienLayout = new GroupLayout(pnDanhSachNhanVien);
        pnDanhSachNhanVien.setLayout(pnDanhSachNhanVienLayout);
        pnDanhSachNhanVienLayout.setHorizontalGroup(
            pnDanhSachNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(spDanhSachNhanVien)
        );
        pnDanhSachNhanVienLayout.setVerticalGroup(
            pnDanhSachNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(spDanhSachNhanVien, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pnTimKiemNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        pnTimKiemNhanVien.setBorder(BorderFactory.createTitledBorder(null, "Tìm Kiếm nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        cbTkTinhTrangNv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTkTinhTrangNv.setModel(new DefaultComboBoxModel<>(new String[] { "Tình trạng", " " }));

        cbTkGioiTinhNv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTkGioiTinhNv.setModel(new DefaultComboBoxModel<>(new String[] { "Giới tính", "Nam", "Nữ", "Gay", "Les", " " }));

        cbTkChucVuNv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTkChucVuNv.setModel(new DefaultComboBoxModel<>(new String[] { "Chức vụ", " ", " " }));

        cbTkCaLamViecNv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTkCaLamViecNv.setModel(new DefaultComboBoxModel<>(new String[] { "Ca làm việc", "Sáng", "Chiều", "Đêm", " " }));

        lbTkTenNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTkTenNhanVien.setText("Từ khoá tìm kiếm:");

        txtTuKhoaTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        GroupLayout pnTimKiemNhanVienLayout = new GroupLayout(pnTimKiemNhanVien);
        pnTimKiemNhanVien.setLayout(pnTimKiemNhanVienLayout);
        pnTimKiemNhanVienLayout.setHorizontalGroup(
            pnTimKiemNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTkGioiTinhNv, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(cbTkChucVuNv, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(cbTkCaLamViecNv, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(cbTkTinhTrangNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(lbTkTenNhanVien)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTuKhoaTimKiem, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );
        pnTimKiemNhanVienLayout.setVerticalGroup(
            pnTimKiemNhanVienLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemNhanVienLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTkGioiTinhNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTkChucVuNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTkCaLamViecNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTkTinhTrangNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTkTenNhanVien, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTuKhoaTimKiem, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout pnBGThongTinCaNhanLayout = new GroupLayout(pnBGThongTinCaNhan);
        pnBGThongTinCaNhan.setLayout(pnBGThongTinCaNhanLayout);
        pnBGThongTinCaNhanLayout.setHorizontalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnTHongTinNhanVien, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnDanhSachNhanVien, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTimKiemNhanVien, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBGThongTinCaNhanLayout.setVerticalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                .addComponent(pnDanhSachNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTimKiemNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTHongTinNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnBGThongTinCaNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnBGThongTinCaNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnSuaNhanVien;
    private JButton btnThemAnhNhanVien;
    private JButton btnThemNhanVien;
    private JButton btnXoaNhanVien;
    private JComboBox<String> cbCaLmViec;
    private JComboBox<String> cbChucVu;
    private JComboBox<String> cbGioiTinh;
    private JComboBox<String> cbTinhTrang;
    private JComboBox<String> cbTkCaLamViecNv;
    private JComboBox<String> cbTkChucVuNv;
    private JComboBox<String> cbTkGioiTinhNv;
    private JComboBox<String> cbTkTinhTrangNv;
    private JDateChooser jDateChooserNgaySinh;
    private JLabel lbCaLamViecNhanVien;
    private JLabel lbChucVu;
    private JLabel lbDiaChiNhanVien;
    private JLabel lbEmail;
    private JLabel lbGIoiTinhNhanVien;
    private JLabel lbHoTenNhanVien;
    private JLabel lbMaNhanVien;
    private JLabel lbNgaySinhNhanVien;
    private JLabel lbSoDienThoaiNhanVien;
    private JLabel lbTaiKhoaNhanVien;
    private JLabel lbTinhTrangNhanVien;
    private JLabel lbTinhTrangQuanLySanPham1;
    private JLabel lbTkTenNhanVien;
    private JPanel pnBGThongTinCaNhan;
    private JPanel pnDanhSachNhanVien;
    private JPanel pnImgNhanVien;
    private JPanel pnTHongTinNhanVien;
    private JPanel pnTimKiemNhanVien;
    private JScrollPane spDanhSachNhanVien;
    private JTable tbDanhSachNhanVien;
    private JTextField txtDiaChiNhanVien;
    private JTextField txtEmail;
    private JTextField txtHoTenNhanVien;
    private JTextField txtMaNhanVien;
    private JTextField txtMatKhauNhanVien;
    private JTextField txtSoDienThoaiNhanVien;
    private JTextField txtTaiKhoanNhanVien;
    private JTextField txtTuKhoaTimKiem;
    // End of variables declaration//GEN-END:variables


    public JTable getTbDanhSachNhanVien() {
        return tbDanhSachNhanVien;
    }
    public JButton getButtonThemNhanVien(){return btnThemNhanVien;}
    public JButton getButtonSuaNhanVien(){return btnSuaNhanVien;}
    public JButton getButtonXoaNhanVien(){return btnXoaNhanVien;}
    public JTextField getTxtMaNhanVien(){return txtMaNhanVien;}
    public JTextField getTxtSoDienThoaiNhanVien(){return txtSoDienThoaiNhanVien;}
    public JDateChooser getjDateChooserNgaySinhNhanVien(){return jDateChooserNgaySinh;}
    public JTextField getTxtDiaChiNhanVien(){return  txtDiaChiNhanVien;}
    public JComboBox getCbCaLamViecNhanVien(){return  cbCaLmViec;}
    public JComboBox getCbTinhTrangNhanVien(){return cbTinhTrang;}
    public JTextField getTxtHoTenNhanVien(){return txtHoTenNhanVien;}
    public JComboBox getCbGioiTinh(){return  cbGioiTinh;}
    public JTextField getTxtEmail(){return  txtEmail;}
    public JComboBox getCbChucVu(){return cbChucVu;}
    public JTextField getTxtTaiKhoanNhanVien(){return txtTaiKhoanNhanVien;}
    public JTextField getTxtMatKhauNhanVien(){return txtMatKhauNhanVien;}
    public JButton getButtonThemHinhAnh(){return btnThemAnhNhanVien;}
    public JPanel getPnImgNhanVien(){return pnImgNhanVien;}
    public JComboBox getCbTkGioiTinh(){return cbTkGioiTinhNv;}
    public JComboBox getCbTkChucVu(){return cbTkChucVuNv;}
    public JComboBox getCbTkCaLamViec(){return cbTkCaLamViecNv;}
    public JComboBox getCbTkTinhTrang(){return cbTkTinhTrangNv;}
    public JTextField getTxtTuKhoaTimKiem(){return txtTuKhoaTimKiem;}
}