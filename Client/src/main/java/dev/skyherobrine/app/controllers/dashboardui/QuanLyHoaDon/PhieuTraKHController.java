package dev.skyherobrine.app.controllers.dashboardui.QuanLyHoaDon;

import dev.skyherobrine.app.AppUtils;
import dev.skyherobrine.app.daos.*;
import dev.skyherobrine.app.entities.Key.ChiTietPhieuTraKhachHangId;
import dev.skyherobrine.app.entities.order.*;
import dev.skyherobrine.app.entities.product.ChiTietPhienBanSanPham;
import dev.skyherobrine.app.entities.product.SanPham;
import dev.skyherobrine.app.views.dashboard.component.QuanLyPhieuTraHangChoKhachHang;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PhieuTraKHController implements KeyListener, TableModelListener, ActionListener, MouseListener, PropertyChangeListener {
    private QuanLyPhieuTraHangChoKhachHang quanLyPhieuTraHangChoKhachHang;
    private DefaultListModel<String> listModelHD;
    private HoaDonDAO<HoaDon> hoaDonDAO;
    private ChiTietHoaDonDAO<ChiTietHoaDon> chiTietHoaDonDAO;
    private SanPhamDAO<SanPham> sanPhamDAO;
    private ChiTietPhieuNhapHangDAO<ChiTietPhieuNhapHang> chiTietPhieuNhapHangDAO;
    private PhieuTraKhachHangDAO<PhieuTraKhachHang> phieuTraKhachHangDAO;
    private ChiTietPhieuTraKhachHangDAO<ChiTietPhieuTraKhachHang> chiTietPhieuTraKhachHangDAO;
    private ChiTietPhienBanSanPhamDAO<ChiTietPhienBanSanPham> chiTietPhienBanSanPhamDAO;
    private String maPTKH;

    private static final AppUtils instance = new AppUtils();
    public PhieuTraKHController(QuanLyPhieuTraHangChoKhachHang quanLyPhieuTraHangChoKhachHang) {
        try {
            this.quanLyPhieuTraHangChoKhachHang = quanLyPhieuTraHangChoKhachHang;
            this.chiTietPhieuTraKhachHangDAO = instance.getChiTietPhieuTraKhachHangDAO();
            this.chiTietPhienBanSanPhamDAO = instance.getChiTietPhienBanSanPhamDAO();
            this.phieuTraKhachHangDAO = instance.getPhieuTraKhachHangDAO();
            this.hoaDonDAO = instance.getHoaDonDAO();
            this.chiTietHoaDonDAO = instance.getChiTietHoaDonDAO();
            this.sanPhamDAO = instance.getSanPhamDAO();
            this.chiTietPhieuNhapHangDAO = instance.getChiTietPhieuNhapHangDAO();
            loadPhieuTra();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        DefaultTableModel tmCTHD = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getModel();
        tmCTHD = new DefaultTableModel(new Object[][]{}, new String[]{"STT", "Mã sản phẩm", "Tên sản phẩm", "Số lượng trả", "Số lượng mua", "Giá bán", "Thành tiền"}){
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==3){
                    return true;
                }
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().setModel(tmCTHD);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            if(e.getSource().equals(quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon())){
                quanLyPhieuTraHangChoKhachHang.getListSuggestHD().requestFocus();
                quanLyPhieuTraHangChoKhachHang.getListSuggestHD().setSelectedIndex(0);
            }
        }else if(e.getKeyCode()==KeyEvent.VK_ENTER) {
            if (e.getSource().equals(quanLyPhieuTraHangChoKhachHang.getListSuggestHD())) {
                String row = quanLyPhieuTraHangChoKhachHang.getListSuggestHD().getSelectedValue().toString();
                loadTTHD(row);
            }else if(e.getSource().equals(quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon())){
                String maHD = quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon().getText();
                loadTTHD(maHD);
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()!=KeyEvent.VK_DOWN && e.getKeyCode()!=KeyEvent.VK_UP && e.getKeyCode()!=KeyEvent.VK_ENTER ){
            if(quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon().getText().equalsIgnoreCase("")){
                quanLyPhieuTraHangChoKhachHang.getMenuSuggestHD().setVisible(false);
            } else {
                searchSuggestionHD(quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon().getText());
            }
            if (e.getSource().equals(quanLyPhieuTraHangChoKhachHang.getTxtTuKhoaTimKiem())) {
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getModel());
                quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().setRowSorter(sorter);
                sorter.setRowFilter(RowFilter.regexFilter(quanLyPhieuTraHangChoKhachHang.getTxtTuKhoaTimKiem().getText()));

            }
        }

    }
    public void xemPhieuTra(){
        DefaultTableModel tmPhieuTra = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getModel();
        int row = quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getSelectedRow();
        quanLyPhieuTraHangChoKhachHang.getTxtMaPhieuTra().setText(tmPhieuTra.getValueAt(row, 1).toString());
        quanLyPhieuTraHangChoKhachHang.getTxtMaPhieuNhap().setText(tmPhieuTra.getValueAt(row,3).toString());
        String nMua = tmPhieuTra.getValueAt(row, 2).toString();
        nMua = nMua.substring(0, nMua.indexOf('T'));
        LocalDate nlapHD = LocalDate.parse(nMua, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        nlapHD.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        quanLyPhieuTraHangChoKhachHang.getjDateChooserNgayLapPhieu().setDateFormatString("dd/MM/yyyy");
        quanLyPhieuTraHangChoKhachHang.getjDateChooserNgayLapPhieu().setDate(java.sql.Date.valueOf(nlapHD));

    }
    public void loadTTHD(String maHD){
        try {
            HoaDon hoaDon = hoaDonDAO.timKiem(maHD);
            DefaultTableModel tmCTHD = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getModel();
            Map<String, Object> conditions= new HashMap<>();
            conditions.put("chiTietHoaDonId.hoaDon.maHD", maHD);
            List<ChiTietHoaDon> listCTHD = chiTietHoaDonDAO.timKiem(conditions);
            SanPham sp;
            int i = 0;
            double tt = 0;
            double giaBan = 0;
            Map<String, Object> conditions2= new HashMap<>();
            conditions2.put("hoaDon.maHD", maHD);
            List<PhieuTraKhachHang> phieuTraKhachHangs = phieuTraKhachHangDAO.timKiem(conditions2);
            if(!phieuTraKhachHangs.isEmpty()){
                JOptionPane.showMessageDialog(null, "Hóa đơn này đã được trả hàng");
                return;
            }
            if(hoaDon == null){
                JOptionPane.showMessageDialog(null, "Hóa đơn này không tồn tại");
                return;
            }
            if(Period.between(LocalDate.from(hoaDon.getNgayLap()), LocalDate.now()).getDays()>=7){
                JOptionPane.showMessageDialog(null, "Hóa đơn này đã quá 7 ngày, không thể trả hàng");
                return;
            }
            for(ChiTietHoaDon cthd : listCTHD){
                sp = cthd.getChiTietHoaDonId().getPhienBanSanPham().getSanPham();
//                sp = new SanPham();
                Map<String, Object> conditionsSP= new HashMap<>();
                conditionsSP.put("sanPham.maSP", sp.getMaSP());
                sp.setChiTietPhieuNhapHangs(chiTietPhieuNhapHangDAO.timKiem(conditionsSP));

                giaBan = Math.round(sp.giaBan());
                Object[] row = {++i, cthd.getChiTietHoaDonId().getPhienBanSanPham().getMaPhienBanSP().toString(), sp.getTenSP(), "0","/"+cthd.getSoLuongMua(), giaBan, "0"};
//                Object[] row = {++i, null, sp.getTenSP(), "0","/"+cthd.getSoLuongMua(), giaBan, "0"};

                tt += giaBan * cthd.getSoLuongMua();
                tmCTHD.addRow(row);
            }
            quanLyPhieuTraHangChoKhachHang.getTxtMaHoaDon().setText(hoaDon.getMaHD());
            LocalDateTime local = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            quanLyPhieuTraHangChoKhachHang.getTxtNgayLapPhieu().setText(local.format(dateTimeFormatter));
            quanLyPhieuTraHangChoKhachHang.getTxtTongTienHang().setText(String.valueOf(tt));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void loadPhieuTra(){
        DefaultTableModel tmPhieu = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getModel();

        try {
            if(phieuTraKhachHangDAO.timKiem().isEmpty()){

            }else {
                List<PhieuTraKhachHang> listPTKH = phieuTraKhachHangDAO.timKiem();
                int i = 0;
                for (PhieuTraKhachHang ptkh : listPTKH) {
                    Map<String, Object> conditions = new HashMap<>();
                    conditions.put("chiTietPhieuTraKhachHangId.phieuTra.maPhieuTraKhachHang", ptkh.getMaPhieuTraKhachHang().toString());
                    List<ChiTietPhieuTraKhachHang> listCTPTKH = chiTietPhieuTraKhachHangDAO.timKiem(conditions);
                    String row[] = {(++i) + "", ptkh.getMaPhieuTraKhachHang(), ptkh.getNgayLap() + "", ptkh.getHoaDon().getMaHD(), ptkh.getHoaDon().getKhachHang().getHoTen(), listCTPTKH.size() + ""};
                    tmPhieu.addRow(row);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void searchSuggestionHD(String text){
        String search = quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon().getText();
        if (!search.equals("")) {
            listModelHD = new DefaultListModel<>();
            quanLyPhieuTraHangChoKhachHang.getListSuggestHD().setModel(listModelHD);
            listModelHD.removeAllElements();
            LocalDate localDate = LocalDate.now();
            Map<String, Object> conditions = new HashMap<>();
            String colNames[] = {"MaHD", "NgayLap"};
            String nMua;
            LocalDate nlapHD;
            try {
                List<HoaDon> listHD = hoaDonDAO.timKiemHoaDonTheoNgay();
                if(listHD.isEmpty()){
                    quanLyPhieuTraHangChoKhachHang.getMenuSuggestHD().setVisible(false);
                }else{
                    for(int i = 0; i < listHD.size(); i++){
                        nMua = listHD.get(i).getNgayLap().toString();
                        nMua = nMua.substring(0, nMua.indexOf('T'));
                        nlapHD = LocalDate.parse(nMua, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                        if(Period.between(nlapHD, LocalDate.now()).getDays()<7){
                            listModelHD.addElement(listHD.get(i).getMaHD().toString());
                        }
                    }
                    if(!listModelHD.isEmpty()) {
                        quanLyPhieuTraHangChoKhachHang.getMenuSuggestHD().show(quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon(), 0, quanLyPhieuTraHangChoKhachHang.getTxtTimKiemHoaDon().getHeight());
                    }
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        if(e.getSource().equals(quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getModel())){
            if(e.getColumn()==3){

                DefaultTableModel tmCTHD = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getModel();
                int row = e.getFirstRow();
                int slTra = Integer.parseInt(quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getValueAt(row, 3).toString());
                int slMua = Integer.parseInt(quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getValueAt(row, 4).toString().substring(1));
                double tt = Double.parseDouble(quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getValueAt(row, 5).toString());
                double tongtien = 0;
                if(slTra>slMua){
                    JOptionPane.showMessageDialog(null, "Số lượng trả không được lớn hơn số lượng mua");
                    tmCTHD.setValueAt("0", row, 3);
                }else{
                    tmCTHD.setValueAt(slTra*tt, row, 6);
                    for(int i = 0; i < tmCTHD.getRowCount(); i++){
                        tongtien += Double.parseDouble(tmCTHD.getValueAt(i, 6).toString());
                    }
                    quanLyPhieuTraHangChoKhachHang.getTxtTongTienTraLai().setText(String.valueOf(tongtien));
                }
            }
        }
    }
    public void lapPhieuTraKH(String maHD){
        DefaultTableModel tmCTHD = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getModel();
        String maPTKH = taoMaPhieuTraKH();
        String nLap = quanLyPhieuTraHangChoKhachHang.getTxtNgayLapPhieu().getText();
        LocalDateTime nl = LocalDateTime.parse(nLap, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        try {
            PhieuTraKhachHang phieuTraKhachHang = new PhieuTraKhachHang(maPTKH, nl, hoaDonDAO.timKiem(maHD));
            phieuTraKhachHangDAO.them(phieuTraKhachHang);
            ChiTietPhienBanSanPham pbsp = new ChiTietPhienBanSanPham();
            int sl = 0;
            for(int i = 0; i < tmCTHD.getRowCount(); i++){
                if(tmCTHD.getValueAt(i, 3).toString().equalsIgnoreCase("0")){
                    continue;
                }
                pbsp = chiTietPhienBanSanPhamDAO.timKiem(tmCTHD.getValueAt(i, 1).toString());
                sl = Integer.parseInt(tmCTHD.getValueAt(i, 3).toString());
//                ChiTietPhieuTraKhachHang chiTietPhieuTraKhachHang = new ChiTietPhieuTraKhachHang();
                ChiTietPhieuTraKhachHang chiTietPhieuTraKhachHang = new ChiTietPhieuTraKhachHang(new ChiTietPhieuTraKhachHangId(phieuTraKhachHang, pbsp), sl, quanLyPhieuTraHangChoKhachHang.getTxtLyDoTraHang().getText());
                chiTietPhieuTraKhachHangDAO.them(chiTietPhieuTraKhachHang);
            }
            xuatHoaDon();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void xuatHoaDon(){

            DefaultTableModel tmCTHoaDon = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachSanPhamTrongHoaDon().getModel();

            Map<String, Object> data= new HashMap<>();
            data.put("ThanhTien", tmCTHoaDon.getValueAt(0, 6).toString());
            double tienTT = Double.parseDouble(quanLyPhieuTraHangChoKhachHang.getTxtTongTienHang().getText());
            double tienTra = Double.parseDouble(quanLyPhieuTraHangChoKhachHang.getTxtTongTienTraLai().getText());
            String maHD = maPTKH;
            data.put("ma_phieu_tra_khach_hang", maPTKH);
            data.put("GiaTri", tienTT);
            data.put("TongTienTraLai", tienTra);
            data.put("TienHang", tienTT);
            JasperPrint jprint = null;
            try {
                jprint = phieuTraKhachHangDAO.xuatHoaDon(data);
                JasperViewer.viewReport(jprint, false);
            } catch (Exception e) {
               e.printStackTrace();
            }
    }
    public String taoMaPhieuTraKH(){
        maPTKH = "PTH-";
        String nl = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        maPTKH += (nl+"-");
        String maHD = quanLyPhieuTraHangChoKhachHang.getTxtMaHoaDon().getText();
        int index = maHD.indexOf('-', maHD.indexOf('-') + 1);
        String sdt = maHD.substring(index+1, index+4);
        maPTKH += (sdt+"-");
        maPTKH += (taoSTT());
        return maPTKH;
    }
    public String taoSTT(){
        List<PhieuTraKhachHang> listPTKH = null;
        String stt = "001";
        String nlap = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")).toString();

        Map<String, Object> conditions = new HashMap<>();
        conditions.put("maPhieuTraKhachHang", "%"+nlap+"%");
        List<PhieuTraKhachHang> phieuTraKhachHangs = new ArrayList<>();
        try{
            phieuTraKhachHangs = phieuTraKhachHangDAO.timKiem(conditions);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if(phieuTraKhachHangs.isEmpty()){
            return stt;
        }
        PhieuTraKhachHang phieuTraKhachHang = phieuTraKhachHangs.get(phieuTraKhachHangs.size()-1);
        int soPhieu = Integer.parseInt(phieuTraKhachHang.getMaPhieuTraKhachHang().substring(phieuTraKhachHang.getMaPhieuTraKhachHang().lastIndexOf('-')+1));
        return formatNumber(soPhieu+1);
    }
    public String formatNumber(int number) {
        if(number < 10)
            return String.format("00%d", number);
        else if((number >= 10) && (number < 100))
            return String.format("0%d", number);
        else
            return String.format("%d", number);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(quanLyPhieuTraHangChoKhachHang.getBtnTraHang())){
            int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lập phiếu trả hàng không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if(result==JOptionPane.YES_OPTION){
                lapPhieuTraKH(quanLyPhieuTraHangChoKhachHang.getTxtMaHoaDon().getText());
                JOptionPane.showMessageDialog(null, "Trả hàng thành công");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        xemPhieuTra();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getSource().toString().equalsIgnoreCase(quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayLap().toString())){
            Date selectedDate = quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayLap().getDate();
            LocalDate localDate = dateToLocalDate(selectedDate);
            if (selectedDate != null) {
                String nlap = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getModel());
                quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().setRowSorter(sorter);
                sorter.setRowFilter(RowFilter.regexFilter(nlap));
                quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay().setEnabled(true);
            }
        }
       if(evt.getSource().equals(quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay())){
           Date selectedDateDenN = quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay().getDate();
           LocalDate localDateDenN = dateToLocalDate(selectedDateDenN);
           Date selectedDateTuN = quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayLap().getDate();
           LocalDate localDateTuN = dateToLocalDate(selectedDateTuN);
           if(localDateDenN.isAfter(LocalDate.now())){
               JOptionPane.showMessageDialog(null, "Ngày chỉ được chọn từ ngày hiện tại về trước");
               quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay().setDate(null);
           } else if (localDateDenN.isBefore(localDateTuN)) {
               JOptionPane.showMessageDialog(null, "Ngày không được trước ngày bắt đầu");
               quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay().setDate(null);
           }
       }
       if(quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayLap().getDate()!=null && quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay().getDate()!=null){
           Date selectedDate = quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayLap().getDate();
           LocalDate localDateTuN = dateToLocalDate(selectedDate);
           Date selectedDate2 = quanLyPhieuTraHangChoKhachHang.getjDateChooserTkNgayHenLay().getDate();
           LocalDate localDateDenN = dateToLocalDate(selectedDate2);
           String tuN = localDateTuN.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
           String denN = localDateDenN.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
           Map<String, Object> conditionsLoc = new HashMap<>();
           conditionsLoc.put("NgayLap between '"+tuN+"' and '"+denN+" 23:59:59' and MaPhieuTraKH", "");
           TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>((DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getModel());
           quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().setRowSorter(sorter);
           sorter.setRowFilter(RowFilter.regexFilter(""));
              try {
                List<PhieuTraKhachHang> listPTKH = phieuTraKhachHangDAO.timKiem(conditionsLoc);
                DefaultTableModel tmPhieu = (DefaultTableModel) quanLyPhieuTraHangChoKhachHang.getTbDanhSachPhieuTraHangChoKhachHang().getModel();
                tmPhieu.setRowCount(0);
                int i = 0;
                for(PhieuTraKhachHang ptkh : listPTKH){
                     Map<String, Object> conditions= new HashMap<>();
                     conditions.put("MaPhieuTraKH", ptkh.getMaPhieuTraKhachHang().toString());
                     List<ChiTietPhieuTraKhachHang> listCTPTKH = chiTietPhieuTraKhachHangDAO.timKiem(conditions);
                     String row[] ={(++i)+"", ptkh.getMaPhieuTraKhachHang(), ptkh.getNgayLap()+"", ptkh.getHoaDon().getMaHD(), ptkh.getHoaDon().getKhachHang().getHoTen(), listCTPTKH.size()+""};
                     tmPhieu.addRow(row);
                }
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
       }
    }
    public LocalDate dateToLocalDate(Date date) {
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
