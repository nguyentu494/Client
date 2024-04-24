package dev.skyherobrine.app.controllers.dashboardui.thongKe;

import dev.skyherobrine.app.AppUtils;
import dev.skyherobrine.app.daos.ChiTietHoaDonDAO;
import dev.skyherobrine.app.daos.ChiTietPhieuNhapHangDAO;
import dev.skyherobrine.app.daos.SanPhamDAO;
import dev.skyherobrine.app.entities.order.ChiTietHoaDon;
import dev.skyherobrine.app.entities.order.ChiTietPhieuNhapHang;
import dev.skyherobrine.app.entities.product.SanPham;
import dev.skyherobrine.app.views.dashboard.component.FormBaoCaoDoanhThuCuaHang;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class thongKeDoanhThuController {
    private FormBaoCaoDoanhThuCuaHang formBaoCaoDoanhThuCuaHang;
    private ChiTietHoaDonDAO<ChiTietHoaDon> chiTietHoaDonDAO;
    private ChiTietPhieuNhapHangDAO<ChiTietPhieuNhapHang> chiTietPhieuNhapHangDAO;
    private SanPhamDAO<SanPham> sanPhamDAO;
    private static final AppUtils instance = new AppUtils();

    public thongKeDoanhThuController(FormBaoCaoDoanhThuCuaHang formBaoCaoDoanhThuCuaHang){
        this.formBaoCaoDoanhThuCuaHang = formBaoCaoDoanhThuCuaHang;
        try {
            this.chiTietHoaDonDAO = instance.getChiTietHoaDonDAO();
            this.chiTietPhieuNhapHangDAO = instance.getChiTietPhieuNhapHangDAO();
            this.sanPhamDAO = instance.getSanPhamDAO();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        loadData();
    }
    public void loadData(){
        DefaultCategoryDataset dataset = createDataSet();

        JFreeChart chart = ChartFactory.createLineChart("Biểu đồ thể hiện doanh thu cửa hàng trong 7 ngày gần nhất", "Ngày lập", "Doanh thu", dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        formBaoCaoDoanhThuCuaHang.getPnBieuDoTHongKeDoanhThu().removeAll();
        formBaoCaoDoanhThuCuaHang.getPnBieuDoTHongKeDoanhThu().setLayout(new java.awt.BorderLayout());
        formBaoCaoDoanhThuCuaHang.getPnBieuDoTHongKeDoanhThu().add(chartPanel);
    }
    public DefaultCategoryDataset createDataSet() {
        String series_1 =  "Doanh Thu";


        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        String cols = " ma_sp, SUM(so_luong_mua) as SoLuongBan, cast(ngay_lap as nvarchar(255))";
        String join = "cthd inner join HoaDon hd on cthd.ma_hd = hd.ma_hd inner join ChiTietPhienBanSanPham pbsp on cthd.ma_phien_ban_sp = pbsp.ma_phien_ban_sp";
        String query = " ngay_lap >= DATEADD(DAY, -7, GETDATE())  group by ma_sp, ngay_lap";

        try {
            List<Map<String, Object>> result = chiTietHoaDonDAO.timKiemHD(cols, join, query);
            double doanhthu = 0;
            for (Map<String, Object> map : result) {
                for(Map.Entry<String, Object> entry : map.entrySet()){
                    SanPham sp  = sanPhamDAO.timKiem(entry.getKey());
                    Map<String, Object> conditions = new HashMap<>();
                    conditions.put("sanPham.maSP", entry.getKey());
                    sp.setChiTietPhieuNhapHangs(chiTietPhieuNhapHangDAO.timKiem(conditions));
                    double dongia = sp.giaBan();
                    Map<String, Integer> data = (Map<String, Integer>) entry.getValue();
                    for(Map.Entry<String, Integer> entry1 : data.entrySet()){
                        dataset.addValue(entry1.getValue()*dongia, series_1, entry1.getKey().substring(0,10));
                        doanhthu =dongia*entry1.getValue();
                    }

               }
            }
            formBaoCaoDoanhThuCuaHang.getTxtBaoCaoDoanhThu().setText(String.valueOf(doanhthu));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return dataset;
    }
}
