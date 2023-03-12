/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nizam
 */
public class FileUtility {

    public static void writeObjectToFile(Serializable object, String name) {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name));) {
            oos.writeObject(object);
        } catch (IOException ex) {
            {
                Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //Object fayli oxumaq 

    }

    public static Object readObjectFromFile(String name) {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        }finally {
                
            
            return obj;}

            }
        }