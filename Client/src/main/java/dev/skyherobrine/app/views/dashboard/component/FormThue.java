/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dev.skyherobrine.app.views.dashboard.component;

import com.toedter.calendar.JDateChooser;
import dev.skyherobrine.app.controllers.dashboardui.product.ThueController;
//import dev.skyherobrine.app.controllers.dashboardui.product.ThueController;

import javax.swing.*;

/**
 *
 * @author Virtue Nguyen
 */
public class FormThue extends JPanel {

    /**
     * Creates new form ThongTinCaNhan
     */
    public FormThue() {
        initComponents();
        lbNgayHetHan.setText("");
        jDateChooserNgayHetHanjThongTinThue.setVisible(false);
        ThueController thueController = new ThueController(this);
        tbDanhSachThueCuaSanPham.addMouseListener(thueController);
        btnThemThue.addActionListener(thueController);
        btnXoaTrangThue.addActionListener(thueController);
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
        pnDanhSachCacThue = new JPanel();
        spDanhSachThueCuaSanPham = new JScrollPane();
        tbDanhSachThueCuaSanPham = new JTable();
        pnTimKiemThue = new JPanel();
        txtTuKhoaTimKiemThue = new JTextField();
        jLabel1 = new JLabel();
        jDateChooserNgayApDungThue = new JDateChooser();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jDateChooserNgayHetHanThue = new JDateChooser();
        pnThongTInThue = new JPanel();
        lbMaKhuyenMai = new JLabel();
        lbTile = new JLabel();
        lbNgayApDung = new JLabel();
        lbNgayHetHan = new JLabel();
        txtMaThue = new JTextField();
        txtThue = new JTextField();
        btnThemThue = new JButton();
        btnXoaTrangThue = new JButton();
        jLabel2 = new JLabel();
        jDateChooserNgayApDungThongTinThue = new JDateChooser();
        jDateChooserNgayHetHanjThongTinThue = new JDateChooser();

        setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnBGThongTinCaNhan.setBackground(new java.awt.Color(255, 255, 255));
        pnBGThongTinCaNhan.setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnDanhSachCacThue.setBackground(new java.awt.Color(255, 255, 255));
        pnDanhSachCacThue.setBorder(BorderFactory.createTitledBorder(null, "Danh thuế của sản phẩm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        tbDanhSachThueCuaSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã thuế", "Ngày áp dụng", "Tỉ lệ"
            }
        ));
        spDanhSachThueCuaSanPham.setViewportView(tbDanhSachThueCuaSanPham);

        GroupLayout pnDanhSachCacThueLayout = new GroupLayout(pnDanhSachCacThue);
        pnDanhSachCacThue.setLayout(pnDanhSachCacThueLayout);
        pnDanhSachCacThueLayout.setHorizontalGroup(
            pnDanhSachCacThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(spDanhSachThueCuaSanPham)
        );
        pnDanhSachCacThueLayout.setVerticalGroup(
            pnDanhSachCacThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(spDanhSachThueCuaSanPham, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pnTimKiemThue.setBackground(new java.awt.Color(255, 255, 255));
        pnTimKiemThue.setBorder(BorderFactory.createTitledBorder(null, "Tìm kiếm khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtTuKhoaTimKiemThue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTuKhoaTimKiemThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuKhoaTimKiemThueActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Từ khoá tìm kiếm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ngày áp dụng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ngày hết hạn:");

        GroupLayout pnTimKiemThueLayout = new GroupLayout(pnTimKiemThue);
        pnTimKiemThue.setLayout(pnTimKiemThueLayout);
        pnTimKiemThueLayout.setHorizontalGroup(
            pnTimKiemThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemThueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserNgayApDungThue, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserNgayHetHanThue, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTuKhoaTimKiemThue, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnTimKiemThueLayout.setVerticalGroup(
            pnTimKiemThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemThueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemThueLayout.createSequentialGroup()
                        .addGroup(pnTimKiemThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserNgayApDungThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addContainerGap())
                    .addGroup(pnTimKiemThueLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTuKhoaTimKiemThue)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, pnTimKiemThueLayout.createSequentialGroup()
                        .addGroup(pnTimKiemThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserNgayHetHanThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))))
        );

        pnThongTInThue.setBackground(new java.awt.Color(255, 255, 255));
        pnThongTInThue.setBorder(BorderFactory.createTitledBorder(null, "Thông tin thuế", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        lbMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMaKhuyenMai.setText("Mã khuyến mãi:");

        lbTile.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTile.setText("Tỉ lệ:");

        lbNgayApDung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNgayApDung.setText("Ngày áp dụng:");

        lbNgayHetHan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbNgayHetHan.setText("Ngày hết hạn:");

        txtMaThue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtThue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnThemThue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThemThue.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/plus.png"))); // NOI18N
        btnThemThue.setText("Thêm Thuế");
        btnThemThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemThueActionPerformed(evt);
            }
        });

