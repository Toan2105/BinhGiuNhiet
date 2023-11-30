/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;
import com.binhgiunhiet_g3.entity.KhuyenMai;
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
public class KhuyenMaiRepository {
     private Session hSession;

    public KhuyenMaiRepository() {
        this.hSession = HibernateUtil.getFACTORY().openSession();

    }

    public void insert(KhuyenMai khuyenMai) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(khuyenMai);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }

    }

    public void update(KhuyenMai khuyenMai) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(khuyenMai);
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void delete(KhuyenMai khuyenMai)
    {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(khuyenMai);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public List<KhuyenMai> findALL()
    {
         String hql = "SELECT obj FROM KhuyenMai obj";
        TypedQuery<KhuyenMai> query = this.hSession.createQuery(hql, KhuyenMai.class);
        return query.getResultList();
    }
    public KhuyenMai findByMa(String ma)
    {
        String hql = "SELECT obj FROM KhuyenMai obj WHERE obj.MaKhuyenMai = ?1";
        TypedQuery<KhuyenMai> query = this.hSession.createQuery(hql, KhuyenMai.class);
        query.setParameter(1, ma);
        return query.getSingleResult();
    }
    }


