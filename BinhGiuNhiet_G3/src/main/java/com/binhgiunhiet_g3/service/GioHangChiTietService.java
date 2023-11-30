/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.GioHangChiTiet;
import java.util.List;

/**
 *
 * @author dungd
 */
public interface GioHangChiTietService {
    List<GioHangChiTiet> getAll();
    
    void add(GioHangChiTiet gioHangChiTiet);
    
    void update(GioHangChiTiet gioHangChiTiet);
    
    void delete(GioHangChiTiet gioHangChiTiet);
}

