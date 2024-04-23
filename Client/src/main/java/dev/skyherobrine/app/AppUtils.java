/*
 * @ (#) AppUtils.java   1.0     20/04/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package dev.skyherobrine.app;

import dev.skyherobrine.app.daos.*;
import dev.skyherobrine.app.entities.order.*;
import dev.skyherobrine.app.entities.person.KhachHang;
import dev.skyherobrine.app.entities.person.NhaCungCap;
import dev.skyherobrine.app.entities.person.NhanVien;
import dev.skyherobrine.app.entities.product.*;
import dev.skyherobrine.app.entities.sale.Thue;
import lombok.Getter;

import java.rmi.Naming;

/*
 * @description:
 * @author: Tuss Nguyen
 * @date: 20/04/2024
 * @version: 1.0
 */

@Getter
public class AppUtils {
    private static final String url = "rmi://LAPTOP-UA4UAHPE:7878/";
    private HoaDonDAO<HoaDon> hoaDonDAO;
    private ChiTietHoaDonDAO<ChiTietHoaDon> chiTietHoaDonDAO;
    private ChiTietPhienBanSanPhamDAO<ChiTietPhienBanSanPham> chiTietPhienBanSanPhamDAO;
    private ChiTietPhieuNhapHangDAO<ChiTietPhieuNhapHang> chiTietPhieuNhapHangDAO;
    private ChiTietPhieuNhapHangPhienBanSPDAO<ChiTietPhieuNhapHangPhienBanSP> chiTietPhieuNhapHangPhienBanSPDAO;
    private ChiTietPhieuTraKhachHangDAO<ChiTietPhieuTraKhachHang> chiTietPhieuTraKhachHangDAO;
    private DanhMucSanPhamDAO<DanhMucSanPham> danhMucSanPhamDAO;
    private KhachHangDAO<KhachHang> khachHangDAO;
    private LoaiSanPhamDAO<LoaiSanPham> loaiSanPhamDAO;
    private NhanVienDAO<NhanVien> nhanVienDAO;
    private NhaCungCapDAO<NhaCungCap> nhaCungCapDAO;
    private PhieuNhapHangDAO<PhieuNhapHang> phieuNhapHangDAO;
    private PhieuTraKhachHangDAO<PhieuTraKhachHang> phieuTraKhachHangDAO;
    private SanPhamDAO<SanPham> sanPhamDAO;
    private ThueDAO<Thue> thueDAO;
    private ThuongHieuDAO<ThuongHieu> thuongHieuDAO;

    private static AppUtils instance;
    public AppUtils() {
        try {
            hoaDonDAO = (HoaDonDAO<HoaDon>) java.rmi.Naming.lookup(url + "hoaDonDAO");
            chiTietHoaDonDAO = (ChiTietHoaDonDAO<ChiTietHoaDon>) java.rmi.Naming.lookup(url + "chiTietHoaDonDAO");
            chiTietPhienBanSanPhamDAO = (ChiTietPhienBanSanPhamDAO<ChiTietPhienBanSanPham>) java.rmi.Naming.lookup(url + "chiTietPhienBanSanPhamDAO");
            chiTietPhieuNhapHangDAO = (ChiTietPhieuNhapHangDAO<ChiTietPhieuNhapHang>) java.rmi.Naming.lookup(url + "chiTietPhieuNhapHangDAO");
            chiTietPhieuNhapHangPhienBanSPDAO = (ChiTietPhieuNhapHangPhienBanSPDAO<ChiTietPhieuNhapHangPhienBanSP>) java.rmi.Naming.lookup(url + "chiTietPhieuNhapHangPhienBanSPDAO");
            khachHangDAO = (KhachHangDAO<KhachHang>) java.rmi.Naming.lookup(url + "khachHangDAO");
            nhaCungCapDAO = (NhaCungCapDAO<NhaCungCap>) java.rmi.Naming.lookup(url + "nhaCungCapDAO");
            phieuNhapHangDAO = (PhieuNhapHangDAO<PhieuNhapHang>) java.rmi.Naming.lookup(url + "phieuNhapHangDAO");
            thueDAO = (ThueDAO<Thue>) java.rmi.Naming.lookup(url + "thueDAO");
            nhanVienDAO = (NhanVienDAO<NhanVien>) java.rmi.Naming.lookup(url + "nhanVienDAO");
            sanPhamDAO = (SanPhamDAO<SanPham>) Naming.lookup(url + "sanPhamDAO");
            danhMucSanPhamDAO = (DanhMucSanPhamDAO<DanhMucSanPham>) java.rmi.Naming.lookup(url + "danhMucSanPhamDAO");
            loaiSanPhamDAO = (LoaiSanPhamDAO<LoaiSanPham>) java.rmi.Naming.lookup(url + "loaiSanPhamDAO");
            thuongHieuDAO = (ThuongHieuDAO<ThuongHieu>) java.rmi.Naming.lookup(url + "thuongHieuDAO");
            phieuTraKhachHangDAO = (PhieuTraKhachHangDAO<PhieuTraKhachHang>) java.rmi.Naming.lookup(url + "phieuTraKhachHangDAO");
            chiTietPhieuTraKhachHangDAO = (ChiTietPhieuTraKhachHangDAO<ChiTietPhieuTraKhachHang>) java.rmi.Naming.lookup(url + "chiTietPhieuTraKhachHangDAO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AppUtils getInstance() {
        if (instance == null) {
            instance = new AppUtils();
        }
        return instance;
    }
}
