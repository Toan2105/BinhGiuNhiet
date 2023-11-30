/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.GioHang;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class GioHangRepository {
    private Session hSession;
    
    public GioHangRepository(){
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }
    
    public void insert(GioHang gh){
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(gh);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    
    public void update(GioHang gh){
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(gh);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();   
        }
    }
    
    public void delete(GioHang gh){
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(gh);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    
    public GioHang findById(String id ){
        return this.hSession.find(GioHang.class, id);
    }
    
    public List<GioHang> findAll(){
        String hql = "SELECT obj FROM GioHang obj";
        TypedQuery<GioHang> query = this.hSession.createQuery(hql, GioHang.class);
        return query.getResultList();
    }
    
    public GioHang findByMa(String ma){
        String hql = "SELECT obj FROM GioHang obj WHERE obj.MaGioHang = ?1";
        TypedQuery<GioHang> query = this.hSession.createQuery(hql, GioHang.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
