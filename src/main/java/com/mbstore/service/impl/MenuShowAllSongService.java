/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.service.impl;

import com.mbstore.bean.Book;
import com.mbstore.bean.Song;
import com.mbstore.config.Config;
import com.mbstore.service.inter.*;
import java.util.ArrayList;

/**
 *
 * @author nizam
 */
public class MenuShowAllSongService implements MenuShowAllSongServiceInter {

    @Override
    public void process() {
        ArrayList<Song> song = Config.instance().getSongs();
        for (Song s : song) {
            System.out.println(s);
        }

    }
}
