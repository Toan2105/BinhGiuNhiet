/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.binhgiunhiet_g3.service;

import com.binhgiunhiet_g3.entity.ChatLieu;
import java.util.List;

/**
 *
 * @author Fuyusaki
 */
public interface ChatLieuService {
    List<ChatLieu> getAll();
    
    void add(ChatLieu chatLieu);
    
    void update(ChatLieu chatLieu);
    
    void delete(ChatLieu chatLieu);
}