        btnXoaTrangThue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoaTrangThue.setIcon(new ImageIcon(getClass().getResource("/img/iconButtonChungChoCacForm/cleaning.png"))); // NOI18N
        btnXoaTrangThue.setText("Xoá trắng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("%");

        GroupLayout pnThongTInThueLayout = new GroupLayout(pnThongTInThue);
        pnThongTInThue.setLayout(pnThongTInThueLayout);
        pnThongTInThueLayout.setHorizontalGroup(
            pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnThongTInThueLayout.createSequentialGroup()
                .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(pnThongTInThueLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnThemThue, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaTrangThue, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(pnThongTInThueLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(pnThongTInThueLayout.createSequentialGroup()
                                .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTile)
                                    .addGroup(pnThongTInThueLayout.createSequentialGroup()
                                        .addComponent(lbMaKhuyenMai, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaThue, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)))
                                .addGap(317, 317, 317)
                                .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNgayHetHan)
                                    .addComponent(lbNgayApDung)))
                            .addGroup(pnThongTInThueLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(txtThue, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserNgayApDungThongTinThue, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(jDateChooserNgayHetHanjThongTinThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(245, 245, 245))
        );
        pnThongTInThueLayout.setVerticalGroup(
            pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTInThueLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMaKhuyenMai, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNgayApDung, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaThue, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserNgayApDungThongTinThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(GroupLayout.Alignment.LEADING, pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTile, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNgayHetHan, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtThue, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDateChooserNgayHetHanjThongTinThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(166, 166, 166)
                .addGroup(pnThongTInThueLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemThue, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaTrangThue, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        GroupLayout pnBGThongTinCaNhanLayout = new GroupLayout(pnBGThongTinCaNhan);
        pnBGThongTinCaNhan.setLayout(pnBGThongTinCaNhanLayout);
        pnBGThongTinCaNhanLayout.setHorizontalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                .addGroup(pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(GroupLayout.Alignment.LEADING, pnBGThongTinCaNhanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnTimKiemThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnThongTInThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDanhSachCacThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnBGThongTinCaNhanLayout.setVerticalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                .addComponent(pnDanhSachCacThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTimKiemThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnThongTInThue, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnBGThongTinCaNhan, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnBGThongTinCaNhan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTuKhoaTimKiemThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuKhoaTimKiemThueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuKhoaTimKiemThueActionPerformed

    private void btnThemThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemThueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemThueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton btnThemThue;
    private JButton btnXoaTrangThue;
    private JDateChooser jDateChooserNgayApDungThongTinThue;
    private JDateChooser jDateChooserNgayApDungThue;
    private JDateChooser jDateChooserNgayHetHanThue;
    private JDateChooser jDateChooserNgayHetHanjThongTinThue;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel lbMaKhuyenMai;
    private JLabel lbNgayApDung;
    private JLabel lbNgayHetHan;
    private JLabel lbTile;
    private JPanel pnBGThongTinCaNhan;
    private JPanel pnDanhSachCacThue;
    private JPanel pnThongTInThue;
    private JPanel pnTimKiemThue;
    private JScrollPane spDanhSachThueCuaSanPham;
    private JTable tbDanhSachThueCuaSanPham;
    private JTextField txtMaThue;
    private JTextField txtThue;
    private JTextField txtTuKhoaTimKiemThue;
    // End of variables declaration//GEN-END:variables
    public JTable getTbDanhSachThueCuaSanPham() {
        return tbDanhSachThueCuaSanPham;
    }
    public JTextField getTxtMaThue() {
        return txtMaThue;
    }
    public JTextField getTxtThue() {
        return txtThue;
    }
    public JTextField getTxtTuKhoaTimKiemThue() {
        return txtTuKhoaTimKiemThue;
    }
    public JDateChooser getjDateChooserNgayApDungThongTinThue() {
        return jDateChooserNgayApDungThongTinThue;
    }

    public JButton getBtnThemThue() {
        return btnThemThue;
    }
    public JButton getBtnXoaTrangThue() {
        return btnXoaTrangThue;
    }
}