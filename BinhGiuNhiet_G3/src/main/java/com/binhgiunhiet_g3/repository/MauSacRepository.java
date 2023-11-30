/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.BinhGiuNhietChiTiet;
import com.binhgiunhiet_g3.entity.MauSac;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fuyusaki
 */
public class MauSacRepository {
    private Session hSession;

    public MauSacRepository() {

        this.hSession = HibernateUtil.getFACTORY().openSession();
    }

    public void insert(MauSac mauSac) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(mauSac);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(MauSac mauSac) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(mauSac);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(MauSac mauSac) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(mauSac);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public MauSac findById(String id) {
        return this.hSession.find(MauSac.class, id);
    }

    public List<MauSac> findAll() {
        String hql = "SELECT obj FROM MauSac obj";
        TypedQuery<MauSac> query = this.hSession.createQuery(hql, MauSac.class);
        return query.getResultList();
    }

}
