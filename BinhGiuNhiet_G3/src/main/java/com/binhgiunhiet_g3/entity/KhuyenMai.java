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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author Hung
 */
@Entity
@Table(name = "KhuyenMai")
public class KhuyenMai {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "MaKhuyenMai")
    private String ma;
    @Column(name = "GiaTri")
    private int giaTri;
    @Column(name = "NgayBatDau")
    private Date ngayBatDau;
    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;
    @Column(name = "KieuGiamGia")
    private int kieuGiamGia;
    @Column(name = "TrangThai")
    private int trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(int id, String ma, int giaTri, Date ngayBatDau, Date ngayKetThuc, int kieuGiamGia, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.giaTri = giaTri;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.kieuGiamGia = kieuGiamGia;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(int giaTri) {
        this.giaTri = giaTri;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getKieuGiamGia() {
        return kieuGiamGia;
    }

    public void setKieuGiamGia(int kieuGiamGia) {
        this.kieuGiamGia = kieuGiamGia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "id=" + id + ", ma=" + ma + ", giaTri=" + giaTri + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", kieuGiamGia=" + kieuGiamGia + ", trangThai=" + trangThai + '}';
    }
}
