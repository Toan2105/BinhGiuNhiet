/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.NhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NhanvVienService {
    List<NhanVien> getAll();
    
    void add(NhanVien nv);
    
    void update(NhanVien nv);
    
    void delete(NhanVien nv);
}
