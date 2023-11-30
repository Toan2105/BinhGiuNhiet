/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import java.util.List;


public interface BinhGiuNhietChiTietService {
    List<BinhGiuNhietChiTiet> getAll();
    
    List<BinhGiuNhietChiTiet> getByIdSanPham(int id);
    
    Boolean add(BinhGiuNhietChiTiet binhGiuNhietChiTiet);
    
    void update(BinhGiuNhietChiTiet binhGiuNhietChiTiet);
    
    void delete(BinhGiuNhietChiTiet binhGiuNhietChiTiet);
}
