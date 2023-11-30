/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import com.binhgiunhiet_g3.repository.BinhGiuNhietChiTietRepository;
import com.binhgiunhiet_g3.service.BinhGiuNhietChiTietService;
import java.util.List;

/**
 *
 * @author PC
 */
public class BinhGiuNhietChiTietServiceImpl implements BinhGiuNhietChiTietService{
    
    private BinhGiuNhietChiTietRepository binhGiuNhietChiTietRepository;

    public BinhGiuNhietChiTietServiceImpl() {
        
        this.binhGiuNhietChiTietRepository = new BinhGiuNhietChiTietRepository();
    }

    
    @Override
    public List<BinhGiuNhietChiTiet> getAll() {
        return this.binhGiuNhietChiTietRepository.findAll();
    }

    @Override
    public Boolean add(BinhGiuNhietChiTiet binhGiuNhietChiTiet) {
        return this.binhGiuNhietChiTietRepository.insert(binhGiuNhietChiTiet);
    }

    @Override
    public void update(BinhGiuNhietChiTiet binhGiuNhietChiTiet) {
       this.binhGiuNhietChiTietRepository.update(binhGiuNhietChiTiet);
    }

    @Override
    public void delete(BinhGiuNhietChiTiet binhGiuNhietChiTiet) {
       this.binhGiuNhietChiTietRepository.delete(binhGiuNhietChiTiet);
    }

    @Override
    public List<BinhGiuNhietChiTiet> getByIdSanPham(int id) {
        return this.binhGiuNhietChiTietRepository.findByIdBinhDuNhiet(id);
    }
    
}
