package com.binhgiunhiet_g3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name = "BinhGiuNhietChiTiet")
public class BinhGiuNhietChiTiet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    
    @Column(name = "SoLuong")
    private int soLuong;
    
    @Column(name = "GiaNhap")
    private BigDecimal giaNhap;
    
    @Column(name = "GiaBan")
    private BigDecimal giaBan;
    
    @Column(name = "TrangThai")
    private Boolean trangThai;
    
    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac mauSac;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdBinhGiuNhiet")
    private BinhGiuNhiet binhGiuNhiet;

    public BinhGiuNhietChiTiet() {
    }

    public BinhGiuNhietChiTiet(int id, int soLuong, BigDecimal giaNhap, BigDecimal giaBan, Boolean trangThai, MauSac mauSac, BinhGiuNhiet binhGiuNhiet) {
        this.id = id;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.mauSac = mauSac;
        this.binhGiuNhiet = binhGiuNhiet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public BinhGiuNhiet getBinhGiuNhiet() {
        return binhGiuNhiet;
    }

    public void setBinhGiuNhiet(BinhGiuNhiet binhGiuNhiet) {
        this.binhGiuNhiet = binhGiuNhiet;
    }

    @Override
    public String toString() {
        return "BinhGiuNhietChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", trangThai=" + trangThai + ", mauSac=" + mauSac + ", binhGiuNhiet=" + binhGiuNhiet + '}';
    }
   
    
}
