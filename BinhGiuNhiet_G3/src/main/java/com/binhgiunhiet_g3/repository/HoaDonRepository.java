/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.HoaDon;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dungd
 */
public class HoaDonRepository {
    private Session hSession;

    public HoaDonRepository() {
    this.hSession= HibernateUtil.getFACTORY().openSession();
    }
    public void insert(HoaDon hoaDon)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(hoaDon);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void update(HoaDon hoaDon)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(hoaDon);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
     public void delete(HoaDon hoaDon)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete( hoaDon);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
     
         public List<HoaDon> findAll()
    {
        String hql = "SELECT obj FROM HoaDon obj";
        TypedQuery<HoaDon> query = this.hSession.createQuery(hql, HoaDon.class);
        return query.getResultList();
    }

    public HoaDon findByMa(String ma)
    {
        String hql = "SELECT obj FROM HoaDon obj WHERE obj.maHoaDon = ?1";
        TypedQuery<HoaDon> query = this.hSession.createQuery(hql, HoaDon.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
}
