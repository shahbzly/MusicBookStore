/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.util;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class SystemUtility {
    
    
    public static int inputNumber(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        int input = sc.nextInt();
        return input;
        
    }
    
    public static String inputString(String a){
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        String input = sc.next();
        return input;
        
    }
    
    
    
}
