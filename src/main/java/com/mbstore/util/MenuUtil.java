/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.util;

import com.mbstore.config.Config;
import static com.mbstore.util.Menu.*;
import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class MenuUtil {

    public static void showAllMenu() {
        Menu m[] = Menu.values();
        for (int i = 0; i < m.length; i++) {
            if (m[i] != UNKNOWN) {
                if(m[i]==LOGIN || m[i]==REGISTER){
                    if(!(Config.isLoggedIn())){
                        System.out.println(m[i]);
                }
                }
                else if(Config.isLoggedIn()){
                System.out.println(m[i]);}
            }

        }
    }

    public static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        showAllMenu();
        System.out.println("Please select operation: ");
        int choice = sc.nextInt();
        Menu menu = Menu.find(choice);
        menu.process();
    }

}
