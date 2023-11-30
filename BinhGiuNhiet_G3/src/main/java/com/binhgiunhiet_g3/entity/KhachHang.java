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
import java.util.Date;

/**
 *
 * @author Hung
 */
@Entity
@Table (name = "KhachHang")
public class KhachHang {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    
    @Column(name = "TenKhachHang")
    private String tenKhachHang;
    
    @Column(name = "MaKhachHang")
    private String ma;
    
    @Column(name = "NgaySinh")
    private Date ngaySinh;
    
    @Column(name = "SoDienThoai")
    private String sdt;
    
    @Column(name = "Email")
    private String email;
    
    @Column(name = "DiaChi")
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(int id, String tenKhachHang, String ma, Date ngaysinh, String sdt, String email, String diachi) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.ma = ma;
        this.ngaySinh = ngaysinh;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgaysinh() {
        return ngaySinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaySinh = ngaysinh;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", tenKhachHang=" + tenKhachHang + ", ma=" + ma + ", ngaysinh=" + ngaySinh + ", sdt=" + sdt + ", email=" + email + ", diachi=" + diachi + '}';
    }
    
}