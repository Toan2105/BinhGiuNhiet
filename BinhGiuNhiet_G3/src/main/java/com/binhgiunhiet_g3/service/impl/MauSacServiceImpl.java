/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.MauSac;
import com.binhgiunhiet_g3.repository.MauSacRepository;
import com.binhgiunhiet_g3.service.MauSacService;
import java.util.List;

/**
 *
 * @author Fuyusaki
 */
public class MauSacServiceImpl implements MauSacService{
    
     private MauSacRepository mauSacRepository;

    public MauSacServiceImpl() {
        this.mauSacRepository = new MauSacRepository();
    }
    
    @Override
    public List<MauSac> getAll() {
         return mauSacRepository.findAll();
   }

    @Override
    public void add(MauSac mauSac) {
        this.mauSacRepository.insert(mauSac);
    }

    @Override
    public void update(MauSac mauSac) {
         this.mauSacRepository.update(mauSac);
   }

    @Override
    public void delete(MauSac mauSac) {
          this.mauSacRepository.delete(mauSac);
  }
    
}
