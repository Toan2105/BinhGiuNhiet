/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.KhachHang;
import com.binhgiunhiet_g3.repository.KhachHangRepository;
import com.binhgiunhiet_g3.service.KhachHangService;
import java.util.List;

/**
 *
 * @author Hung
 */
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRepository khachHangRepository;

    public KhachHangServiceImpl() {
        this.khachHangRepository = new KhachHangRepository();

    }

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findALL();
    }

    @Override
    public void add(KhachHang khachHang) {
        this.khachHangRepository.insert(khachHang);
    }

    @Override
    public void update(KhachHang khachHang) {
        this.khachHangRepository.update(khachHang);
    }

    @Override
    public void delete(KhachHang khachHang) {
        this.khachHangRepository.delete(khachHang);
    }
}
