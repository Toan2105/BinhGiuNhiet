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
 * @author ADMIN
 */
@Entity
@Table(name = "GioHang")
public class GioHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    
    @Column(name ="MaGioHang")
    private String maGH;
    
    @Column(name ="NgayTao")
    private Date ngayTao;
    
    @Column(name ="TrangThai")
    private Boolean trangThai;
    
    @ManyToOne
    @JoinColumn(name = "IdKhachHang")
    private KhachHang khachHang;

    public GioHang() {
    }

    public GioHang(int id, String maGH, Date ngayTao, Boolean trangThai, KhachHang khachHang) {
        this.id = id;
        this.maGH = maGH;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.khachHang = khachHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaGH() {
        return maGH;
    }

    public void setMaGH(String maGH) {
        this.maGH = maGH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "GioHang{" + "id=" + id + ", maGH=" + maGH + ", ngayTao=" + ngayTao + ", trangThai=" + trangThai + ", khachHang=" + khachHang + '}';
    }

    
}
