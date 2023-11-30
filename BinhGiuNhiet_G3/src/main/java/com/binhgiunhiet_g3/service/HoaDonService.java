/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.HoaDon;
import java.util.List;

/**
 *
 * @author dungd
 */
public interface HoaDonService {
    List<HoaDon>getAll();
    void add(HoaDon hoaDon);
    void update(HoaDon hoaDon);
    void delete(HoaDon hoaDon);
    
    HoaDon findByMa(String ma);
}
