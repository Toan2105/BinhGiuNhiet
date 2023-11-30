/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.BinhGiuNhiet;
import com.binhgiunhiet_g3.repository.BinhGiuNhietRepository;
import com.binhgiunhiet_g3.service.BinhGiuNhietService;
import java.util.List;

/**
 *
 * @author PC
 */
public class BinhGiuNhietServiceImpl implements BinhGiuNhietService{
    private BinhGiuNhietRepository binhGiuNhietRepository;

    public BinhGiuNhietServiceImpl() {
        this.binhGiuNhietRepository = new BinhGiuNhietRepository();
    }
    
    
    @Override
    public List<BinhGiuNhiet> getAll() {
        return binhGiuNhietRepository.findAll();
    }

    @Override
    public Boolean add(BinhGiuNhiet binhGiuNhiet) {
        return this.binhGiuNhietRepository.insert(binhGiuNhiet);
    }

    @Override
    public void update(BinhGiuNhiet binhGiuNhiet) {
        this.binhGiuNhietRepository.update(binhGiuNhiet);
    }

    @Override
    public void delete(BinhGiuNhiet binhGiuNhiet) {
        this.binhGiuNhietRepository.delete(binhGiuNhiet);
    }

    @Override
    public BinhGiuNhiet findByMa(String ma) {
        return this.binhGiuNhietRepository.findByMa(ma);
    }

    @Override
    public BinhGiuNhiet findById(int id) {
        return this.binhGiuNhietRepository.findById(id);
    }
    
}
