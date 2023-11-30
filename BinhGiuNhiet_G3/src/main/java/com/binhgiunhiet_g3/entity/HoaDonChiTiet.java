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
import java.math.BigDecimal;

/**
 *
 * @author dungd
 */
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;

    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonGia")
    private BigDecimal donGia;

    @ManyToOne
    @JoinColumn(name = "IdHoaHon")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "IdChiTietSanPham")
    private BinhGiuNhietChiTiet binhGiuNhietChiTiet;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int id, int soLuong, BigDecimal donGia, HoaDon hoaDon, BinhGiuNhietChiTiet binhGiuNhietChiTiet) {
        this.id = id;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.hoaDon = hoaDon;
        this.binhGiuNhietChiTiet = binhGiuNhietChiTiet;
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

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public BinhGiuNhietChiTiet getBinhGiuNhietChiTiet() {
        return binhGiuNhietChiTiet;
    }

    public void setBinhGiuNhietChiTiet(BinhGiuNhietChiTiet binhGiuNhietChiTiet) {
        this.binhGiuNhietChiTiet = binhGiuNhietChiTiet;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", donGia=" + donGia + ", hoaDon=" + hoaDon + ", binhGiuNhietChiTiet=" + binhGiuNhietChiTiet + '}';
    }

    
}
