/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.service.impl;

import com.mbstore.bean.*;
import com.mbstore.util.*;

import com.mbstore.config.Config;
import com.mbstore.service.inter.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        String username = SystemUtility.inputString("Enter username: ");
        int password = SystemUtility.inputNumber("Enter password: ");

        ArrayList<Register> register = Config.instance().getRegisters();
        
        
        
        for (int i = 0; i < register.size(); i++) {

            String giris = register.get(i).getUsername();
            int sifre = register.get(i).getPassword();

            if (!(username.equals(giris) && password == sifre)) {
                Config.setLoggedIn(false);
            }else
            {Config.setLoggedIn(true);}

        }
        
        if(!(Config.isLoggedIn())){
            System.out.println("Username or Password is invalid!");
        }
        
    }

}
