/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.ThuongHieu;
import java.util.List;

/**
 *
 * @author Fuyusaki
 */
public interface ThuongHieuService {
    List<ThuongHieu> getAll();
    
    void add(ThuongHieu thuongHieu);
    
    void update(ThuongHieu thuongHieu);
    
    void delete(ThuongHieu thuongHieu);
}
