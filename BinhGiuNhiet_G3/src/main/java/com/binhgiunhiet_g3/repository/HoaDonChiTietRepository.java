/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.HoaDonChiTiet;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dungd
 */
public class HoaDonChiTietRepository {
    private Session hSession;

    public HoaDonChiTietRepository() {
        
        this.hSession = HibernateUtil.getFACTORY().openSession();
        }
    

    public Boolean insert(HoaDonChiTiet hoaDonChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(hoaDonChiTiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    public void update(HoaDonChiTiet hoaDonChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(hoaDonChiTiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(HoaDonChiTiet hoaDonChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(hoaDonChiTiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public HoaDonChiTiet findById(int id)
    {
        return this.hSession.find(HoaDonChiTiet.class, id);
    }

    public List<HoaDonChiTiet> findAll()
    {
        String hql = "SELECT obj FROM HoaDonChiTiet obj";
        TypedQuery<HoaDonChiTiet> query = this.hSession.createQuery(hql, HoaDonChiTiet.class);
        return query.getResultList();
    }

}
