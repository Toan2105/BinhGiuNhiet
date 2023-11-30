/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author dungd
 */
@Entity
@Table(name = "HoaDon")

public class HoaDon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "MaDoaDon")
    private String maHoaDon;
    
    @Column(name = "TienSauGiamGia")
    private float tienSauGiamGia;
    
    @Column(name = "ThanhTien")
    private float thanhTien;
    
    @Column(name = "PhuongThucThanhToan")
    private int phuongThucThanhToan;
//     @Column(name="NgayThanhToan")
//    private date ngayThanhToan ;

    @ManyToOne
    @JoinColumn(name = "IdKhachHang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "IdNhanVien")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "IdKhuyenMai")
    private KhuyenMai khuyenMai;

    public HoaDon() {
    }

    public HoaDon(int id, String maHoaDon, float tienSauGiamGia, float thanhTien, int phuongThucThanhToan, KhachHang khachHang, NhanVien nhanVien, KhuyenMai khuyenMai) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.tienSauGiamGia = tienSauGiamGia;
        this.thanhTien = thanhTien;
        this.phuongThucThanhToan = phuongThucThanhToan;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.khuyenMai = khuyenMai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public float getTienSauGiamGia() {
        return tienSauGiamGia;
    }

    public void setTienSauGiamGia(float tienSauGiamGia) {
        this.tienSauGiamGia = tienSauGiamGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(int phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(KhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", maHoaDon=" + maHoaDon + ", tienSauGiamGia=" + tienSauGiamGia + ", thanhTien=" + thanhTien + ", phuongThucThanhToan=" + phuongThucThanhToan + ", khachHang=" + khachHang + ", nhanVien=" + nhanVien + ", khuyenMai=" + khuyenMai + '}';
    }

    
}
