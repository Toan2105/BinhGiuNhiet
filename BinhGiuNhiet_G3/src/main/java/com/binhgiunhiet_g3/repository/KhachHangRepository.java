/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.KhachHang;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Hung
 */
public class KhachHangRepository {

    private Session hSession;

    public KhachHangRepository() {
        this.hSession = HibernateUtil.getFACTORY().openSession();

    }

    public void insert(KhachHang khachHang) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(khachHang);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }

    }

    public void update(KhachHang khachHang) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(khachHang);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void delete(KhachHang khachHang)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(khachHang);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public List<KhachHang> findALL()
    {
         String hql = "SELECT obj FROM KhachHang obj";
        TypedQuery<KhachHang> query = this.hSession.createQuery(hql, KhachHang.class);
        return query.getResultList();
    }
    public KhachHang findByMa(String ma)
    {
        String hql = "SELECT obj FROM KhachHang obj WHERE obj.Ma = ?1";
        TypedQuery<KhachHang> query = this.hSession.createQuery(hql, KhachHang.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
    }

