/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.ThuongHieu;
import com.binhgiunhiet_g3.repository.ThuongHieuRepository;
import com.binhgiunhiet_g3.service.ThuongHieuService;
import java.util.List;

/**
 *
 * @author Fuyusaki
 */
public class ThuongHieuServiceImpl implements ThuongHieuService{

    private ThuongHieuRepository thuongHieuRepository;

    public ThuongHieuServiceImpl() {
        this.thuongHieuRepository = new ThuongHieuRepository();
    }
    
    @Override
    public List<ThuongHieu> getAll() {
        return thuongHieuRepository.findAll();
    }

    @Override
    public void add(ThuongHieu thuongHieu) {
        this.thuongHieuRepository.insert(thuongHieu);
    }

    @Override
    public void update(ThuongHieu thuongHieu) {
        this.thuongHieuRepository.update(thuongHieu);
    }

    @Override
    public void delete(ThuongHieu thuongHieu) {
        this.thuongHieuRepository.delete(thuongHieu);
    }
    
}
