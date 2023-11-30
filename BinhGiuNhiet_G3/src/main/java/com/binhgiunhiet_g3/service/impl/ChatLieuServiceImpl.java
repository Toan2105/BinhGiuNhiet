/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.binhgiunhiet_g3.service.impl;

import com.binhgiunhiet_g3.entity.ChatLieu;
import com.binhgiunhiet_g3.repository.ChatLieuRepository;
import com.binhgiunhiet_g3.service.ChatLieuService;
import java.util.List;

/**
 *
 * @author Fuyusaki
 */
public class ChatLieuServiceImpl implements ChatLieuService {

    private ChatLieuRepository chatLieuRepository;

    public ChatLieuServiceImpl() {
        this.chatLieuRepository = new ChatLieuRepository();
    }

    @Override
    public List<ChatLieu> getAll() {
        return chatLieuRepository.findAll();
    }

    @Override
    public void add(ChatLieu chatLieu) {
        this.chatLieuRepository.insert(chatLieu);
    }

    @Override
    public void update(ChatLieu chatLieu) {
        this.chatLieuRepository.update(chatLieu);
    }

    @Override
    public void delete(ChatLieu chatLieu) {
        this.chatLieuRepository.delete(chatLieu);
    }

}
