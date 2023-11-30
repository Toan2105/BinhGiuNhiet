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
@Table(name = "ChiTietGioHang")
public class GioHangChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    
     @Column(name = "SoLuong")
    private int soLuong;
    @ManyToOne
    @JoinColumn(name = "IdBinhGiuNhietChiTiet")
    private BinhGiuNhietChiTiet binhGiuNhietChiTiet;
     @ManyToOne
    @JoinColumn(name = "IdGioHang")
    private GioHang gioHang;

    public GioHangChiTiet() {
    }

    public GioHangChiTiet(int id, int soLuong, BinhGiuNhietChiTiet binhGiuNhietChiTiet, GioHang gioHang) {
        this.id = id;
        this.soLuong = soLuong;
        this.binhGiuNhietChiTiet = binhGiuNhietChiTiet;
        this.gioHang = gioHang;
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

    public BinhGiuNhietChiTiet getBinhGiuNhietChiTiet() {
        return binhGiuNhietChiTiet;
    }

    public void setBinhGiuNhietChiTiet(BinhGiuNhietChiTiet binhGiuNhietChiTiet) {
        this.binhGiuNhietChiTiet = binhGiuNhietChiTiet;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    @Override
    public String toString() {
        return "GioHangChiTiet{" + "id=" + id + ", soLuong=" + soLuong + ", binhGiuNhietChiTiet=" + binhGiuNhietChiTiet + ", gioHang=" + gioHang + '}';
    }
    

}
