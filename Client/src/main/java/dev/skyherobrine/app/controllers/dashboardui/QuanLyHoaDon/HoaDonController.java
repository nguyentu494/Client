package dev.skyherobrine.app.controllers.dashboardui.QuanLyHoaDon;


import dev.skyherobrine.app.AppUtils;
import dev.skyherobrine.app.daos.*;
import dev.skyherobrine.app.entities.order.ChiTietHoaDon;
import dev.skyherobrine.app.entities.order.ChiTietPhieuNhapHang;
import dev.skyherobrine.app.entities.order.HoaDon;
import dev.skyherobrine.app.entities.product.SanPham;
import dev.skyherobrine.app.views.dashboard.component.QuanLyHoaDon;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.lang.Math.abs;

public class HoaDonController implements MouseListener, ActionListener, KeyListener, PropertyChangeListener {
    private static QuanLyHoaDon hoaDonUI;
    private static List<HoaDon> dsHoaDon;
    private static HoaDonDAO<HoaDon> hoaDonDAO;
    private static List<ChiTietHoaDon> dsChiTietHoaDon;
    private static ChiTietHoaDonDAO<ChiTietHoaDon> chiTietHoaDonDAO;
    private static SanPhamDAO<SanPham> sanPhamDAO;
    private static ConnectDB connectDB;
    private static ChiTietPhieuNhapHangDAO<ChiTietPhieuNhapHang> chiTietPhieuNhapHangDAO;
    private static List<ChiTietHoaDon> chiTietHoaDons = new ArrayList<>();
    private static final AppUtils instance = AppUtils.getInstance();
    public HoaDonController(QuanLyHoaDon hoaDonUI) {
        try {
            this.hoaDonUI = hoaDonUI;
            hoaDonDAO = instance.getHoaDonDAO();
            chiTietHoaDonDAO = instance.getChiTietHoaDonDAO();
            sanPhamDAO = instance.getSanPhamDAO();
            chiTietPhieuNhapHangDAO = instance.getChiTietPhieuNhapHangDAO();
            loadDsHoaDon();
//            loadCbMucTien();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void loadDsHoaDon() throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel tmHoaDon= (DefaultTableModel) hoaDonUI.getTbDanhSachHoaDon().getModel();
                tmHoaDon.setRowCount(0);
                try {
                    dsHoaDon = hoaDonDAO.timKiemTop30();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                double tongTien = 0;
                int i = 0;
                for(HoaDon hd : dsHoaDon){
                    String row[] = {(++i)+"",hd.getMaHD(), hd.getNgayLap()+"", hd.getNhanVienLap().getHoTen()};
                    tmHoaDon.addRow(row);
                }
            }
        }).start();
    }
    public static void loadCbMucTien(){
        hoaDonUI.getCbTkCaLamViec().addItem("Tất cả");
        hoaDonUI.getCbTkCaLamViec().addItem("0 - 1 triệu");
        hoaDonUI.getCbTkCaLamViec().addItem("1 - 5 triệu");
        hoaDonUI.getCbTkCaLamViec().addItem("5 - 10 triệu");
        hoaDonUI.getCbTkCaLamViec().addItem("hơn 10 triệu");
    }
    public static double tinhTongTien(String maHD){
        try {
            Map<String, Object> conditions = new HashMap<>();
            conditions.put("chiTietHoaDonId.hoaDon.maHD", maHD);
            HoaDon hd = dsHoaDon.stream().filter(hd1 -> hd1.getMaHD().equals(maHD)).findFirst().get();
            LocalDateTime ngayLap = hd.getNgayLap();
            Map<String, Object> conditionsSP = new HashMap<>();
            conditionsSP.put("ngay_lap", ngayLap);
            chiTietHoaDons = chiTietHoaDonDAO.timKiem(conditions);
            double tongTien = 0;
            for(ChiTietHoaDon chiTietHoaDon : chiTietHoaDons){
                SanPham sanPham = new SanPham();
                String maSp = chiTietHoaDon.getChiTietHoaDonId().getPhienBanSanPham().getSanPham().getMaSP();
                conditionsSP.put("ma_sp", maSp);
                sanPham = sanPhamDAO.timKiem(maSp);
                sanPham.setChiTietPhieuNhapHangs(chiTietPhieuNhapHangDAO.timKiemHaiBang(conditionsSP));
                tongTien += chiTietHoaDon.getSoLuongMua() * sanPham.giaBan();
            }
            return Math.round(tongTien);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void xemHoaDon(){
        int row = hoaDonUI.getTbDanhSachHoaDon().getSelectedRow();
        DefaultTableModel tmHoaDon = (DefaultTableModel) hoaDonUI.getTbDanhSachHoaDon().getModel();
        String maHD = tmHoaDon.getValueAt(row, 1).toString();
        hoaDonUI.getTxtHoaDon().setText(maHD);
        hoaDonUI.getTxtNgayLap().setText(tmHoaDon.getValueAt(row, 2).toString());
        hoaDonUI.getTxtTenNhanVien().setText(tmHoaDon.getValueAt(row, 3).toString());
        hoaDonUI.getTxtKhachHang().setText(dsHoaDon.stream().filter(hd -> hd.getMaHD().equals(maHD)).findFirst().get().getKhachHang().getHoTen());
        hoaDonUI.getTxtKhachHang1().setText(dsHoaDon.stream().filter(hd -> hd.getMaHD().equals(maHD)).findFirst().get().getSoTienKHTra().toString()  );
        hoaDonUI.getTxtKhachHang2().setText(tinhTongTien(maHD)+"");
    }
    public static void inHoaDon(){
            int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn này không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                int row = hoaDonUI.getTbDanhSachHoaDon().getSelectedRow();
                DefaultTableModel tmHoaDon = (DefaultTableModel) hoaDonUI.getTbDanhSachHoaDon().getModel();
                String maHD = hoaDonUI.getTxtHoaDon().getText();
                Map<String, Object> data= new HashMap<>();
                data.put("ma_hd", maHD);
                Double tienKhachDua = null;
                Map<String, Object> conditionsSP = new HashMap<>();
                HoaDon hd = dsHoaDon.stream().filter(hd1 -> hd1.getMaHD().equals(maHD)).findFirst().get();
                LocalDateTime ngayLap = hd.getNgayLap();
                conditionsSP.put("ngayLap", ngayLap);
                try {
                    tienKhachDua = Double.parseDouble(hoaDonUI.getTxtKhachHang1().getText());
                    for(ChiTietHoaDon cthd : chiTietHoaDons){

                        SanPham sanPham = new SanPham();
                        String maSp = cthd.getChiTietHoaDonId().getPhienBanSanPham().getSanPham().getMaSP();
                        conditionsSP.put("sanPham.maSP", maSp);
                        sanPham = sanPhamDAO.timKiem(maSp);
                        sanPham.setChiTietPhieuNhapHangs(chiTietPhieuNhapHangDAO.timKiemHaiBang(conditionsSP));
                        data.put("ThanhTien", cthd.getSoLuongMua() * sanPham.giaBan());
                    }
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

                data.put("TongTien", hoaDonUI.getTxtKhachHang2().getText());
                data.put("tienKhachDua", tienKhachDua);
                data.put("tienThua", abs(Double.parseDouble(hoaDonUI.getTxtKhachHang2().getText()) - tienKhachDua.doubleValue()));

                try {
                    JasperPrint jprint = hoaDonDAO.xuatHoaDon(data);
                    JasperViewer.viewReport(jprint, false);
                }catch (Exception ex){
                    throw new RuntimeException(ex);
                }
            }

    }
    public void xuatHDsHoaDon(){
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn xuất file danh sách hóa đơn này không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION) {
            DefaultTableModel tmHoaDon = (DefaultTableModel) hoaDonUI.getTbDanhSachHoaDon().getModel();
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Danh sách hóa đơn");
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(5);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã hóa đơn");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Ngày lập");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Nhân viên lập");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Khách hàng");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Tổng tiền");

            for (int i = 0; i < tmHoaDon.getRowCount(); i++) {
                row = sheet.createRow(i + 6);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(tmHoaDon.getValueAt(i, 0).toString());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(tmHoaDon.getValueAt(i, 1).toString());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(tmHoaDon.getValueAt(i, 2).toString());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(tmHoaDon.getValueAt(i, 3).toString());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(tmHoaDon.getValueAt(i, 4).toString());

            }

            File f = new File("src/main/resources/HoaDon/ExcelHoaDon/DanhSachHoaDon.xlsx");
            try {
                FileOutputStream fos = new FileOutputStream(f);
                workbook.write(fos);
                fos.close();

            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            JOptionPane.showMessageDialog(null, "Xuất file thành công");
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        xemHoaDon();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    public LocalDate dateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().toString().equalsIgnoreCase(hoaDonUI.getBtnInHoaDon().toString())) {
            inHoaDon();
        }else if(e.getSource().toString().equalsIgnoreCase(hoaDonUI.getBtnXuatHoaDon().toString())){
            xuatHDsHoaDon();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) hoaDonUI.getTbDanhSachHoaDon().getModel());
        hoaDonUI.getTbDanhSachHoaDon().setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(hoaDonUI.getTxtTuKhoaTimKiem().getText()));
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getSource().toString().equalsIgnoreCase(hoaDonUI.getJDateChooserNgayLapHoaDon().toString())){
            Date selectedDate = hoaDonUI.getJDateChooserNgayLapHoaDon().getDate();
            LocalDate localDate = dateToLocalDate(selectedDate);
            if (selectedDate != null) {
                String nlap = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) hoaDonUI.getTbDanhSachHoaDon().getModel());
                hoaDonUI.getTbDanhSachHoaDon().setRowSorter(sorter);
                sorter.setRowFilter(RowFilter.regexFilter(nlap));
            }
        }
    }
}
