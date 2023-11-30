/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.GioHang;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface GioHangService {
    List<GioHang> getAll();
    
    void add(GioHang gh);
    
    void uddate(GioHang gh);
    
    void delete(GioHang gh);
}
