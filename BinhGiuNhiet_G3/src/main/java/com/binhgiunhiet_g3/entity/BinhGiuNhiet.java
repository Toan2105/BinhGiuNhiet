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
 * @author PC
 */

@Entity
@Table(name = "BinhGiuNhiet")
public class BinhGiuNhiet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private int id;
    
    @Column(name="MaBinhGiuNhiet")
    private String ma;
    
    @Column(name="NamSanXuat")
    private int namSanXuat;
    
    @Column(name="DungTich")
    private int dungTich;
    
    @Column(name="Ten")
    private String ten;
    
    @Column(name="UrlAnh")
    private String url;
    
    @ManyToOne
    @JoinColumn(name = "IdThuongHieu")
    private ThuongHieu thuongHieu;
    
    @ManyToOne
    @JoinColumn(name = "IdChatLieu")
    private ChatLieu ChatLieu;

    public BinhGiuNhiet() {
    }

    public BinhGiuNhiet(int id, String ma, int namSanXuat, int dungTich, String ten, String url, ThuongHieu thuongHieu, ChatLieu ChatLieu) {
        this.id = id;
        this.ma = ma;
        this.namSanXuat = namSanXuat;
        this.dungTich = dungTich;
        this.ten = ten;
        this.url = url;
        this.thuongHieu = thuongHieu;
        this.ChatLieu = ChatLieu;
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

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ThuongHieu getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(ThuongHieu thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public ChatLieu getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(ChatLieu ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    @Override
    public String toString() {
        return "BinhGiuNhiet{" + "id=" + id + ", ma=" + ma + ", namSanXuat=" + namSanXuat + ", dungTich=" + dungTich + ", ten=" + ten + ", url=" + url + ", thuongHieu=" + thuongHieu + ", ChatLieu=" + ChatLieu + '}';
    }

    
}
