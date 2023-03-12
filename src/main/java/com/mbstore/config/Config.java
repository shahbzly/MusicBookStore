/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.config;

import com.mbstore.bean.*;
import com.mbstore.util.FileUtility;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nizam
 */
public class Config implements Serializable {
    
    // Single tone design pattern
    public static Config instance(){
        if(config==null){
            return new Config();}
        return config;
    }
    
    public static void save(){
                FileUtility.writeObjectToFile(Config.instance(), "bs.obj");

    }
    
    public static void registerSave(){
                FileUtility.writeObjectToFile(Config.instance(), "rsave.obj");

    }
    
    public static void initialize(){
        Object obj = FileUtility.readObjectFromFile("bs.obj");
        if(obj == null){
            return;
        }
        if(obj instanceof Config){
            config = (Config) obj;
        }
    }
    
    public static void registerInitialize(){
        Object obj = FileUtility.readObjectFromFile("rsave.obj");
        if(obj == null){
            return;
        }
        if(obj instanceof Config){
            config = (Config) obj;
        }
    }
    
    private ArrayList<Register> registers = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Song> songs = new ArrayList<>();
    public static Config config;
    private static boolean LoggedIn;

    public static boolean isLoggedIn() {
        return LoggedIn;
    }

    public static void setLoggedIn(boolean LoggedIn) {
        Config.LoggedIn = LoggedIn;
    }
    
    

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        this.books.add(book);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(Song song) {
        this.songs.add(song);
    }

    public ArrayList<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(Register registers) {
        this.registers.add(registers);
    }
    
    
    
    
    
}
