/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.GioHangChiTiet;
import com.binhgiunhiet_g3.repository.GioHangChiTietRepository;
import com.binhgiunhiet_g3.service.GioHangChiTietService;
import java.util.List;

/**
 *
 * @author dungd
 */
public class GioHangChiTietServiceIpml implements GioHangChiTietService {
    
    private GioHangChiTietRepository chiTietRepository = new GioHangChiTietRepository();
    
    @Override
    public List<GioHangChiTiet> getAll() {
        return this.chiTietRepository.findAll();
    }
    
    @Override
    public void add(GioHangChiTiet gioHangChiTiet) {
        this.chiTietRepository.insert(gioHangChiTiet);
    }
    
    @Override
    public void update(GioHangChiTiet gioHangChiTiet) {
        this.chiTietRepository.update(gioHangChiTiet);
    }
    
    @Override
    public void delete(GioHangChiTiet gioHangChiTiet) {
        this.chiTietRepository.delete(gioHangChiTiet);
    }
    
}
