/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dev.skyherobrine.app.views.dashboard.component;

//import dev.skyherobrine.app.controllers.dashboardui.thongKe.thongKeSanPhamController;

import javax.swing.*;

/**
 *
 * @author Virtue Nguyen
 */
public class FormBaoCaoSanPhamCuaHang extends JPanel {

    /**
     * Creates new form ThongTinCaNhan
     */
    public FormBaoCaoSanPhamCuaHang() {
        initComponents();
//        thongKeSanPhamController controller = new thongKeSanPhamController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
//     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBGThongTinCaNhan = new JPanel();
        pnBieuDoTHongKeSanPham = new JPanel();
        pnBoLocSanPhamCuaHang = new JPanel();
        pnKetQuaTongSanPham = new JPanel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        txtBaoCaoDoanhThu = new JTextField();
        jLabel7 = new JLabel();
        txtBaoCaoDoanhThu1 = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnBGThongTinCaNhan.setBackground(new java.awt.Color(255, 255, 255));
        pnBGThongTinCaNhan.setPreferredSize(new java.awt.Dimension(1651, 1000));

        pnBieuDoTHongKeSanPham.setBackground(new java.awt.Color(255, 255, 255));
        pnBieuDoTHongKeSanPham.setBorder(BorderFactory.createTitledBorder(null, "Biểu đồ thống kê sản phẩm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        GroupLayout pnBieuDoTHongKeSanPhamLayout = new GroupLayout(pnBieuDoTHongKeSanPham);
        pnBieuDoTHongKeSanPham.setLayout(pnBieuDoTHongKeSanPhamLayout);
        pnBieuDoTHongKeSanPhamLayout.setHorizontalGroup(
            pnBieuDoTHongKeSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 1186, Short.MAX_VALUE)
        );
        pnBieuDoTHongKeSanPhamLayout.setVerticalGroup(
            pnBieuDoTHongKeSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );

        pnBoLocSanPhamCuaHang.setBackground(new java.awt.Color(255, 255, 255));
        pnBoLocSanPhamCuaHang.setBorder(BorderFactory.createTitledBorder(null, "Bộ lọc sản phẩm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        GroupLayout pnBoLocSanPhamCuaHangLayout = new GroupLayout(pnBoLocSanPhamCuaHang);
        pnBoLocSanPhamCuaHang.setLayout(pnBoLocSanPhamCuaHangLayout);
        pnBoLocSanPhamCuaHangLayout.setHorizontalGroup(
            pnBoLocSanPhamCuaHangLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBoLocSanPhamCuaHangLayout.setVerticalGroup(
            pnBoLocSanPhamCuaHangLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        pnKetQuaTongSanPham.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Kết quả thống kê");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Số lượng bán được:");

        txtBaoCaoDoanhThu.setText("Chưa có dữ liệu");
        txtBaoCaoDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaoCaoDoanhThuActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Mặt hàng bán chạy nhất: ");

        txtBaoCaoDoanhThu1.setText("Chưa có dữ liệu");
        txtBaoCaoDoanhThu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaoCaoDoanhThu1ActionPerformed(evt);
            }
        });

        GroupLayout pnKetQuaTongSanPhamLayout = new GroupLayout(pnKetQuaTongSanPham);
        pnKetQuaTongSanPham.setLayout(pnKetQuaTongSanPhamLayout);
        pnKetQuaTongSanPhamLayout.setHorizontalGroup(
            pnKetQuaTongSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnKetQuaTongSanPhamLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtBaoCaoDoanhThu, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(GroupLayout.Alignment.TRAILING, pnKetQuaTongSanPhamLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnKetQuaTongSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, pnKetQuaTongSanPhamLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(126, 126, 126))
                    .addGroup(GroupLayout.Alignment.TRAILING, pnKetQuaTongSanPhamLayout.createSequentialGroup()
                        .addComponent(txtBaoCaoDoanhThu1, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnKetQuaTongSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnKetQuaTongSanPhamLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );
        pnKetQuaTongSanPhamLayout.setVerticalGroup(
            pnKetQuaTongSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnKetQuaTongSanPhamLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(txtBaoCaoDoanhThu1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnKetQuaTongSanPhamLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBaoCaoDoanhThu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(638, Short.MAX_VALUE))
            .addGroup(pnKetQuaTongSanPhamLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(pnKetQuaTongSanPhamLayout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addGap(697, 697, 697)))
        );

        GroupLayout pnBGThongTinCaNhanLayout = new GroupLayout(pnBGThongTinCaNhan);
        pnBGThongTinCaNhan.setLayout(pnBGThongTinCaNhanLayout);
        pnBGThongTinCaNhanLayout.setHorizontalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(pnBoLocSanPhamCuaHang, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                .addComponent(pnBieuDoTHongKeSanPham, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnKetQuaTongSanPham, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBGThongTinCaNhanLayout.setVerticalGroup(
            pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnBGThongTinCaNhanLayout.createSequentialGroup()
                .addComponent(pnBoLocSanPhamCuaHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(pnBGThongTinCaNhanLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnBieuDoTHongKeSanPham, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnBGThongTinCaNhanLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pnKetQuaTongSanPham, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void txtBaoCaoDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaoCaoDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaoCaoDoanhThuActionPerformed

    private void txtBaoCaoDoanhThu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaoCaoDoanhThu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaoCaoDoanhThu1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel pnBGThongTinCaNhan;
    private JPanel pnBieuDoTHongKeSanPham;
    private JPanel pnBoLocSanPhamCuaHang;
    private JPanel pnKetQuaTongSanPham;
    private JTextField txtBaoCaoDoanhThu;
    private JTextField txtBaoCaoDoanhThu1;
    // End of variables declaration//GEN-END:variables

    public JPanel getPnBieuDoTHongKeSanPham() {
        return pnBieuDoTHongKeSanPham;
    }
    public JTextField getTxtBaoCaoDoanhThu() {
        return txtBaoCaoDoanhThu;
    }
    public JTextField getTxtBaoCaoDoanhThu1() {
        return txtBaoCaoDoanhThu1;
    }
}