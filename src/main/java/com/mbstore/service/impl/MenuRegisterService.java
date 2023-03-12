/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mbstore.service.impl;

import com.mbstore.util.*;
import com.mbstore.bean.Register;
import com.mbstore.config.Config;
import com.mbstore.exceptions.SameUserException;
import com.mbstore.service.inter.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void process() {

        try {
            ArrayList<Register> registerUser = Config.instance().getRegisters();

            String username = SystemUtility.inputString("Enter username: ");

            for (int i = 0; i > Config.instance().getRegisters().size(); i++) {
                String pk_username = registerUser.get(i).getUsername();
                if (username.equals(pk_username)) {
                    throw new SameUserException();
                }
            }
            int password = SystemUtility.inputNumber("Enter password: ");

            Register register = new Register(username, password);
            Config config = new Config();
            Config.instance().setRegisters(register);
            Config.registerSave();
        } catch (SameUserException ex) {
            System.out.println("Username existing!");
        }

    }

}
