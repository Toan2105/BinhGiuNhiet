/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.GioHang;
import com.binhgiunhiet_g3.entity.GioHangChiTiet;
import com.binhgiunhiet_g3.repository.GioHangRepository;
import com.binhgiunhiet_g3.service.GioHangService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class GioHangServiceImpl implements GioHangService{
    private GioHangRepository ghRepo;

    public GioHangServiceImpl(){
        this.ghRepo = new GioHangRepository();
    }
    @Override
    public List<GioHang> getAll() {
        return ghRepo.findAll();
    }

    @Override
    public void add(GioHang gh) {
        this.ghRepo.insert(gh);
    }

    @Override
    public void uddate(GioHang gh) {
        this.ghRepo.update(gh);
    }

    @Override
    public void delete(GioHang gh) {
        this.ghRepo.delete(gh);
    }
   
}
