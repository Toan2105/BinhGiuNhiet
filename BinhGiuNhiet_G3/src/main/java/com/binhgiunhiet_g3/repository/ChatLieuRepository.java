/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.repository;

import com.binhgiunhiet_g3.entity.ChatLieu;
import com.binhgiunhiet_g3.utils.HibernateUtil;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fuyusaki
 */
public class ChatLieuRepository {

    private Session hSession;

    public ChatLieuRepository() {
        this.hSession = HibernateUtil.getFACTORY().openSession();
    }

    public void insert(ChatLieu chatLieu) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.persist(chatLieu);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void update(ChatLieu chatLieu) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.merge(chatLieu);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public void delete(ChatLieu chatLieu) {
        Transaction transaction = this.hSession.getTransaction();
        try {
            transaction.begin();
            this.hSession.delete(chatLieu);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
    }

    public ChatLieu findById(String id) {
        return this.hSession.find(ChatLieu.class, id);
    }

    public List<ChatLieu> findAll() {
        String hql = "SELECT obj FROM ChatLieu obj";
        TypedQuery<ChatLieu> query = this.hSession.createQuery(hql, ChatLieu.class);
        return query.getResultList();
    }
}
