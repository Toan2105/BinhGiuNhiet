/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.BinhGiuNhiet;
import java.util.List;

/**
 *
 * @author PC
 */
public interface BinhGiuNhietService {
    List<BinhGiuNhiet> getAll();
    
    Boolean add(BinhGiuNhiet binhGiuNhiet);
    
    void update(BinhGiuNhiet binhGiuNhiet);
    
    void delete(BinhGiuNhiet binhGiuNhiet);
    
    BinhGiuNhiet findByMa(String ma);
    
    BinhGiuNhiet findById(int id);
}
