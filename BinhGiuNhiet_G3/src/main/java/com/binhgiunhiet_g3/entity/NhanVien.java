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
import jakarta.persistence.Table;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "NhanVien")
public class NhanVien {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    
    @Column(name = "MaNhanVien")
    private String maNV;
    
    @Column(name = "Ten")
    private String ten;
    
    @Column(name ="NgaySinh")
    private Date ngaySinh;
    
    @Column(name ="ChucVu")
    private Boolean chucVu;
    
    @Column(name ="SoDienThoai")
    private String sdt;
    
    @Column(name ="Email")
    private String email;
    
    @Column(name ="GioiTinh")
    private Boolean gioiTinh;
    
    @Column(name ="DiaChi")
    private String diaChi;
    
    @Column(name ="MatKhau")
    private String matKhau;
    
    @Column(name ="TrangThai")
    private Boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(int id, String maNV, String ten, Date ngaySinh, Boolean chucVu, String sdt, String email, Boolean gioiTinh, String diaChi, String matKhau, Boolean trangThai) {
        this.id = id;
        this.maNV = maNV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
        this.sdt = sdt;
        this.email = email;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Boolean getChucVu() {
        return chucVu;
    }

    public void setChucVu(Boolean chucVu) {
        this.chucVu = chucVu;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
