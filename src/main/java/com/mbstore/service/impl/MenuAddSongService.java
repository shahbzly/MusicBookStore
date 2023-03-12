/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.service.impl;

import com.mbstore.bean.*;
import com.mbstore.util.*;
import com.mbstore.config.Config;
import com.mbstore.exceptions.NegativeException;
import com.mbstore.service.inter.MenuAddSongServiceInter;
import com.mbstore.service.inter.MenuService;
import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class MenuAddSongService implements MenuAddSongServiceInter {

    @Override
    public void process() {

        try {
            
            String songName = SystemUtility.inputString("Please enter Song name: ");
            int songPrice = SystemUtility.inputNumber("Please enter Song price: ");
            if (songPrice < 0) {
                throw new NegativeException();
            }
            //NegativeException.checkNegativeException(songPrice);
            String songSinger = SystemUtility.inputString("Please enter Song singer: ");
            String songDuration = SystemUtility.inputString("Please enter Song duration: ");

            Song song = new Song(songName, songPrice, songSinger, songDuration);

            Config config = new Config();
            Config.instance().setSongs(song);
            Config.save();
        } catch (NegativeException ex) {
            System.out.println("Can not be negative!");
        }

    }

}
