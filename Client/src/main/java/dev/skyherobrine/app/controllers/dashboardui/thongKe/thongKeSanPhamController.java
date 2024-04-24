package dev.skyherobrine.app.controllers.dashboardui.thongKe;

import dev.skyherobrine.app.AppUtils;
import dev.skyherobrine.app.daos.ChiTietHoaDonDAO;
import dev.skyherobrine.app.entities.order.ChiTietHoaDon;
import dev.skyherobrine.app.views.dashboard.component.FormBaoCaoSanPhamCuaHang;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import java.util.List;
import java.util.Map;

public class thongKeSanPhamController {
    private FormBaoCaoSanPhamCuaHang formBaoCaoSanPhamCuaHang;
    private ChiTietHoaDonDAO<ChiTietHoaDon> chiTietHoaDonDAO;
    private static final AppUtils instance = new AppUtils();
    public thongKeSanPhamController(FormBaoCaoSanPhamCuaHang formBaoCaoSanPhamCuaHang){
        this.formBaoCaoSanPhamCuaHang = formBaoCaoSanPhamCuaHang;
        try {
            this.chiTietHoaDonDAO = instance.getChiTietHoaDonDAO();
            loadData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void loadData(){
        PieDataset dataSet = createDataSet();
        JFreeChart chart = createChart(dataSet);
        ChartPanel chartPanel = new ChartPanel(chart);
        formBaoCaoSanPhamCuaHang.getPnBieuDoTHongKeSanPham().removeAll();
        formBaoCaoSanPhamCuaHang.getPnBieuDoTHongKeSanPham().setLayout(new java.awt.BorderLayout());
        formBaoCaoSanPhamCuaHang.getPnBieuDoTHongKeSanPham().add(chartPanel);
    }
    private PieDataset createDataSet() {

        String cols = " TOP 10 ten_sp, sum(so_luong_mua) as soLuongBan ";
        String join = " cthd inner join HoaDon hd on cthd.ma_hd = hd.ma_hd inner join ChiTietPhienBanSanPham pbsp on cthd.ma_phien_ban_sp = pbsp.ma_phien_ban_sp inner join SanPham sp on pbsp.ma_sp =sp.ma_sp";
        String query = " ngay_lap >= DATEADD(DAY, -7, GETDATE()) GROUP BY ten_sp ORDER BY soLuongBan DESC";
        DefaultPieDataset dataset = new DefaultPieDataset();

        try {
            List<Map<String, Integer>> result = chiTietHoaDonDAO.timKiem(cols, join, query);
            String max = "";
            int maxSoLuong = 0;
            for (Map<String, Integer> map : result) {
                for(Map.Entry<String, Integer> entry : map.entrySet()){
                    dataset.setValue(entry.getKey(), entry.getValue());
                    for (Map.Entry<String, Integer> entry1 : map.entrySet()) {
                        if (entry1.getValue() > maxSoLuong) {
                            maxSoLuong = entry1.getValue();
                            max = entry1.getKey();
                        }
                    }
                }
            }
            formBaoCaoSanPhamCuaHang.getTxtBaoCaoDoanhThu1().setText(max);
            formBaoCaoSanPhamCuaHang.getTxtBaoCaoDoanhThu().setEnabled(false);
            formBaoCaoSanPhamCuaHang.getTxtBaoCaoDoanhThu().setText(String.valueOf(maxSoLuong));
            formBaoCaoSanPhamCuaHang.getTxtBaoCaoDoanhThu1().setEnabled(false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dataset;
    }
    private JFreeChart createChart(PieDataset dataset) {
        return ChartFactory.createPieChart("Biểu đồ biểu hiện top 10 sản phẩm bán chạy", dataset, true, true, false);
    }
}
