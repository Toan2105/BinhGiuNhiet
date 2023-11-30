/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.ThuongHieu;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fuyusaki
 */
public class ThuongHieuRepository {
       private Session hSession;

    public ThuongHieuRepository() {
        
        this.hSession = HibernateUtil.getFACTORY().openSession();
        }
    

    public void insert(ThuongHieu thuongHieu)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(thuongHieu);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(ThuongHieu thuongHieu)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(thuongHieu);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(ThuongHieu thuongHieu)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(thuongHieu);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public ThuongHieu findById(String id)
    {
        return this.hSession.find(ThuongHieu.class, id);
    }

    public List<ThuongHieu> findAll()
    {
        String hql = "SELECT obj FROM ThuongHieu obj";
        TypedQuery<ThuongHieu> query = this.hSession.createQuery(hql, ThuongHieu.class);
        return query.getResultList();
    }
}
