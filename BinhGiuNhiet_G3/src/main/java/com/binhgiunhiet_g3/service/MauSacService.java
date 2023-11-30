/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.MauSac;
import java.util.List;

/**
 *
 * @author Fuyusaki
 */
public interface MauSacService {
    List<MauSac> getAll();
    
    void add(MauSac mauSac);
    
    void update(MauSac mauSac);
    
    void delete(MauSac mauSac);
}
