/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.KhuyenMai;
import java.util.List;

/**
 *
 * @author Hung
 */
public interface KhuyenMaiService {
    List<KhuyenMai> getAll();
    
    void add(KhuyenMai km);
    
    void update(KhuyenMai km);
    
    void delete(KhuyenMai km);
}
