/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;


import com.binhgiunhiet_g3.entity.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author dungd
 */
public interface HoaDonChiTietService {
    List<HoaDonChiTiet> getAll();
    
//    List<HoaDonChiTiet> getByIdSanPham(int id);
    
    Boolean add(HoaDonChiTiet hoaDonChiTiet);
    
    void update(HoaDonChiTiet hoaDonChiTiet);
    
    void delete(HoaDonChiTiet hoaDonChiTiet);
}
