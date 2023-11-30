/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.NhanVien;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepository {
    private Session hSession;
    
    public NhanVienRepository(){
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }
    
    public void insert(NhanVien nv){
        Transaction transaction = this.hSession.getTransaction();
        try{
           transaction.begin();
           this.hSession.persist(nv);
           transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    
    
      public void update(NhanVien nv)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(nv);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
      
     public void delete(NhanVien nv)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(nv);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
     
     
    public NhanVien findById(String id)
    {
        return this.hSession.find(NhanVien.class, id);
    }

    
    public List<NhanVien> findAll()
    {
        String hql = "SELECT obj FROM NhanVien obj";
        TypedQuery<NhanVien> query = this.hSession.createQuery(hql, NhanVien.class);
        return query.getResultList();
    }
    
    
    public NhanVien findByMa(String ma)
    {
        String hql = "SELECT obj FROM NhanVien obj WHERE obj.MaNhanVien = ?1";
        TypedQuery<NhanVien> query = this.hSession.createQuery(hql, NhanVien.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
