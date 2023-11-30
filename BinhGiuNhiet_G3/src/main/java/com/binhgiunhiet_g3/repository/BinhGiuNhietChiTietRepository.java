/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PC
 */
public class BinhGiuNhietChiTietRepository {
    private Session hSession;

    public BinhGiuNhietChiTietRepository() {
        
        this.hSession = HibernateUtil.getFACTORY().openSession();
        }
    

    public Boolean insert(BinhGiuNhietChiTiet binhGiuNhietChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(binhGiuNhietChiTiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    public void update(BinhGiuNhietChiTiet binhGiuNhietChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(binhGiuNhietChiTiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(BinhGiuNhietChiTiet binhGiuNhietChiTiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(binhGiuNhietChiTiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public BinhGiuNhietChiTiet findById(String id)
    {
        return this.hSession.find(BinhGiuNhietChiTiet.class, id);
    }
    
    public List<BinhGiuNhietChiTiet> findByIdBinhDuNhiet(int id)
    {
        String hql = "SELECT obj FROM BinhGiuNhietChiTiet obj WHERE obj.binhGiuNhiet.id = :binhGiuNhietId";
        TypedQuery<BinhGiuNhietChiTiet> query = this.hSession.createQuery(hql, BinhGiuNhietChiTiet.class);
        query.setParameter("binhGiuNhietId", id);

        return query.getResultList();
    }


    public List<BinhGiuNhietChiTiet> findAll()
    {
        String hql = "SELECT obj FROM BinhGiuNhietChiTiet obj";
        TypedQuery<BinhGiuNhietChiTiet> query = this.hSession.createQuery(hql, BinhGiuNhietChiTiet.class);
        return query.getResultList();
    }

}
