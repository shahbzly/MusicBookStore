/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mbstore.bean;

/**
 *
 * @author nizam
 */
public class Song extends Product {
    private String singer;
    private String duration;

    public Song(String songName, int songPrice, String songSinger, int songDuration) {
    }

    public Song( String name, double price, String singer, String duration) {
        super(name, price);
        this.singer = singer;
        this.duration = duration;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song:" +getName()+"\nPrice:" +getPrice() +"\nSinger:" + singer + "\nDuration:" + duration ;
    }
    
    
    
    
    
}
