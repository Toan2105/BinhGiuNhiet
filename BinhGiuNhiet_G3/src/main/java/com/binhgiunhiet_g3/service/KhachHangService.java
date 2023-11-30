/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;
import com.binhgiunhiet_g3.entity.KhachHang;
import java.util.List;

/**
 *
 * @author Hung
 */
public interface KhachHangService {
    List<KhachHang> getAll();
    void add(KhachHang binhGiuNhiet);
    
    void update(KhachHang binhGiuNhiet);
    
    void delete(KhachHang binhGiuNhiet);
}
