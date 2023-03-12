/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.bean;

import com.mbstore.config.Config;
import static com.mbstore.config.Config.config;
import com.mbstore.util.FileUtility;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nizam
 */
public class Register implements Serializable {

    private String username;
    private int password;
    

    public Register() {
    }

    public Register(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username=" + username + ", Password=" + password ;
    }
    
    

}
