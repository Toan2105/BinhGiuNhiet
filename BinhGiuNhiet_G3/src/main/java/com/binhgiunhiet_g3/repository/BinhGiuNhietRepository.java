/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.BinhGiuNhiet;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author PC
 */
public class BinhGiuNhietRepository {
    
    private Session hSession;

    public BinhGiuNhietRepository() {
        
        this.hSession = HibernateUtil.getFACTORY().openSession();
        }
    

    public Boolean insert(BinhGiuNhiet binhGiuNhiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(binhGiuNhiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return false;
    }

    public void update(BinhGiuNhiet binhGiuNhiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(binhGiuNhiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(BinhGiuNhiet binhGiuNhiet)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(binhGiuNhiet);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public BinhGiuNhiet findById(int id)
    {
        return this.hSession.find(BinhGiuNhiet.class, id);
    }

    public List<BinhGiuNhiet> findAll()
    {
        String hql = "SELECT obj FROM BinhGiuNhiet obj";
        TypedQuery<BinhGiuNhiet> query = this.hSession.createQuery(hql, BinhGiuNhiet.class);
        return query.getResultList();
    }

    public BinhGiuNhiet findByMa(String ma)
    {
        String hql = "SELECT obj FROM BinhGiuNhiet obj WHERE obj.ma = ?1";
        TypedQuery<BinhGiuNhiet> query = this.hSession.createQuery(hql, BinhGiuNhiet.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
