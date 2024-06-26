/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dev.skyherobrine.app.views.dashboard.component;

//import dev.skyherobrine.app.controllers.dashboardui.person.NhaCungCapController;

import dev.skyherobrine.app.controllers.dashboardui.person.NhaCungCapController;

import javax.swing.*;

/**
 *
 * @author Virtue Nguyen
 */
public class FrmNhaCungCap extends JPanel {

    /**
     * Creates new form ThongTinCaNhan
     */
    public FrmNhaCungCap() {
        initComponents();
        NhaCungCapController controller = new NhaCungCapController(this);
        controller.loaddsNhaCungCap();
        controller.loadComboBoxPhanThongTinNCC();
        controller.loadComboBoxPhanTimKiem();
        tbDanhSachCacNhaCungCap.addMouseListener(controller);
        btnThemNhaCungCap.addActionListener(controller);
        btnSuaNhaCungCap.addActionListener(controller);
        btnXoaNhaCungCap.addActionListener(controller);

        cbTkTinhTrangNhaCungCap.addActionListener(controller);
        txtTuKhoaTimKiem.addKeyListener(controller);
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
        pnDanhSachCacNhaCungCap = new JPanel();
        spDanhCacNhaCungCap = new JScrollPane();
        tbDanhSachCacNhaCungCap = new JTable();
        pnTimKiemNhaCungCap = new JPanel();
        cbTkTinhTrangNhaCungCap = new JComboBox<>();
        txtTuKhoaTimKiem = new JTextField();
        jLabel1 = new JLabel();
        pnThongTInNhaCungCap = new JPanel();
        lbMaNhaCungCap = new JLabel();
        lbTenNhaCungCap = new JLabel();
        lbDiaChiNhaCungCap = new JLabel();
        lbEmailNhaCungCap = new JLabel();
        lbTinhTrangNhaCungCap = new JLabel();
        txtMaNhaCungCap = new JTextField();
        txtTenNhaCungCap = new JTextField();
        txtDiaChiNhaCungCap = new JTextField();
        txtEmailNhaCungCap = new JTextField();
        btnThemNhaCungCap = new JButton();
        btnSuaNhaCungCap = new JButton();
        btnXoaNhaCungCap = new JButton();
        jLabel2 = new JLabel();
        cbTinhTrangNhaCungCap = new JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnBGThongTinCaNhan.setBackground(new java.awt.Color(255, 255, 255));
        pnBGThongTinCaNhan.setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnDanhSachCacNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));
        pnDanhSachCacNhaCungCap.setBorder(BorderFactory.createTitledBorder(null, "Danh sách các nhà cung cấp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tbDanhSachCacNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "Email", "Tình trạng"
            }
        ));
        spDanhCacNhaCungCap.setViewportView(tbDanhSachCacNhaCungCap);

        GroupLayout pnDanhSachCacNhaCungCapLayout = new GroupLayout(pnDanhSachCacNhaCungCap);
        pnDanhSachCacNhaCungCap.setLayout(pnDanhSachCacNhaCungCapLayout);
        pnDanhSachCacNhaCungCapLayout.setHorizontalGroup(
            pnDanhSachCacNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachCacNhaCungCapLayout.createSequentialGroup()
                .addComponent(spDanhCacNhaCungCap)
                .addContainerGap())
        );
        pnDanhSachCacNhaCungCapLayout.setVerticalGroup(
            pnDanhSachCacNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachCacNhaCungCapLayout.createSequentialGroup()
                .addComponent(spDanhCacNhaCungCap, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnTimKiemNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));
        pnTimKiemNhaCungCap.setBorder(BorderFactory.createTitledBorder(null, "Tìm kiếm nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cbTkTinhTrangNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbTkTinhTrangNhaCungCap.setModel(new DefaultComboBoxModel<>(new String[] { "Tình trạng", " ", " ", " " }));

        txtTuKhoaTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Từ khoá tìm kiếm:");

        GroupLayout pnTimKiemNhaCungCapLayout = new GroupLayout(pnTimKiemNhaCungCap);
        pnTimKiemNhaCungCap.setLayout(pnTimKiemNhaCungCapLayout);
        pnTimKiemNhaCungCapLayout.setHorizontalGroup(
            pnTimKiemNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemNhaCungCapLayout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(cbTkTinhTrangNhaCungCap, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTuKhoaTimKiem, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        pnTimKiemNhaCungCapLayout.setVerticalGroup(
            pnTimKiemNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemNhaCungCapLayout.createSequentialGroup()
                .addGroup(pnTimKiemNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTuKhoaTimKiem, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(cbTkTinhTrangNhaCungCap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnThongTInNhaCungCap.setBackground(new java.awt.Color(255, 255, 255));
        pnThongTInNhaCungCap.setBorder(BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        lbMaNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaNhaCungCap.setText("Mã nhà cung cấp:");

        lbTenNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTenNhaCungCap.setText("Tên nhà cung cấp:");

        lbDiaChiNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDiaChiNhaCungCap.setText("Địa chỉ:");

        lbEmailNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbEmailNhaCungCap.setText("Email:");

        lbTinhTrangNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtMaNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaNhaCungCap.setEnabled(false);

        txtTenNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDiaChiNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtEmailNhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnThemNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThemNhaCungCap.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/plus.png"))); // NOI18N
        btnThemNhaCungCap.setText("Thêm nhà cung cấp");

        btnSuaNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSuaNhaCungCap.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/edit.png"))); // NOI18N
        btnSuaNhaCungCap.setText("Sửa nhà cung cấp");

        btnXoaNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoaNhaCungCap.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/remove.png"))); // NOI18N
        btnXoaNhaCungCap.setText("Xoá nhà cung cấp");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Tình trạng:");

        cbTinhTrangNhaCungCap.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        GroupLayout pnThongTInNhaCungCapLayout = new GroupLayout(pnThongTInNhaCungCap);
        pnThongTInNhaCungCap.setLayout(pnThongTInNhaCungCapLayout);
        pnThongTInNhaCungCapLayout.setHorizontalGroup(
            pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnThongTInNhaCungCapLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnThemNhaCungCap)
                .addGap(274, 274, 274)
                .addComponent(btnSuaNhaCungCap)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnXoaNhaCungCap)
                .addGap(265, 265, 265))
            .addGroup(pnThongTInNhaCungCapLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTInNhaCungCapLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbMaNhaCungCap))
                    .addComponent(lbTinhTrangNhaCungCap)
                    .addComponent(lbEmailNhaCungCap))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNhaCungCap, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailNhaCungCap, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnThongTInNhaCungCapLayout.createSequentialGroup()
                        .addComponent(lbTenNhaCungCap)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNhaCungCap, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, pnThongTInNhaCungCapLayout.createSequentialGroup()
                        .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lbDiaChiNhaCungCap)
                            .addComponent(jLabel2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDiaChiNhaCungCap, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(cbTinhTrangNhaCungCap, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(183, 183, 183))
        );
        pnThongTInNhaCungCapLayout.setVerticalGroup(
            pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTInNhaCungCapLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTenNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChiNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDiaChiNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmailNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTinhTrangNhaCungCap, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbTinhTrangNhaCungCap))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(pnThongTInNhaCungCapLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNhaCungCap, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaNhaCungCap, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaNhaCungCap, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        GroupLayout pnBGThongTinCaNhanLayout = new GroupLayout(pnBGThongTinCaNhan);
        pnBGThongTinCaNhan.setLayout(pnBGThongTinCaNhanLayout);
        pnBGThongTinCaNhanLayout.setHorizontalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnDanhSachCacNhaCungCap, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnThongTInNhaCungCap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTimKiemNhaCungCap, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBGThongTinCaNhanLayout.setVerticalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                .addComponent(pnDanhSachCacNhaCungCap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTimKiemNhaCungCap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnThongTInNhaCungCap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(pnBGThongTinCaNhan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnSuaNhaCungCap;
    private JButton btnThemNhaCungCap;
    private JButton btnXoaNhaCungCap;
    private JComboBox<String> cbTinhTrangNhaCungCap;
    private JComboBox<String> cbTkTinhTrangNhaCungCap;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel lbDiaChiNhaCungCap;
    private JLabel lbEmailNhaCungCap;
    private JLabel lbMaNhaCungCap;
    private JLabel lbTenNhaCungCap;
    private JLabel lbTinhTrangNhaCungCap;
    private JPanel pnBGThongTinCaNhan;
    private JPanel pnDanhSachCacNhaCungCap;
    private JPanel pnThongTInNhaCungCap;
    private JPanel pnTimKiemNhaCungCap;
    private JScrollPane spDanhCacNhaCungCap;
    private JTable tbDanhSachCacNhaCungCap;
    private JTextField txtDiaChiNhaCungCap;
    private JTextField txtEmailNhaCungCap;
    private JTextField txtMaNhaCungCap;
    private JTextField txtTenNhaCungCap;
    private JTextField txtTuKhoaTimKiem;
    // End of variables declaration//GEN-END:variables

    public JTable getTbDanhSachNhaCungCap() {
        return tbDanhSachCacNhaCungCap;
    }
    public JButton getButtonThemNhaCungCap(){return btnThemNhaCungCap;}
    public JButton getButtonSuaNhaCungCap(){return btnSuaNhaCungCap;}
    public JButton getButtonXoaNhaCungCap(){return btnXoaNhaCungCap;}
    public JTextField getTxtMaNhaCungCap(){return txtMaNhaCungCap;}
    public JTextField getTxtDiaChiNhaCungCap(){return txtDiaChiNhaCungCap;}
    public JTextField getTxtTenNhaCungCap(){return txtTenNhaCungCap;}
    public JTextField getTxtEmailNhaCungCap(){return txtEmailNhaCungCap;}
    public JComboBox getCbTinhTrangNhaCungCap(){return cbTinhTrangNhaCungCap;}
    public JComboBox getCbTkTinhTrangNhaCungCap(){return cbTkTinhTrangNhaCungCap;}
    public JTextField getTxtTuKhoaTimKiem(){return txtTuKhoaTimKiem;}

}
