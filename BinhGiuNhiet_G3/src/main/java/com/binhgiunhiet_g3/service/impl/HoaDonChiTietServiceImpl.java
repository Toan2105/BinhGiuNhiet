/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.HoaDonChiTiet;
import com.binhgiunhiet_g3.repository.HoaDonChiTietRepository;
import com.binhgiunhiet_g3.service.HoaDonChiTietService;
import java.util.List;

/**
 *
 * @author dungd
 */
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService{

    private HoaDonChiTietRepository hoaDonChiTietRepository;

    public HoaDonChiTietServiceImpl() {
        this.hoaDonChiTietRepository = new HoaDonChiTietRepository();
    }
    
    @Override
    public List<HoaDonChiTiet> getAll() {
        return this.hoaDonChiTietRepository.findAll();
    }

    @Override
    public Boolean add(HoaDonChiTiet hoaDonChiTiet) {
        return this.hoaDonChiTietRepository.insert(hoaDonChiTiet);
    }

    @Override
    public void update(HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDonChiTietRepository.update(hoaDonChiTiet);
    }

    @Override
    public void delete(HoaDonChiTiet hoaDonChiTiet) {
        this.hoaDonChiTietRepository.delete(hoaDonChiTiet);
    }
    
}
