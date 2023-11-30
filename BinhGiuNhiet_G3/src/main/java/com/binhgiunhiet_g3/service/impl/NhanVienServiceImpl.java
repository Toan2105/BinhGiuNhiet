/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.NhanVien;
import com.binhgiunhiet_g3.repository.NhanVienRepository;
import com.binhgiunhiet_g3.service.NhanvVienService;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class NhanVienServiceImpl implements NhanvVienService{
    private NhanVienRepository nvRepo;
    
    public NhanVienServiceImpl(){
        this.nvRepo = new NhanVienRepository();
    }
    
    @Override
    public List<NhanVien> getAll() {
        return nvRepo.findAll();
    }

    @Override
    public void add(NhanVien nv) {
        this.nvRepo.insert(nv);
    }

    @Override
    public void update(NhanVien nv) {
        this.nvRepo.update(nv);
    }

    @Override
    public void delete(NhanVien nv) {
        this.nvRepo.delete(nv);
    }
    
}
