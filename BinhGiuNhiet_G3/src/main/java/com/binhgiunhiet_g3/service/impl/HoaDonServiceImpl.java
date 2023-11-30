/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.HoaDon;
import com.binhgiunhiet_g3.repository.HoaDonRepository;
import com.binhgiunhiet_g3.service.HoaDonService;
import java.util.List;

/**
 *
 * @author dungd
 */
public class HoaDonServiceImpl implements HoaDonService {

    private HoaDonRepository hoaDonRepository;

    public HoaDonServiceImpl() {
        hoaDonRepository = new HoaDonRepository();
    }

    @Override
    public List<HoaDon> getAll() {
        return this.hoaDonRepository.findAll();
    }

    @Override
    public void add(HoaDon hoaDon) {
        this.hoaDonRepository.insert(hoaDon);
    }

    @Override
    public void update(HoaDon hoaDon) {
        this.hoaDonRepository.update(hoaDon);
    }

    @Override
    public void delete(HoaDon hoaDon) {
        this.hoaDonRepository.delete(hoaDon);
    }

    @Override
    public HoaDon findByMa(String ma) {
        return this.hoaDonRepository.findByMa(ma);
    }
}
